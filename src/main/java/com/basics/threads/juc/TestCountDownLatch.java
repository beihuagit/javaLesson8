package com.basics.threads.juc;

import java.util.concurrent.CountDownLatch;

/**
 * CountDownLatch：闭锁：在完成某些运算时，只有当其他所有线程的运算全部完成，当前运算才继续执行
 * @author 洛水晴川
 * @date 2021/9/7 14:03
 * */
public class TestCountDownLatch {
    public static void main(String[] args) {
        final CountDownLatch latch = new CountDownLatch(5);
        LatchDemo ld = new LatchDemo(latch);

        long start = System.currentTimeMillis();
        for (int i = 0; i < 5; i++) {
            new Thread(ld).start();
        }
        // 上述线程执行完毕才执行以下代码
        try {
            latch.await();
        } catch (InterruptedException e) {
        }
        long end = System.currentTimeMillis();
        System.out.println("运行时间：" + (end - start));
    }
}


class LatchDemo implements Runnable {

    private CountDownLatch latch;

    public LatchDemo(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        synchronized (this) {
            try {
                // 50000以内的偶数
                for (int i = 0; i < 50000; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
            } finally {
                latch.countDown();
            }
        }
    }
}
