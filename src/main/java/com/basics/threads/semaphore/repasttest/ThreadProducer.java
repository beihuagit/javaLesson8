package com.basics.threads.semaphore.repasttest;

/**
 * �����ߣ���ʦ��
 * @author ��ˮ�紨
 * @date 2021/6/3 17:59
 * */
public class ThreadProducer extends Thread {

    private RepastService repastService;

    public ThreadProducer(RepastService repastService) {
        super();
        this.repastService = repastService;
    }

    @Override
    public void run() {
        repastService.set();
    }
}
