package com.design.factory.abstractfactory;

/**
 * 白人女性
 * @author 洛水晴川
 * @date 2021/7/13 21:52
 * */
public class FemaleWhiteHuman extends AbstractWhiteHuman {
    @Override
    public void getSex() {
        System.out.println("----性别：白人女性----");
    }
}
