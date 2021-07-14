package com.basics.threads.semaphore;

/**
 * @author ÂåË®Çç´¨
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
