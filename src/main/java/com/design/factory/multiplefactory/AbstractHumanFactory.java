package com.design.factory.multiplefactory;

import com.design.factory.Human;

/**
 * 多工厂模式：抽线工厂类
 * @author 洛水晴川
 * @date 2021/7/13 17:31
 * */
public abstract class AbstractHumanFactory {

    /**
     * 业务方法：产生人类
     * @return
     */
    public abstract Human createHuman();
}
