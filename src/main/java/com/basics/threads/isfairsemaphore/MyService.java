package com.basics.threads.isfairsemaphore;

import java.util.concurrent.Semaphore;

/**
 * ��ƽ��ǹ�ƽ�ź����������ɵ�˳���Ƿ����߳�����˳���йأ���ƽ�йأ��ǹ�ƽ�޹�
 * @author ��ˮ�紨
 * @date 2021/6/2 16:03
 * */
public class MyService {

    private final boolean isFair = true;
    private final Semaphore semaphore = new Semaphore(1, isFair);

    public void test() {
        try {
            semaphore.acquire();
            System.out.println("ThreadName=" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}
