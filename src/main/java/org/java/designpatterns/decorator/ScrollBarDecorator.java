package org.java.designpatterns.decorator;

/**
 * Created by mgupta on 8/7/16.
 */
public class ScrollBarDecorator extends Decorator {
    public ScrollBarDecorator(GraphicalComponent next) {
        super(next);
    }

    @Override
    public void paint() {
        System.out.println("# Render the scroll bar...");
        super.paint();
    }

}
