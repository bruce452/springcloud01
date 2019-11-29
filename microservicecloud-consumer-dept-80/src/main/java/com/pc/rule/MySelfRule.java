package com.pc.rule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * created by pengchao on 2019/11/28.
 */


//自定义轮询，每个都轮询5次后，在跳转到下一个。

@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        return new RandomRule_pc();
    }
}