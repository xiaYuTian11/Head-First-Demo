package com.demo.chapter05;

/**
 * @author TMW
 * @date 2020/8/5 15:22
 */
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        return uniqueInstance == null ? uniqueInstance = new Singleton() : uniqueInstance;
    }
}
