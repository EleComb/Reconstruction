package designPattern._2_abstractFactoryPattern.bean;

import designPattern._2_abstractFactoryPattern.iml.Color;

public class Red implements Color {

    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}