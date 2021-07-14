package com.design.factory.abstractfactory;

/**
 * 生产女性工厂
 * @author 洛水晴川
 * @date 2021/7/13 21:49
 * */
public class FemaleFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return new FemaleYelloHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }
}
