package com.net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Java网络编程简单案例：服务端接受数据并返回相应结果给客户端
 * @author 洛水晴川
 * @date 2021/7/21 10:54
 * */
public class SocketServer {
    public static void main(String[] args) throws IOException {
        int port = 7000;
        ServerSocket serverSocket = new ServerSocket(port);
        Socket socket = serverSocket.accept();
        DataInputStream inputStream = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        DataOutputStream outputStream = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
        do {
            double len = inputStream.readDouble();
            System.out.println("服务端收到数据：" + len);
            double result = len * len;
            outputStream.writeDouble(result);
            outputStream.flush();
        }while(inputStream.readInt() != 0);

        socket.close();
        serverSocket.close();
    }
}
