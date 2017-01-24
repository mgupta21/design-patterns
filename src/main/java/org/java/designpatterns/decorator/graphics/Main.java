package org.java.designpatterns.decorator.graphics;

/**
 * Created by mgupta on 8/7/16.
 */
public class Main {

    public static void main(String[] args) {
        GraphicalComponent tf = constructPoem();
        // To add border to text field here. 1) create sub class of TextField with border 2) or use decorator pattern

        // Wrap text field into border decorator
        tf = new BorderDecorator(tf);

        tf.paint();
    }

    private static GraphicalComponent constructPoem() {
        GraphicalComponent tf = new TextField();
        tf = tf.addContent("You may shoot me with your words,");
        tf = tf.addContent("You may cut me with your eyes,");
        tf = tf.addContent("You may kill me with your hatefulness,");
        tf = tf.addContent("But still, like air, I'll rise.");
        tf = tf.addContent("-- By Maya Angelou");
        return tf;
    }
}
