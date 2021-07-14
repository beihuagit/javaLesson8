package com.design.singleton;

import java.math.BigDecimal;

/**
 * 辅导员召集学生参加班会：假设一个辅导员管理两个班级
 * @author 洛水晴川
 * @date 2021/7/13 11:24
 * */
public class Student {
    public static void main(String[] args) {
        for (int i = 0; i < BigDecimal.ROUND_CEILING; i++) {
            // 辅导员来了，同学们见到的都是同一个辅导员
            HeadTeacher2 headTeacher = HeadTeacher2.getInstance();
            headTeacher.say(i + 1);
        }
    }
}
