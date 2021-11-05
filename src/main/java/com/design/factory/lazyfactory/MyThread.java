package com.design.factory.lazyfactory;

import com.design.factory.Human;

import java.util.concurrent.Callable;

/**
 * @author 洛水晴川
 * @date 2021/7/15 18:59
 * */
public class MyThread implements Callable<Human> {

    private final int i;
    MyThread(int i) {
        this.i = i;
    }

    @Override
    public Human call() throws Exception {
        return HumanFactory.createHuman("random" + (i + 1));
    }
}
