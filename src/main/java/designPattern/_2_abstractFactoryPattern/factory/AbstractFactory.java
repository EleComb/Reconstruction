package designPattern._2_abstractFactoryPattern.factory;

import designPattern._1_factoryPattern.iml.Shape;
import designPattern._2_abstractFactoryPattern.iml.Color;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}