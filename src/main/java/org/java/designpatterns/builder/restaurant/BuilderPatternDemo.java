package org.java.designpatterns.builder.restaurant;

import org.apache.log4j.Logger;

/**
 * Created by mgupta on 1/26/17.
 */
public class BuilderPatternDemo {

    private static final Logger LOGGER = Logger.getLogger(BuilderPatternDemo.class);

    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();

        LOGGER.info("\n\n# Vegetarian Meal");
        Meal vegMeal = builder.prepareVegMeal();
        vegMeal.showItems();
        LOGGER.info("\n>> Veg. Meal Cost : $" + vegMeal.getBill());

        LOGGER.info("\n\n# Non-Vegetarian Meal");
        Meal nonVegMeal = builder.prepareNonVegMeal();
        nonVegMeal.showItems();
        LOGGER.info("\n>> Non-Veg. Meal Cost : $" + nonVegMeal.getBill());

    }
}
