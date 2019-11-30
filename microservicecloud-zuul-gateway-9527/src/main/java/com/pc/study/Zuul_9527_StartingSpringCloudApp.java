package com.pc.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * created by pengchao on 2019/11/30.
 */

@SpringBootApplication
@EnableZuulProxy
public class Zuul_9527_StartingSpringCloudApp {

    public static void main(String[] args) {
        SpringApplication.run(Zuul_9527_StartingSpringCloudApp.class,args);
    }
}
