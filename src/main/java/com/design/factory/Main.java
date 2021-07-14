package com.design.factory;

/**
 * 工厂测试
 * @author 洛水晴川
 * @date 2021/7/13 16:56
 * */
public class Main {
    public static void main(String[] args) {
        // 声明工厂
        //AbstractHumanFactory factory = new HumanFactory();
        //System.out.println("----产生一批白人----");
        //Human white = factory.createHuman(WhiteHuman.class);
        //white.getColor();
        //white.talk();
        //System.out.println("----产生一批黑人----");
        //Human black = factory.createHuman(BlackHuman.class);
        //black.getColor();
        //black.talk();
        //System.out.println("----产生一批黄种人----");
        //Human yellow = factory.createHuman(YellowHuman.class);
        //yellow.getColor();
        //yellow.talk();

        // 简单工厂模式测试
        System.out.println("----产生一批白人----");
        Human white = SimpleHumanFactory.createHuman(WhiteHuman.class);
        white.getColor();
        white.talk();
        System.out.println("----产生一批黑人----");
        Human black = SimpleHumanFactory.createHuman(BlackHuman.class);
        black.getColor();
        black.talk();
        System.out.println("----产生一批黄种人----");
        Human yellow = SimpleHumanFactory.createHuman(YellowHuman.class);
        yellow.getColor();
        yellow.talk();
    }
}
