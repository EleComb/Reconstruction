package _6;

/**
 * 以查询取代临时变量
 * */
public class Replace_Temp_with_Query {

    double quantity = 10, itemPrice = 10;

    public double test() {
        if(getBasePrice() > 1000) {
            return getBasePrice() * 0.95;
        } else {
            return getBasePrice() * 0.98;
        }
    }

    private double getBasePrice() {
        return quantity * itemPrice;
    }
}
