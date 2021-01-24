package com.demo.design.factory.factorymethod;

/**
 * author lichao
 * date  2020/2/18 10:12
 **/
public class PC extends  AbstractDigitalProduct {


    public PC(String name, String type){
        this.type=type;
        this.name=name;
    }

    @Override
    protected void work() {
        System.out.println(this.name+"=="+this.type);
    }
}
