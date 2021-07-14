package com.design.factory;

/**
 * 人类：抽象工厂类
 * @author 洛水晴川
 * @date 2021/7/13 16:47
 * */
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}
