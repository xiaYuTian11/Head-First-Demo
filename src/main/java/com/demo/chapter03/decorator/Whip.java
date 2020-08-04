package com.demo.chapter03.decorator;

import com.demo.chapter03.base.Beverage;
import com.demo.chapter03.base.SizeEnum;
import com.demo.chapter03.util.SizeCostUtil;

/**
 * 奶泡
 *
 * @author TMW
 * @date 2020/8/4 15:02
 */
public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public SizeEnum getSize() {
        return beverage.getSize();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Whip";
    }

    @Override
    public double cost() {
        return .10d + beverage.cost() + SizeCostUtil.calculatePrice(getSize());
    }
}
