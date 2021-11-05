package com.spring5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author 洛水晴川
 * @date 2021/9/16 18:39
 * */
@ServletComponentScan(basePackages = "com.spring5.filters")
@SpringBootApplication
@EnableAsync
public class MySpringApplication {
    public static ConfigurableApplicationContext ac;

    public static void main(String[] args) {
        ac = SpringApplication.run(MySpringApplication.class, args);
    }
}
