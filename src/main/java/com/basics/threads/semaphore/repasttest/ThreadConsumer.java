package com.basics.threads.semaphore.repasttest;

/**
 * �ò��ߣ������ߣ�
 * @author ��ˮ�紨
 * @date 2021/6/3 17:56
 * */
public class ThreadConsumer extends Thread {

    private RepastService repastService;

    public ThreadConsumer(RepastService repastService) {
        super();
        this.repastService = repastService;
    }

    @Override
    public void run() {
        repastService.get();
    }
}
