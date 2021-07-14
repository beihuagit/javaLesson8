package com.basics.threads.semaphore.repasttest;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 使用Semaphore 实现多生产者 / 多消费者模式 <br>
 *     我们用厨师炒菜和消费者用餐来模拟实现。
 * @author 洛水晴川
 * @date 2021/6/3 17:20
 * */
public class RepastService {
    /** 厨师 **/
    volatile private Semaphore setSemaphore = new Semaphore(10);
    /** 就餐者 **/
    volatile private Semaphore getSemaphore = new Semaphore(20);
    /** **/
    volatile private ReentrantLock lock = new ReentrantLock();
    /** **/
    volatile private Condition setCondition = lock.newCondition();
    /** **/
    volatile private Condition getCondition = lock.newCondition();
    /** 代表最多只有4个餐盘存放菜品 **/
    volatile private Object[] producePosition = new Object[4];

    /**
     * 否有空菜盘
     * @return
     */
    private boolean isEmpty() {
        boolean isEmpty = true;
        for (Object o : producePosition) {
            if (o != null) {
                isEmpty = false;
                break;
            }
        }
        return isEmpty;
    }

    /**
     * 厨师炒菜
     */
    public void set() {
        try {
            setSemaphore.acquire();
            lock.lock();
            // 如果盘子全装满了，则等待取餐
            while (!isEmpty()) {
                setCondition.await();
            }
            // 一旦有空盘则立即上菜（装入数据）
            for (int i = 0; i < producePosition.length; i++) {
                if (producePosition[i] == null) {
                    //producePosition[i] = " 盘子[" + (i +1) + "]上新菜了";
                    producePosition[i] = " 数据" + (i + 1);
                    System.out.println(Thread.currentThread().getName()
                            + " 生产了 " + producePosition[i]);
                    break;
                }
            }
            // 通知就餐者，有新的菜品了
            getCondition.signalAll();
            lock.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // 释放许可
            setSemaphore.release();
        }
    }

    /**
     * 用餐者用餐
     */
    public void get() {

        try {
            getSemaphore.acquire();
            lock.lock();
            // 当有餐盘是空的时，新的用餐者须等待
            while (isEmpty()) {
                getCondition.await();
            }
            // 一旦餐盘是满的时，用餐者可以立即用餐
            for (int i = 0; i < producePosition.length; i++) {
                if (producePosition[i] != null) {
                    System.out.println(Thread.currentThread().getName()
                            + " 消费了 " + producePosition[i]);
                    // 清空即代表消费了
                    producePosition[i] = null;
                    break;
                }
            }
            // 通知生产者，已经可以生产新的菜品了
            setCondition.signalAll();
            lock.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            getSemaphore.release();
        }
    }
}
