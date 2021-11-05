package com.spring5.bean;

import com.spring5.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * 初始化的时候对bean做一些事情
 * @author xiaole.chen
 * @date 2021/10/26 21:40
 * */
@Component
public class MyContextBean {

    @Autowired
    private OrderService orderService;

    public static OrderService staticOrderService;

    @PostConstruct
    public void init() {
        staticOrderService = orderService;
    }

    //public static String getOrder() {
    //    return staticOrderService.test();
    //}
}
