package org.java.designpatterns.decorator.shape;

import org.apache.log4j.Logger;

/**
 * Created by mgupta on 1/23/17.
 */
public class Rectangle implements Shape {

    private static final Logger LOGGER = Logger.getLogger(Rectangle.class);

    @Override
    public void draw() {
        LOGGER.info("Shape : Rectangle");
    }
}
