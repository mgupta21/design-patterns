package org.java.designpatterns.decorator;

/**
 * Created by mgupta on 8/7/16.
 */
public class BorderDecorator extends Decorator {
    public BorderDecorator(GraphicalComponent next) {
        super(next);
    }

    @Override
    public void paint() {
        System.out.println("# Render the border here...");
        super.paint();
    }
}
