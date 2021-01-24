package com.demo.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: super
 * @Date: 2021/1/10
 */
public class VillageHead {

    /*** 村长统计村民做核酸检测情况*/
    public void checkCount() {
         List<People> peopleList = new ArrayList<>();
        //模拟出666村民的基本情况
        for (int i=0; i<666; i++){
            boolean checked= i%9==0?false:true;
            peopleList.add(new People(i+1,checked));
        }
        int checked=0;
        int unCheck=0;
        for (People people : peopleList) {
            if (people.getChecked()){
                checked++;
            }else {
                unCheck++;
            }
        }
        System.out.println("已经做完核酸检测人数："+checked+"\n"+
                           "未做核酸检测人数："+unCheck);
    }
}
