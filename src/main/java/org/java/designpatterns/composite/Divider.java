package org.java.designpatterns.composite;

/**
 * Created by mgupta on 8/4/16.
 */
public class Divider extends BinaryExpression {

    public Divider(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double getValue() {
        return left.getValue() / right.getValue();
    }
}