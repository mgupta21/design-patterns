package org.java.designpatterns.strategy.printer;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by mgupta on 1/13/17.
 */
public class Printer extends Thread {

    private boolean   shouldRun = true;
    private List<Job> jobs;

    public Printer() {
        this.jobs = new LinkedList<>();
    }

    public void run() {
        while (shouldRun) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Job j;
            synchronized (this) {
                j = this.getNextJob();
            }
            if (j != null) {
                this.printJob(j);
                synchronized (this) {
                    this.removeJob();
                }
            }
            this.informUser(j);
        }
    }

    private void removeJob() {
        this.jobs.remove(0);
    }

    private void informUser(Job j) {
        if (j.getUser() != null) {
            System.out.println("Notifying the user : " + j.getUser().getName() + " that job is done");
            j.getUser().printJobComplete(j);
        }
    }

    private String getJobAsPrinterLanguage(Job j) {
        String retVal = new StringBuilder(j.getJobDescription().toUpperCase()).reverse().toString();
        System.out.println("Translated : " + j.getJobDescription() + " ---> " + retVal);
        return retVal;
    }

    synchronized public void print(Job job) {
        this.jobs.add(job);
    }

    private void printJob(Job j) {
        try {
            System.out.println("\nStart job " + j.getId());
            Thread.sleep(1000);
            System.out.println("Printed: " + this.getJobAsPrinterLanguage(j));
            Thread.sleep(1000);
            System.out.println("End of job " + j.getId() + "\n");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private Job getNextJob() {
        if (this.jobs.isEmpty()) {
            return null;
        }
        return jobs.get(0);
    }

    public void shutdownPrinter() {
        this.shouldRun = false;

    }
}
