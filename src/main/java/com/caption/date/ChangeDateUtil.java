package com.caption.date;

import java.time.LocalDateTime;

/**
 * @ClassName ChangeDateUtil
 * @Description 日期工具类 可以增加减少日期
 * @Author xia
 * @Date 2020/5/18 20:21
 * @Version 1.0
 */
public class ChangeDateUtil {

    /**
     * 增加小时
     * @param localDateTime
     * @param hours
     * @return
     */
    public static LocalDateTime plusHour(LocalDateTime localDateTime, int hours){
        return localDateTime.plusHours(hours);
    }

    /**
     * 增加小时
     * @param localDateTime
     * @param hours
     * @return
     */
    public static LocalDateTime minusHours(LocalDateTime localDateTime,int hours){
        return localDateTime.plusHours(hours);
    }

    /**
     * 增加月份
     * @param localDateTime
     * @param hours
     * @return
     */
    public static  LocalDateTime plusMonth(LocalDateTime localDateTime,int hours){
        return localDateTime.plusHours(hours);
    }

    /**
     * 减少月份
     * @param localDateTime
     * @param months
     * @return
     */
    public static LocalDateTime minusMonth(LocalDateTime localDateTime,int months){
        return localDateTime.minusMonths(months);
    }

    /**
     * 增加天数
     * @param localDateTime
     * @param days
     * @return
     */
    public static LocalDateTime plusDay(LocalDateTime localDateTime,int days){
        return localDateTime.plusDays(days);
    }

    /**
     * 减少天数
     * @param localDateTime
     * @param days
     * @return
     */
    public static LocalDateTime minusDay(LocalDateTime localDateTime,int days){
        return localDateTime.minusDays(days);
    }

    /**
     * 增加月份 天数 小时
     * @param localDateTime
     * @param month
     * @param day
     * @param hours
     * @return
     */
    public static LocalDateTime plusDateTime(LocalDateTime localDateTime,int month,int day,int hours){
        return localDateTime.plusMonths(month).plusDays(day).plusHours(hours);
    }

    /**
     * 减少月份 天数 小时
     * @param localDateTime
     * @param month
     * @param day
     * @param hours
     * @return
     */
    public static LocalDateTime minusDateTime(LocalDateTime localDateTime,int month,int day,int hours){
        return localDateTime.minusMonths(month).minusDays(day).minusHours(hours);
    }
}
