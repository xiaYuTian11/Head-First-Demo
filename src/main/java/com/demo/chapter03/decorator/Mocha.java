package com.demo.chapter03.decorator;

import com.demo.chapter03.base.Beverage;
import com.demo.chapter03.base.SizeEnum;
import com.demo.chapter03.util.SizeCostUtil;

/**
 * 摩卡
 *
 * @author TMW
 * @date 2020/8/4 14:55
 */
public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public SizeEnum getSize() {
        return beverage.getSize();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }

    @Override
    public double cost() {
        System.out.println( beverage.cost() + .20d + SizeCostUtil.calculatePrice(getSize()));
        return beverage.cost() + .20d + SizeCostUtil.calculatePrice(getSize());
    }
}
