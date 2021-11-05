package com.basics.base.springsource.test;

import com.basics.base.springsource.Autowired;
import com.basics.base.springsource.Component;
import com.basics.base.springsource.Scope;

/**
 * @author 洛水晴川
 * @date 2021/4/14 18:29
 * */
@Component("orderService")
@Scope("prototype")
public class OrderService {

    @Autowired
    private UserService userService;

    public void test() {
        System.out.println("========执行OrderService.test()方法：========");
        System.out.println(userService);
    }

}
