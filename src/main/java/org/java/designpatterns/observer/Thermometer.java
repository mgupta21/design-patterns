package org.java.designpatterns.observer;

/**
 * Created by mgupta on 1/6/17.
 */
public class Thermometer extends Observable {

    private final String KELVIN_FORMAT       = "%,.1fK";
    private final String CELCIUS_FORMAT      = "%,.1fC";
    private final String FAHRENHEIT_FORMAT   = "%,.1fF";
    public double        temperatureInKelvin = -1.0;

    void driverValue(long value) {
        this.temperatureInKelvin = value / 100.0;
        super.notifyDependents();
    }

    public String getTemperatureInKelvin() {
        return String.format(KELVIN_FORMAT, this.temperatureInKelvin);
    }

    public String getTemperatureInCelcius() {
        return String.format(CELCIUS_FORMAT, (this.temperatureInKelvin - 273.15));
    }

    public String getTemperatureInFahrenheit() {
        return String.format(FAHRENHEIT_FORMAT, (this.temperatureInKelvin - 273.15));
    }

}
