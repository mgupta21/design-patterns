package org.java.designpatterns.strategy.math;

/**
 * Created by mgupta on 9/9/16.
 */
public class StrategyPatternDemo {

    static int a = 2;
    static int b = 11;

    public static void main(String[] args) {
        new Context(new AddStrategy()).executeStrategy(b, a);
        new Context(new SubtractStrategy()).executeStrategy(b, a);
        new Context(new MultiplyStrategy()).executeStrategy(b, a);
    }
}
