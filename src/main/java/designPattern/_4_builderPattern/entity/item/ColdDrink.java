package designPattern._4_builderPattern.entity.item;

import designPattern._4_builderPattern.entity.packing.Bottle;
import designPattern._4_builderPattern.iml.Item;
import designPattern._4_builderPattern.iml.Packing;

public abstract class ColdDrink implements Item {

    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}