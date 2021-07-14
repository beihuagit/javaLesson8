package com.basics.threads.semaphoreonemorethan;

/**
 * @author 洛水晴川
 * @date 2021/6/2 16:58
 * */
public class Run {

    public static void main(String[] args) {
        Service service = new Service();
        MyThread[] threads = new MyThread[12];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new MyThread(service);
            threads[i].start();
        }
    }
}
