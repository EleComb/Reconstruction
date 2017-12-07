package _7;

import java.util.Date;

/**
 * 引入本地扩展
 * */
public class _8_Introduce_Local_Extension {
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

        public MfDateWrap(String dateString) {
            original = new Date(Long.parseLong(dateString));
        }

        public MfDateWrap (Date arg) {
            original = arg;
        }

        public int getYear() {
            return original.getYear();
        }

        public int getMonth() {
            return original.getMonth();
        }

        public int getDate() {
            return original.getDate();
        }

        public boolean equals(Object arg) {
            if(this == arg) return true;
            if(!(arg instanceof MfDateWrap)) return false;
            MfDateWrap other = (MfDateWrap) arg;
            return original.equals(other.original);
        }

        Date nextDay() {
            return new Date(getYear(), getMonth(), getDate() + 1);
        }

        public boolean after(Date arg) {
            return false;
        }

    }

    public static void main(String[] args) {
    }

}
