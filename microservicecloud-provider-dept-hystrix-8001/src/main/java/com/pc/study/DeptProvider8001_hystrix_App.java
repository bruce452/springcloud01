package com.pc.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * created by pengchao on 2019/11/27.
 */

@SpringBootApplication
@EnableEurekaClient       //本服务启动后会自动注册到eureka服务器
@EnableDiscoveryClient    //服务发现
@EnableCircuitBreaker      //对hystrix熔断器提供支持
public class DeptProvider8001_hystrix_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_hystrix_App.class,args);
    }

}
