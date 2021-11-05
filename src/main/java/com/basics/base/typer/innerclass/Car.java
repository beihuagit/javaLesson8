package com.basics.base.typer.innerclass;

/**
 * @author 洛水晴川
 * @date 2021/9/23 17:19
 * */
public abstract class Car {

    public abstract void drive();

    void start() {
        common("");
    }
    void start(String name) {
        common(name);
    }

    /**
     * 设定参数可传可不传：方法重载
     * @param name
     */
    private void common(String name) {
        System.out.println(name + "已经启动");
    }
}
