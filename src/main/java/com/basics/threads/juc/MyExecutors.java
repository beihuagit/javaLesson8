package com.basics.threads.juc;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 模拟自定义线程池：
 *     1.创建一定数量的可执行的线程
 *     2.缓存可执行线程到线程队列中等待下次任务调用
 * @author 洛水晴川
 * @date 2021/9/16 16:54
 * */
public class MyExecutors {

    public List<WorkerThread> workThreads;
    public BlockingQueue<Runnable> dequeThread;
    public boolean isRun = true;

    public MyExecutors(int corePoolSize, int dequeSize) {
        // 执行完成核心线程数，会从队列中取线程执行
        dequeThread = new LinkedBlockingQueue<>(dequeSize);
        // 核心线程数直接是Runnable状态的
        workThreads = new ArrayList<>(corePoolSize);
        for (int i = 0; i < corePoolSize; i++) {
            new WorkerThread().start();
        }
    }

    public static void main(String[] args) {
        MyExecutors myExecutors = new MyExecutors(5, 20);
        for (int i = 0; i < 10; i++) {
            final int finalI = i;
            myExecutors.execute(() -> {
                System.out.println(Thread.currentThread().getName() + " : " + finalI);
            });
        }
        myExecutors.isRun = false;
    }

    public boolean execute(Runnable command) {
        return dequeThread.offer(command);

    }

    class WorkerThread extends Thread {

        @Override
        public void run() {
            while (isRun || !dequeThread.isEmpty()) {
                Runnable runnable = dequeThread.poll();
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }
}
