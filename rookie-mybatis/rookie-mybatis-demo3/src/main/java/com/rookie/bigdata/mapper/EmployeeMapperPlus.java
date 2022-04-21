package com.rookie.bigdata.mapper;

import com.rookie.bigdata.domain.Employee;

import java.util.List;

/**
 * @Classname EmployeeMapperPlus
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/21 10:27
 * @Version 1.0
 */
public interface EmployeeMapperPlus {
    public Employee getEmpById(Integer id);

    public Employee getEmpAndDept(Integer id);

    public Employee getEmpByIdStep(Integer id);

    public List<Employee> getEmpsByDeptId(Integer deptId);
}
