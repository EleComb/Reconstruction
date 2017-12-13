package designPattern._4_builderPattern.action;

import designPattern._4_builderPattern.entity.item.burger.ChickenBurger;
import designPattern._4_builderPattern.entity.item.burger.VegBurger;
import designPattern._4_builderPattern.entity.item.codeDrink.Coke;
import designPattern._4_builderPattern.entity.item.codeDrink.Pepsi;

public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}