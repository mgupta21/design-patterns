package org.java.designpatterns.decorator.shape;

/**
 * Created by mgupta on 1/23/17.
 */
public abstract class ShapeDecorator implements Shape {

    // Object to be wrapped
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    // Provide default functionality (Optional)
    @Override
    public void draw() {
        decoratedShape.draw();
    }

    // Add additional functionality
    protected abstract void addBorderColor(Shape decoratedShape);

}
