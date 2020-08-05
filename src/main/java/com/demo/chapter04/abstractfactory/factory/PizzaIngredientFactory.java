package com.demo.chapter04.abstractfactory.factory;

import com.demo.chapter04.abstractfactory.ingredient.*;

/**
 * 原料工厂
 *
 * @author TMW
 * @date 2020/8/5 14:35
 */
public interface PizzaIngredientFactory {
    Dough createDough();

    Sauce createSauce();

    Cheese creteCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();

}
