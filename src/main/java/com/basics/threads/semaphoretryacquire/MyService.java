package com.basics.threads.semaphoretryacquire;

import java.util.concurrent.Semaphore;

/**
 * tryAcquire ʹ�̷߳�������ִ�г��򣬲�������ͬ����һֱ�ȴ�
 * @author ��ˮ�紨
 * @date 2021/6/2 16:03
 * */
public class MyService {

    private final Semaphore semaphore = new Semaphore(1);

    public void test() {
        if (semaphore.tryAcquire()) {
            System.out.println("ThreadName=" + Thread.currentThread().getName()
            + "���Ƚ��룡");
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                String newString = new String();
                Math.random();
            }
            semaphore.release();
        } else {
            System.out.println("ThreadName=" + Thread.currentThread().getName()
               + "δ�ɹ����룡");
        }
    }
}
