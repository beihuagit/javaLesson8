package com.basics.threads.semaphoretryacquire2;

/**
 * @author ��ˮ�紨
 * @date 2021/6/2 14:20
 * */
public class ThreadB extends Thread {

    private MyService service;
    public ThreadB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.test();
    }
}
