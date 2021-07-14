package com.basics.threads.themaphoreacquireuninterruptibly;

import java.util.concurrent.Semaphore;

/**
 * ���ܱ��жϣ�
 * @author ��ˮ�紨
 * @date 2021/6/2 14:13
 * */
public class SemaphoreUninterruptService {

    /**
     * ����permits�ĺ��壺ͬһʱ�����ֻ��X���߳̿���ִ��acquire��release֮��Ĵ���
     */
    private final Semaphore semaphore = new Semaphore(1);

    public void test() {
        semaphore.acquireUninterruptibly();
        System.out.println(Thread.currentThread().getName() + " begin timer = "
                + System.currentTimeMillis());
        for (int i = 0; i < Integer.MAX_VALUE / 50 ; i++) {
            String newString = new String();
            Math.random();
        }
        System.out.println(Thread.currentThread().getName() + " end timer = " + System.currentTimeMillis());
        semaphore.release();
    }
}
