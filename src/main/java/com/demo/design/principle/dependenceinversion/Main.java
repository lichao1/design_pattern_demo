package com.demo.design.principle.dependenceinversion;

/**
 * 测试主类
 * @Author: super
 * @Date: 2021/1/3
 */
public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        store.setPhone(new MiPhone());
        store.display();
        store.setPhone(new OppoPhone());
        store.display();
        store.setPhone(new VivoPhone());
        store.display();
    }
}
