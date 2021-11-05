package com.basics.threads.juc;

import com.basics.utils.ThreadPoolExecutorUtil;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * 自定义线程池：原理解析
 * 拒绝策略：自定义拒绝策略：如果任务数 > 核心线程数 + 缓存队列数 + （最大线程数 - 核心线程数）,则触发拒绝
 * @author 洛水晴川
 * @date 2021/9/16 18:05
 * */
public class TestThreadExecutors {

    public static void main(String[] args) {
        ThreadPoolExecutor executor = ThreadPoolExecutorUtil.createThreadPoolExecutor("mythread");
        for (int i = 1; i <= 10; i++) {
            final int finalI = i;
            executor.execute(() -> System.out.println(Thread.currentThread().getName() + " : " + finalI));
        }
    }
}
