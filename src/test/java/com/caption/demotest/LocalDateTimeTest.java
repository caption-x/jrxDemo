package com.caption.demotest;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @ClassName LocalDateTimeTest
 * @Description LocalDateTime常用方法测试
 * @Author xia
 * @Date 2020/5/18 18:43
 * @Version 1.0
 */
public class LocalDateTimeTest {
        @Test
        public void dateTest(){
            //获取当前时区的日期
            LocalDate localDate =LocalDate.now();
            System.out.println("当前日期："+localDate);
            //获取当前时区的时间
            LocalTime localTime = LocalTime.now();
            System.out.println("当前时间 ："+localTime);
            //根据日期和时间对象获取日期时间
            LocalDateTime localDateTime1 = LocalDateTime.of(localDate,localTime);
            System.out.println("localDateTime1:"+localDateTime1);
            //使用静态方法获取日期时间
            LocalDateTime localDateTime2 = LocalDateTime.now();
            System.out.println("localDateTime2:"+localDateTime2);


            //日期格式化
            DateTimeFormatter formatter =DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            System.out.println("格式化后："+formatter.format(localDateTime1));
            //日期加减法
            System.out.println("3年后"+localDateTime2.plusYears(3));
            System.out.println("3年前"+localDateTime2.minusYears(3));




        }

}
