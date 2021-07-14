package com.basics.threads.themaphoreacquireuninterruptibly;

/**
 * @author ÂåË®Çç´¨
 * @date 2021/6/2 15:11
 * */
public class SemaphoreTest3 {

    public static void main(String[] args) throws InterruptedException {
        //SemaphoreService service = new SemaphoreService();
        SemaphoreUninterruptService service = new SemaphoreUninterruptService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();

        Thread.sleep(1000);

        b.interrupt();
        System.out.println("main ÖÐ¶ÏÁË a!");
    }
}
