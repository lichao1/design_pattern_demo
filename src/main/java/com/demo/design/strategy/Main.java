package com.demo.design.strategy;

/**
 * author lichao
 * date  2020/2/22 11:30
 **/
public class Main {
    public static void main(String[] args) {
      Order order= new Order("qwqe","123",200.23);
        System.out.println(order.pay("wechat"));
    }
}
