package com.pc.study.controller;

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

    @PostMapping(value = "/dept/add")
    public boolean add(@RequestBody Dept dept){
        return deptService.add(dept);
    }


    @GetMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return deptService.get(id);
    }


    @GetMapping(value = "/dept/list")
    public List<Dept> list(){
        return deptService.list();
    }



    @Autowired
    private DiscoveryClient client;

    @GetMapping(value = "/dept/discovery")
    public Object discovery(){
        List<String> services = client.getServices();
        System.out.println("====="+services);

        List<ServiceInstance> instances = client.getInstances("MICROSERVICECLOUD-DEPT");
        for(ServiceInstance instance:instances){
            System.out.println("host="+instance.getHost()+",port="+instance.getPort()+",uri="+instance.getUri());
        }
        return client;
    }



}
