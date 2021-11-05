package com.design.factory.singletonfactory;

/**
 * 单例工厂测试
 * @author 洛水晴川
 * @date 2021/7/13 18:33
 * */
public class Test {
    public static void main(String[] args) {
        Singleton singleton = SingletonFactory.getSingleton();
        singleton.doSomething();
    }
}
