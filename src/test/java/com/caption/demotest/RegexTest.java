package com.caption.demotest;

import com.caption.regular.AnalyticalAddress;
import org.junit.Test;

import java.util.Scanner;

/**
 * @ClassName RegexTest
 * @Description 测试正则表达式
 * @Author xia
 * @Date 2020/5/18 12:03
 * @Version 1.0
 */
public class RegexTest {
    @Test
    public void regexTest1(){
        String address1="中华人民共和国吉林省长春市二道区临河街万兴小区4栋2门";
        String address2="中华人民共和国河北省石家庄市武林区砂石街河东小区8栋1单元";
        AnalyticalAddress.analyticalAddress(address1);
        AnalyticalAddress.analyticalAddress(address2);
    }

}
