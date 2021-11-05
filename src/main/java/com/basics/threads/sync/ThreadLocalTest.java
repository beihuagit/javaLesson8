package com.basics.threads.sync;

/**
 * ThreadLocal内存泄漏问题
 * @author 洛水晴川
 * @date 2021/9/27 11:23
 * */
public class ThreadLocalTest {

    public static void main(String[] args) {

        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        threadLocal.set("hello");
        threadLocal.set("world");
        threadLocal.remove();
        System.out.println(threadLocal.get());
        new Thread(() -> {
            threadLocal.set("xiaole");
            System.out.println(threadLocal.get());
        },"java").start();
        System.out.println("1111" + threadLocal.get());
    }
}
