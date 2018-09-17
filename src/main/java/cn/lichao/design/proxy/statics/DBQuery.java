package cn.lichao.design.proxy.statics;

public class DBQuery implements IDBQuery {

    public DBQuery() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String request() {
        return "request String";
    }
}
