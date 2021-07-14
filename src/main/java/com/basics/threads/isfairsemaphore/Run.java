package com.basics.threads.isfairsemaphore;

/**
 * @author ÂåË®Çç´¨
 * @date 2021/6/2 16:10
 * */
public class Run {

    public static void main(String[] args) {
        MyService service = new MyService();

        MyThread firstThread = new MyThread(service);
        firstThread.start();

        MyThread[] threads = new MyThread[4];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new MyThread(service);
            threads[i].start();
        }
    }
}
