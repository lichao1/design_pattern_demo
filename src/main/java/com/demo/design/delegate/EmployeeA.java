package com.demo.design.delegate;

/**
 * author lichao
 * date  2020/2/22 10:48
 **/
public class EmployeeA implements IEmployee {
    @Override
    public void dowork() {
        System.out.println("我是员工A，我擅长加密。");
    }
}
