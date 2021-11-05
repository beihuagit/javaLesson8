package com.basics.threads.creation;

/**
 * @author 洛水晴川
 * @date 2021/9/7 16:20
 * */
public class TestThread extends Thread {

    @Override
    public void run() {
        System.out.println("-------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println("T" + i);
        }
    }
}
