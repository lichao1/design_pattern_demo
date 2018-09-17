package cn.lichao.design.proxy.statics;

public class DBQueryProxy implements IDBQuery {

     private DBQuery dbq=null;


    @Override
    public String request() {
        if (null==dbq){
            dbq=new DBQuery();
        }
        return dbq.request();
    }
}
