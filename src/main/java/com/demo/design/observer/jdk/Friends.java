package com.demo.design.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * author lichao
 * date  2020/2/26 10:00
 **/
public class Friends implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Event event=(Event)arg;
        System.out.println("看到动态="+event);
    }
}
