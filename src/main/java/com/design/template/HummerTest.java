package com.design.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 生产悍马测试
 * @author 洛水晴川
 * @date 2021/7/26 16:56
 * */
public class HummerTest {

    public static void main(String[] args) throws IOException {
        System.out.println("H1悍马是否需要喇叭声响？\n  0-不需要     1-需要");
        String type = new BufferedReader(new InputStreamReader(System.in)).readLine();
        HummerH1Model h1 = new HummerH1Model();
        if("0".equals(type)){
            h1.setAlarmFlag(false);
        }
        h1.run();
        System.out.println("========================");
        HummerH2Model h2 = new HummerH2Model();
        h2.run();
    }
}
