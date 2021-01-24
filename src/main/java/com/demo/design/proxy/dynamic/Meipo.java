package cn.lichao.design.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * author lichao
 * date  2020/2/20 17:01
 **/
public class Meipo implements InvocationHandler {

    public Object target;

    public Meipo(Object target){
        this.target=target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行前做点什么");
       return method.invoke(target,args);
    }
}
