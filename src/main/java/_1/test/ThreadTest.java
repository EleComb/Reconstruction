package _1.test;

import java.util.concurrent.*;

public class ThreadTest {

    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        threadTest.testFunc(10);
    }

    public int testFunc(final int test) {

        final ExecutorService exec = Executors.newFixedThreadPool(1);

        Callable<Integer> call = new Callable<Integer>() {
            public Integer call() throws Exception {
                //开始执行耗时操作
                int retn = getRetn(test);
                return retn;
            }
        };

        try {
            Future<Integer> future = exec.submit(call);
            Integer obj = future.get(1000 * 1, TimeUnit.MILLISECONDS); //任务处理超时时间设为 1 秒
            System.out.println("任务成功返回:" + obj);
        } catch (TimeoutException ex) {
            System.out.println("处理超时啦....");
            ex.printStackTrace();
        } catch (Exception e) {
            System.out.println("处理失败.");
            e.printStackTrace();
        }
        // 关闭线程池
        exec.shutdown();


    return 0;
//        return retn;
    }

    private int getRetn(int test) {
        int retn = test + 3;
        // 耗时【还可以】的形式
        for(int i = 0; i < 1000; i++) {
            retn  += test;
        }
        // 耗时【太长】的形式
//        while(true) {
//            retn += test;
//        }
        return retn;
    }

    @Deprecated
    public static class CheckTime implements Runnable {

        public CheckTime() {
        }

        public void run() {
            Long current = System.currentTimeMillis();
            Long timeOut = Long.valueOf(10000);
            while(true) {
                Long newCurrent = System.currentTimeMillis();
                if(current + timeOut == newCurrent);
           }
        }
    }
}