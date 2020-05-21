package com.caption.file;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @ClassName MyThread
 * @Description 线程实现文件读取写入
 * @Author xia
 * @Date 2020/5/20 17:30
 * @Version 1.0
 */
public class MyThread extends Thread{
    //开始位值
    private Long begin;
    //结束位值
    private Long end;
    //读入文件
    private RandomAccessFile inputFile;
    //写入文件
    private  RandomAccessFile outFile;

    /**
     * 创建线程时给变量赋值
     * @param begin
     * @param end
     * @param inputFile
     * @param outFile
     */
    public MyThread(Long begin,long end,String inputFile,String outFile){
        super();
        this.begin = begin;
        this.end = end;
        try{
            this.inputFile = new RandomAccessFile(inputFile,"rw");
            this.outFile = new RandomAccessFile(outFile,"rw");
        }catch (IOException e) {
            e.getStackTrace();
        }
    }
    public MyThread(){
        super();
    }
    @Override
    public void run()  {
        try{
            System.out.println("开始长度："+begin);
            System.out.println("结束长度："+end);
            inputFile.seek(begin);
            outFile.seek(begin);

            String s;
            //判断是否到达结束位值，并逐行读取写入
            while (begin <end&&(s=inputFile.readLine())!=null){
                outFile.writeBytes(s);
                //RandomAccessFile没有逐行写入需要手动换行
                outFile.writeBytes("\r\n");

                begin+=s.getBytes().length;

            }

        }catch (IOException e){
            e.getStackTrace();
        }finally {
            try {
                //关闭
                inputFile.close();
                outFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
