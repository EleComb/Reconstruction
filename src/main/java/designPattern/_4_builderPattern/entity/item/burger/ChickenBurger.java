package designPattern._4_builderPattern.entity.item.burger;

import designPattern._4_builderPattern.entity.item.Burger;

public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    public String name() {
        return "Chicken Burger";
    }
}