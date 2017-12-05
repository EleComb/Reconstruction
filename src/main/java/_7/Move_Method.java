package _7;

public class Move_Method {
    class Account {

        AccountType type;
        int daysOverdrawn = 10;

        double overdraftCharge() {
            if(type.isPremium()) {
                double result = 10;
                if(daysOverdrawn > 7) result += (daysOverdrawn - 7) * 0.85;
                return result;
            } else {
                return daysOverdrawn * 1.75;
            }
        }

        double bankCharge() {
            double result = 4.5;
            if(daysOverdrawn > 0) result += overdraftCharge();
            return result;
        }
    }

    class AccountType {
        boolean isPremium() {
            return false;
        }
    }
}
