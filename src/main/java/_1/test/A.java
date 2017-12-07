package _1.test;

class A{
    public int i = 1;
    public static int b = 2;
    public A(){
        System.out.println("无参构造");
    }

    private A(String s){
        System.out.println("有参构造"+s);
    }

    public void print() {
        System.out.println("hello world");
    }

    public void say(){
        System.out.println("say");
    }
}