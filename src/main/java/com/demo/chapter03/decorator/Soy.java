package com.demo.chapter03.decorator;

import com.demo.chapter03.base.Beverage;
import com.demo.chapter03.base.SizeEnum;
import com.demo.chapter03.util.SizeCostUtil;

/**
 * 豆浆
 *
 * @author TMW
 * @date 2020/8/4 15:00
 */
public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public SizeEnum getSize() {
        return beverage.getSize();
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Soy";
    }

    @Override
    public double cost() {
        return .15d + beverage.cost() + SizeCostUtil.calculatePrice(getSize());
    }
}
