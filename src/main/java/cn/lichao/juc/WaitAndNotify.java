package cn.lichao.juc;

public class WaitAndNotify {

    public static void main(String[] args) {

        Object object=new Object();

        Producer p =new Producer(object);
        Consumer consumer = new Consumer(object);
        consumer.start();
        p.start();

    }
}
