package com.demo.design.principle.demeter.simple;

import com.demo.design.principle.demeter.People;
import java.util.ArrayList;

/**
 * @Author: super
 * @Date: 2021/1/10
 */
public class Mayor {

    /**
     * 命令村长统计村民做核酸检测情况
     */
    public void commandCheckCount( VillageHead villageHead){

        ArrayList<People> peopleArrayList = new ArrayList<>();

        //模拟出666村民的基本情况
        for (int i=0; i<666; i++){
            //模拟部分未做检测村民
            boolean checked= i%9==0?false:true;
            peopleArrayList.add(new People(i+1,checked));
        }
        //调用存在检查方法
        villageHead.checkCount(peopleArrayList);
    }
}
