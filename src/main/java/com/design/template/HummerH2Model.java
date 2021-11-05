package com.design.template;

/**
 * 悍马H2实例
 * @author 洛水晴川
 * @date 2021/7/26 16:49
 * */
public class HummerH2Model extends HummerModel {
    /**
     * 是否鸣喇叭
     */
    private final boolean isAlarmFlag = true;
    @Override
    protected void start() {
        System.out.println("悍马H2发动......");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H2停止......");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H2鸣笛......");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H2引擎声......");
    }

    @Override
    protected boolean isAlarm() {
        return this.isAlarmFlag;
    }
}
