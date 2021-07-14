package com.basics.threads.semaphoretryacquire3;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * tryAcquire ʹ�̷߳�������ִ�г��򣬲�������ͬ����һֱ�ȴ�
 * ��������ָ��ʱ���ڻ�ȡ���
 * @author ��ˮ�紨
 * @date 2021/6/2 16:03
 * */
public class MyService {

    private final Semaphore semaphore = new Semaphore(1);

    public void test() {
        try {
            if (semaphore.tryAcquire(3, TimeUnit.SECONDS)) {
                System.out.println("ThreadName=" + Thread.currentThread().getName()
                + "���Ƚ��룡");
                // ���Ĵ�ʱ�䣬�������ʲô��ͬ
                Thread.sleep(5000);
                semaphore.release();
            } else {
                System.out.println("ThreadName=" + Thread.currentThread().getName()
                   + "δ�ɹ����룡");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
