package com.spring5.entity;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author 洛水晴川
 * @date 2021/9/24 22:21
 * */
@Slf4j
@Component
public class OrderManager {

    /**
     * Spring结合线程池异步
     */
    @Async("asyncExecutor")
    public String asyncAdd() {
        try {
            Thread.sleep(3000);
            log.info("<2>");
        } catch (InterruptedException e) {

        }
        return "1";
    }
}
