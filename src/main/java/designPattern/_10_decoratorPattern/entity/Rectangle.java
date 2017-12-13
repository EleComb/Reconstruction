package designPattern._10_decoratorPattern.entity;

import designPattern._10_decoratorPattern.iml.Shape;

public class Rectangle implements Shape {
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}