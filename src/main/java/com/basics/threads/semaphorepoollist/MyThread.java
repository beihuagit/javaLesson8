package com.basics.threads.semaphorepoollist;

/**
 * @author ��ˮ�紨
 * @date 2021/6/3 16:48
 * */
public class MyThread extends Thread {

    private ListPool listPool;

    public MyThread(ListPool listPool) {
        super();
        this.listPool = listPool;
    }

    @Override
    public void run() {
        // ȡ��ֵȻ���ٷŻ�ȥ
        for (int i = 0; i < 30; i++) {
            String getString = listPool.get();
            System.out.println(Thread.currentThread().getName() + " ȡ��ֵ: " + getString);
            if ( i % 2 == 0 ) {
                listPool.put(getString);
            }
        }
    }
}
