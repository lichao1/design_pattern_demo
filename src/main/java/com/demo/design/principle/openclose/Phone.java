package com.demo.design.principle.openclose;

import java.math.BigDecimal;

/**
 * @Author: super
 * @Date: 2021/1/2
 */
public interface Phone {

    /**
     * 获取名字
     * @return
     */
    public  String getName();

    /**
     * 获取价格
     * @return
     */
    public BigDecimal getPrice();
}
