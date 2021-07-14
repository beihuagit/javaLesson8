package com.design.factory.multiplefactory;

import com.design.factory.BlackHuman;
import com.design.factory.Human;

/**
 * 黑人工厂
 * @author 洛水晴川
 * @date 2021/7/13 17:33
 * */
public class BlackHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
