package _7;

/**
 * 搬移字段。
 * */
public class _2_Move_Field {
    class Account {
        private AccountType type;

        //先生成构造方法Self Encapsulate Field(171)，再做委托更好用。
        public double getInterestRate() {
            return type.getInterestRate();
        }

        public void setInterestRate(double interestRate) {
            type.setInterestRate(interestRate);
        }

        double interestForAmount_days(double amount, int days) {
            return getInterestRate() * amount * days / 365;
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
