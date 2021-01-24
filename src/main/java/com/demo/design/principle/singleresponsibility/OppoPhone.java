package com.demo.design.principle.singleresponsibility;

import java.math.BigDecimal;

/**
 * @Author: super
 * @Date: 2021/1/4
 */
public class OppoPhone implements IPhoneInfo,IPhoneAction {
    @Override
    public void call() {
        System.out.println("do call");
    }
    @Override
    public void surfInternet() {
        System.out.println("surf the Internet");
    }
    @Override
    public String getName() {
        return "OPPO";
    }
    @Override
    public BigDecimal getPrice() {
        return new BigDecimal("2699");
    }
}
