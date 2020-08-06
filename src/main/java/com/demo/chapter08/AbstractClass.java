package com.demo.chapter08;

/**
 * @author TMW
 * @date 2020/8/6 15:36
 */
public abstract class AbstractClass {
    final void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        concreteOperation();
        hook();
    }

    /**
     * 由子类实现具体逻辑
     */
    abstract void primitiveOperation1();

    /**
     * 由子类实现具体逻辑
     */
    abstract void primitiveOperation2();

    /**
     * 子类无法覆盖
     */
    final void concreteOperation() {

    }

    /**
     * 钩子方法，子类可以覆盖进行自定义
     */
    void hook() {

    }
}
