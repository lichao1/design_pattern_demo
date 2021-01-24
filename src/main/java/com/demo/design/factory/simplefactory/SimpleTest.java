package com.demo.design.factory.simplefactory;

import com.demo.design.factory.ICourse;
import com.demo.design.factory.PythonCourse;

/**
 * author lichao
 * date  2020/2/17 9:10
 **/
public class SimpleTest {

    public static void main(String[] args) {

        //ICourse byName = CourseFactory.createByName("cn.lichao.design.factory.simplefactory.JavaCourse");
        //byName.redcord();

        CourseFactory courseFactory = new CourseFactory();
        ICourse byClass = courseFactory.createByClass(PythonCourse.class);
        byClass.redcord();
    }
}
