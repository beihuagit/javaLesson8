package com.jvm;

/**
 * JVM调优参数
 * @author 洛水晴川
 * @date 2021/10/12 16:17
 * */
public class TestVmOptions {

    public static void main(String[] args) {
        String str = System.getProperty("str");
        if (str == null) {
            System.out.println("java");
        } else {
            System.out.println(str);
        }
    }
}
