package com.design.factory.abstractfactory;

/**
 * 黄皮肤：男性
 * @author 洛水晴川
 * @date 2021/7/13 21:42
 * */
public class MaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("----性别：黄色人种男性----");
    }
}
