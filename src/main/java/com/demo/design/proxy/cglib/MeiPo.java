package cn.lichao.design.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * author lichao
 * date  2020/2/20 20:38
 **/
public class MeiPo implements MethodInterceptor {


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("对类增强===");
        Object object = methodProxy.invokeSuper(o, objects);
        return object;
    }
}
