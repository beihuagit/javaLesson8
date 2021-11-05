package com.net;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author 洛水晴川
 * @date 2021/7/21 11:05
 * */
public class SocketClient {
    public static void main(String[] args) throws IOException {
        int port = 7000;
        String host = "localhost";
        Socket socket = new Socket(host, port);
        DataInputStream inputStream = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        DataOutputStream outputStream = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        while (!flag){
            System.out.println("请输入正方形边长：");
            double len = scanner.nextDouble();
            outputStream.writeDouble(len);
            outputStream.flush();

            double area = inputStream.readDouble();
            System.out.println("服务器返回的计算面积是：" + area);

            while(true){
                System.out.println("继续计算？（Y/N）");
                String str = scanner.next();
                if (str.equalsIgnoreCase("N")) {
                    outputStream.writeInt(0);
                    outputStream.flush();
                    flag = true;
                    break;
                } else if(str.equalsIgnoreCase("Y")) {
                    outputStream.writeInt(1);
                    outputStream.flush();
                    break;
                }
            }
        }
        socket.close();
    }
}
