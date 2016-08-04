package org.java.designpatterns.composite;

/**
 * Created by mgupta on 8/3/16.
 */
public class Subtract implements Expression {
    private final double valueA;
    private final double valueB;

    public Subtract(double a, double b) {
        this.valueA = a;
        this.valueB = b;
    }

    @Override
    public double getValue() {
        return valueA - valueB;
    }
}
