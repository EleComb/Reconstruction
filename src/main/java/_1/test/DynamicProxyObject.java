package _1.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyObject implements InvocationHandler {

    private Object proxied = null;

    public DynamicProxyObject(){

    }

    public DynamicProxyObject(Object proxied){
        this.proxied  = proxied;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("hello");
        return method.invoke(proxied, args);
    }
}
