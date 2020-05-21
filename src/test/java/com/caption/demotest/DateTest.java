package com.caption.demotest;

import com.caption.date.CalendarUtil;
import com.caption.date.ChangeDateUtil;
import com.caption.date.DateUtil;
import com.caption.date.FormatDateUtil;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName DateTest
 * @Description 用来测试Date工具类
 * @Author xia
 * @Date 2020/5/18 14:26
 * @Version 1.0
 */
public class DateTest {

    //取系统当前时间对CalenderUtils中的方法进行输出打印测试
    @Test
    public void getTimeInfo(){
        Date date = new Date();
        System.out.println(CalendarUtil.getYear(date)+"年");
        System.out.println(CalendarUtil.getMonth(date)+"月");
        System.out.println(CalendarUtil.getDayOfMonth(date)+"号");
        System.out.println("星期"+ CalendarUtil.getDayOfWeek(date));
        System.out.println("本年第"+ CalendarUtil.getDayOfYear(date)+"天");
        System.out.println("本年第"+ CalendarUtil.getQuarter(date)+"季度");
    }


    //取系统当前时间对DateUtil中的方法进行输出打印测试
    @Test
    public void getDateInfo(){
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(DateUtil.getYear(localDateTime)+"年");
        System.out.println(DateUtil.getMonth(localDateTime)+"月");
        System.out.println(DateUtil.getDayOfMonth(localDateTime)+"号");
        System.out.println(DateUtil.getDayOfWeek(localDateTime));
        System.out.println("本年第"+ DateUtil.getDayOfYear(localDateTime)+"天");
        System.out.println("本年第"+ DateUtil.getQuarter(localDateTime)+"季度");
    }

   //测试FormatDateUtil工具类
    @Test
    public void LocalDateTest(){
        String dateTime1=FormatDateUtil.date2String(new Date(),FormatDateUtil.YEAR_MONTH_DAY);
        System.out.println("dateTime1："+dateTime1);
        String dateTime2=FormatDateUtil.localDate2String(LocalDateTime.now(),FormatDateUtil.YEAR_MONTH_DAY_HOURS_MINUTE_SECOND);
        System.out.println("dateTime2："+dateTime2);
    }

    @Test
    public void changeDateTest(){
        LocalDateTime localDateTime = LocalDateTime.now();
        //当前时间
        System.out.println("当前时间："+localDateTime);
        //增加5月10天5小时
        System.out.println("更改后时间："+ChangeDateUtil.plusDateTime(localDateTime,5,10,5));
    }
    @Test
    public  void dateTest(){
        Date date1 = new Date(0L);
        Date date2 = new Date();
        //SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("现在时间是："+date1.compareTo(date1));
    }

}
