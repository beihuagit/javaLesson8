package com.design.factory.abstractfactory;

/**
 * 由抽象工厂类引申出一个思考：抽象类是否能够被实例化？答案是：抽象类是可以实例化的，只不过是通过子类实例化的
 * 抽象类和接口：
 * @author 洛水晴川
 * @date 2021/7/13 22:02
 * */
public class Main {
    public static void main(String[] args) {
        // 第一条生产线：男性生产线
        HumanFactory maleHumanFactory = new MaleFactory();
        // 第二条生产线：女性生产线
        HumanFactory femaleHumanFactory = new FemaleFactory();
        // 开始生产人类
        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
        System.out.println("====生产一个黄色女性============");
        femaleYellowHuman.getColor();
        femaleYellowHuman.talk();
        femaleYellowHuman.getSex();
        System.out.println("====生产一个黄色男性============");
        maleYellowHuman.getColor();
        maleYellowHuman.talk();
        maleYellowHuman.getSex();
        Human maleWhiteHuman = maleHumanFactory.createWhiteHuman();
        Human femaleWhiteHuman = femaleHumanFactory.createWhiteHuman();
        System.out.println("====生产一个白人男性============");
        maleWhiteHuman.getColor();
        maleWhiteHuman.talk();
        maleWhiteHuman.getSex();
        System.out.println("====生产一个白人女性============");
        femaleWhiteHuman.getColor();
        femaleWhiteHuman.talk();
        femaleWhiteHuman.getSex();
        Human maleBlackHuman = maleHumanFactory.createBlackHuman();
        Human femaleBlackHuman = femaleHumanFactory.createBlackHuman();
        System.out.println("====生产一个黑人女性============");
        femaleBlackHuman.getColor();
        femaleBlackHuman.talk();
        femaleBlackHuman.getSex();
        System.out.println("====生产一个黑人男性============");
        maleBlackHuman.getColor();
        maleBlackHuman.talk();
        maleBlackHuman.getSex();
    }
}

