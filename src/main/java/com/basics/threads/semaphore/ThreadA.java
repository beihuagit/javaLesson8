package com.basics.threads.semaphore;

/**
 * @author 洛水晴川
 * @date 2021/6/2 14:20
 * */
public class ThreadA extends Thread {

    private SemaphoreService service;
    public ThreadA(SemaphoreService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.test();
    }
}
