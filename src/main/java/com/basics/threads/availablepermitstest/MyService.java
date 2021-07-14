package com.basics.threads.availablepermitstest;

import java.util.concurrent.Semaphore;

/**
 * 获取实时可用许可数量
 * @author 洛水晴川
 * @date 2021/6/2 15:40
 * */
public class MyService {

    private Semaphore semaphore = new Semaphore(10);

    public void test() {
        try {
            semaphore.acquire();
            System.out.println(semaphore.availablePermits());
            System.out.println(semaphore.availablePermits());
            System.out.println(semaphore.availablePermits());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}
