package com.demo.design.principle.segregation;

/**
 * @Author: super
 * @Date: 2021/1/9
 */
public class Cat implements IEatAnimal{
    @Override
    public void eat() {
        System.out.println("进食");
    }
}
