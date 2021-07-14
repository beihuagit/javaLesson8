package com.design.factory;

/**
 * 人类产生工厂
 * @author 洛水晴川
 * @date 2021/7/13 16:50
 * */
public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        // 定义一个产生人类的对象
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("人类生成错误！");
            e.printStackTrace();
        }
        return (T) human;
    }
}
