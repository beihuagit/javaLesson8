package com.basics.threads.semaphoretwomethods;

/**
 * �ź�������������
 * @author ��ˮ�紨
 * @date 2021/6/2 15:53
 * */
public class Run {

    public static void main(String[] args) {
        SemaphoreService service = new SemaphoreService();
        MyThread firstThread = new MyThread(service);
        firstThread.start();

        MyThread[] threads = new MyThread[4];
        for (int i = 0; i < 4; i++) {
            threads[i] = new MyThread(service);
            threads[i].start();
        }
    }
}
