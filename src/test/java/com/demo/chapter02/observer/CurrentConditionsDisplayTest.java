package com.demo.chapter02.observer;

import com.demo.chapter02.subject.WeatherData;
import org.junit.jupiter.api.Test;

/**
 * @author TMW
 * @date 2020/8/4 11:09
 */
class CurrentConditionsDisplayTest {
    @Test
    public void test() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        PrecastDisplay precastDisplay = new PrecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}