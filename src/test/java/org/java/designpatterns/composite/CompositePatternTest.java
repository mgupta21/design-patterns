package org.java.designpatterns.composite;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mgupta on 8/3/16.
 */
public class CompositePatternTest {

    @Test
    public void testExpression() throws Exception {
        double testValue = 2.0;
        Expression e = new Constant(testValue);
        Assert.assertEquals(testValue, e.getValue(), 0.0);
    }

    @Test
    public void testAdder() throws Exception {
        double testValueA = 2.0;
        double testValueB = 4.0;
        Expression e = new Add(testValueA, testValueB);
        Assert.assertEquals((testValueA + testValueB), e.getValue(), 0.0);
    }

    @Test
    public void testSubtract() throws Exception {
        double testValueA = 4.0;
        double testValueB = 2.0;
        Expression e = new Subtract(testValueA, testValueB);
        Assert.assertEquals((testValueA - testValueB), e.getValue(), 0.0);
    }
}
