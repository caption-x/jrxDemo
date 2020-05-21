package com.caption.date;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @ClassName FormatDateUtil
 * @Description 格式化日期的工具类
 * @Author xia
 * @Date 2020/5/19 17:20
 * @Version 1.0
 */
public class FormatDateUtil{

    public static final int YEAR_MONTH_DAY=1;
    public static final int MONTH_DAY_YEAR_=2;
    public static final int YEAR_MONTH_DAY_HOURS_MINUTE_SECOND=3;
    //对Date类型日期格式化
    public static String date2String(Date date, int field){
        String patten = choosePatten(field);
        SimpleDateFormat dateFormat = new SimpleDateFormat(patten);
        return dateFormat.format(date);
    }
    //对LocalDateTime类型日期格式化
    public static String localDate2String(LocalDateTime localDateTime,int field){
        String patten = choosePatten(field);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(patten);
        return dateTimeFormatter.format(localDateTime);
    }

    //根据选择判断使用哪种格式
    private static String choosePatten(int field){
        String patten=null;
        switch (field){
            case 1:patten="yyyy-MM-dd";break;
            case 2:patten="MM-dd-yyyy";break;
            case 3:patten="yyyy-MM-dd HH:mm:ss";break;
            default:
                System.out.println("输入有误");
                return null;
        }
        return patten;
    }



}
