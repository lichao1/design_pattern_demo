package com.demo.design.delegate;

/**
 * author lichao
 * date  2020/2/22 10:45
 **/
public class Boss {

    public void command(String name,Leader leader){
        leader.doWork(name);
    }
}
