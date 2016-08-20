package org.java.designpatterns.factory;

/**
 * Created by mgupta on 8/20/16.
 */
public class Main {

    public static void main(String[] args) {
        String[] shapes = {
            "#rect 1,2,100,200",
            "#oval 1,1,100,100",
            "#line 1,4,15,20",
            "#rect 3,5,400, 600"
        };
        Client c = new Client();
        c.readShapes(shapes);
        c.drawAllShapes();

    }

}
