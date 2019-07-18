#! python2
# -*- coding: utf-8 -*-

# 九张羊皮纸 STEAM版用 联机辅助脚本
# 本脚本用于，减少STEAM游戏九张羊皮纸在线游戏时的频繁掉线现象。

# 安装方法:
# 1, 请去Python官方网站下载Python 2.7版安装程序并安装。
#    版本一定必须是2.7或其子版本，若使用3以上版本将无法正确运行。
# 2, 请修改操作系统中的HOSTS文件，增加条目: 127.0.0.1 master.frozenbyte-online.com
# 3, 保存本脚本到本地任意位置。

# 使用方法:
# 1, 直接双击运行本脚本。
# 2, 直接打开游戏，新建立一个在线游戏的主机，然后切出游戏查看本脚本的运行窗口。
#    如果窗口中有4个计数，并且有计数在增加，则说明脚本一切运行正常。
# 3, 正常开始联机游戏吧。
# 4, 游戏结束后，在脚本窗口按ctrl+c来结束脚本，或者直接关闭窗口。

# 注意事项:
# 1, 当修改完操作系统中的HOSTS文件后，该游戏的联机模式便 必 须 使用本脚本才能联机。
#    若想恢复以前的直接联机方式，仅需在HOSTS中删除之前添加的条目即可。
# 2, 除了手动修改的HOSTS外，本脚本不注册任何系统资源，可随时直接删除。
# 3, 本脚本以及HOSTS设置，仅影响该游戏。不影响其他游戏联机。
#    但未经测试，本脚本有可能会影响同厂商的其他游戏联机。
#    如果同厂其他游戏联机出现问题，请如条目1所述恢复操作系统中的HOSTS文件即可。
# 4，即使使用了本脚本，依旧有可能出现掉线现象。
#    但是这就是其他因素导致的，而非大多数人碰到的服务器检测信号丢包问题。

# 原理简介：
# 本脚本在本地系统建立了一个连接游戏客户端与远在芬兰的官方联机服务器之间的中继服务器。
# 对于服务器方面的数据，本脚本直接透传转发，对服务器上下行数据没有任何修改，不属于外挂范畴。
# 对于游戏客户端方面的数据，本脚本伪造了一个服务器上周期性发送的检测玩家在线状态的心跳信号，
# 用于欺骗游戏客户端，无视一切网络传输导致的心跳丢包，而使其不会随意掉线。

# 免责声明：
# 本脚本仅仅用于技术交流。
# 任何人基于任何目的使用本脚本带来的任何后果，作者皆不承担任何责任。
# 若无法同意上述声明，请不要使用本脚本。

import sys
import socket
import SocketServer
import threading
from time import sleep

dst_url = 'master.frozenbyte-online.com'
#dst_ip = socket.gethostbyname(dst_url)
dst_ip = '185.20.138.174'
dst_port = 27300

def run_thr_svr(svr):
    thr = threading.Thread(target = svr.serve_forever)
    thr.daemon = True
    thr.start()
    return thr

def send_unblock(s):
    try:
        addr = s.getsockname()
    except socket.error as e:
        if e.errno == 10022:
            return
        else:
            raise
    s.sendto('unblock', ('localhost', addr[1]))

class dummy_relay_9p(SocketServer.BaseRequestHandler):

    DST_ADDR = (dst_ip, dst_port)
    DST_SOCK = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
    STATUS = {'s_relay': 0, 'r_relay': 0, 's_ack': 0, 'r_ack': 0}

    def print_status(self):
        sys.stdout.write('status: {:s}'.format(self.STATUS) + '\r')
        sys.stdout.flush()

    def handle(self):
        self.print_status()
        d = self.request[0]
        s = self.request[1]
        nd, dr = self.data_mod(d)
        if not nd:
            return
        send_unblock(self.DST_SOCK)
        #print 'send to', self.DST_ADDR
        self.DST_SOCK.sendto(nd, self.DST_ADDR)
        if dr:
            #print 'resend to', self.client_address
            s.sendto(dr, self.client_address)
        while True:
            try:
                r, dsrv = self.DST_SOCK.recvfrom(4096)
            except socket.error as e:
                if e.errno == 10054:
                    return
                else:
                    raise
            if dsrv[0] == '127.0.0.1':
                #print 'r-fresh'
                return
            nr = self.recv_mod(r)
            if nr:
                s.sendto(nr, self.client_address)

    D_BEAT_ACK = bytearray([0xcb, 0xbd, 0xfd, 0x20, 0xf5])
    
    def data_mod(self, data):
        if bytearray(data) == self.D_BEAT_ACK:
            self.STATUS['s_ack'] += 1
            return data, data
        else:
            self.STATUS['s_relay'] += 1
            return data, None

    def recv_mod(self, data):
        bdata = bytearray(data)
        if len(bdata) >= 2 and bdata[:2] == bytearray([0xcf, 0x00]):
            del self.D_BEAT_ACK[:]
            self.D_BEAT_ACK.extend(bytearray([0xcb]) + bdata[2:])
        if bdata == self.D_BEAT_ACK:
            self.STATUS['r_ack'] += 1
            return None
        else:
            self.STATUS['r_relay'] += 1
            return data

def stop_serve(svr):
    send_unblock(svr.RequestHandlerClass.DST_SOCK)
    sleep(.1)
    svr.shutdown()
    svr.server_close()

if __name__ == '__main__':
    print 'dummy for', dst_url, dst_ip, dst_port
    c_9p = SocketServer.ThreadingUDPServer(('', dst_port), dummy_relay_9p)
    run_thr_svr(c_9p)

    try:
        while True:
            sleep(1)
    except KeyboardInterrupt:
        stop_serve(c_9p)
        print '\nclose'
        
