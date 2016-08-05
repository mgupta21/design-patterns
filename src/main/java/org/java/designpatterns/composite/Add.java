package org.java.designpatterns.composite;

/**
 * Created by mgupta on 8/3/16.
 */
public class Add extends BinaryExpression {

    public Add(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double getValue() {
        return left.getValue() + right.getValue();
    }
}
