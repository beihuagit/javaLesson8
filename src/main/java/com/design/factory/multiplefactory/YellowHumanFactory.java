package com.design.factory.multiplefactory;

import com.design.factory.Human;
import com.design.factory.YellowHuman;

/**
 * 黄种人工厂
 * @author 洛水晴川
 * @date 2021/7/13 17:34
 * */
public class YellowHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}
