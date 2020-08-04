package com.demo.chapter03.component;

import com.demo.chapter03.base.Beverage;

/**
 * 深焙coffee
 *
 * @author TMW
 * @date 2020/8/4 14:49
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99d;
    }
}
