package _7;

/**
 * 搬移字段。
 * */
public class Move_Field {
    class Account {
        private AccountType type;

        double interestForAmount_days(double amount, int days) {
            return type.getInterestRate() * amount * days / 365;
        }
    }

    class AccountType {

        public double getInterestRate() {
            return interestRate;
        }

        public void setInterestRate(double interestRate) {
            this.interestRate = interestRate;
        }

        private double interestRate;

        boolean isPremium() {
            return false;
        }

    }
}
