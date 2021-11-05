package com.basics.base.typer.innerclass;

/**
 * 内部类
 * @author 洛水晴川
 * @date 2021/9/23 17:21
 * */
public class Test {

    public static void main(String[] args) {

        /**
         * 接口匿名内部类的实现
         */
        Animal animal = () -> System.out.println("动物鸣叫");
        animal.tweet();


        /**
         * 抽象类匿名内部类的实现方式
         */
        Car car = new Car() {
            @Override
            public void drive() {
                System.out.println("车辆运行");
            }
        };
        car.start();
        car.drive();

        /**
         * 抽象类普通实现类：实现抽象方法，普通方法可以直接使用
         */
        Car bwm = new BwmCar();
        bwm.drive();
    }
}
