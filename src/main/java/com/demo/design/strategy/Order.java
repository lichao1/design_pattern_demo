package com.demo.design.strategy;

/**
 * author lichao
 * date  2020/2/22 11:01
 **/
public class Order {

    private String uid;
    private String orderID;
    private double amount;

    public Order(String uid, String orderID, double amount) {
        this.uid = uid;
        this.orderID = orderID;
        this.amount = amount;
    }

      public MsgResult pay(String payKey){
        return PayFactory.getPayment(payKey).pay("1",amount);
      }
}
