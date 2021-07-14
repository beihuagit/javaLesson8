package com.design.factory.abstractfactory;

/**
 * 抽象人类：黄种人
 * @author 洛水晴川
 * @date 2021/7/13 19:03
 * */
public abstract class AbstractYellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("----黄色人种的皮肤是黄色的----");
    }

    @Override
    public void talk() {
        System.out.println("----黄色人，中国人，说普通话，字正腔圆！----");
    }
}
