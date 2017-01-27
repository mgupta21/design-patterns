package org.java.designpatterns.builder.restaurant;

/**
 * Created by mgupta on 1/26/17.
 */
public class Pepsi extends ColdDrink {

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public double price() {
        return 1.50d;
    }
}
