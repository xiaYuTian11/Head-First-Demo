package com.demo.chapter01;

import com.demo.chapter01.behavior.FlyBehavior;
import com.demo.chapter01.behavior.QuackBehavior;

/**
 * @author TMW
 * @since 2020/7/30 12:01
 */
public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public abstract void display();

    public void swim() {
        System.out.println("All ducks float,even decoys!");
    }
}
