package org.java.designpatterns.composite;

/**
 * Created by mgupta on 8/3/16.
 */
public class Add implements Expression {

    private final double valueB;
    private final double valueA;

    public Add(double a, double b) {
        this.valueA = a;
        this.valueB = b;
    }

    @Override
    public double getValue() {
        return valueA + valueB;
    }
}
