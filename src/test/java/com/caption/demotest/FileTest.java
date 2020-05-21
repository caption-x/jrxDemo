package com.caption.demotest;

import com.caption.file.FileDemo;
import org.junit.Test;

import java.io.*;

/**
 * @ClassName FileTest
 * @Description 测试FileDemo类中的方法
 * @Author xia
 * @Date 2020/5/18 20:07
 * @Version 1.0
 */
public class FileTest {

    //遍历文件
    @Test
    public void fileTest(){
        String filePath = "E:\\测试文件.html";
        FileDemo fileDemo = new FileDemo();
        fileDemo.getFiles(filePath);
    }

    /**
     * 实现文件逐行读取写入，实现文件复制粘贴贴
     */
    @Test
    public void fileCopyTest(){
        //写入文件的地址
        String inPath="E:\\测试文件.html";
        //写出文件的地址
        String outPath="E:\\测试文件1.html";
        FileDemo fileDemo = new FileDemo();
        fileDemo.copyFile(inPath,outPath);
    }

}
