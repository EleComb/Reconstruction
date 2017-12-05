package _7;

import java.util.Date;

/**
 * 引入外加函数。
 * */
public class Introduce_Foreign_Method {

    private PriviousEnd previousEnd;

    public void test() {
        Date newStart = nextDay(previousEnd);
    }

    private Date nextDay(Date arg) {
        return new Date(arg.getYear(), arg.getMonth(), arg.getDate() + 1);
    }

    class PriviousEnd extends Date {

    }

}
