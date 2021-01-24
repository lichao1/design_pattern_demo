package com.demo.design.principle.singleresponsibility;

import java.math.BigDecimal;

/**
 * @Author: super
 * @Date: 2021/1/4
 */
public interface IPhoneInfo {

    /**
     * 获取名称
     * @return
     */
    public String getName();

    /**
     * 获取价格
     * @return
     */
    public BigDecimal getPrice();
}
