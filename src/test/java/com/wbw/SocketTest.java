package com.wbw;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketTest {
    public static void main(String[] args){
        BufferedReader br = null;
        PrintWriter pw = null;
        try{
//            Socket socket = new Socket("39.108.122.77",2323);
            Socket socket = new Socket("58.49.57.76",2323);
            //获取输入流与输出流
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            pw = new PrintWriter(socket.getOutputStream(),true);
            //向服务器发送数据
            pw.println("hello,world");
            String s = null;
            while (true){
                s = br.readLine();
                if(s != null){
                    break;
                }
            }
            System.out.println(s);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                br.close();
                pw.close();
            }catch (Exception e){
            }
        }
    }
}
