package com.demo.design.principle.dependenceinversion;

/**
 * @Author: super
 * @Date: 2021/1/3
 */
public class Store {
    /**
     * 定义手机属性，依赖抽象
     */
    private IPhone phone;
    /**
     * 提供一个注入方法
     * @param phone
     */
    public void setPhone(IPhone phone) {
        this.phone = phone;
    }
    /**
     * 商城展售方法
     */
    public void display(){
        phone.display();
    }
}
