package _8;

import java.util.HashSet;
import java.util.Set;

/**
 * 将单向关联改为双向关联
 * */
public class _7_Change_Unidirectional_Association_to_Bidirectional {

    class Order {
        Customer customer;

        Customer getCustomer() {
            return customer;
        }

        void setCustomer(Customer customer) {
//            this.customer = customer;
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
    }
}
