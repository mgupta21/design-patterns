package org.java.designpatterns.observer;

/**
 * Created by mgupta on 1/6/17.
 */
public class Setup {

    private Driver      driver;
    private Thermometer thermometer;

    public Setup() {
        this.thermometer = new Thermometer();
        this.driver = new Driver(this.thermometer);
        this.driver.start();
    }

    public void shutdown() {
        this.driver.shutdown();
    }

    public Thermometer getThermometer() {
        return this.thermometer;
    }

}
