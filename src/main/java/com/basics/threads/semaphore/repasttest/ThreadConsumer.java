package com.basics.threads.semaphore.repasttest;

/**
 * 用餐者（消费者）
 * @author 洛水晴川
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
