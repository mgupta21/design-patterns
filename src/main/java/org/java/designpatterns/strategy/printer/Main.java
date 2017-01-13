package org.java.designpatterns.strategy.printer;

import java.util.Random;

/**
 * Created by mgupta on 1/13/17.
 */
public class Main {

    public static final int NUMBER_OF_JOBS          = 10;
    public static final int MAX_JOB_DURATION_IN_SEC = 2;

    public static void main(String[] args) {
        Random r = new Random();
        System.out.println("Starting Experiment");
        User u[] = {new User("Petter"), new User("John"), new User("Sue")};
        Printer p = new Printer();
        p.start();
        for (int i = 0; i < NUMBER_OF_JOBS; i++) {
            p.print(new Job(u[r.nextInt(u.length)], "Content set (Something rnadom = " + r.nextInt() + ") ", i));
        }

        try {
            // Sleeping for time to finish all jobs
            Thread.sleep(NUMBER_OF_JOBS * MAX_JOB_DURATION_IN_SEC * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        p.shutdownPrinter();
        System.out.println("Ending Experiment");

    }

}
