package _8;

import java.util.HashSet;
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

    }
}
