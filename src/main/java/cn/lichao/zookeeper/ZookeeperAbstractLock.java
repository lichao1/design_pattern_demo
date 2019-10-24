package cn.lichao.zookeeper;

import org.I0Itec.zkclient.ZkClient;

public abstract class ZookeeperAbstractLock implements LcLock {

    private static final String CONNECTION="172.18.0.39:2181";
    protected ZkClient zkClient = new ZkClient(CONNECTION);
    protected String lockPath="/lockPath";

    @Override
    public void lock() {
        //1、连接zkClient 创建一个/lock的临时节点
        // 2、如果节点创建成果，直接执行业务逻辑，如果节点创建失败，进行等待
        if (tryLock()) {
            System.out.println("#####成功获取锁######");
        }else {
            //进行等待
            waitLock();
        }
    }

    @Override
    public void unlock() {
        //执行完毕 直接连接
        if (zkClient != null) {
            zkClient.close();
            System.out.println("######释放锁完毕######");
        }

    }

    protected abstract boolean tryLock();

    protected abstract void waitLock();


}
