package com.spring5.service;

import com.spring5.entity.OrderInfo;

/**
 * @author 洛水晴川
 * @date 2021/9/27 11:53
 * */
public interface OrderService {

    /**
     * 新增订单
     * @param order
     */
    void add(OrderInfo order);

    String test();
}
