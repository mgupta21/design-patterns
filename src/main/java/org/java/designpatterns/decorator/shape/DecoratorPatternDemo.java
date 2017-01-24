package org.java.designpatterns.decorator.shape;

import org.apache.log4j.Logger;

/**
 * Created by mgupta on 1/23/17.
 */
public class DecoratorPatternDemo {

    private static final Logger LOGGER = Logger.getLogger(DecoratorPatternDemo.class);

    public static void main(String[] args) {

        LOGGER.info("\nDrawing simple circle");
        Shape circle = new Circle();
        circle.draw();

        LOGGER.info("\nDrawing colored circle");
        Shape redCircle = new RedShapeDecorator(new Circle());
        redCircle.draw();

        LOGGER.info("\nDrawing colored rectangle");
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        redRectangle.draw();

    }
}
