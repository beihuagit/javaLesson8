package com.basics.threads.semaphore.repasttest;

/**
 * 生产者（厨师）
 * @author 洛水晴川
 * @date 2021/6/3 17:59
 * */
public class ThreadProducer extends Thread {

    private final RepastService repastService;

    public ThreadProducer(RepastService repastService) {
        super();
        this.repastService = repastService;
    }

    @Override
    public void run() {
        repastService.set();
    }
}
