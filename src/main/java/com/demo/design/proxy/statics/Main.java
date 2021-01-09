package cn.lichao.design.proxy.statics;

public class Main {
    public static void main(String[] args) {
        IDBQuery  db=new DBQueryProxy();
        System.out.println(db.request());
    }
}
