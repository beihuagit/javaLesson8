package com.design.builder;

/**
 * 车辆实现：奔驰
 * @author 洛水晴川
 * @date 2021/7/28 16:05
 * */
public class BenzModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("奔驰车启动");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰车停止");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰车鸣笛");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰车引擎声");
    }
}
