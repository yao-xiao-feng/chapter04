package com.chapter04.dao;

import com.chapter04.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//部门dao
@Repository
public class DepartmentDao {
    //模拟数据库中的数据

    private static Map<Integer, Department> departments=null;
    static {
        departments =new HashMap<Integer, Department>();
        departments.put(101,new Department(101,"教学部"));
        departments.put(102,new Department(102,"市场部"));

    }
    //获得所有部门信息
    public Collection<Department> getDepartments(){

        return departments.values();
    }
    //获得id得到部门
    public Department getDepartmentById(Integer id){

        return departments.get(id);
    }
}
