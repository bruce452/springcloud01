package com.pc.study.cfgbean;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * created by pengchao on 2019/11/28.
 */

@Configuration
public class ConfigBean {
    /*
        restTemplate提供了多种便捷访问远程http服务的方法
        是spring提供的用于访问rest服务的客户端模板工具及
    */

    @Bean
    @LoadBalanced       //开启ribbon负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }


    // 选择负载均衡的算法。默认是轮询
    @Bean
    public IRule myRule(){
        return new RetryRule();
    }


}


/**
 * configBean用Configuration注解，相当于spring中的applicationContext.xml
 *
 * <bean id='userService' class='com.pc.study.UserServiceImpl'></bean>
 *
 * 等价于
 *
 * @Bean
 * public UserService getUserService(){
 *       return new UserServiceImpl();
 * }
 */
