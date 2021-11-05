package com.design.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 洛水晴川
 * @date 2021/7/28 16:08
 * */
public class BuilderTest {

    public static void main(String[] args) {
        /**
         * 客户需要生产一种车模，并且按照一定的顺序运行
         */
        //BenzModel benzModel = new BenzModel();
        List<String> list = new ArrayList<>();
        list.add("alarm");
        list.add("engine boom");
        list.add("start");
        list.add("stop");
        //benzModel.setSequence(list);
        //benzModel.run();
        // 关于上述代码，如果客户要求随意调整顺序，随意增减功能，对于硬编码来说就非常不便了，于是我们采用建造者模式，增加一个车辆的Builder抽象类
        BenzBuilder benz = new BenzBuilder();
        benz.setSequence(list);
        BenzModel benzModel = (BenzModel) benz.getCarModel();
        benzModel.run();
    }
}
