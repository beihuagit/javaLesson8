package com.design.factory.lazyfactory;

import com.design.factory.BlackHuman;
import com.design.factory.Human;
import com.design.factory.WhiteHuman;
import com.design.factory.YellowHuman;

import java.util.HashMap;
import java.util.Map;

/**
 * 全世界人的种类(按皮肤颜色划分)
 * @author 洛水晴川
 * @date 2021/7/13 18:16
 * */
public class HumanTypeConstans {

    public static final Map<String, Class<? extends Human>> human = new HashMap<>();

    static {
        human.put("yellow", YellowHuman.class);
        human.put("white", WhiteHuman.class);
        human.put("black", BlackHuman.class);
    }
}
