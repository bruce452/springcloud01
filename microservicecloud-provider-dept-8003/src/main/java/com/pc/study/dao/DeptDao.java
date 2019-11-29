package com.pc.study.dao;

import com.pc.study.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * created by pengchao on 2019/11/27.
 */

@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
