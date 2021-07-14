package com.design.factory.lazyfactory;

import com.design.factory.Human;

import java.util.HashMap;
import java.util.Map;

/**
 * 延迟加载工厂：产生的对象被消费完毕后不立即回收，工厂类保持其初始状态，等待再次被使用（相当于产生一个缓存）
 * 典型应用场景：JDBC连接池
 * @author 洛水晴川
 * @date 2021/7/13 17:59
 * */
public class HumanFactory {
    private static final Map<String, Human> hMap = new HashMap<>();

    public static synchronized Human createHuman(String color) throws IllegalAccessException, InstantiationException {
        Human human;
        if (hMap.containsKey(color)) {
            human = hMap.get(color);
        } else {
            Class c = HumanTypeConstans.human.get(color);
            if (c != null) {
                human = HumanTypeConstans.human.get(color).newInstance();
                // 放入缓存容器中
                hMap.put(color, human);
            } else {
                // 默认生成黄种人(从缓存取值，不再重新生成对象)
                human = hMap.get("yellow");
            }
        }
        return human;
    }
}
