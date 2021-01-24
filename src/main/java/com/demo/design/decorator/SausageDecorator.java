package com.demo.design.decorator;

/**
 * author lichao
 * date  2020/2/25 17:36
 **/
public class SausageDecorator extends PanCake {

    private PanCake panCake;

    public SausageDecorator(PanCake panCake) {
        this.panCake = panCake;
    }

    @Override
    protected String getMsg() {
        return panCake.getMsg()+"加1个香肠";
    }

    @Override
    protected int getPrice() {
        return panCake.getPrice()+1;
    }
}
