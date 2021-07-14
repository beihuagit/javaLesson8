package com.basics.threads.isfairsemaphore;

import java.util.concurrent.Semaphore;

/**
 * 公平与非公平信号量：获得许可的顺序是否与线程启动顺序有关，公平有关，非公平无关
 * @author 洛水晴川
 * @date 2021/6/2 16:03
 * */
public class MyService {

    private final boolean isFair = true;
    private final Semaphore semaphore = new Semaphore(1, isFair);

    public void test() {
        try {
            semaphore.acquire();
            System.out.println("ThreadName=" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}
