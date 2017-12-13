package designPattern._11_facadePattern.entity;

import designPattern._11_facadePattern.iml.Shape;

public class Rectangle implements Shape {

    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}