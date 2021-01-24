package com.demo.design.observer.jdk;

/**
 * author lichao
 * date  2020/2/26 10:05
 **/
public class Event {

    private  String content;
    private  String date;

    public Event(String content, String date) {
        this.content = content;
        this.date = date;
    }

    @Override
    public String toString() {
        return "动态信息{" +
                "内容'" + content + '\'' +
                ", 日期'" + date + '\'' +
                '}';
    }
}
