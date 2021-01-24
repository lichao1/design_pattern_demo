package com.demo.design.principle.segregation.simple;

/**
 * @Author: super
 * @Date: 2021/1/9
 */
public class Cat implements IAnimal {
    @Override
    public void eat() {
        System.out.println("进食");
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}
