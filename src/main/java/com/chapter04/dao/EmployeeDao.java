package com.chapter04.dao;

import com.chapter04.pojo.Department;
import com.chapter04.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//员工Dao
@Repository
public class EmployeeDao {
    private static Map<Integer, Employee> employees=null;
    @Autowired
    private DepartmentDao departmentDao;
    static {

        employees =new HashMap<Integer, Employee>();
       employees.put(101,new Employee(1001,"AA","932225228","男"));
        employees.put(102,new Employee(1002,"BB","9322252258","男"));

    }
    //主键自增
    private static  Integer initId =1006;

    //增加员工
    public void save(Employee employee){
        if (employee.getId()==null){
            employee.setId(initId++);
        }
        employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));
        employees.put(employee.getId(),employee);
    }

    //查询全部员工信息
    public  Collection<Employee>getAll(){
        return  employees.values();
    }
    //通过Id查询
    public Employee getEmployeeById(Integer id){
        return employees.get(id);
    }
    //通过id删除员工
    public void delete(Integer id){
        employees.remove(id);
    }
}
