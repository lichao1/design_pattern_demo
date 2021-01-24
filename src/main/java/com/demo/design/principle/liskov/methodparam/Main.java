package com.demo.design.principle.liskov.methodparam;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Object, Object> hashMap = new HashMap<>();

        Base base = new Base();
        //父类执行
        base.doWork(hashMap);

        Child child = new Child();
        //子类执行
        child.doWork(hashMap);
    }
}
