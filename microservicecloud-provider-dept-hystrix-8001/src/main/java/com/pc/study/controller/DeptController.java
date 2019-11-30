package com.pc.study.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.pc.study.entity.Dept;
import com.pc.study.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * created by pengchao on 2019/11/27.
 */

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping(value = "/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable("id") Long id){
        Dept dept = deptService.get(id);
        if(null==dept){
            throw new RuntimeException("没有对应编号的信息");
        }
        return dept;
    }

    public Dept processHystrix_Get(@PathVariable("id") Long id){
        return new Dept().setDeptno(id).setDname("没有对应信息").setDb_source("没有对应数据库");
    }

}
