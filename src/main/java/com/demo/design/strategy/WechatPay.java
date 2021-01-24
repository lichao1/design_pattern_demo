package com.demo.design.strategy;

/**
 * author lichao
 * date  2020/2/22 11:16
 **/
public class WechatPay extends Payment {
    @Override
    protected String getName() {
        return "微信支付";
    }

    @Override
    protected double querybalance() {
        return 100;
    }
}
