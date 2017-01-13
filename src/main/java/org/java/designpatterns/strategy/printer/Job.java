package org.java.designpatterns.strategy.printer;

/**
 * Created by mgupta on 1/13/17.
 */
public class Job {

    private User   user;
    private int    id;
    private String jobDescription;

    public Job(User user, String desc, int id) {
        this.user = user;
        this.jobDescription = desc;
        this.id = id;
    }

    public User getUser() {
        return null;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public int getId() {
        return id;
    }
}
