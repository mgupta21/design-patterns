package org.java.designpatterns.observer;

/**
 * Created by mgupta on 1/6/17.
 */
public class Driver extends Thread {

    public static final long  AVG_TIME_BETWEEN_UPDATES_IN_SEC = 5;
    private static final long RANGE_OF_CHANGE                 = 100;
    public int                updateCount                     = 0;
    private long              value                           = 30000;
    private Thermometer       thermometer;
    private boolean           shutdown;

    public Driver(Thermometer t) {
        this.thermometer = t;
    }

    @Override
    public void run() {
        try {
            while (!this.shutdown) {
                this.value += (long) (Math.random() * RANGE_OF_CHANGE) - (RANGE_OF_CHANGE / 2);
                this.updateCount++;
                System.out.println("Driver Update #" + this.updateCount + ": " + this.value);
                this.thermometer.driverValue(this.value);
                Thread.sleep((long) (Math.random() * AVG_TIME_BETWEEN_UPDATES_IN_SEC * 1000));
            }
        } catch (Exception e) {
        }
    }

    public void shutdown() {
        this.shutdown = true;
    }

}
