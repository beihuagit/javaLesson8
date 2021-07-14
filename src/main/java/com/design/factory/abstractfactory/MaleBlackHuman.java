package com.design.factory.abstractfactory;

/**
 * @author 洛水晴川
 * @date 2021/7/13 21:59
 * */
public class MaleBlackHuman extends AbstractBlackHuman {
    @Override
    public void getSex() {
        System.out.println("----性别：黑人男性----");
    }
}
