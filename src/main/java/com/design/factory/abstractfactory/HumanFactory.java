package com.design.factory.abstractfactory;

/**
 * 造人工厂
 * @author 洛水晴川
 * @date 2021/7/13 21:43
 * */
public interface HumanFactory {
    /**
     * 制造一个黄色人
     */
    Human createYellowHuman();

    /**
     * 制造一个白色人
     */
    Human createWhiteHuman();

    /**
     * 制造一个黑色人
     */
    Human createBlackHuman();

}
