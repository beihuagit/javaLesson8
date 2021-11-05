package com.spring5.controller;

import com.spring5.MySpringApplication;
import com.spring5.bean.MyContextBean;
import com.spring5.common.ResultData;
import com.spring5.entity.OrderInfo;
import com.spring5.entity.OrderManager;
import com.spring5.entity.Student;
import com.spring5.service.OrderService;
import com.spring5.service.StudentInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author 洛水晴川
 * @date 2021/9/24 22:10
 * */
@Slf4j
@RestController
public class TestManagerController {

    /**
     * 同一个线程中可以随处获取到变量值，不同线程无法获取；
     */
    ThreadLocal<String> local = new ThreadLocal<>();

    @Autowired
    private OrderManager orderManager;
    @Resource
    private OrderService orderService;

    @RequestMapping(value = "/test")
    public ResultData test() {
        log.info("<1>");
        orderManager.asyncAdd();
        log.info("<3>");
        go();
        return ResultData.SUCCESS("hello");
    }

    @RequestMapping(value = "/local")
    public String testThreadLocal() {

        //HttpServletRequest request = ((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        if (local.get() == null) {
            // 值只会存一次
            local.set("测试ThreadLocal");
        }
        OrderInfo order = new OrderInfo();
        order.setCreateTime(LocalDateTime.now());
        order.setOrderId(1002002L);
        order.setRemark("补送");
        orderService.add(order);
        go();
        return "threadlocal";
    }

    private void go() {
        System.out.println(local.get());
    }

    @GetMapping(value = "/test3")
    public String test3() {
        OrderService orderService = MyContextBean.staticOrderService;
        return orderService.test();
    }

    @GetMapping(value = "/test4")
    public List<Student> test4() {
        StudentInfoService infoService = MySpringApplication.ac.getBean(StudentInfoService.class);
        return infoService.list();

    }
}
