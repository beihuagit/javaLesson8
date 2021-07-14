package com.basics.threads.semaphorepoollist;

/**
 * @author 洛水晴川
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
        // 取出值然后再放回去
        for (int i = 0; i < 30; i++) {
            String getString = listPool.get();
            System.out.println(Thread.currentThread().getName() + " 取得值: " + getString);
            if ( i % 2 == 0 ) {
                listPool.put(getString);
            }
        }
    }
}
