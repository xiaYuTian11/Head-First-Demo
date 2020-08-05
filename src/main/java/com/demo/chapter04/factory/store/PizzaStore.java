package com.demo.chapter04.factory.store;

import com.demo.chapter04.factory.entity.Pizza;
import com.demo.chapter04.simplefactory.entity.PizzaType;

/**
 * pizza 商店
 *
 * @author TMW
 * @date 2020/8/5 9:45
 */
public abstract class PizzaStore {

    public Pizza orderPizza(PizzaType pizzaType) {
        Pizza pizza = createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(PizzaType pizzaType);
}
