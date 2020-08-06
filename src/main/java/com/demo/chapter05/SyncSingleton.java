package com.demo.chapter05;

/**
 * 多线程单例
 *
 * @author TMW
 * @date 2020/8/5 15:22
 */
public class SyncSingleton {
    private static SyncSingleton uniqueInstance;

    private SyncSingleton() {
    }

    public static synchronized SyncSingleton getInstance() {
        return uniqueInstance == null ? uniqueInstance = new SyncSingleton() : uniqueInstance;
    }
}
