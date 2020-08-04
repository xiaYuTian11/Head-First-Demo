package com.demo.chapter01.behavior;

/**
 * 呱呱叫
 *
 * @author TMW
 * @since 2020/7/30 11:56
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack ... ");
    }
}
