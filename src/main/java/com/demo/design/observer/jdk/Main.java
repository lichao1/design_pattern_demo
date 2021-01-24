package com.demo.design.observer.jdk;

/**
 * author lichao
 * date  2020/2/26 10:09
 **/
public class Main {

    public static void main(String[] args) {
        Personal personal = new Personal();
        personal.addObserver(new Friends());
        personal.publish(new Event("今天找到一个好工作","2020/02/26"));


    }
}
