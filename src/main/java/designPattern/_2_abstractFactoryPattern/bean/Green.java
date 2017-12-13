package designPattern._2_abstractFactoryPattern.bean;

import designPattern._2_abstractFactoryPattern.iml.Color;

public class Green implements Color {
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}