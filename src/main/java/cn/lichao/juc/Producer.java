package cn.lichao.juc;

public class Producer extends Thread {

    Object object;

    Producer(Object object){
      this.object=object;
    }

    @Override
    public void run() {
        synchronized (object){
        System.out.println("开始生产");
        try {
            Thread.sleep(1000*2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         object.notify();
        System.out.println("生产结束");
        }
    }
}
