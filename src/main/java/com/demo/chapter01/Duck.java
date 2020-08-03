package com.demo.chapter01;

import com.demo.chapter01.behavior.FlyBehavior;
import com.demo.chapter01.behavior.QuackBehavior;

/**
 * @author TMW
 * @since 2020/7/30 12:01
 */
public class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public void performQuack(){
        quackBehavior.quack();
    }
}
