package com.pc.study.service;

import com.pc.study.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component    //一定要加
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept get(Long id) {
                return new Dept().setDeptno(id).setDname("没有获取到对应信息，consumer客户端提供的降级信息，此可服务provider已经关闭").setDb_source("没有对应数据库");
            }

            @Override
            public List<Dept> list() {
                return null;
            }
        };
    }
}
