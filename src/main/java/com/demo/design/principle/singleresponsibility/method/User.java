package com.demo.design.principle.singleresponsibility.method;

/**
 * @Author: super
 * @Date: 2021/1/4
 */
public class User {

    public void updateUserInfo(String name, String address){
        System.out.println("update name and address");
    }

    public void updateUserInfo(String name, String address,Boolean flag){
        if(flag){
         System.out.println("update name");
        }else {
         System.out.println("update address");
        }
    }

    public void updateUserName(String name){
        System.out.println("update name");
    }

    public void updateUserAddress(String address){
        System.out.println("update address");
    }
}
