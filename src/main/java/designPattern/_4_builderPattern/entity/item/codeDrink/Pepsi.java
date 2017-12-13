package designPattern._4_builderPattern.entity.item.codeDrink;

import designPattern._4_builderPattern.entity.item.ColdDrink;

public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    public String name() {
        return "Pepsi";
    }
}