package _7;

import com.sun.org.apache.regexp.internal.REUtil;

import java.sql.Date;

/**
 * 引入本地扩展
 * */
public class Introduce_Local_Extension {
    class MfDateSub extends Date{

        public MfDateSub(int year, int month, int day) {
            super(year, month, day);
        }

        public MfDateSub(String dateString) {
            super(Long.parseLong(dateString));
        }

        public MfDateSub(Date arg) {
            super(arg.getTime());
        }

        Date nextDay() {
            return new Date(getYear(), getMonth(), getDate() + 1);
        }

        public int dayOfYear() {
            return 0;
        }
    }

    // 包装类
    class MfDateWrap {
        private Date original;

    }

}
