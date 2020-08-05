package com.demo.chapter04.simplefactory.entity;

/**
 * Pizza 实体类
 *
 * @author TMW
 * @date 2020/8/5 9:36
 */
public interface Pizza {

    default void prepare() {
        System.out.println("prepare...");
    }

    default void bake() {
        System.out.println("bake...");
    }

    default void cut() {
        System.out.println("cut...");
    }

    default void box() {
        System.out.println("box...");
    }
}
