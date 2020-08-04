package com.demo.chapter01.behavior;

/**
 * 具体实现飞行
 *
 * @author TMW
 * @since 2020/7/30 11:54
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("FlyWithWings ... ");
    }
}
