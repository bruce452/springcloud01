package com.pc.study.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * created by pengchao on 2019/11/27.
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {

    //序列化是为了持久化
    private static final long serialVersionUID = -1992587174802921288L;

    //主键
    private Long deptno;

    //部门名称
    private String dname;

    //来自哪个数据库，因为微服务架构可以一个服务对应一个数据库
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }

    public static void main(String[] args) {
        Dept dept=new Dept();
        dept.setDname("aaf").setDeptno(11L).setDb_source("dfg");
        System.out.println(dept);
    }
}
