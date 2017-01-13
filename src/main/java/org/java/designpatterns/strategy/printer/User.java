package org.java.designpatterns.strategy.printer;

/**
 * Created by mgupta on 1/13/17.
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printJobComplete(Job j) {
        System.out.println("Job '" + j.getId() + " is complete");
    }
}
