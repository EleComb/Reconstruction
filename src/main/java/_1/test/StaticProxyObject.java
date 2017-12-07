package _1.test;

//代理者
class StaticProxyObject implements ProxyInterface{

    public void say() {
        // TODO Auto-generated method stub
        //dosomething for example
        System.out.println("hello proxy");
        new RealObject().say();
        System.out.println("this is method end");
    }

}