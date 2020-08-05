package com.demo.chapter04.simplefactory.factory;

import com.demo.chapter04.simplefactory.entity.*;

/**
 * 简单的 Pizza 工厂
 *
 * @author TMW
 * @date 2020/8/5 9:36
 */
public class SimplePizzaFactory {

    public Pizza createPizza(PizzaType pizzaType) {
        switch (pizzaType) {
            case CHEESE:
                return new CheesePizza();
            case PEPPERONI:
                return new PepperoniPizza();
            case CLAM:
                return new ClamPizza();
            case VEGGIE:
                return new VeggiePizza();
            default:
                return null;
        }
    }
}
