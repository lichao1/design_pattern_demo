package com.demo.design.factory.factorymethod;

/**
 * author lichao
 * date  2020/2/18 10:23
 **/
public class PCFactory implements IFactory {
    @Override
    public AbstractDigitalProduct create() {
        return new PC("lianxing","yideng");
    }
}
