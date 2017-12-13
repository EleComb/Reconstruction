package designPattern._5_prototypePattern.entity;

import designPattern._5_prototypePattern.iml.Shape;

public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}