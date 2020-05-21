package com.caption.date;

import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName CalendarUtil
 * @Description 使用Calendar类获取日期年份，月份等
 * @Author xia
 * @Date 2020/5/18 14:00
 * @Version 1.0
 */
public class CalendarUtil {

    private static Calendar calendar=Calendar.getInstance();

    /**
     * 获取日期年份
     * @param date
     * @return
     */
    public static int getYear(Date date){
        calendar.setTime(date);
        return calendar.get(Calendar.YEAR);
    }

    /**
     * 获取月份
     * @param date
     * @return
     */
    public static int getMonth(Date date){
        calendar.setTime(date);
        return calendar.get(Calendar.MONTH)+1;
    }

    /**
     * 获取日期
     * @param date
     * @return
     */
    public static int getDayOfMonth(Date date){
        calendar.setTime(date);
        return calendar.get(Calendar.DAY_OF_MONTH);
    }
    //获取星期
    public static int getDayOfWeek(Date date){
        calendar.setTime(date);
        int week=calendar.get(Calendar.DAY_OF_WEEK);
        //每周的第一天是星期日
        if(week==1){
            return 7;
        }
        return week-1;
    }
    //获取今天在本年的第几天
    public static int getDayOfYear(Date date){
        calendar.setTime(date);
        return calendar.get(Calendar.DAY_OF_YEAR);
    }
    //获取季度
    public static int getQuarter(Date date){
        calendar.setTime(date);
        int num= calendar.get(Calendar.MONTH)/3;
        return num+1;
    }
}
