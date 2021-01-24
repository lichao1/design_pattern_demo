package com.demo.design.principle.liskov.v2;

import com.demo.design.principle.liskov.Rectangle;

/**
 * @Author: super
 * @Date: 2021/1/16
 */
public class Square  implements Quadrangle {
    private Integer length;

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Override
    public Integer getWidth() {
        return length;
    }

    @Override
    public Integer getHeight() {
        return length;
    }
}
