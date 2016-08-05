package org.java.designpatterns.composite;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mgupta on 8/3/16.
 */
public class CompositePatternTest {

    private static final double TEST_VALUE_A = 4.0;
    private static final double TEST_VALUE_B = 2.0;

    @Test
    public void testExpression() {
        Expression e = getConstant(TEST_VALUE_A);
        assertEquals(TEST_VALUE_A, e.getValue(), 0.0);
    }

    @Test
    public void testAdder() {
        Expression e = getAddExpression(TEST_VALUE_A, TEST_VALUE_B);
        assertEquals((TEST_VALUE_B + TEST_VALUE_A), e.getValue(), 0.0);
    }

    @Test
    public void testSubtracter() {
        Expression e = getSubtractExpression(TEST_VALUE_A, TEST_VALUE_B);
        assertEquals((TEST_VALUE_A - TEST_VALUE_B), e.getValue(), 0.0);
    }

    @Test
    public void testMultiplier() {
        Expression e = getMultiplyExpression(TEST_VALUE_A, TEST_VALUE_B);
        assertEquals((TEST_VALUE_A * TEST_VALUE_B), e.getValue(), 0.0);
    }

    @Test
    public void testDivider() {
        Expression e = getDivideExpression(TEST_VALUE_A, TEST_VALUE_B);
        assertEquals((TEST_VALUE_A / TEST_VALUE_B), e.getValue(), 0.0);
    }

    @Test
    public void testComplexExpression() {
        Expression e = new Divider(
                new Multiplier(
                        new Adder(new Constant(3.0), new Constant(5.0)),
                        new Constant(100.0)
                ),
                new Adder(new Constant(2.0), new Constant(64.0))
        );
        assertEquals(12.121212, e.getValue(), 0.000001);
    }

    private Expression getDivideExpression(double leftValue, double rightValue) {
        return new Divider(getConstant(leftValue), getConstant(rightValue));
    }

    private Expression getMultiplyExpression(double leftValue, double rightValue) {
        return new Multiplier(getConstant(leftValue), getConstant(rightValue));
    }

    private Expression getSubtractExpression(double leftValue, double rightValue) {
        return new Subtracter(getConstant(leftValue), getConstant(rightValue));
    }

    private Expression getAddExpression(double leftValue, double rightValue) {
        return new Adder(getConstant(leftValue), getConstant(rightValue));
    }

    private Constant getConstant(double leftValue) {
        return new Constant(leftValue);
    }

}
