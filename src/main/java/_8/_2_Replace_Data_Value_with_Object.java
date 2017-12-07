package _8;

import java.util.Collection;
import java.util.Iterator;

public class _2_Replace_Data_Value_with_Object {

    private static int numberOfOrdersFor(Collection orders, String customer) {
        int result = 0;
        Iterator iter = orders.iterator();
        while (iter.hasNext()) {
            Order each = (Order) iter.next();
            if(each.getCustomer().equals(customer)) result++;
        }
        return result;
    }

    class Order {

        private String customer;

        public Order(String customer) {
            this.customer = customer;
        }

        public String getCustomer() {
            return customer;
        }

        public void setCustomer(String customer) {
            this.customer = customer;
        }

    }

}
