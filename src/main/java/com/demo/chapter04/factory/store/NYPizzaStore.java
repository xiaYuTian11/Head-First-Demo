package com.demo.chapter04.factory.store;

import com.demo.chapter04.factory.entity.*;
import com.demo.chapter04.simplefactory.entity.PizzaType;

/**
 * @author TMW
 * @date 2020/8/5 9:57
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        switch (pizzaType) {
            case CHEESE:
                return new NYCheesePizza();
            case PEPPERONI:
                return new NYPepperoniPizza();
            case CLAM:
                return new NYClamPizza();
            case VEGGIE:
                return new NYVeggiePizza();
            default:
                return null;
        }
    }
}
