package designPattern._12_flyweightPattern.factory;

import designPattern._12_flyweightPattern.entity.Circle;
import designPattern._12_flyweightPattern.iml.Shape;

import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<String, Shape>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}