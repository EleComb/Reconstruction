package _6;

/**
 * 以查询取代临时变量
 * */
public class Replace_Temp_with_Query {

    double quantity = 10, itemPrice = 10;

    public double test() {
        double basePrice = quantity * itemPrice;
        if(basePrice > 1000) {
            return basePrice * 0.95;
        } else {
            return basePrice * 0.98;
        }
    }
}
