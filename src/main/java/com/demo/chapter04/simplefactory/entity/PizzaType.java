package com.demo.chapter04.simplefactory.entity;

/**
 * pizza 类型
 *
 * @author TMW
 * @date 2020/8/5 9:37
 */
public enum PizzaType {
    CHEESE(1),
    PEPPERONI(2),
    CLAM(3),
    VEGGIE(4);

    PizzaType(int code) {
        this.code = code;
    }

    private int code;

    public int getCode() {
        return code;
    }

    public PizzaType setCode(int code) {
        this.code = code;
        return this;
    }
}
