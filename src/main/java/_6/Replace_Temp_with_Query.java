package _6;

/**
 * 以查询取代临时变量
 * */
public class Replace_Temp_with_Query {

    int quantity = 10, itemPrice = 10;

    // 将两个临时变量去掉，一次一个。
    double getPrice() {
        int basePrice = quantity * itemPrice;
        double discountFactor;
        if(basePrice > 1000) discountFactor = 0.95;
        else discountFactor = 0.98;
        return basePrice * discountFactor;
    }

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
