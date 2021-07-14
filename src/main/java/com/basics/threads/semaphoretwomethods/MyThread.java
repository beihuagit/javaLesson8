package com.basics.threads.semaphoretwomethods;

/**
 * @author 洛水晴川
 * @date 2021/6/2 15:55
 * */
public class MyThread extends Thread {

    private SemaphoreService service;

    public MyThread(SemaphoreService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.test();
    }
}
