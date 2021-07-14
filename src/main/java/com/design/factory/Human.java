package com.design.factory;

/**
 * 工厂方法模式
 * 人类
 * @author 洛水晴川
 * @date 2021/7/13 16:40
 * */
public interface Human {
    /**
     * 用以区分不同人种的皮肤属性
     */
    void getColor();

    /**
     * 人类交流的语言
     */
    void talk();
}
