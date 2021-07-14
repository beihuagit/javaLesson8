package com.basics.threads.drainpermitstest;

import java.util.concurrent.Semaphore;

/**
 * 获取并返回立即可用的所有许可个数，并将可用许可清零
 * @author 洛水晴川
 * @date 2021/6/2 15:40
 * */
public class MyService {

    private Semaphore semaphore = new Semaphore(10);

    public void test() {
        try {
            // drainPermits 返回可用许可的个数，并将可用许可清零
            semaphore.acquire();
            System.out.println(semaphore.availablePermits());
            System.out.println(semaphore.drainPermits() + " " + semaphore.availablePermits());
            System.out.println(semaphore.drainPermits() + " " + semaphore.availablePermits());
            System.out.println(semaphore.drainPermits() + " " + semaphore.availablePermits());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}
