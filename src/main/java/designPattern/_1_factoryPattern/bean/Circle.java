package designPattern._1_factoryPattern.bean;

import designPattern._1_factoryPattern.iml.Shape;

public class Circle implements Shape {

    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}