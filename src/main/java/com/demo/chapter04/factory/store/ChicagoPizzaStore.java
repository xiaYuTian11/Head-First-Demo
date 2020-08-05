package com.demo.chapter04.factory.store;

import com.demo.chapter04.factory.entity.*;
import com.demo.chapter04.simplefactory.entity.PizzaType;

/**
 * @author TMW
 * @date 2020/8/5 10:36
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        // 懒得建实体类了
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
