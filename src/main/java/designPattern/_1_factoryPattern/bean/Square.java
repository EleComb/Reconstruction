package designPattern._1_factoryPattern.bean;

import designPattern._1_factoryPattern.iml.Shape;

public class Square implements Shape {

    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}