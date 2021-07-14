package com.design.factory;

/**
 * 白色人
 * @author 洛水晴川
 * @date 2021/7/13 16:45
 * */
public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白色人皮肤是白色的！");
    }

    @Override
    public void talk() {
        System.out.println("白人一般讲英文");
    }
}
