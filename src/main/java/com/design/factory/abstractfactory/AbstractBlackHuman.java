package com.design.factory.abstractfactory;

/**
 * 抽象人类：黑人
 * @author 洛水晴川
 * @date 2021/7/13 19:06
 * */
public abstract class AbstractBlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("----黑人的肤色是黑色的-----");
    }

    @Override
    public void talk() {
        System.out.println("----黑人讲的话听不懂啊！-----");
    }
}
