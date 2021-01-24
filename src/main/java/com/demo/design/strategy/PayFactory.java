package com.demo.design.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * author lichao
 * date  2020/2/22 11:18
 **/
public class PayFactory {

    private static final String  ALIY="ali";
    private static final String  wechaY="wechat";


    private static Map<String,Payment> map=new HashMap<>();

    static {
        map.put(ALIY,new AliPay());
        map.put(wechaY,new WechatPay());
    }

    public static Payment getPayment(String key){
       return map.get(key);
    }
}
