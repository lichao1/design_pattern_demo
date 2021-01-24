package com.demo.design.principle.dependenceinversion;

/**
 * @Author: super
 * @Date: 2021/1/3
 */
public class MiPhone implements IPhone {
    @Override
    public void display() {
        System.out.println("商城正在展售小米手机");
    }
}
