package _8;

import java.util.Collection;
import java.util.Iterator;

/**
 * 以对象取代数据值
 * */
public class _2_Replace_Data_Value_with_Object {

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
            this.customer = new Customer(customerName);
        }

        public String getCustomerName() {
            return customer.getName();
        }

        public void setCustomer(String customerName) {
            this.customer = new Customer(customerName);
        }

    }

    class Customer {

        private final String name;

        public Customer(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

}
