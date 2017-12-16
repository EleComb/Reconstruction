package _8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 将双向关联改为单向关联
 * */
public class _8_Change_Bidirectional_Association_to_Unidirectional {
    class Order {
        Customer customer;

        Customer getCustomer() {
            return customer;
        }

        void setCustomer(Customer customer) {
            if(this.customer != null)
                this.customer.friendOrders().remove(this);
            this.customer = customer;
            if(this.customer != null)
                this.customer.friendOrders().add(this);
        }

        double getDiscountedPrice(Customer customer) {
            return getGrossPrice() * (1 - customer.getDiscount());
        }

        double getGrossPrice() {
            return 0;
        }

    }

    class Customer {
        private Set order = new HashSet();

        Set friendOrders() {
            /** should only be used by Order when modifying the association */
            return order;
        }

        void addOrder(Order order) {
            order.setCustomer(this);
        }

        double getPriceFor(Order order) {
            return order.getDiscountedPrice(this);
        }

        Customer getCustomer() throws IllegalAccessException, InstantiationException {
            Iterator iter = Customer.class.newInstance().order.iterator();
            while (iter.hasNext()) {
                Customer each = (Customer) iter.next();
                if(each.containsOrder(this)) return each;
            }
            return null;
        }

        boolean containsOrder(Customer customer) {
            if(order.stream().equals(customer)) return true;
//            Iterator iter = order.iterator();
//            while(iter.hasNext()) {
//                if(((Customer) iter.next()).equals(customer)) return true;
//            }
            return false;
        }

        @Override
        public boolean equals(Object arg) {
            if(this == arg) return true;
            if(!(arg instanceof Customer)) return false;
            Customer other = (Customer) arg;
            return arg.equals(other);
        }

        double getDiscount() {
            return 0;
        }

    }
}
