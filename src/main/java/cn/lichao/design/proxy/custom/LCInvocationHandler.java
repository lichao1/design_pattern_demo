package cn.lichao.design.proxy.custom;

import java.lang.reflect.Method;

public interface LCInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;

}
