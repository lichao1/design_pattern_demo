package cn.lichao.design.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * author lichao
 * date  2020/2/20 20:41
 **/
public class MainTest {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Girls.class);
        enhancer.setCallback(new MeiPo());

        Girls girls = (Girls) enhancer.create();
        girls.findLove();
    }

}
