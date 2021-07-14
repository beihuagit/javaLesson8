package com.basics.threads.semaphoretwomethods;

import java.util.concurrent.Semaphore;

/**
 * @author 洛水晴川
 * @date 2021/6/2 14:13
 * */
public class SemaphoreService {

    /**
     * 参数permits的含义：同一时间最多只有X个线程可以执行acquire和release之间的代码
     */
    private final Semaphore semaphore = new Semaphore(1);

    public void test() {
        try {
            semaphore.acquire();
            Thread.sleep(1000);
            System.out.println(" 还有大约 : " + semaphore.getQueueLength() + " 个线程在等待");
            System.out.println(" 是否有线程正在等待信号量呢？" + semaphore.hasQueuedThreads());
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}
