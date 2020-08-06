package com.demo.chapter05;

/**
 * 多线程单例
 * 双重检查加锁
 * 多线程情况下，这种方式效率最高
 * volatile 内存可见性，但不能保证原子性
 * @author TMW
 * @date 2020/8/5 15:22
 */
public class DoubleCheckedLockingSingleton {
    private volatile static DoubleCheckedLockingSingleton uniqueInstance;

    private DoubleCheckedLockingSingleton() {
    }

    public static DoubleCheckedLockingSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return uniqueInstance;
    }
}
