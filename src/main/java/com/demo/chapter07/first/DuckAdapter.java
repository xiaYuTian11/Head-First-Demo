package com.demo.chapter07.first;

/**
 * 鸭子火鸡适配器
 *
 * @author TMW
 * @date 2020/8/6 14:45
 */
public class DuckAdapter implements Turkey {
    Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
