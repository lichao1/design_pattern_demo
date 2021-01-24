package cn.lichao.design.proxy.dynamic;

/**
 * author lichao
 * date  2020/2/20 16:59
 **/
public class Girl implements Person {
    @Override
    public void findLove() {
        System.out.println("要求高度帅");
        System.out.println("身高178cm");
    }
}
