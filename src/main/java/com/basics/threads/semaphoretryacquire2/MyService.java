package com.basics.threads.semaphoretryacquire2;

import java.util.concurrent.Semaphore;

/**
 * tryAcquire 使线程非阻塞地执行程序，不至于在同步处一直等待
 * @author 洛水晴川
 * @date 2021/6/2 16:03
 * */
public class MyService {

    private final Semaphore semaphore = new Semaphore(3);

    public void test() {
        if (semaphore.tryAcquire(3)) {
            System.out.println("ThreadName=" + Thread.currentThread().getName()
            + "首先进入！");
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                String newString = new String();
                Math.random();
            }
            semaphore.release(3);
        } else {
            System.out.println("ThreadName=" + Thread.currentThread().getName()
               + "未成功进入！");
        }
    }
}
