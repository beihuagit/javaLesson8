package com.basics.threads.semaphoreonemorethan;

import java.util.concurrent.Semaphore;

/**
 * ���· - �ദ�� - ���·
 * ����̣߳�����ź�����ģ�¶��߳�ͬ��ִ�У�ÿ���߳�ͬʱִ���Լ�������
 * @author ��ˮ�紨
 * @date 2021/6/2 16:50
 * */
public class Service {

    private final Semaphore semaphore = new Semaphore(3);

    public void sayHello() {
        try {
            semaphore.acquire();
            System.out.println("ThreadName=" + Thread.currentThread().getName()
               + " ׼����");
            System.out.println("begin hello " + System.currentTimeMillis());
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName()
                        + "��ӡ " + (i + 1));
            }
            System.out.println("end hello " + System.currentTimeMillis());
            semaphore.release();
            System.out.println("ThreadName=" + Thread.currentThread().getName()
               + " ������");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
