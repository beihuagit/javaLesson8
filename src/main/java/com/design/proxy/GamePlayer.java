package com.design.proxy;

/**
 * 游戏玩家实现类
 * @author 洛水晴川
 * @date 2021/7/28 19:01
 * */
public class GamePlayer implements IGamePlayer {
    private String name;

    public GamePlayer(String name_) {
        this.name = name_;
    }

    @Override
    public void login(String username, String password) {
        System.out.println("用户名为：" + username + " 的用户登录成功！");
    }

    @Override
    public void killBoos() throws InterruptedException {
        // 模拟打怪升级消耗时间
        System.out.println(this.name + "在打怪！");
        int temp = 0;
        for (int i = 0; i < 1000; i++) {
            temp += i + 1;
            System.out.print("*");
            if (temp % 2 == 0) {
                System.out.println(temp);
            }
        }
        Thread.sleep(5000);
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + "又升了一级！");
    }
}
