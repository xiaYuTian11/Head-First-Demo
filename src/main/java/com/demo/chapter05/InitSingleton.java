package com.demo.chapter05;

/**
 * 多线程单例
 *
 * @author TMW
 * @date 2020/8/5 15:22
 */
public class InitSingleton {
    private static InitSingleton uniqueInstance = new InitSingleton();

    private InitSingleton() {
    }

    public static synchronized InitSingleton getInstance() {
        return uniqueInstance;
    }
}
