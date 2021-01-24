package com.demo.design.factory.abstractfactory;

/**
 * author lichao
 * date  2020/2/18 10:54
 **/
public class HuaweiFactory implements IFactory {
    @Override
    public IComputer createComputer() {
        return new HuaweiComputer();
    }

    @Override
    public IPhone createPhone() {
        return new HuaweiPone();
    }
}
