package com.demo.design.decorator;

/**
 * author lichao
 * date  2020/2/25 17:40
 **/
public class Maintest {

    public static void main(String[] args) {
        PanCake base=new BasePanCake();
        System.out.println("名称："+base.getMsg()+"，价格："+base.getPrice());

        PanCake egg=new EggDecorator(new EggDecorator(base));

        System.out.println("名称："+egg.getMsg()+"，价格："+egg.getPrice());

        PanCake sausage=new SausageDecorator(egg);

        System.out.println("名称："+sausage.getMsg()+"，价格："+sausage.getPrice());
    }
}
