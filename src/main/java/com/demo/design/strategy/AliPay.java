package com.demo.design.strategy;

/**
 * author lichao
 * date  2020/2/22 11:15
 **/
public class AliPay extends Payment {
    @Override
    protected String getName() {
        return "阿里支付";
    }

    @Override
    protected double querybalance() {
        return 500;
    }
}
