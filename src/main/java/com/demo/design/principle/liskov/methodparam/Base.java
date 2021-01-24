package com.demo.design.principle.liskov.methodparam;

import java.util.HashMap;

public class Base {
    public void doWork(HashMap map){
        System.out.println("父类执行");
    }
}
