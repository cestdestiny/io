package com.destiny.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class BIOServer {

    public static void main(String[] args) throws  Exception{
        ServerSocket ss = new ServerSocket(8081,2);
        while (true){
            Socket socket = ss.accept();
            System.out.println("=====");
            InputStream stream = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(stream));
            while (true){
                String line = bufferedReader.readLine();
                if (line != null){
                    System.out.println(line);
                }else {
                    socket.close();
                    break;
                }
            }
//            new Thread(() ->{
//                try{
//                    InputStream stream = socket.getInputStream();
//                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(stream));
//                    while (true){
//                        String line = bufferedReader.readLine();
//                        if (line != null){
//                            System.out.println(line);
//                        }else {
//                            socket.close();
//                            break;
//                        }
//                    }
//                }catch (IOException e){
//                    e.printStackTrace();
//                }
//            }).start();
        }
    }
}
