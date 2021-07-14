package com.basics.threads.themaphoreacquireuninterruptibly;

import java.util.concurrent.Semaphore;

/**
 * 不能被中断：
 * @author 洛水晴川
 * @date 2021/6/2 14:13
 * */
public class SemaphoreUninterruptService {

    /**
     * 参数permits的含义：同一时间最多只有X个线程可以执行acquire和release之间的代码
     */
    private final Semaphore semaphore = new Semaphore(1);

    public void test() {
        semaphore.acquireUninterruptibly();
        System.out.println(Thread.currentThread().getName() + " begin timer = "
                + System.currentTimeMillis());
        for (int i = 0; i < Integer.MAX_VALUE / 50 ; i++) {
            String newString = new String();
            Math.random();
        }
        System.out.println(Thread.currentThread().getName() + " end timer = " + System.currentTimeMillis());
        semaphore.release();
    }
}
