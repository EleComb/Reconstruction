package _7;

public class Move_Method {
    class Account {

        AccountType type;
        int daysOverdrawn = 10;

//        double overdraftCharge() {
//            return type.overdraftCharge(daysOverdrawn);
//        }

        double bankCharge() {
            double result = 4.5;
//            if(daysOverdrawn > 0) result += overdraftCharge();
            if(daysOverdrawn > 0) result += type.overdraftCharge(new Account());
            return result;
        }

        double getDaysOverDrawn() {
            return 0;
        }
    }

    class AccountType {
        boolean isPremium() {
            return false;
        }

        /**
         * 这个情况就要搬回去
         * */
        double overdraftCharge(Account account) {
            if(isPremium()) {
                double result = 10;
                if(account.getDaysOverDrawn() > 7) result += (account.getDaysOverDrawn() - 7) * 0.85;
                return result;
            } else {
                return account.getDaysOverDrawn() * 1.75;
            }
        }
    }
}
