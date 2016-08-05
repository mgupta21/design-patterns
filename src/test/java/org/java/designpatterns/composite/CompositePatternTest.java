package org.java.designpatterns.composite;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mgupta on 8/3/16.
 */
public class CompositePatternTest {

    private static final double TEST_VALUE_A = 4.0;
    private static final double TEST_VALUE_B = 2.0;

    @Test
    public void testExpression() throws Exception {
        Expression e = getConstant(TEST_VALUE_A);
        Assert.assertEquals(TEST_VALUE_A, e.getValue(), 0.0);
    }

    @Test
    public void testAdder() throws Exception {
        Expression e = getAddExpression(TEST_VALUE_A, TEST_VALUE_B);
        Assert.assertEquals((TEST_VALUE_B + TEST_VALUE_A), e.getValue(), 0.0);
    }

    @Test
    public void testSubtract() throws Exception {
        Expression e = getSubtractExpression(TEST_VALUE_A, TEST_VALUE_B);
        Assert.assertEquals((TEST_VALUE_A - TEST_VALUE_B), e.getValue(), 0.0);
    }

    @Test
    public void testMultiply() throws Exception {
        Expression e = getMultiplyExpression(TEST_VALUE_A, TEST_VALUE_B);
        Assert.assertEquals((TEST_VALUE_A * TEST_VALUE_B), e.getValue(), 0.0);
    }

    private Expression getMultiplyExpression(double leftValue, double rightValue) {
        return new Multiply(getConstant(leftValue), getConstant(rightValue));
    }

    private Expression getSubtractExpression(double leftValue, double rightValue) {
        return new Subtract(getConstant(leftValue), getConstant(rightValue));
    }

    private Expression getAddExpression(double leftValue, double rightValue) {
        return new Add(getConstant(leftValue), getConstant(rightValue));
    }

    private Constant getConstant(double leftValue) {
        return new Constant(leftValue);
    }

}
