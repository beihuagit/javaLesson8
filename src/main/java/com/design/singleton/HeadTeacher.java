package com.design.singleton;

/**
 * 单例模式：班主任，一个班级只有一个班主任，管理多名学生
 * @author 洛水晴川
 * @date 2021/7/13 11:15
 * */
public class HeadTeacher {

    /**
     * 构造函数私有化
     */
    private HeadTeacher(){}

    /**
     * 饿汉模式(单例推荐)
     */
    public static final HeadTeacher INSTANCE = new HeadTeacher();

    public static HeadTeacher getInstance() {
        return INSTANCE;
    }

    public void say(Integer Class) {
        System.out.println(String.format("Class %s students have a meeting .......", Class));
    }
}
