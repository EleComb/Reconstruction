package designPattern._2_abstractFactoryPattern.bean;

import designPattern._2_abstractFactoryPattern.iml.Color;

public class Blue implements Color {
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}