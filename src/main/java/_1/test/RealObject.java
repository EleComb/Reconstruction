package _1.test;

//被代理者
class RealObject implements ProxyInterface{
    //实现接口方法
    public void say() {
        // TODO Auto-generated method stub
        System.out.println("i'm talking");
    }

}