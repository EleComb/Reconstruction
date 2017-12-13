package designPattern._1_factoryPattern.bean;

import designPattern._1_factoryPattern.iml.Shape;

public class Rectangle implements Shape {

    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}