package com.caption.regular;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName AnalyticalAddress
 * @Description 解析地址
 * @Author xia
 * @Date 2020/5/18 11:15
 * @Version 1.0
 */
public class AnalyticalAddress {
    /**
     *将传入的地址解析并输出打印
     * @param address 传入的地址
     */
    public static void analyticalAddress(String address){
        //匹配规则
        String regex="(?<county>[^国]+国)(?<province>[^省]+省)(?<city>[^市]+市)(?<town>[^市]+市|[^区]+区)(?<street>[^街]+街|[^镇]+镇|[^乡]+乡)?(?<village>.*)";
        //判断地址是否符合规则
        if(!Pattern.matches(regex,address)){
            System.out.println("地址不符合规则");
            return;
        };
        //创建Matcher对象
        Matcher mather= Pattern.compile(regex).matcher(address);
        while(mather.find()){
            // 循环定组，并输出捕获的输入子序列
            for(int i=1;i<mather.groupCount();i++){
                    System.out.println(mather.group(i));


            }
        }

    }

}
