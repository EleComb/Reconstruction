package _7;

/**
 * 搬移字段。
 * */
public class Move_Field {
    class Account {
        private AccountType type;
        private double interestRate;

        double interestForAmount_days(double amount, int days) {
            return interestRate * amount * days / 365;
        }
    }

    class AccountType {
        
        boolean isPremium() {
            return false;
        }

    }
}
