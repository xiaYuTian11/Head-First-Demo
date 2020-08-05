package com.demo.chapter04.simplefactory.store;

import com.demo.chapter04.simplefactory.entity.Pizza;
import com.demo.chapter04.simplefactory.entity.PizzaType;
import com.demo.chapter04.simplefactory.factory.SimplePizzaFactory;
import org.junit.jupiter.api.Test;

/**
 * @author TMW
 * @date 2020/8/5 10:19
 */
class PizzaStoreTest {
    @Test
    public void test() {
        Pizza pizza = new PizzaStore(new SimplePizzaFactory()).orderPizza(PizzaType.CHEESE);
    }
}