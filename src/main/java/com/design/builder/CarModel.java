package com.design.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 建造者模式
 * @author 洛水晴川
 * @date 2021/7/26 17:59
 * */
public abstract class CarModel {
    /**
     * 基本方法的执行顺序
     */
    private List<String> sequence = new ArrayList<>();
    /**
     * 功能描述： 启动
     * @author 陈小乐 xiaole_chen@aliyun.com
     * @date 2021-07-26
     */
    protected abstract void start();
    /**
     * 功能描述：停止
     * @author 陈小乐 xiaole_chen@aliyun.com
     * @date 2021-07-26
     */
    protected abstract void stop();

    /**
     * 鸣喇叭
     */
    protected abstract void alarm();

    /**
     * 引擎声
     */
    protected abstract void engineBoom();

    /**
     * final普通方法，不被子类继承
     */
    final public void run() {
        /**
         * 谁在前就执行谁
         */
        for (int i = 0; i < sequence.size(); i++) {
            String actionName = this.sequence.get(i);
            if(actionName.equalsIgnoreCase("start")) {
                this.start();
            } else if(actionName.equalsIgnoreCase("stop")) {
                this.stop();
            } else if (actionName.equalsIgnoreCase("alarm")) {
                this.alarm();
            } else if (actionName.equalsIgnoreCase("engine boom")) {
                this.engineBoom();
            }
        }
    }

    final public void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }
}
