package com.basics.threads.semaphore.repasttest;

/**
 * @author ÂåË®Çç´¨
 * @date 2021/6/3 18:02
 * */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        RepastService service = new RepastService();
        ThreadProducer[] producers = new ThreadProducer[60];
        ThreadConsumer[] consumers = new ThreadConsumer[60];
        for (int i = 0; i < 60; i++) {
            producers[i] = new ThreadProducer(service);
            consumers[i] = new ThreadConsumer(service);
        }
        Thread.sleep(2000);
        for (int i = 0; i < 60; i++) {
            producers[i].start();
            consumers[i].start();
        }
    }
}
