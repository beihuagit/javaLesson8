package com.basics.threads.semaphoreacquire;

import java.util.concurrent.Semaphore;

/**
 * ����Semaphore(�ź���)�����ƶ��̲߳���������<br>
 *    ע�⣺���߳�ͬ��������ʵ�����Ŷ�ȥִ��һ������ִ��������һ��һ��ִ������ģ������ǲ���ִ��
 * @author ��ˮ�紨
 * @date 2021/6/2 14:13
 * */
public class SemaphoreService {

    /**
     * ����permits�ĺ��壺ͬһʱ�����ֻ��X���߳̿���ִ��acquire��release֮��Ĵ���
     */
    private final Semaphore semaphore = new Semaphore(2);

    public void test() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " begin timer : " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " end timer : " + System.currentTimeMillis());
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
