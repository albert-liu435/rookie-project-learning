package com.rookie.bigdata.mapper;

import com.rookie.bigdata.domain.Employee;

import java.util.List;

/**
 * @Classname EmployeeMapper
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/21 15:47
 * @Version 1.0
 */
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public List<Employee> getEmps();


}
