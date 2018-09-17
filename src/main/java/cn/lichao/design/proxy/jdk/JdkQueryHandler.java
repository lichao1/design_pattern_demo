package cn.lichao.design.proxy.jdk;

import cn.lichao.design.proxy.statics.DBQuery;
import cn.lichao.design.proxy.statics.IDBQuery;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkQueryHandler implements InvocationHandler {
    IDBQuery real =null;
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       /* if(null==real){
            real=new DBQuery();
        }
        return real.request();*/
        System.out.println("method invoed "+method.getName());
        return  method.invoke(new DBQuery(), args);

    }
    //public static  IDBQuery
}
