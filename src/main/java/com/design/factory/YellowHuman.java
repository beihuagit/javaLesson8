package com.design.factory;

/**
 * 黄种人
 * @author 洛水晴川
 * @date 2021/7/13 16:42
 * */
public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄种人皮肤是黄色的！");
    }

    @Override
    public void talk() {
        System.out.println("中国是黄种人，讲普通话");
    }
}
