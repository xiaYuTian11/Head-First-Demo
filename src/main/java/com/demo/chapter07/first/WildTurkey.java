package com.demo.chapter07.first;

/**
 * @author TMW
 * @date 2020/8/6 14:38
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
