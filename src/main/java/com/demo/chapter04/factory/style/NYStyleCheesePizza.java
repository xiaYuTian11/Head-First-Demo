package com.demo.chapter04.factory.style;

import com.demo.chapter04.factory.entity.Pizza;

/**
 * @author TMW
 * @date 2020/8/5 10:28
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
