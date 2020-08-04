package com.demo.chapter03.decorator;

import com.demo.chapter03.base.Beverage;
import com.demo.chapter03.base.SizeEnum;
import com.demo.chapter03.util.SizeCostUtil;

/**
 * 牛奶
 *
 * @author TMW
 * @date 2020/8/4 14:57
 */
public class Milk extends CondimentDecorator {
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public SizeEnum getSize() {
        return beverage.getSize();
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Milk";
    }

    @Override
    public double cost() {
        System.out.println( .10d + beverage.cost() + SizeCostUtil.calculatePrice(getSize()));
        return .10d + beverage.cost() + SizeCostUtil.calculatePrice(getSize());
    }
}
