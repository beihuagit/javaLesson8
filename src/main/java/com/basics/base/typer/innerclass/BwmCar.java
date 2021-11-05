package com.basics.base.typer.innerclass;

/**
 * @author 洛水晴川
 * @date 2021/9/23 17:34
 * */
public class BwmCar extends Car {
    @Override
    public void drive() {
        super.start("宝马车");
        System.out.println("宝马车运行中");
    }
}
