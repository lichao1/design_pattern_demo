package com.demo.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * @Author: super_li
 * @Date: 2020/6/3 9:45
 */
public class DateAndTime {
    public static void main(String[] args) {
       /* LocalDate date = LocalDate.now();
        System.out.println("当前日期=" + date);
        LocalDate of = LocalDate.of(2020, 6, 3);
        System.out.println(of.equals(date));*/

        /*LocalTime time = LocalTime.now();
        System.out.println("当前时间=" + time);
        LocalTime newTime = time.plusHours(-2);
        System.out.println("newTime=" + newTime);

        // 日期增量
        LocalDate date = LocalDate.now();
        LocalDate newDate = date.plus(1, ChronoUnit.WEEKS);
        System.out.println("newDate=" + newDate);*/

        // 解析日期
        /*String dateText = "20180924";
        LocalDate date = LocalDate.parse(dateText, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("格式化之后的日期=" + date);

        // 格式化日期
        dateText = date.format(DateTimeFormatter.ISO_DATE);
        System.out.println("dateText=" + dateText);*/


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // 日期时间转字符串
        LocalDateTime now = LocalDateTime.now();
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        System.out.println("dayOfWeek name =="+ dayOfWeek.name());
        System.out.println("dayOfWeek name =="+ dayOfWeek.getValue());

        String nowText = now.format(formatter);
        System.out.println("nowText=" + nowText);

        // 字符串转日期时间
        String datetimeText = "1999-12-31 23:59:59";
        LocalDateTime datetime = LocalDateTime.parse(datetimeText, formatter);
        System.out.println(datetime);



    }
}
