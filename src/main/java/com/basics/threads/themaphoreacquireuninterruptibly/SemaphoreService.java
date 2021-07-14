package com.basics.threads.themaphoreacquireuninterruptibly;

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
    private final Semaphore semaphore = new Semaphore(1);

    public void test() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " begin timer : " + System.currentTimeMillis());
            for (int i = 0; i < Integer.MAX_VALUE / 50 ; i++) {
                String str = new String();
                Math.random();
            }
            System.out.println(Thread.currentThread().getName() + " end timer : " + System.currentTimeMillis());
            semaphore.release();
        } catch (InterruptedException e) {
            System.out.println("�̣߳�" + Thread.currentThread().getName() + " ������ catch");
            e.printStackTrace();
        }
    }
}
