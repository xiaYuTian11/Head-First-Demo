package com.demo.chapter04.factory.entity;

import java.util.ArrayList;

/**
 * Pizza 实体类
 *
 * @author TMW
 * @date 2020/8/5 9:36
 */
public abstract class Pizza {

    public String name;
    public String dough;
    public String sauce;

    public ArrayList<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Prepare " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("     " + toppings.get(i));
        }
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350..");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices...");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box...");
    }

    public String getName() {
        return name;
    }

    public Pizza setName(String name) {
        this.name = name;
        return this;
    }

    public String getDough() {
        return dough;
    }

    public Pizza setDough(String dough) {
        this.dough = dough;
        return this;
    }

    public String getSauce() {
        return sauce;
    }

    public Pizza setSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }
}
