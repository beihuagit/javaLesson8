package com.basics.threads.semaphoretryacquire3;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * tryAcquire 使线程非阻塞地执行程序，不至于在同步处一直等待
 * 参数可以指定时间内获取许可
 * @author 洛水晴川
 * @date 2021/6/2 16:03
 * */
public class MyService {

    private final Semaphore semaphore = new Semaphore(1);

    public void test() {
        try {
            if (semaphore.tryAcquire(3, TimeUnit.SECONDS)) {
                System.out.println("ThreadName=" + Thread.currentThread().getName()
                + "首先进入！");
                // 更改此时间，看结果有什么不同
                Thread.sleep(5000);
                semaphore.release();
            } else {
                System.out.println("ThreadName=" + Thread.currentThread().getName()
                   + "未成功进入！");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
