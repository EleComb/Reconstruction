package designPattern._2_abstractFactoryPattern.factory;

import designPattern._1_factoryPattern.iml.Shape;
import designPattern._2_abstractFactoryPattern.bean.Blue;
import designPattern._2_abstractFactoryPattern.bean.Green;
import designPattern._2_abstractFactoryPattern.bean.Red;
import designPattern._2_abstractFactoryPattern.iml.Color;

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
}