package com.net;


import org.apache.tomcat.util.threads.TaskThreadFactory;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 支持多客户端通信
 * @author 洛水晴川
 * @date 2021/7/21 11:32
 * */
public class SocketServerM {
    public static void main(String[] args) throws IOException {
        int port = 7000;
        int clientNo = 1;
        ServerSocket serverSocket = new ServerSocket(port);
        ExecutorService executor = new ThreadPoolExecutor(2,
                5, 0, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(),
                // 自定义线程名称
                new TaskThreadFactory("tf", false, 1),
                // 拒绝策略默认：异常拒绝
                new ThreadPoolExecutor.AbortPolicy());
        while (true) {
            Socket socket = serverSocket.accept();
            executor.execute(new SingleServer(socket, clientNo));
            clientNo++;
        }

    }
}
