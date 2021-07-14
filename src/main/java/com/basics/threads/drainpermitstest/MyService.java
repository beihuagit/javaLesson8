package com.basics.threads.drainpermitstest;

import java.util.concurrent.Semaphore;

/**
 * ��ȡ�������������õ�������ɸ��������������������
 * @author ��ˮ�紨
 * @date 2021/6/2 15:40
 * */
public class MyService {

    private Semaphore semaphore = new Semaphore(10);

    public void test() {
        try {
            // drainPermits ���ؿ�����ɵĸ��������������������
            semaphore.acquire();
            System.out.println(semaphore.availablePermits());
            System.out.println(semaphore.drainPermits() + " " + semaphore.availablePermits());
            System.out.println(semaphore.drainPermits() + " " + semaphore.availablePermits());
            System.out.println(semaphore.drainPermits() + " " + semaphore.availablePermits());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}
