package com.design.proxy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author 洛水晴川
 * @date 2021/7/28 22:00
 * */
public class Client {

    public static void main(String[] args) throws InterruptedException {
        IGamePlayer player = new GamePlayer("小波");
        System.out.println("开始时间：" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        player.login("张三", "123456");
        player.killBoos();
        player.upgrade();
        System.out.println("结束时间是：" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}
