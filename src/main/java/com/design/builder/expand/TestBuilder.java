package com.design.builder.expand;

/**
 * @author 洛水晴川
 * @date 2021/7/28 17:18
 * */
public class TestBuilder {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder("Intel", "Samsung").setKeyboard("机械键盘").setUsbCount(3).build();
        System.out.println(computer.toString());
    }
}
