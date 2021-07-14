package com.design.factory.abstractfactory;

/**
 * 制造男性工厂
 * @author 洛水晴川
 * @date 2021/7/13 21:50
 * */
public class MaleFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }
}
