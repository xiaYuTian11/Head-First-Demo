package com.demo.chapter02.observer;

import com.demo.chapter02.subject.Subject;

/**
 * 统计布告板
 *
 * @author TMW
 * @date 2020/8/4 10:59
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
        // 构造方式注入，方便移除
        // weatherData.removerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("StatisticsDisplay: " + temperature + "F degrees and " + humidity + "% humidity" + "and " + pressure + " pressure");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
