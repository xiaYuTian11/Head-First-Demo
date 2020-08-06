package com.demo.chapter07.first;

/**
 * @author TMW
 * @date 2020/8/6 14:37
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
