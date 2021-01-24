package cn.lichao.design.proxy.jdk;

/**
 * author lichao
 * date  2020/2/21 18:04
 **/
public class Test {

    public static void main(String[] args) {
        int chchr=0;
        int enchar=0;
        int numchar=0;

        String s = "中2044国2018广州China";
        char[] chars = s.toCharArray();
        System.out.println(chars[2]>0 && chars[2]<10);

        for(int i=0;i<chars.length;i++){
            System.out.println(chars[i]);
            if(47<chars[i] && chars[i]<58){
                numchar++;
            }else if((64<chars[i]&& chars[i]<91)||(96<chars[i]&& chars[i]<113) ){
                enchar++;
            }else{
                chchr++;
            }

        }

        System.out.println("中文="+chchr);
        System.out.println("英文="+enchar);
        System.out.println("数字="+numchar);
    }

}
