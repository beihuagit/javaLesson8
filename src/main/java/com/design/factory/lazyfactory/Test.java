package com.design.factory.lazyfactory;

import com.design.factory.Human;

/**
 * 延迟工厂测试
 * @author 洛水晴川
 * @date 2021/7/13 18:08
 * */
public class Test {
    public static void main(String[] args) {
        try {
            Human white = HumanFactory.createHuman("white");
            System.out.println("----产生一批白人----" + white);
            white.getColor();
            white.talk();
            Human black = HumanFactory.createHuman("black");
            System.out.println("----产生一批黑人----" + black);
            black.getColor();
            black.talk();
            Human yellow = HumanFactory.createHuman("yellow");
            System.out.println("----产生一批黄种人----" + yellow);
            yellow.getColor();
            yellow.talk();
            Human green = HumanFactory.createHuman("green");
            System.out.println("----产生一批绿色人----" + green);
            green.getColor();
            green.talk();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
