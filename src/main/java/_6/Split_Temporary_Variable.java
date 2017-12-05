package _6;

/**
 * 分解临时变量
 * */
public class Split_Temporary_Variable {

    private double height = 1, width = 2;

    public void test() {
        double temp = 2 * (height * width);
        System.out.println(temp);
        temp = height * width;
        System.out.println(temp);
    }
}
