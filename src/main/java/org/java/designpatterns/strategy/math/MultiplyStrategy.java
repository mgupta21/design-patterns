package org.java.designpatterns.strategy.math;

/**
 * Created by mgupta on 9/9/16.
 */
public class MultiplyStrategy implements Strategy {

    @Override
    public int doOperation(int a, int b) {
		int result = a * b;
		System.out.println("Multiplication of '" + a + "' * '" + b + "' = " + result);
		return result;
    }

}
