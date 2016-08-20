package org.java.designpatterns.strategy;

/**
 * Created by mgupta on 9/9/16.
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b) {
        return strategy.doOperation(a, b);
    }

}
