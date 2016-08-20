package org.java.designpatterns.factory;

/**
 * Created by mgupta on 8/20/16.
 */
public interface Shape {

    void draw();

    static Shape create(String shapesAsText) {
        Shape retValue = null;
        if (shapesAsText.startsWith("#rect")) {
            retValue = new Rectangle();
        } else if (shapesAsText.startsWith("#oval")) {
            retValue = new Oval();
        } else if (shapesAsText.startsWith("#line")) {
            retValue = new Line();
        }
        return retValue;
    }

}
