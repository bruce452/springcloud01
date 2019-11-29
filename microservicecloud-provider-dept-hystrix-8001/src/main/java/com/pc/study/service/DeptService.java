package com.pc.study.service;

import com.pc.study.entity.Dept;

import java.util.List;

/**
 * created by pengchao on 2019/11/27.
 */
public interface DeptService {

    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
