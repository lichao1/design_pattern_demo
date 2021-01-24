package com.demo.design.principle.demeter.simple;

import com.demo.design.principle.demeter.People;
import java.util.ArrayList;

/**
 * @Author: super
 * @Date: 2021/1/10
 */
public class VillageHead {
    /**
     * 村长统计村民做核酸检测情况
     * @param peopleArrayList
     */
    public void checkCount(ArrayList<People> peopleArrayList) {
        int checked=0;
        int unCheck=0;
        for (People people : peopleArrayList) {
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
