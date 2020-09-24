package com.destiny.io.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketBIO {


    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(9093,2);

        System.out.println("step1: new ServerSocket(9090) ");

        while (true) {
            Socket client = server.accept();  //阻塞1
            System.out.println("step2:client\t" + client.getPort());
            InputStream in = null;
            try {
                in = client.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(in));
                while(true){
                    System.out.println("===========");
                    char [] data = new char[1024];
                    int num = reader.read(data);
                    if (num > 0 ){
                        System.out.println(data);
                    }else if (num < 0 ){
                        System.out.println("客户端断开");
                    }
//                    String dataline = reader.readLine(); //阻塞2

//                    if(null != dataline){
//                        System.out.println(dataline);
//                    }else{
//                        client.close();
//                        break;
//                    }
                }


            } catch (IOException e) {
                e.printStackTrace();
            }
//            new Thread(new Runnable(){
//
//                public void run() {
//                    InputStream in = null;
//                    try {
//                        in = client.getInputStream();
//                        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
//                        while(true){
//                            String dataline = reader.readLine(); //阻塞2
//
//                            if(null != dataline){
//                                System.out.println(dataline);
//                            }else{
//                                client.close();
//                                break;
//                            }
//                        }
//                        System.out.println("客户端断开");
//
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//
//                }
//
//
//
//            }).start();

        }
    }


}
