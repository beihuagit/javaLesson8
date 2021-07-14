package com.design.singleton;

/**
 * 单例模式2：懒汉式（在高并发下容易有线程安全隐患，不推荐使用）
 * @author 洛水晴川
 * @date 2021/7/13 15:57
 * */
public class HeadTeacher2 {

    public static HeadTeacher2 INSTANCE = null;

    private HeadTeacher2() {
    }

    public static HeadTeacher2 getInstance() {
        if (INSTANCE == null) {
            synchronized (HeadTeacher2.class) {
                INSTANCE = new HeadTeacher2();
            }
        }
        return INSTANCE;
    }

    public void say(Integer ClassId) {
        System.out.println(String.format("Class %s have a meeting......", ClassId));
    }
}
