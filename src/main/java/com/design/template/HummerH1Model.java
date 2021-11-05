package com.design.template;

/**
 * 悍马H1实例
 * @author 洛水晴川
 * @date 2021/7/26 16:49
 * */
public class HummerH1Model extends HummerModel {
    /**
     * 是否鸣喇叭
     */
    private boolean isAlarmFlag = true;
    @Override
    protected void start() {
        System.out.println("悍马H1发动......");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H1停止......");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H1鸣笛......");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H1引擎声......");
    }

    public void setAlarmFlag(boolean alarmFlag) {
        this.isAlarmFlag = alarmFlag;
    }

    @Override
    protected boolean isAlarm() {
        return this.isAlarmFlag;
    }
}
