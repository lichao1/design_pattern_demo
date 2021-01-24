package com.demo.design.principle.liskov;

public class MainTest {
    /**
     * 改变宽和高
     * @param rectangle
     */
    public static void resize(Rectangle rectangle){
        while (rectangle.getWidth()>=rectangle.getHeight()){
            rectangle.setHeight(rectangle.getHeight()+1);
            System.out.println("width:"+rectangle.getWidth()+"，height:"+rectangle.getHeight());
        }
        System.out.println("resize end， width:"+rectangle.getWidth()+"，height:"+rectangle.getHeight());
    }
    public static void main(String[] args) {
        Square square = new Square();
        square.setWidth(10);
        square.setHeight(5);
        resize(square);
    }
}
