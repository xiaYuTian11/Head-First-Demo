package com.demo.chapter03.component;

import com.demo.chapter03.base.Beverage;

/**
 * 浓缩Coffee
 *
 * @author TMW
 * @date 2020/8/4 14:42
 */
public class Espresso extends Beverage {

    public Espresso(){
        description = "Espresso Coffee";
    }

    @Override
    public double cost() {
        return 1.99d;
    }
}
