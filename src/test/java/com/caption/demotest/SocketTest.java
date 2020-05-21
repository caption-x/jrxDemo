package com.caption.demotest;

import org.junit.Test;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @ClassName SocketTest
 * @Description 从网页抓取内容并写入本地
 * @Author xia
 * @Date 2020/5/19 17:32
 * @Version 1.0
 */
public class SocketTest {
    @Test
    public  void  getText(){
        URL url= null;
        BufferedWriter bw=null;
        BufferedReader br=null;
        try{
            //获得一个url对象
            url=new URL("http://www.163.com/");
            //读取url对象的内容并创建缓存区
            br=new BufferedReader(new InputStreamReader(url.openStream(),"gb2312"));
            //创建File对象
            File file=new File("src\\main\\resources\\test\\抓取内容.html");
            //file若不存在则创建
            if(!file.exists()){
                file.createNewFile();
            }
            //将文本写入字符输出流并缓存
            bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file),"utf-8"));
            String line=null;
            //逐行写入
            while ((line=br.readLine())!=null){
                System.out.println(line);
                bw.write(line);
                line=br.readLine();
            }
        }catch (MalformedURLException e){
            e.getStackTrace();
        }catch (IOException e){
            e.getStackTrace();
        }finally {
            //关闭流
            try {
                br.close();
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("写入完成");

    }
}
