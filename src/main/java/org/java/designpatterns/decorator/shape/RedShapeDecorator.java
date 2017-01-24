package org.java.designpatterns.decorator.shape;

import org.apache.log4j.Logger;

/**
 * Created by mgupta on 1/23/17.
 */
public class RedShapeDecorator extends ShapeDecorator {

    private static final Logger LOGGER = Logger.getLogger(RedShapeDecorator.class);

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    protected void addBorderColor(Shape decoratedShape) {
        LOGGER.info("Shape border color : Red");
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        addBorderColor(decoratedShape);
    }

}
