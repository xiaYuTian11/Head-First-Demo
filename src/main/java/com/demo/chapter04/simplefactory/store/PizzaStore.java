package com.demo.chapter04.simplefactory.store;

import com.demo.chapter04.simplefactory.entity.Pizza;
import com.demo.chapter04.simplefactory.entity.PizzaType;
import com.demo.chapter04.simplefactory.factory.SimplePizzaFactory;

/**
 * pizza 商店
 *
 * @author TMW
 * @date 2020/8/5 9:45
 */
public class PizzaStore {
    SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public Pizza orderPizza(PizzaType pizzaType) {
        Pizza pizza = simplePizzaFactory.createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
