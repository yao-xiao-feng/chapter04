package com.chapter04.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    private Integer id;
    private  int departmentName;

    public Department(int i, String 教学部) {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDepartmentName(int departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getId() {
        return id;
    }

    public int getDepartmentName() {
        return departmentName;
    }
}
