package com.caption.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalField;

/**
 * @ClassName DateUtil
 * @Description 提供查询日期年份月份日期等静态方法
 * @Author xia
 * @Date 2020/5/19 9:57
 * @Version 1.0
 */
public class DateUtil {
    /**
     * 获得年份
     * @param localDateTime
     * @return 返回年份
     */
    public static int getYear(LocalDateTime localDateTime){
        return localDateTime.getYear();
    }

    /**
     * 获得月份
     * @param localDateTime
     * @return 返回数字表示月份
     */
    public static int getMonth(LocalDateTime localDateTime){
        //日期默认月份为0-11 因此需要+1
        return localDateTime.getMonthValue()+1;
    }

    /**
     *  获取日期
     * @param localDateTime
     * @return
     */
    public static int getDayOfMonth(LocalDateTime localDateTime){
        return localDateTime.getMonthValue()+1;
    }

    /**
     * 根据月份计算季度
     * @param localDateTime
     * @return
     */
    public static int getQuarter(LocalDateTime localDateTime){
        return localDateTime.getMonthValue()/3+1;
    }

    /**
     * 英语简写的周几
     * @param localDateTime
     * @return
     */
    public static DayOfWeek getDayOfWeek(LocalDateTime localDateTime){
        return localDateTime.getDayOfWeek();
    }

    /**
     * 计算是日期在年份里哪一天
     * @param localDateTime
     * @return
     */
    public static int getDayOfYear(LocalDateTime localDateTime){
        return localDateTime.getDayOfYear();
    }
}
