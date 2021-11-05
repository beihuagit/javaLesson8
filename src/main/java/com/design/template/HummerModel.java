package com.design.template;

/**
 * 模板方法模式一般由：基本方法（基本操作）和模板方法（组合基本操作，实现对基本操作的调度）组成；
 * 模板方法模式：模板一——悍马
 * @author 洛水晴川
 * @date 2021/7/26 16:45
 * */
public abstract class HummerModel {

    /**
     * 基本方法：
     * 启动
     */
    protected abstract void start();

    /**
     * 基本方法：
     * 停止
     */
    protected abstract void stop();

    /**
     * 基本方法：
     * 鸣笛
     */
    protected abstract void alarm();

    /**
     * 基本方法：
     * 引擎响
     */
    protected abstract void engineBoom();

    /**
     * 模板方法
     * 行驶：将启动、鸣笛、引擎声、停止综合起来
     */
    protected final void run() {
        // 启动
        this.start();
        // 引擎
        this.engineBoom();
        // 鸣笛
        if (isAlarm()) {
            this.alarm();
        }
        // 停车
        this.stop();
    }

    /**
     * 升级版：由具体实现决定是否鸣喇叭(实现类影响父类的结果)
     * @return
     */
    protected boolean isAlarm() {
        return true;
    }
}
