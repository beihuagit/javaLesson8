package com.basics.threads.semaphoretryacquire3;

/**
 * @author 洛水晴川
 * @date 2021/6/2 14:20
 * */
public class ThreadA extends Thread {

    private MyService service;
    public ThreadA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.test();
    }
}
