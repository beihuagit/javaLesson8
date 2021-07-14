package com.basics.threads;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.LockSupport;

/**
 * ָ����С�Ļ������BlockingQueue
 * @author xiaole.chen
 * @date 2020/9/14 17:44
 * */
public class ArrayBlockingQueueTest extends ArrayBlockingQueue {
    static Thread t1 = null, t2 = null;

    /**
     * Creates an {@code ArrayBlockingQueue} with the given (fixed)
     * capacity and default access policy.
     *
     * @param capacity the capacity of this queue
     * @throws IllegalArgumentException if {@code capacity < 1}
     */
    public ArrayBlockingQueueTest(int capacity) {
        super(capacity);
    }

    /**
     * Creates an {@code ArrayBlockingQueue} with the given (fixed)
     * capacity and the specified access policy.
     *
     * @param capacity the capacity of this queue
     * @param fair if {@code true} then queue accesses for threads blocked
     *        on insertion or removal, are processed in FIFO order;
     *        if {@code false} the access order is unspecified.
     * @throws IllegalArgumentException if {@code capacity < 1}
     */
    public ArrayBlockingQueueTest(int capacity, boolean fair) {
        super(capacity, fair);
    }

    /**
     * Creates an {@code ArrayBlockingQueue} with the given (fixed)
     * capacity, the specified access policy and initially containing the
     * elements of the given collection,
     * added in traversal order of the collection's iterator.
     *
     * @param capacity the capacity of this queue
     * @param fair if {@code true} then queue accesses for threads blocked
     *        on insertion or removal, are processed in FIFO order;
     *        if {@code false} the access order is unspecified.
     * @param c the collection of elements to initially contain
     * @throws IllegalArgumentException if {@code capacity} is less than
     *         {@code c.size()}, or less than 1.
     * @throws NullPointerException if the specified collection or any
     *         of its elements are null
     */
    public ArrayBlockingQueueTest(int capacity, boolean fair, Collection c) {
        super(capacity, fair, c);
    }

    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueueTest test = new ArrayBlockingQueueTest(2, false);
        Map<String, String> map = new HashMap<String, String>(16) {{
            put("Chongqing", "023");
            put("WuHan", "027");
            put("Beijing", "010");
        }};
        // put���������ݳ������г���ʱ���̻߳��������״̬; add��������׳��쳣
        t1 = new Thread(() -> {
            try {
                test.add(map);
                test.add("����");
                test.add("����");
            } catch (IllegalStateException e) {
                System.out.println("#######�߳�״̬��#########" + Thread.currentThread().getState());
                LockSupport.park(t1);
                LockSupport.unpark(t2);
                e.printStackTrace();
            }
        }, "t1");

        t2 = new Thread(() -> {
            System.out.println("ִ��t2" + test);
            try {
                test.poll();
                test.add("���");
                System.out.println("���ս����" + test);
            } catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }, "t2");

        t1.start();
        t2.start();
    }
}
