package com.demo.design.factory.abstractfactory;

/**
 * author lichao
 * date  2020/2/18 10:54
 **/
public class MainTests {

    public static void main(String[] args) {


        IFactory  xiaomiFactory = new XiaomiFactory();
        xiaomiFactory.createComputer().work();
        xiaomiFactory.createPhone().call();


        IFactory   huaweiFactory =new HuaweiFactory();
        huaweiFactory.createComputer().work();
        huaweiFactory.createPhone().call();
    }
}
