package com.demo.chapter04.factory.style;

import com.demo.chapter04.factory.entity.Pizza;

/**
 * @author TMW
 * @date 2020/8/5 10:32
 */
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish CHeese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the Pizza into square slices");
    }
}
