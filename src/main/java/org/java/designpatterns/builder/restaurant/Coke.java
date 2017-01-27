package org.java.designpatterns.builder.restaurant;

/**
 * Created by mgupta on 1/26/17.
 */
public class Coke extends ColdDrink {

    @Override
    public String name() {
        return "Coca Cola";
    }

    @Override
    public double price() {
        return 1.50d;
    }
}
