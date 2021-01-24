package com.demo.design.observer.jdk;

import java.util.Observable;

/**
 * author lichao
 * date  2020/2/26 9:59
 **/
public class Personal extends Observable {

    void publish(Event event){

        System.out.println("发布朋友圈信息："+event);
        setChanged();
        notifyObservers(event);

    }

}
