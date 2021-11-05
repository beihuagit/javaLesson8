package com.spring5.entity;

import java.time.LocalDateTime;

/**
 * @author 洛水晴川
 * @date 2021/9/27 11:54
 * */
public class OrderInfo {
    private Long orderId;
    private LocalDateTime createTime;
    private String remark;

    public OrderInfo() {
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "orderId=" + orderId +
                ", createTime=" + createTime +
                ", remark='" + remark + '\'' +
                '}';
    }
}
