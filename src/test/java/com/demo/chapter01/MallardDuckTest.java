package com.demo.chapter01;

import org.junit.jupiter.api.Test;

/**
 * strategy pattern(策略模式)  测试
 *
 * @author TMW
 * @date 2020/8/4 10:26
 */
class MallardDuckTest {

    @Test
    public void test() {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.performFly();
        mallardDuck.performQuack();
    }

}