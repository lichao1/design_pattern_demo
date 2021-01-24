package com.demo.design.principle.liskov.methodreturn;

import java.util.HashMap;
import java.util.Map;

public class Child extends Base {

    @Override
    public HashMap doWork(String key) {
        return null;
    }
}
