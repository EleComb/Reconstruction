package _6;

import _6.source.Order;

import java.util.Enumeration;

public class Extract_Method {

    private String name = "";
    Order orders = new Order(0);

    public Extract_Method(String name) {
        this.name = name;
    }

    void printOwing(double amount) {
        printBanner();
        double outstanding = getOutstanding();
        printDetail(outstanding);
    }

    private double getOutstanding() {
        Enumeration e = orders.elements();
        double outstanding = 0.0;
        while (e.hasMoreElements()) {
            Order each = (Order) e.nextElement();
            outstanding += each.getAmount();
        }
        return outstanding;
    }

    private void printBanner() {
        System.out.println("*************************");
        System.out.println("***** Customer Owes *****");
        System.out.println("*************************");
    }

    private void printDetail(double outstanding) {
        System.out.println("name:" + name);
        System.out.println("amount:" + outstanding);
    }

    public static void main(String[] args) {
        Extract_Method em = new Extract_Method("thisName");
        em.printOwing(11);
    }
}
