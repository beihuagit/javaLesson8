package com.basics.threads.semaphore.repasttest;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ʹ��Semaphore ʵ�ֶ������� / ��������ģʽ <br>
 *     �����ó�ʦ���˺��������ò���ģ��ʵ�֡�
 * @author ��ˮ�紨
 * @date 2021/6/3 17:20
 * */
public class RepastService {
    /** ��ʦ **/
    volatile private Semaphore setSemaphore = new Semaphore(10);
    /** �Ͳ��� **/
    volatile private Semaphore getSemaphore = new Semaphore(20);
    /** **/
    volatile private ReentrantLock lock = new ReentrantLock();
    /** **/
    volatile private Condition setCondition = lock.newCondition();
    /** **/
    volatile private Condition getCondition = lock.newCondition();
    /** �������ֻ��4�����̴�Ų�Ʒ **/
    volatile private Object[] producePosition = new Object[4];

    /**
     * ���пղ���
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
     * ��ʦ����
     */
    public void set() {
        try {
            setSemaphore.acquire();
            lock.lock();
            // �������ȫװ���ˣ���ȴ�ȡ��
            while (!isEmpty()) {
                setCondition.await();
            }
            // һ���п����������ϲˣ�װ�����ݣ�
            for (int i = 0; i < producePosition.length; i++) {
                if (producePosition[i] == null) {
                    //producePosition[i] = " ����[" + (i +1) + "]���²���";
                    producePosition[i] = " ����" + (i + 1);
                    System.out.println(Thread.currentThread().getName()
                       + " ������ " + producePosition[i]);
                    break;
                }
            }
            // ֪ͨ�Ͳ��ߣ����µĲ�Ʒ��
            getCondition.signalAll();
            lock.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // �ͷ����
            setSemaphore.release();
        }
    }

    /**
     * �ò����ò�
     */
    public void get() {

        try {
            getSemaphore.acquire();
            lock.lock();
            // ���в����ǿյ�ʱ���µ��ò�����ȴ�
            while (isEmpty()) {
                getCondition.await();
            }
            // һ������������ʱ���ò��߿��������ò�
            for (int i = 0; i < producePosition.length; i++) {
                if (producePosition[i] != null) {
                    System.out.println(Thread.currentThread().getName()
                       + " ������ " + producePosition[i]);
                    // ��ռ�����������
                    producePosition[i] = null;
                    break;
                }
            }
            // ֪ͨ�����ߣ��Ѿ����������µĲ�Ʒ��
            setCondition.signalAll();
            lock.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            getSemaphore.release();
        }
    }
}
