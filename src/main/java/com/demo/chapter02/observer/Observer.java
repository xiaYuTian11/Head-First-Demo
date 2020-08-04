package com.demo.chapter02.observer;

/**
 * 观察者
 *
 * @author TMW
 * @date 2020/8/4 10:41
 */
public interface Observer {
    /**
     * 更新消息
     *
     * @param temp     温度
     * @param humidity 湿度
     * @param pressure 压力
     */
    void update(float temp, float humidity, float pressure);
}
