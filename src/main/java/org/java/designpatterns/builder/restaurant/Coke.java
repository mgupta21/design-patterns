package org.java.designpatterns.builder.restaurant;

import org.java.designpatterns.ColdDrink;

/**
 * Created by mgupta on 1/26/17.
 */
public class Coke extends ColdDrink {

    @Override
    public String name() {
        return "Coca Cola";
    }

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public double price() {
        return 1.50d;
    }
}
