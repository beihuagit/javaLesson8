package com.design.template;

/**
 * 模板方法模式
 * @author 洛水晴川
 * @date 2021/5/2 22:58
 * */
public class TemplateMethod {

    public final void print(String message, String prefix) {
        System.out.println("#################");
        commonPrint(message, prefix);
        wrapPrint(message, prefix);
        System.out.println("#################");
    }

    protected void wrapPrint(String message, String prefix) {
        System.out.println(prefix + message + prefix);
    }

    private void commonPrint(String message, String prefix) {
        System.out.println(String.format("输入消息：%s", message));
    }
}
