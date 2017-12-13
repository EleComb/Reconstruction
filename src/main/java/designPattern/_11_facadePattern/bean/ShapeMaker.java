package designPattern._11_facadePattern.bean;

import designPattern._11_facadePattern.entity.Circle;
import designPattern._11_facadePattern.entity.Rectangle;
import designPattern._11_facadePattern.entity.Square;
import designPattern._11_facadePattern.iml.Shape;

public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}