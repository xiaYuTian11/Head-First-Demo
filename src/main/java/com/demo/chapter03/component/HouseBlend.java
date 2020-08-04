package com.demo.chapter03.component;

import com.demo.chapter03.base.Beverage;

/**
 * 综合coffee
 *
 * @author TMW
 * @date 2020/8/4 14:44
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89d;
    }
}
