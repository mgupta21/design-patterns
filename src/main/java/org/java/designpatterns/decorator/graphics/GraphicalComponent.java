package org.java.designpatterns.decorator.graphics;

/**
 * Created by mgupta on 8/7/16.
 */
public interface GraphicalComponent {
    void paint();

    GraphicalComponent addContent(Object content);
}
