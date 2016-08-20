package org.java.designpatterns.strategy;

/**
 * Created by mgupta on 9/9/16.
 */
public class SubtractStrategy implements Strategy {

    @Override
    public int doOperation(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction of '" + a + "' - '" + b + "' = " + result);
        return result;
    }

}
