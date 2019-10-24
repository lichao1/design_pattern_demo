package cn.lichao.juc;

public class Consumer extends Thread {


   Object object;
   Consumer(Object object){
       this.object=object;
   }


    @Override
    public void run() {
       synchronized (object){
           System.out.println("开始消费");
           try {
               object.wait();
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           System.out.println("消费完成");
       }

    }
}
