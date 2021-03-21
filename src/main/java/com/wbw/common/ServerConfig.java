package com.wbw.common;


import com.google.gson.Gson;

import java.io.*;
import java.net.Socket;
import java.net.SocketException;
import java.util.zip.GZIPInputStream;

/**
 * @author 易水●墨龙吟
 * @Description
 * @create 2019-04-14 23:21
 */

public class ServerConfig extends Thread {

    private Socket socket;
    Gson gs = new Gson();
    public ServerConfig(Socket socket) {
        this.socket = socket;
    }

    private String handle(InputStream inputStream) throws IOException {
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        StringBuffer request = new StringBuffer();
        if (len != -1) {
            request.append(new String(bytes, 0, len, "UTF-8"));
            System.out.println("接受的数据: " + request);
            System.out.println("from client ... " + request + "当前线程" + Thread.currentThread().getName());
        }
        return request.toString();
    }

    @Override
    public void run() {
        BufferedWriter writer = null;
        GZIPInputStream gzipis = null;
        ObjectInputStream ois = null;
        try {
            // 设置连接超时9秒
            socket.setSoTimeout(9000);
            System.out.println("客户 - " + socket.getRemoteSocketAddress() + " -> 机连接成功");
            InputStream inputStream = socket.getInputStream();

            gzipis = new GZIPInputStream(socket.getInputStream());
            ois = new ObjectInputStream(gzipis);
            Object obj = ois.readObject();
            String msg = gs.toJson(obj);
            System.out.println("zip包消息："+msg);

            writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            String result = null;
            try {
                result = handle(inputStream);
                writer.write(result);
                writer.newLine();
                writer.flush();
            } catch (IOException | IllegalArgumentException e) {
                writer.write("error");
                writer.newLine();
                writer.flush();
                System.out.println("发生异常");
                try {
                    System.out.println("再次接受!");
                    result = handle(inputStream);
                    writer.write(result);
                    writer.newLine();
                    writer.flush();
                } catch (Exception ex) {
                    System.out.println("再次接受, 发生异常,连接关闭");
                }
            }
        } catch (SocketException socketException) {
            socketException.printStackTrace();
            try {
                writer.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

