package com.basics.base.springsource;

/**
 * 管理Bean的一些定义的属性（类）
 * @author 洛水晴川
 * @date 2021/4/14 17:22
 * */
public class BeanDefinition {

    private Class clazz;
    private String scope;

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}
