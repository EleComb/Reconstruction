package _6;

/**
 * 以函数对象取代函数
 * */
public class Replace_Method_with_Method_Object {

    /**
     * 局部变量混杂，无法提取：建立新类把它们做成成员变量。
     * */
    public double price() {
        double primaryBasePrice;
        double secondaryBasePrice;
        double tertiaryBasePrice;
        // long computation;
        return 0;
    }

    int gamma(int inputVal, int quantity, int yearToDate) {
        return new Gamma(this, inputVal, quantity, yearToDate).compute();
    }

    int delta() {
        return 0;
    }

    class Gamma {
        private Replace_Method_with_Method_Object account;
        private int inputVal;
        private int quantity;
        private int yearToDate;

        Gamma(Replace_Method_with_Method_Object account,int inputVal, int quantity, int yearToDate) {
            this.account = account;
            this.inputVal = inputVal;
            this.quantity = quantity;
            this.yearToDate = yearToDate;
        }

        /**
         * 现在，可以轻易对compute()里的函数提取方法了。
         * */
        int compute() {
            // and so on
            return getImportantValue3() - 2 * getImportantValue1();
        }

        private int getImportantValue3() {
            return getNewImportantValue2() * 7;
        }

        private int getNewImportantValue2() {
            int result = getImportantValue2();
            if((yearToDate - getImportantValue1()) > 1000)
                result -= 20;
            return result;
        }

        private int getImportantValue2() {
            return (inputVal * yearToDate) + 100;
        }

        private int getImportantValue1() {
            return (inputVal * quantity) + account.delta();
        }

    }

}
