package com.demo.design.principle.liskov.methodparam;

import java.util.Map;

public class Child extends Base {
    /**
     * 重载父类方法
     * @param map
     */
    public void doWork(Map map) {
        System.out.println("子类执行");
    }
}
