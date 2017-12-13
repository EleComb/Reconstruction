package designPattern._11_facadePattern;

import designPattern._11_facadePattern.bean.ShapeMaker;

/**
 * 向系统添加接口,隐藏复杂性.
 * */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}