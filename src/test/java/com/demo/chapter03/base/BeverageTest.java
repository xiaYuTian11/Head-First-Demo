package com.demo.chapter03.base;

import com.demo.chapter03.component.DarkRoast;
import com.demo.chapter03.component.Espresso;
import com.demo.chapter03.component.HouseBlend;
import com.demo.chapter03.decorator.Milk;
import com.demo.chapter03.decorator.Mocha;
import com.demo.chapter03.decorator.Soy;
import com.demo.chapter03.decorator.Whip;
import org.junit.jupiter.api.Test;

/**
 * @author TMW
 * @date 2020/8/4 15:07
 */
class BeverageTest {
    @Test
    public void test() {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2.setSize(SizeEnum.TALL);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Milk(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(SizeEnum.venti);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);

        System.out.println(beverage3.getDescription() + "  $" + beverage3.cost());

    }

}