package com.demo.design.principle.demeter;

/**
 * @Author: super
 * @Date: 2021/1/10
 */
public class Mayor {

    /**
     * 命令村长统计村民做核酸检测情况
     */
    public void commandCheckCount( VillageHead villageHead){
        villageHead.checkCount();
    }
}
