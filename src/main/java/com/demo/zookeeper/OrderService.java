package com.demo.zookeeper;

public class OrderService implements  Runnable {

    private OrderNumGenerator orderNumGenerator = new OrderNumGenerator(); // 定义成全局的
    private LcLock lock = new ZookeeperDistrbuteLock();

    @Override
    public void run() {
        getNumber();
    }

    public synchronized void getNumber() { // 加锁 保证线程安全问题 让一个线程操作
        try {
            lock.lock();
            String number = orderNumGenerator.getNumber();
            System.out.println(Thread.currentThread().getName() + ",number" + number);

        } catch (Exception e) {

        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
//        OrderService orderService = new OrderService();
        for (int i = 0; i < 100; i++) { // 开启100个线程
            //模拟分布式锁的场景
            new Thread(new OrderService()).start();
        }
    }
}
