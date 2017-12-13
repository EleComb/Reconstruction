package designPattern._4_builderPattern.entity.item.codeDrink;

import designPattern._4_builderPattern.entity.item.ColdDrink;

public class Coke extends ColdDrink {

    public float price() {
        return 30.0f;
    }

    public String name() {
        return "Coke";
    }
}