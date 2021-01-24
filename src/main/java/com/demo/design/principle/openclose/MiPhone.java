package com.demo.design.principle.openclose;

import java.math.BigDecimal;

/**
 * @Author: super
 * @Date: 2021/1/2
 */
public class MiPhone implements Phone {

    private String name;

    private BigDecimal price;

    public MiPhone(String name,BigDecimal price) {
        this.name=name;
        this.price=price;
    }
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public BigDecimal getPrice() {
        return this.price;
    }
}
