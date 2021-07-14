package com.design.factory.multiplefactory;

import com.design.factory.*;

/**
 * 多工厂模式测试
 * @author 洛水晴川
 * @date 2021/7/13 17:36
 * */
public class FactoryTest {
    public static void main(String[] args) {
        System.out.println("----产生一批白人----");
        Human white = new WhiteHumanFactory().createHuman();
        white.getColor();
        white.talk();
        System.out.println("----产生一批黑人----");
        Human black = new BlackHumanFactory().createHuman();
        black.getColor();
        black.talk();
        System.out.println("----产生一批黄种人----");
        Human yellow = new YellowHumanFactory().createHuman();
        yellow.getColor();
        yellow.talk();
    }
}
