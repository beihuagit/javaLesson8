package com.basics.threads.semaphoreonemorethan;

import java.util.concurrent.Semaphore;

/**
 * 多进路 - 多处理 - 多出路
 * 多个线程，多个信号量，模仿多线程同步执行，每个线程同时执行自己的任务
 * @author 洛水晴川
 * @date 2021/6/2 16:50
 * */
public class Service {

    private final Semaphore semaphore = new Semaphore(3);

    public void sayHello() {
        try {
            semaphore.acquire();
            System.out.println("ThreadName=" + Thread.currentThread().getName()
               + " 准备！");
            System.out.println("begin hello " + System.currentTimeMillis());
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName()
                        + "打印 " + (i + 1));
            }
            System.out.println("end hello " + System.currentTimeMillis());
            semaphore.release();
            System.out.println("ThreadName=" + Thread.currentThread().getName()
               + " 结束！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
