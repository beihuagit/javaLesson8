package com.design.proxy;

/**
 * 代理类：游戏代练
 * @author 洛水晴川
 * @date 2021/10/14 16:17
 * */
public class GamePlayerProxy implements IGamePlayer {

    private final IGamePlayer player;

    public GamePlayerProxy(IGamePlayer player) {
        this.player = player;
    }

    @Override
    public void login(String username, String password) {
        this.player.login(username, password);
    }

    @Override
    public void killBoos() throws InterruptedException {
        this.player.killBoos();
    }

    @Override
    public void upgrade() {
        this.player.upgrade();
    }
}
