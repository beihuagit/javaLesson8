package com.basics.threads.semaphoreonemorethan;

/**
 * @author ÂåË®Çç´¨
 * @date 2021/6/2 16:57
 * */
public class MyThread extends Thread {

    private Service service;

    public MyThread(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.sayHello();
    }
}
