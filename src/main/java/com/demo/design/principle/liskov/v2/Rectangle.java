package com.demo.design.principle.liskov.v2;

/**
 * @Author: super
 * @Date: 2021/1/16
 */
public class Rectangle implements Quadrangle {

    /**宽 */
    private Integer width;

    /**高 */
    private Integer height;

    @Override
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    @Override
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}
