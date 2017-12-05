package _6;

/**
 * 分解临时变量
 * */
public class Split_Temporary_Variable {

    private double height = 1, width = 2;

    public void test() {
        final double perimeter = 2 * (height * width);
        System.out.println(perimeter);
        final double area = height * width;
        System.out.println(area);
    }
}
