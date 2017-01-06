package org.java.designpatterns.observer;

/**
 * Created by mgupta on 1/6/17.
 */
public class ThermometerObserverClient implements Observer {

    public static void main(String[] args) {
        Setup ex = new Setup();
        ThermometerObserverClient client = new ThermometerObserverClient();
        ex.getThermometer().addObserver(client);
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        ex.shutdown();

    }

    @Override
    public void update(Observable o) {
        Thermometer t = (Thermometer) o;
        System.out.println("Checking temperature # " + t.getTemperatureInCelcius() + ", " + t.getTemperatureInFahrenheit() + ", " + t.getTemperatureInKelvin());
    }
}
