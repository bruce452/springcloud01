package com.pc.study.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by pengchao on 2019/12/2.
 */
@RestController
public class ConfigClientRest {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaName;

    @Value("${server.port}")
    private Integer port;

    @RequestMapping("/conf")
    public String getConfig(){
        return "applicationName:"+applicationName+",eurekaName:"+eurekaName+",port:"+port;
    }


}
