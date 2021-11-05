package com.design.proxy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author 洛水晴川
 * @date 2021/7/28 22:00
 * */
public class Client2 {

    public static void main(String[] args) throws InterruptedException {
        // 定义一个玩家
        IGamePlayer player = new GamePlayer("张三");
        // 定义一个代练
        GamePlayerProxy proxy = new GamePlayerProxy(player);
        System.out.println("开始时间：" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        // 后面的活都交给代练做
        proxy.login("ZhangSan", "123456");
        proxy.killBoos();
        proxy.upgrade();
        System.out.println("结束时间是：" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}
