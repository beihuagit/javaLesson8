package com.basics.threads;

import java.util.concurrent.locks.LockSupport;

/**
 * LockSupport ： 线程工具类（灵活的线程控制）
 * @Author: xiaole.chen
 * @Date: 2019/11/9 19:26
 * @Description: 多线程(多个线程依次切换按顺序执行，形成一个闭环)
 * */
public class LockSupportTest {
    static Thread t1 = null, t2 = null, t3 = null, t4 = null;

    public static void main(String[] args) {
        char[] aI = "123456789".toCharArray();
        char[] aC = "ABCDEFGHI".toCharArray();
        t1 = new Thread(() -> {
            for (char c : aI) {
                System.out.print(c + "-");
                LockSupport.unpark(t2);// 启动唤醒线程
                LockSupport.park(); // 停止阻塞线程
            }
        }, "t1");

        t2 = new Thread(() -> {
            for (char c : aC) {
                LockSupport.park();
                System.out.print(c);
                System.out.println();
                LockSupport.unpark(t3);
            }
        }, "t2");

        t3 = new Thread(() -> {
            for (char c : aC) {
                LockSupport.park();
                System.out.println("###");
                LockSupport.unpark(t1);
            }
        }, "t3");
        t1.start();
        t2.start();
        t3.start();
    }
}
