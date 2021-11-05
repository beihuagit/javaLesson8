package com.basics.threads.creation;

import java.util.concurrent.FutureTask;

/**
 * 线程的几种实现方式
 * @author 洛水晴川
 * @date 2021/9/7 15:52
 * */
public class Main {

    public static void main(String[] args) {
        TestCallable c = new TestCallable("world !");
        try {
            // 用于接受结果
            FutureTask<String> result = new FutureTask<>(c);
            new Thread(result).start();
            String r = result.get();
            System.out.println(r);
            System.out.println("--------------------");

            TestRunnable runnable = new TestRunnable();
            new Thread(runnable).start();
            new TestThread().start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
