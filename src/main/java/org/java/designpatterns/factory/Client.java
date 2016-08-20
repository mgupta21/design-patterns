package org.java.designpatterns.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mgupta on 8/20/16.
 */
public class Client {

    private List<Shape> shapes;

    public Client() {
        this.shapes = new ArrayList<>();
    }

    public void readShapes(String[] shapesAsText) {
        for (String s : shapesAsText) {
            this.shapes.add(Shape.create(s));
        }
    }

    public void drawAllShapes() {
        shapes.forEach(s -> s.draw());
    }

}
