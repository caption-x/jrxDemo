package com.caption.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.SocketAddress;
import java.sql.SQLOutput;

/**
 * @ClassName SocketDemo
 * @Description ServerSocket的一些方法
 * @Author xia
 * @Date 2020/5/18 13:38
 * @Version 1.0
 */
public class SocketDemo {
    public static void main(String[] args) {
        ServerSocket socket =null;
        try{
            socket = new ServerSocket(80);
            System.out.println(socket.getLocalSocketAddress());
            System.out.println(socket.getInetAddress());
            System.out.println(socket.getReuseAddress());
            System.out.println(socket.getSoTimeout());
        }catch (IOException e){
            e.getStackTrace();
        }
    }
}

