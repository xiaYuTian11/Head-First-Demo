package com.demo.chapter03.decorator;

import com.demo.chapter03.base.Beverage;

/**
 * 调料装饰者
 *
 * @author TMW
 * @date 2020/8/4 14:38
 */
public abstract class CondimentDecorator extends Beverage {
    /**
     * 描述
     *
     * @return
     */
    @Override
    public abstract String getDescription();

}
