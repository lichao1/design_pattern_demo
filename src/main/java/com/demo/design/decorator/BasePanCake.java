package com.demo.design.decorator;

/**
 * author lichao
 * date  2020/2/25 17:34
 **/
public class BasePanCake extends PanCake {
    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}
