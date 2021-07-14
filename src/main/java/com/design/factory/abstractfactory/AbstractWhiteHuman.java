package com.design.factory.abstractfactory;

/**
 * 抽象人类：白种人
 * @author 洛水晴川
 * @date 2021/7/13 18:58
 * */
public abstract class AbstractWhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("----白色人种的肤色是白色的-----");
    }

    @Override
    public void talk() {
        System.out.println("----白色人一般都讲英文----");
    }
}
