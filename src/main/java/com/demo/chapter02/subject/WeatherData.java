package com.demo.chapter02.subject;

import com.demo.chapter02.observer.Observer;

import java.util.ArrayList;

/**
 * 气象站数据
 *
 * @author TMW
 * @date 2020/8/4 10:46
 */
public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>(5);
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer -> observer.update(temperature, humidity, pressure));
    }

    /**
     * 测量数据变化
     */
    public void measurementsChanged() {
        notifyObserver();
    }

    /**
     *
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

    // other methods
}
