package _1.test;

import java.lang.reflect.Proxy;

public class DynamicProxyTest {

    static void customer(ProxyInterface pi){
        pi.say();
    }
    public static void main(String[] args){
        RealObject real = new RealObject();
        ClassLoader classLoader = ProxyInterface.class.getClassLoader();
        Class[] classProxy = new Class[]{ProxyInterface.class};
        DynamicProxyObject dynamicProxyObject = new DynamicProxyObject(real);

        ProxyInterface proxy = (ProxyInterface) Proxy.newProxyInstance(classLoader, classProxy, dynamicProxyObject);
        customer(proxy);
    }

}

