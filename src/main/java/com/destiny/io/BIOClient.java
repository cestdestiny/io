package com.destiny.io;

import java.io.*;
import java.net.Socket;

public class BIOClient {

    public static void main(String[] args){
        try{
            Socket client = new Socket("127.0.0.1",8081);
//            client.setTcpNoDelay(true);
//            client.setSendBufferSize(20);
            OutputStream os = client.getOutputStream();
            InputStream inputStream = System.in;
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            while (true){
                String line = reader.readLine();
                if (null != line){
                    os.write(line.getBytes());
                    os.flush();
//                    byte[] bytes = line.getBytes();
//                    for (byte b : bytes){
//                        os.write(b);
//                    }
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
