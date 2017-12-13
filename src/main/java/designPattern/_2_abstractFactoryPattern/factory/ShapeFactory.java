package designPattern._2_abstractFactoryPattern.factory;

import designPattern._1_factoryPattern.bean.Circle;
import designPattern._1_factoryPattern.bean.Rectangle;
import designPattern._1_factoryPattern.bean.Square;
import designPattern._1_factoryPattern.iml.Shape;
import designPattern._2_abstractFactoryPattern.iml.Color;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            int closeDuplicatedCode = 0;
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}