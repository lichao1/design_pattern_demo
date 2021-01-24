package com.demo.design.strategy;

/**
 * author lichao
 * date  2020/2/22 11:10
 **/
public abstract class Payment {

    protected abstract String getName();

    protected abstract double querybalance();

    protected  MsgResult pay(String uid,Double amonut){
        if (querybalance()<amonut){

           return new MsgResult(500,"余额不足","支付失败");
        }else{
           return new MsgResult(200,"支付金额"+amonut,"支付成功");
        }
    }
}
