package com.basics.data;

import java.util.Scanner;

/**
 * Java基础综合练习：模拟登录
 * @author 洛水晴川
 * @date 2021/9/24 17:40
 * */
public class MonitorLoginError {
    public static void main(String[] args) {
        String userName = "admin";
        String password = "123456";
        // 重试机会3次
        int retryCount = 3;
        int count = 0;
        while(count < retryCount) {
            count++;
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String name = scanner.nextLine();
            System.out.println("请输入密码：");
            String pwd = scanner.nextLine();
            if (name.equals(userName) && pwd.equals(password)) {
                System.out.println("用户名和密码正确，恭喜登录成功！");
                break;
            }else {
                if (retryCount == count) {
                    System.out.println("你输入的错误次数太多，账户已冻结，请明天再试。");
                    return;
                }
                System.out.println("账户或密码输入有误，还剩 " + (retryCount - count) + " 次机会");
            }
        }
    }
}
