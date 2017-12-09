package _8;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 * 将引用对象改为值对象
 * */
public class _4_Change_Reference_to_Value {

//    public static void main(String[] args) {
//
//        Currency.loadCustomers();
//        Currency usd = Currency.getNamed("USD");
//        System.out.println(usd);
//
//        System.out.println(new Currency("USD").equals(new Currency("USD"))); // not return false
//    }

    // 引用对象
    static class Currency {
        private String code;
        private static Dictionary instances = new Hashtable();

        public static Currency getNamed(String name) {
            return (Currency) instances.get(name);
        }

        static void loadCustomers() {
            new Currency("USD").store();
            new Currency("Associated Coffee Machines").store();
            new Currency("Bilston Gasworks").store();
        }

        private void store() {
            instances.put(this.getCode(), this);
        }

        public String getCode() {
            return code;
        }

        private Currency(String code) {
            this.code = code;
        }

        public boolean equals(Object arg) {
            if(! (arg instanceof Currency)) return false;
            Currency other = (Currency) arg;
            return code.equals(other.code);
        }
    }

}
