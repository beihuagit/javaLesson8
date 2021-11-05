package com.spring5;

/**
 * SpringBean的生命周期
 * Bean 的三种获取方式：
 *     1. 启动类获取
 *     2. 实现ApplicationContextAware
 *     3. @PostConstruct注解
 * @author 洛水晴川
 * @date 2021/9/23 11:24
 * */
public class Main {

    public static void main(String[] args) {
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring_01.xml");
        //UserEntity userEntity = (UserEntity) context.getBean("userEntity");
        //MySpringApplication.ac.getBean("");
        //MyStaticBeanAware.getBean(UserEntity.class);
        //MyContextBean.getOrder();
        //System.out.println("第四步：调用使用bean实例userEntity");
        //System.out.println(userEntity);
        //context.close();
    }
}
