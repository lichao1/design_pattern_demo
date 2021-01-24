package com.demo.design.factory.factorymethod;

/**
 * author lichao
 * date  2020/2/18 10:18
 **/
public class MainTest {

    public static void main(String[] args) {
        IFactory factory = new PhoneFactory();
        AbstractDigitalProduct abstractDigitalProduct = factory.create();
        abstractDigitalProduct.work();

        IFactory pfactory = new PCFactory();
        AbstractDigitalProduct pabstractDigitalProduct = pfactory.create();
        pabstractDigitalProduct.work();
    }
}
