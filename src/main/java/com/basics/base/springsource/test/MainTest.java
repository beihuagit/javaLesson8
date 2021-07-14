package com.basics.base.springsource.test;

import java.awt.*;

/**
 * 手写Spring容器
 * @author 洛水晴川
 * @date 2021/4/14 15:46
 * */
public class MainTest {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        //XiaoleApplicationContext appContext = new XiaoleApplicationContext(AppConfig.class);
        //UserService userService = (UserService) appContext.getBean("userService");
        //System.out.println(appContext.getBean("userService"));
        //System.out.println(appContext.getBean("userService"));
        //System.out.println(appContext.getBean("userService"));
        //UserService userService = (UserService) appContext.getBean("userService");
        // 测试依赖注入
        //userService.test();

        Image im[] = new Image[4];
        System.out.println(im[0].toString());
    }
}
