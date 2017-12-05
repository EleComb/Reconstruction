package _7;

import java.util.Date;

/**
 * 引入外加函数。
 * */
public class Introduce_Foreign_Method {

    private PriviousEnd previousEnd;

    public void test() {
        Date newStart = new Date(previousEnd.getYear(), previousEnd.getMonth(), previousEnd.getDate() + 1);
    }

    class PriviousEnd {

        int getYear() {
            return 0;
        }

        int getMonth() {
            return 0;
        }

        int getDate() {
            return 0;
        }
    }

}
