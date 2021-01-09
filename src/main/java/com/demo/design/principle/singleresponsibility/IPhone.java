package com.demo.design.principle.singleresponsibility;

import java.math.BigDecimal;

/**
 * @Author: super
 * @Date: 2021/1/4
 */
public interface IPhone {

    /*** 获取名称*/
    public String getName();

    /*** 获取价格*/
    public BigDecimal getPrice();

    /*** 打电话*/
    public void  call();

    /***上网*/
    public void  surfInternet();
}
