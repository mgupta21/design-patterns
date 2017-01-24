package org.java.designpatterns.decorator.graphics;

/**
 * Created by mgupta on 8/7/16.
 */
public abstract class Decorator implements GraphicalComponent {

    private GraphicalComponent next;

    // Abstract class cannot be instantiated but can have a constructor
    public Decorator(GraphicalComponent next) {
        this.next = next;
    }

    @Override
    public void paint() {
        this.next.paint();
    }

    @Override
    public GraphicalComponent addContent(Object content) {
        return this.next;
    }
}
