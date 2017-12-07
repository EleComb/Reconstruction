package _8;

import java.util.*;

/**
 * 将值对象改为引用对象
 * 如果用户拥有多个不同订单，这些订单的所有Order对象可以共享同一个Customer对象。
 * */
public class _3_Change_Value_to_Reference {

    public static Customer create(String name) {
        return new Customer(name);
    }

    private static int numberOfOrdersFor(Collection orders, String customer) {
        int result = 0;
        Iterator iter = orders.iterator();
        while (iter.hasNext()) {
            Order each = (Order) iter.next();
            if(each.getCustomerName().equals(customer)) result++;
        }
        return result;
    }

    class Order {

        private Customer customer;

        public Order(String customerName) {
            this.customer = Customer.getNamed(customerName);
        }

        public String getCustomerName() {
            return customer.getName();
        }

        public void setCustomer(String customerName) {
            this.customer = new Customer(customerName);
        }

    }

    static class Customer {

        private final String name;
        private static Dictionary instances = new Hashtable();

        public static Customer getNamed(String name) {
            return (Customer) instances.get(name);
        }

        private Customer(String name) {
            this.name = name;
        }

        static void loadCustomers() {
            new Customer("Lemon Car Hire").store();
            new Customer("Associated Coffee Machines").store();
            new Customer("Bilston Gasworks").store();
        }

        private void store() {
            instances.put(this.getName(), this);
        }

        public String getName() {
            return name;
        }
    }
}
