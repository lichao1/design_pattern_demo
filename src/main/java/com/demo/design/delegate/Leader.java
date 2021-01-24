package com.demo.design.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * author lichao
 * date  2020/2/22 10:46
 **/
public class Leader {


    private static Map<String,IEmployee> map=new HashMap();

    static {
        map.put("加密",new EmployeeA());
        map.put("设计",new EmployeeB());
    }

    void doWork(String command){
        map.get(command).dowork();
    }

}
