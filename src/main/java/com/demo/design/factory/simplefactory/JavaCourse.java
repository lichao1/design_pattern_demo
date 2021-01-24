package com.demo.design.factory.simplefactory;

import com.demo.design.factory.ICourse;

/**
 * author lichao
 * date  2020/2/17 9:08
 **/
public class JavaCourse implements ICourse {
    @Override
    public void redcord() {
        System.out.println("开始录制java");
    }
}
