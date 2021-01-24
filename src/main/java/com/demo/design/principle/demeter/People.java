package com.demo.design.principle.demeter;
/**
 * @Author: super
 * @Date: 2021/1/10
 */
public class People {

    /*** 村民编号*/
    private Integer id;
    /*** 是否做完检测*/
    private Boolean checked;

    public People(Integer id, Boolean checked) {
        this.id = id;
        this.checked = checked;
    }

    public Integer getId() {
        return id;
    }
    public Boolean getChecked() {
        return checked;
    }

}
