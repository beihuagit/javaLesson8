package com.spring5.service.impl;

import com.spring5.entity.OrderInfo;
import com.spring5.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * @author 洛水晴川
 * @date 2021/9/27 11:58
 * */
@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public void add(OrderInfo order) {
        Thread t = Thread.currentThread();
        System.out.println(t);
    }

    @Override
    public String test() {
        System.out.println("test@postConstruct");
        return "hello";
    }
}
