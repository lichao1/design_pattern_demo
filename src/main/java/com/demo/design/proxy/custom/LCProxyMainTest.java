package cn.lichao.design.proxy.custom;

import cn.lichao.design.proxy.statics.IDBQuery;

public class LCProxyMainTest {
    public static void main(String[] args) {

        IDBQuery oidb =(IDBQuery) LCProxy.newProxyInstance(new LCClassLoader(), new Class[]{IDBQuery.class}, new LCQueryHandler());
        oidb.request();
    }

}
