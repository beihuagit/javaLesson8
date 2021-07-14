package com.design.factory.abstractfactory;

/**
 * 黄皮肤人：女性
 * @author 洛水晴川
 * @date 2021/7/13 21:41
 * */
public class FemaleYelloHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("----性别：黄色人种女性----");
    }
}
