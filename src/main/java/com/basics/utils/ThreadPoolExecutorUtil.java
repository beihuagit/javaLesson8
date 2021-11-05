package com.basics.utils;


import com.basics.threads.juc.MyExecutorHandler;
import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 线程池创建工具类
 * 线程池满了任务会丢失吗？
 * 常见的拒绝策略：
 *      AbortPolicy：丢弃任务，抛运行时异常
 *      CallerRunPolicy：执行任务
 *      DiscardPolicy：忽视，什么都不发生
 *      DiscardOldestPolicy：从队列中剔除最先进入队列的任务；
 *      实现RejectedExecutionHandler接口，自定义拒绝处理（例如：MyExecutorHandler）
 *
 * @author chenxl
 */
public class ThreadPoolExecutorUtil {
    private static final int corePoolSize = 2;
    private static final int maximumPoolSize = 4;
    /**
     * 时间设为0，等待任务的空闲线程（非核心线程：4-2）会立即被回收
     */
    private static final Long keepAliveTime = 0L;
    /**
     * 等待队列缓存线程数
     */
    private static final int workQueue = 5;

    public static ThreadPoolExecutor createThreadPoolExecutor(String nameFormat) {
        ThreadFactory threadFactory = new ThreadFactoryBuilder()
                .setNameFormat(nameFormat + "-%d")
                .build();
        return new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>(workQueue),
                threadFactory,
                // 自定义拒绝
                new MyExecutorHandler()
                // 默认拒绝策略
                //new ThreadPoolExecutor.CallerRunsPolicy()
        );
    }
}
