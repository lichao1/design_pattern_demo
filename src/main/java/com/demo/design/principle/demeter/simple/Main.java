package com.demo.design.principle.demeter.simple;

/**
 * @Author: super
 * @Date: 2021/1/10
 */
public class Main {
    public static void main(String[] args) {
        Mayor mayor = new Mayor();
        mayor.commandCheckCount(new VillageHead());
    }
}
