package com.caption.date;

import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName CalendarDemo
 * @Description 使用Calender实现加减日期
 * @Author xia
 * @Date 2020/5/18 18:57
 * @Version 1.0
 */
public class CalendarDemo {
    Calendar calendar =Calendar.getInstance();

    //以年为单位修改日期
    public Date addYear(Date date,int num){
        calendar.setTime(date);
        calendar.add(Calendar.YEAR,num);
        return calendar.getTime();
    }
    //以年为单位修改日期
    public Date addHours(Date date,int num){
        calendar.setTime(date);
        calendar.add(Calendar.HOUR,num);
        return calendar.getTime();
    }
    //以年为单位修改日期
    public Date addDay(Date date,int num){
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_YEAR,num);
        return calendar.getTime();
    }
}
