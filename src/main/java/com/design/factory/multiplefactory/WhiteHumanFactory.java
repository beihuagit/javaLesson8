package com.design.factory.multiplefactory;

import com.design.factory.Human;
import com.design.factory.WhiteHuman;

/**
 * 白人工厂
 * @author 洛水晴川
 * @date 2021/7/13 17:33
 * */
public class WhiteHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}
