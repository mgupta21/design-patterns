package org.java.designpatterns.builder.restaurant;

/**
 * Created by mgupta on 1/26/17.
 */
public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public double price() {
        return 25.50d;
    }
}
