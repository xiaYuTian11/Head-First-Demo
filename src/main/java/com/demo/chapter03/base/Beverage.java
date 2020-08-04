package com.demo.chapter03.base;

/**
 * 饮料
 *
 * @author TMW
 * @date 2020/8/4 11:42
 */
public abstract class Beverage {

    public String description = "Unknown Beverage";
    public SizeEnum size;

    public String getDescription() {
        return description;
    }

    /**
     * 计算价格
     */
    public abstract double cost();

    public SizeEnum getSize() {
        return size;
    }

    public Beverage setSize(SizeEnum size) {
        this.size = size;
        return this;
    }
}
