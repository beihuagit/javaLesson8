package com.basics.threads.semaphorepoollist;

/**
 * @author ÂåË®Çç´¨
 * @date 2021/6/3 16:53
 * */
public class Run {

    public static void main(String[] args) {
        ListPool listPool = new ListPool();
        MyThread[] threads = new MyThread[12];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new MyThread(listPool);
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
    }
}
