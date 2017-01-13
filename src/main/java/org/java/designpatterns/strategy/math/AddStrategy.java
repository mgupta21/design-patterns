package org.java.designpatterns.strategy.math;

/**
 * Created by mgupta on 9/9/16.
 */
public class AddStrategy implements Strategy {

    @Override
    public int doOperation(int a, int b) {
        int result = a + b;
        System.out.println("Addition of '" + a + "' + '" + b + "' = " + result);
        return result;
    }

}
