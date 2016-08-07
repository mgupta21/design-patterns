package org.java.designpatterns.adapter;

/**
 * Created by mgupta on 8/7/16.
 */
public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.create();
        logger.debug("Some debug message");
        logger.trace("Some trace message");
        logger.log("Some log message");
    }

}
