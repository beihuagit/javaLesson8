package com.basics.threads.isfairsemaphore;

/**
 * @author ��ˮ�紨
 * @date 2021/6/2 16:06
 * */
public class MyThread extends Thread {

    private MyService service;
    public MyThread(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        System.out.println("ThreadName=" + this.getName() + " �����ˣ�");
        service.test();
    }
}
