package com.demo.design.principle.openclose;

import java.math.BigDecimal;

/**
 * @Author: super
 * @Date: 2021/1/2
 */
public class DiscountMiPhone extends  MiPhone {

    public DiscountMiPhone(String name, BigDecimal price) {
        super(name, price);
    }

    /**
     * 直接获取打折后的价格
     * @return
     */
    public BigDecimal getDisCountPrice() {
        return super.getPrice().multiply(BigDecimal.valueOf(0.9));
    }
}
