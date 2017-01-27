package org.java.designpatterns.builder.restaurant;

/**
 * Created by mgupta on 1/26/17.
 */
public interface Item {

    String name();

    Packing packing();

    double price();

}
