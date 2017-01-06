package org.java.designpatterns.observer;

/**
 * Created by mgupta on 1/6/17.
 */
public class ThermometerPollingClient {

    private static final long SEC_TO_RUN       = 15;
    private static final long MS_BETWEEN_POLLS = 50;

    public static void main(String[] args) {
        Setup ex = new Setup();
        Thermometer t = ex.getThermometer();
        long count = SEC_TO_RUN * 1000 / MS_BETWEEN_POLLS;

        try {
            for (int i = 0; i < count; i++) {
                Thread.sleep(MS_BETWEEN_POLLS);
                System.out.println("Checking temperature # " + i + ": " + t.getTemperatureInCelcius() + ", " + t.getTemperatureInFahrenheit() + ", " + t.getTemperatureInKelvin());
            }

        } catch (Exception e) {
        }

        ex.shutdown();
    }
}
