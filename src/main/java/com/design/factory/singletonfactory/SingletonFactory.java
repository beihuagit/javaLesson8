package com.design.factory.singletonfactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 工厂单例：结合工厂模式的单例
 * @author 洛水晴川
 * @date 2021/7/13 17:46
 * */
public class SingletonFactory {
    private static Singleton singleton;
    static {
        try {
            Class<?> c1 = Class.forName(Singleton.class.getName());
            // 获得无参构造
            Constructor<?> constructor = c1.getDeclaredConstructor();
            // 设置无参构造是可访问的
            constructor.setAccessible(true);
            // 产生一个实例对象
            singleton = (Singleton) constructor.newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException e) {
            e.printStackTrace();
        }
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
