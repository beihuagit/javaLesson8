package com.basics.threads.semaphore;

/**
 * @author ÂåË®Çç´¨
 * @date 2021/6/2 14:20
 * */
public class ThreadB extends Thread {

    private SemaphoreService service;
    public ThreadB(SemaphoreService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.test();
    }
}
