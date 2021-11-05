package com.basics.base.springsource.test;

/**
 * @author xiaole.chen
 * @date 2021/10/17 10:43
 * */
public class OrderInf {

    private Long orderId;
    private String orderName;
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
}
