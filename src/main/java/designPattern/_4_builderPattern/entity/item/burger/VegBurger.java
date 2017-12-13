package designPattern._4_builderPattern.entity.item.burger;

import designPattern._4_builderPattern.entity.item.Burger;

public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    public String name() {
        return "Veg burger";
    }
}
