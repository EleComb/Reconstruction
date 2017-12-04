package _6;

import _6.source.Order;

/**
 * 内联临时变量
 * */
public class Inline_Temp {

    Order anOrder = new Order(10);

    public boolean basePriceIsBig() {
        double basePrice = anOrder.basePrice();
        return (basePrice > 1000);
    }

}
