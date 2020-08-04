package com.demo.chapter02.jdk;

import java.util.Observable;

/**
 * @author TMW
 * @date 2020/8/4 11:17
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    /**
     * 测量数据变化
     */
    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    /**
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
