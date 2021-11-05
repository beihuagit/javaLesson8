package com.design.proxy;

/**
 * 游戏玩家
 * @author 洛水晴川
 * @date 2021/7/28 18:00
 * */
public interface IGamePlayer {
    /**
     * 登录
     * @param username
     * @param password
     */
    void login(String username, String password);

    /**
     * 杀怪
     */
    void killBoos() throws InterruptedException;

    /**
     * 升级
     */
    void upgrade();
}
