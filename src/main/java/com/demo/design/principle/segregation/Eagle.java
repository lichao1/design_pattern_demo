package com.demo.design.principle.segregation;

/**
 * @Author: super
 * @Date: 2021/1/9
 */
public class Eagle implements IEatAnimal,IFlyAnimal {
    @Override
    public void eat() {
        System.out.println("进食");
    }

    @Override
    public void fly() {
        System.out.println("飞翔");
    }
}
