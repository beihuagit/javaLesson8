package com.basics.threads.themaphoreacquireuninterruptibly;

import java.util.concurrent.Semaphore;

/**
 * 利用Semaphore(信号量)来控制多线程并发的数量<br>
 *    注意：多线程同步概念其实就是排队去执行一个任务，执行任务是一个一个执行任务的，而不是并行执行
 * @author 洛水晴川
 * @date 2021/6/2 14:13
 * */
public class SemaphoreService {

    /**
     * 参数permits的含义：同一时间最多只有X个线程可以执行acquire和release之间的代码
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
            System.out.println("线程：" + Thread.currentThread().getName() + " 进入了 catch");
            e.printStackTrace();
        }
    }
}
