package designPattern._4_builderPattern.entity.item;

import designPattern._4_builderPattern.entity.packing.Wrapper;
import designPattern._4_builderPattern.iml.Item;
import designPattern._4_builderPattern.iml.Packing;

public abstract class Burger implements Item {

    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();
}