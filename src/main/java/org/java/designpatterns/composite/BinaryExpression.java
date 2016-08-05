package org.java.designpatterns.composite;

/**
 * Created by mgupta on 8/4/16.
 */
// Created to prevent field and constructor code repetition in Adder, Multiplier ...
abstract public class BinaryExpression implements Expression {

    protected Expression left;
    protected Expression right;

    protected BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

}
