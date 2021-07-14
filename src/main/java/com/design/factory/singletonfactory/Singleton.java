package com.design.factory.singletonfactory;

/**
 * 单例类（任意类）
 * @author 洛水晴川
 * @date 2021/7/13 17:49
 * */
public class Singleton {
    /**
     * 私有化构造器：不允许通过new产生对象
     */
    private Singleton() {}

    public void doSomething() {
        // 业务处理
        System.out.println("----单例模式的工厂实现思路-----");
    }
}
