package com.basics.threads.semaphoretwomethods;

import java.util.concurrent.Semaphore;

/**
 * @author ��ˮ�紨
 * @date 2021/6/2 14:13
 * */
public class SemaphoreService {

    /**
     * ����permits�ĺ��壺ͬһʱ�����ֻ��X���߳̿���ִ��acquire��release֮��Ĵ���
     */
    private final Semaphore semaphore = new Semaphore(1);

    public void test() {
        try {
            semaphore.acquire();
            Thread.sleep(1000);
            System.out.println(" ���д�Լ : " + semaphore.getQueueLength() + " ���߳��ڵȴ�");
            System.out.println(" �Ƿ����߳����ڵȴ��ź����أ�" + semaphore.hasQueuedThreads());
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}
