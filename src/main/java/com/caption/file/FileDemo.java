package com.caption.file;

import java.io.*;
import java.util.logging.Logger;

/**
 * @ClassName FileDemo
 * @Description File一些案例
 * @Author xia
 * @Date 2020/5/18 20:14
 * @Version 1.0
 */
public class FileDemo {
    public void getFiles(String filePath){
        //获取该目录下的文件
        File file=new File(filePath);
        if(file.exists()){
            //遍历文件
            ergodicFile(file);
        }else {
            System.out.println("该文件不存在");
        };

    }
    //遍历目录文件
    private void ergodicFile(File file){
        //判断文件是否是目录文件
        if(file.isDirectory()){
            System.out.println(file.getName()+"是子目录");
            //若是目录获得该目录下得文件
            File[] files = file.listFiles();
            //判断文件书否有文件
            if(files.length>0){
                //循环文件列表
                for(File file1:files){
                    //遍历子文件
                    ergodicFile(file1);
                }
            }
        }else{
            //若不是目录文件则输出文件名
            System.out.println(file.getName());
        }
    }

    /**
     * 利用文件写入写出实现文件复制
     * @param fileInputPath 读入文件的地址
     * @param fileOutPaht  写入文件的地址
     */
    public void copyFile(String fileInputPath,String fileOutPaht){
        BufferedReader br=null;
        BufferedWriter bw=null;
        try{
            //将文件读入流中
            br = new BufferedReader(new InputStreamReader(new FileInputStream(fileInputPath)));
            //将流写出
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileOutPaht)));
            String line = null;
            //读入一行并判断是否为空
            while((line=br.readLine())!=null){
                //将整行写入
                bw.write(line);
                //再次读入一行
                line = br.readLine();
            }
            //关闭流
            bw.close();
            br.close();
        }catch (FileNotFoundException e){
            e.getStackTrace();
            Logger.getGlobal().warning("找不到文件");
        }catch (IOException e){
            e.getStackTrace();
        }


    }




}
