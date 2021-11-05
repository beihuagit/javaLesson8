package com.basics.threads.creation;

/**
 * @author 洛水晴川
 * @date 2021/9/7 16:18
 * */
public class TestRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                System.out.println("00");
            } else {
                System.out.println(i * 10);
            }
        }
    }
}
