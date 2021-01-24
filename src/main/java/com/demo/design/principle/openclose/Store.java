package com.demo.design.principle.openclose;
import java.math.BigDecimal;
/**
 * @Author: super
 * @Date: 2021/1/2
 */
public class Store {
    public static void main(String[] args) {
        Phone miPhone = new MiPhone("小米11", new BigDecimal(3999));
        System.out.println("商品名称："+miPhone.getName()+
                           "\n商品售价："+miPhone.getPrice());
        System.out.println("==============================");
        DiscountMiPhone discountMiPhone =
                new DiscountMiPhone("小米11", new BigDecimal(3999));
        System.out.println("商品名称："+discountMiPhone.getName()+
                        "\n商品原价："+discountMiPhone.getPrice()+
                        "\n商品售价："+discountMiPhone.getDisCountPrice());
    }
}
