package _6;

import _6.source.Order;

/**
 * 内联临时变量
 * */
public class _3_Inline_Temp {

    Order anOrder = new Order(100);

    public boolean basePriceIsBig() {
        return (anOrder.basePrice() > 1000);
    }

}
