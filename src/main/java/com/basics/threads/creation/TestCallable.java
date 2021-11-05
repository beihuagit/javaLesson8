package com.basics.threads.creation;

import java.util.concurrent.Callable;

/**
 * @author 洛水晴川
 * @date 2021/9/7 15:48
 * */
public class TestCallable implements Callable<String> {

    private String params;

    public TestCallable(String pp) {
        this.params = pp;
    }

    @Override
    public String call() throws Exception {

        for (int i = 0; i < params.length(); i++) {
            System.out.println(params.charAt(i));
        }
        return "hello " + params;
    }
}
