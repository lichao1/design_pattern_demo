package com.demo.design.principle.singleresponsibility;

import java.math.BigDecimal;

/**
 * @author super
 * @Date: 2021/1/4
 */
public class MiPhone implements IPhone {
    @Override
    public String getName() {
        return "小米";
    }
    @Override
    public BigDecimal getPrice() {
        return new BigDecimal("3999");
    }
    @Override
    public void call() {
        System.out.println("do call");
    }
    @Override
    public void surfInternet() {
        System.out.println("surf the Internet");
    }
}
