package com.basics.threads.juc;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author 洛水晴川
 * @date 2021/9/16 17:57
 * */
public class MyExecutorHandler implements ThreadFactory, RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("自定义拒绝线程任务");
        r.run();
    }

    @Override
    public Thread newThread(Runnable r) {
        return null;
    }
}
