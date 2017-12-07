package _1.test;

public class StaticProxyTest {
    //这里传入的是接口类型的对象，方便向上转型，实现多态
    public static void consumer(ProxyInterface pi){
        pi.say();
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        consumer(new StaticProxyObject());
    }
}





