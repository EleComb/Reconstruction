package _1;

public class 起床 {



    public static void main(String[] args) {
        起床 le = new 起床();
    }
    //
    public 起床() {
        int 闹钟个数 = 3;
        for (int 计数器 = 0; 计数器 < 闹钟个数; 计数器++) {
            System.out.println("闹钟"+ (计数器+1) +"：起床！！！");
            if(计数器 == (闹钟个数-1)) {
                System.out.println("我：起床啦！！！");
            } else {
                System.out.println("我：...");
            }

        }
    }
}
