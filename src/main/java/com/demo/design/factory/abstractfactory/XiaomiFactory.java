package com.demo.design.factory.abstractfactory;

/**
 * author lichao
 * date  2020/2/18 10:53
 **/
public class XiaomiFactory implements  IFactory{
    @Override
    public IComputer createComputer() {
        return new XiaomiComputer();
    }

    @Override
    public IPhone createPhone() {
        return new XiaomiPone();
    }
}
