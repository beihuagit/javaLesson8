package com.basics.threads;

import java.util.concurrent.CompletableFuture;

/**
 * @author xiaole.chen 原则
 * @date 2020/12/29 12:18
 * */
public class Concurrent01 {

    public static void main(String[] args) {
        CompletableFuture.runAsync(() -> {
            for (int i = 0; i < 11; i++) {
                prtVal(Thread.currentThread().getName() + ":" + i);
            }
        });
    }

    private static void prtVal(String val) {
        System.out.println(val);
    }
}
