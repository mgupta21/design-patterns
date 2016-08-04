package org.java.designpatterns.composite;

/**
 * Created by mgupta on 8/3/16.
 */
public class Constant implements Expression {

    double value;

    Constant(double value) {
        this.value = value;
    }

    @Override
    public double getValue() {
        return value;
    }

}
