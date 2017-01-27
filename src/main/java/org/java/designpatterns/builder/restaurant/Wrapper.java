package org.java.designpatterns.builder.restaurant;

/**
 * Created by mgupta on 1/26/17.
 */
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}
