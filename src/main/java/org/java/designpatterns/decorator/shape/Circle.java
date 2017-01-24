package org.java.designpatterns.decorator.shape;

import org.apache.log4j.Logger;

/**
 * Created by mgupta on 1/23/17.
 */
public class Circle implements Shape {

    private static final Logger LOGGER = Logger.getLogger(Circle.class);

    @Override
    public void draw() {
        LOGGER.info("Shape : Circle");
    }
}
