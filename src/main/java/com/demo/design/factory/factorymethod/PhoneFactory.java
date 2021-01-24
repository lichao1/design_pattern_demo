package com.demo.design.factory.factorymethod;

/**
 * author lichao
 * date  2020/2/18 10:17
 **/
public class PhoneFactory implements IFactory {
    @Override
    public AbstractDigitalProduct create() {
         return new Phone("xiaomi","4G");
    }
}
