package com.basics.base.springsource.test;

import com.basics.base.springsource.Autowired;
import com.basics.base.springsource.Component;
import com.basics.base.springsource.InitializeBean;

/**
 * @author 洛水晴川
 * @date 2021/4/14 15:46
 * */
@Component("userService")
public class UserService implements InitializeBean {

    @Autowired
    OrderService orderService;

    private User defaultUser;

    public void test() {
        System.out.println("========执行userService.test()方法===========");
        System.out.println(orderService);
        System.out.println(defaultUser);
        System.out.println(defaultUser.getUsername());
        System.out.println(defaultUser.getAge());
    }

    /**
     * Spring用于初始化值的方法
     */
    @Override
    public void afterPropertiesSet() {
        defaultUser = new User();
        defaultUser.setUsername("afterPropertiesSet()");
        defaultUser.setAge(26);
    }
}
