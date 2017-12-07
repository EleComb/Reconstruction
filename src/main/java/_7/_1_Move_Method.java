package _7;

public class _1_Move_Method {
    class Account {

        AccountType type;
        int daysOverdrawn = 10;

//        double overdraftCharge() {
//            return type.overdraftCharge(daysOverdrawn);
//        }

        double bankCharge() {
            double result = 4.5;
//            if(daysOverdrawn > 0) result += overdraftCharge();
            if(daysOverdrawn > 0) result += overdraftCharge();
            return result;
        }

        /**
         * 这个情况就要搬回去
         * */
        double overdraftCharge() {
            if(type.isPremium()) {
                double result = 10;
                if(getDaysOverDrawn() > 7) result += (getDaysOverDrawn() - 7) * 0.85;
                return result;
            } else {
                return getDaysOverDrawn() * 1.75;
            }
        }

        double getDaysOverDrawn() {
            return 0;
        }
    }

    class AccountType {
        boolean isPremium() {
            return false;
        }


    }
}
