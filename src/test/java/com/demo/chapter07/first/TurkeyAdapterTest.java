package com.demo.chapter07.first;

import org.junit.jupiter.api.Test;

/**
 * @author TMW
 * @date 2020/8/6 14:41
 */
class TurkeyAdapterTest {
    @Test
    public void test() {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("The Turkey says ...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says ...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says ...");
        testDuck(turkeyAdapter);
    }

    public void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}