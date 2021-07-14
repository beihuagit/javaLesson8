package com.design.principal;

/**
 * @author 洛水晴川
 * @date 2021/3/2 14:59
 * */
public interface Iphone {
    /**
     * 运行内存
     */
    String RAM();

    /**
     * 手机存储内存
     */
    String ROM();

    /**
     * CPU主频
     */
    String CPU();

    /**
     * 屏幕大小
     */
    int Size();

    /**
     * 手机充电接口
     */
    void Charging();

    /**
     * 打电话
     */
    void RingUp();

    /**
     * 接电话
     */
    void ReceiveUp();

    /**
     * 上网
     */
    void SurfInternet();
}
