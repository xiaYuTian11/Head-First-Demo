package com.demo.chapter04.factory.store;

import com.demo.chapter04.factory.entity.Pizza;
import com.demo.chapter04.simplefactory.entity.PizzaType;
import org.junit.jupiter.api.Test;

/**
 * @author TMW
 * @date 2020/8/5 10:35
 */
class PizzaStoreTest {

    @Test
    public void test() {
        PizzaStore nyStore = new NYPizzaStore();
        ChicagoPizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Ethan ordered a  " + pizza.getName() + "\n");
        pizza = chicagoStore.orderPizza(PizzaType.CLAM);
        System.out.println("Joel ordered a  " + pizza.getName() + "\n");
    }
}