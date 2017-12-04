package _6.source;

import java.util.Enumeration;

public class Order {

    int i;

    public Order(int i) {
        this.i = i;
    }

    public Enumeration elements() {
        return new EnumerationTest();
    }

    public double getAmount() {
        return i;
    }

}