package com.demo.design.principle.segregation.simple;

/**
 * @Author: super
 * @Date: 2021/1/9
 */
public interface IAnimal {

    /**
     * 吃行为方法
     */
    void  eat() ;

    /**
     *飞行为方法
     */
    void  fly();

    /**
     * 游泳行为方法
     */
    void swim();
}
