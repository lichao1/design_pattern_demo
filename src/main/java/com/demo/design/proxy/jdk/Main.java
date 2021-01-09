package cn.lichao.design.proxy.jdk;

import cn.lichao.design.proxy.statics.IDBQuery;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) throws Exception {

        IDBQuery oidb =(IDBQuery) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{IDBQuery.class}, new JdkQueryHandler());
        byte[] oidbs = ProxyGenerator.generateProxyClass("$oidb0", new Class[]{IDBQuery.class});
        FileOutputStream outputStream = new FileOutputStream("E://$oidb0.class");
        outputStream.write(oidbs);
        outputStream.close();

        System.out.println( oidb.request());
    }
}
