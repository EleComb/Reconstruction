package designPattern._11_facadePattern.entity;

import designPattern._11_facadePattern.iml.Shape;

public class Circle implements Shape {

    public void draw() {
        System.out.println("Circle::draw()");
    }
}