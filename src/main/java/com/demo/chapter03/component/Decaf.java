package com.demo.chapter03.component;

import com.demo.chapter03.base.Beverage;

/**
 * 低咖啡因
 *
 * @author TMW
 * @date 2020/8/4 14:50
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05d;
    }
}
