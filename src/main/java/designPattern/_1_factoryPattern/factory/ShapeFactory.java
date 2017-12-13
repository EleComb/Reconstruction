package designPattern._1_factoryPattern.factory;

import designPattern._1_factoryPattern.bean.Circle;
import designPattern._1_factoryPattern.bean.Rectangle;
import designPattern._1_factoryPattern.iml.Shape;
import designPattern._1_factoryPattern.bean.Square;

public class ShapeFactory {

    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}