package designPattern._10_decoratorPattern;

import designPattern._10_decoratorPattern.entity.Circle;
import designPattern._10_decoratorPattern.entity.Rectangle;
import designPattern._10_decoratorPattern.entity.color.RedShapeDecorator;
import designPattern._10_decoratorPattern.iml.Shape;

/**
 * 向现有的对象添加新功能,同时不改变结构.
 * */
public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}