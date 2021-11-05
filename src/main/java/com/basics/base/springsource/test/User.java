package com.basics.base.springsource.test;

/**
 * @author 洛水晴川
 * @date 2021/4/14 18:49
 * */
public class User {

    private String username;
    private Integer age;
    private OrderInf order;

    public void setOrder(OrderInf order) {
        this.order = order;
    }

    public OrderInf getOrder() {
        return order;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
