package com.basics.threads.juc;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * java.util.concurrent.atomic 原子变量
 *    1. 用volatile保证内存可见性
 *    2. 用了CAS算法保证数据的原子性
 *       CAS（Compare And Swap）算法是硬件层面对于并发操作共享数据的支持
 *       CAS包含了三个操作数：
 *          内存值：V
 *          预估值：A
 *          更新至：B
 *          当且仅当 V = A 时，V = B, 否则不做任何操作
 * @author 洛水晴川
 * @date 2021/9/7 11:15
 * */
public class TestAtomicDemo {

    public static void main(String[] args) {
        AtomicDemo demo = new AtomicDemo();
        for (int i = 0; i < 10; i++) {
            new Thread(demo).start();
        }
    }
}

class AtomicDemo implements Runnable {

    //private int serialNumber = 0;
    private AtomicInteger serialNumber = new AtomicInteger(0);

    public int getSerialNumber() {
        return serialNumber.getAndIncrement();
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + ":" + getSerialNumber());
    }
}
