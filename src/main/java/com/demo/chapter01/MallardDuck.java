package com.demo.chapter01;

import com.demo.chapter01.behavior.FlyWithWings;
import com.demo.chapter01.behavior.Quack;

/**
 * 绿头鸭
 *
 * @author TMW
 * @date 2020/8/4 10:17
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck!");
    }
}
