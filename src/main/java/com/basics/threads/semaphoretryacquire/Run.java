package com.basics.threads.semaphoretryacquire;

/**
 * @author ��ˮ�紨
 * @date 2021/6/2 16:25
 * */
public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
