package com.basics.threads.semaphoreacquire;

/**
 * @author 洛水晴川
 * @date 2021/6/2 14:27
 * */
public class SemaphoreTest2 {

    public static void main(String[] args) {
        SemaphoreService service = new SemaphoreService();
        ThreadA[] a = new ThreadA[10];
        for (int i = 0; i < 10; i++) {
            a[i] = new ThreadA(service);
            a[i].start();
        }
    }
}
