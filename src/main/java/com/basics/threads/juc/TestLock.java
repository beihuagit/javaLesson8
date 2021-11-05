package com.basics.threads.juc;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 解决多线程安全问题
 * 方法一：synchronized 隐式锁
 *     1.同步方法
 *     2.同步代码块
 *  jdk1.5后：
 *     3.同步锁：Lock
 *  注意：Lock 是一个显示锁，需要通过lock()方法上锁，unlock()方法释放锁
 * @author 洛水晴川
 * @date 2021/9/7 16:31
 * */
public class TestLock {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        Ticket tk = new Ticket(lock);
        new Thread(tk, "窗口1").start();
        new Thread(tk, "窗口2").start();
        new Thread(tk, "窗口3").start();
    }

}

class Ticket implements Runnable {

    private int ticket = 100;
    private final Lock lock;
    public Ticket(Lock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {

        while (true) {
            try {
                lock.lock();
                Thread.sleep(100);
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "售票完成，当前余票：" + --ticket);
                } else {
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}
