package com.design.factory;

/**
 * 黑人
 * @author 洛水晴川
 * @date 2021/7/13 16:44
 * */
public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑人皮肤是黑色的！");
    }

    @Override
    public void talk() {
        System.out.println("黑人讲话，听球不懂！");
    }
}
