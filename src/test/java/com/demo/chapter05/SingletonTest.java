package com.demo.chapter05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author TMW
 * @date 2020/8/5 17:46
 */
class SingletonTest {

    @Test
    public void test(){
        Singleton instance = Singleton.getInstance();
        System.out.println(instance.equals(Singleton.getInstance()));

    }
}