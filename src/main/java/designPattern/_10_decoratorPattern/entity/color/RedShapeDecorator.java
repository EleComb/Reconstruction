package designPattern._10_decoratorPattern.entity.color;

import designPattern._10_decoratorPattern.iml.Shape;
import designPattern._10_decoratorPattern.iml.ShapeDecorator;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}