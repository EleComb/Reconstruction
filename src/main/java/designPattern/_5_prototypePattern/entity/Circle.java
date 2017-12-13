package designPattern._5_prototypePattern.entity;

import designPattern._5_prototypePattern.iml.Shape;

public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}