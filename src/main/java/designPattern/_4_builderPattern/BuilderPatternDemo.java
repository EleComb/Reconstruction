package designPattern._4_builderPattern;

import designPattern._4_builderPattern.action.Meal;
import designPattern._4_builderPattern.action.MealBuilder;

/**
 * 一步一步构造最终对象。
 * 产品有共同点，范围有限制。
 * */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());
    }


}