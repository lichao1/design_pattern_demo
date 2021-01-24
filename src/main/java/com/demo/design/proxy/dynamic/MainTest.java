package cn.lichao.design.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * author lichao
 * date  2020/2/20 17:05
 **/
public class MainTest {
    public static void main(String[] args) {
        Person  instance = (Person)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Person.class}, new Meipo(new Girl()));
        instance.findLove();
    }
}
