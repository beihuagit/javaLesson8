package com.basics.threads.semaphorepoollist;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ʹ��Semaphore�����ַ�����
 * @author ��ˮ�紨
 * @date 2021/6/3 16:37
 * */
public class ListPool {

    private int poolMaxSize = 5;
    private int semaphorePermits = 3;
    private List<String> list = new ArrayList<>();
    private Semaphore currencySemaphore = new Semaphore(semaphorePermits);
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public ListPool() {
        super();
        for (int i = 0; i < poolMaxSize; i++) {
            list.add(" ��ˮ�紨 " + i);
        }
    }

    public String get() {
        String result = null;
        try {
            currencySemaphore.acquire();
            lock.lock();
            while (list.size() == 0) {
                condition.await();
            }
            result = list.remove(0);
            lock.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return result;
    }

    public void put(String stringValue) {
        lock.lock();
        list.add(stringValue);
        condition.signalAll();
        lock.unlock();
        currencySemaphore.release();
    }
}
