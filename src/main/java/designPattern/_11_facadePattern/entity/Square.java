package designPattern._11_facadePattern.entity;

import designPattern._11_facadePattern.iml.Shape;

public class Square implements Shape {

    public void draw() {
        System.out.println("Square::draw()");
    }
}
