package com.design.factory;

/**
 * 简单工厂模式（去掉抽象工厂类的继承，改用静态方法）
 * @author 洛水晴川
 * @date 2021/7/13 17:23
 * */
public class SimpleHumanFactory {

    public static <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("人类产生异常！");
            e.printStackTrace();
        }
        return (T) human;
    }
}
