package com.basics.threads.semaphore;

/**
 * @author 洛水晴川
 * @date 2021/6/2 14:27
 * */
public class SemaphoreTest1 {

    public static void main(String[] args) {
        SemaphoreService service = new SemaphoreService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        ThreadC c = new ThreadC(service);
        c.setName("C");
        a.start();
        b.start();
        c.start();
    }
}
