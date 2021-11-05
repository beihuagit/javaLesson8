package com.design.factory.abstractfactory;

/**
 * 造人工厂：依赖倒置原则（高层不依赖于低层，接口不依赖于实现，细节依赖于抽象），针对人这个对象，我们需要创建怎样的工厂？
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
