package com.demo.design.delegate;

/**
 * author lichao
 * date  2020/2/22 10:54
 **/
public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.command("加密",new Leader());
    }
}
