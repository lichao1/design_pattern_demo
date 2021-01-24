package com.demo.design.principle.segregation;

/**
 * @Author: super
 * @Date: 2021/1/9
 */
public class Dog implements  IEatAnimal,ISwimAnimal{
    @Override
    public void eat() {
        System.out.println("进食");
    }

    @Override
    public void swim() {
        System.out.println("游泳");
    }
}
