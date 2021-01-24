package com.demo.design.factory.simplefactory;


import com.demo.design.factory.ICourse;
import com.demo.design.factory.PythonCourse;

/**
 * author lichao
 * date  2020/2/17 9:11
 **/
public class CourseFactory {

    public static ICourse create(String name) {
        if (name.equals("java")) {
            return new JavaCourse();
        } else {
            return new PythonCourse();
        }
    }

    public static ICourse createByName(String name) {

        try {
            Class<?> aClass = Class.forName(name);
            return (ICourse) aClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public ICourse createByClass(Class clazz){
        try {

            return (ICourse) clazz.newInstance();
        }catch (Exception e){

        }
        return null;
    }
}