package com.demo.chapter02.subject;

import com.demo.chapter02.observer.Observer;

/**
 * 主题，被观察者，Observable
 *
 * @author TMW
 * @date 2020/8/4 10:38
 */
public interface Subject {
    /**
     * 注册观察者
     *
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     *
     * @param observer
     */
    void removerObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObserver();

}
