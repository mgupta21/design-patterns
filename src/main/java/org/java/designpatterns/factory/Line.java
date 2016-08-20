package org.java.designpatterns.factory;

/**
 * Created by mgupta on 8/20/16.
 */
public class Line implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a line");
    }
}
