package com.rookie.bigdata.mapper;

import com.rookie.bigdata.domain.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Classname EmployeeMapperDynamicSQL
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/21 11:17
 * @Version 1.0
 */
public interface EmployeeMapperDynamicSQL {
    public List<Employee> getEmpsTestInnerParameter(Employee employee);

    //携带了哪个字段查询条件就带上这个字段的值
    public List<Employee> getEmpsByConditionIf(Employee employee);

    public List<Employee> getEmpsByConditionTrim(Employee employee);

    public List<Employee> getEmpsByConditionChoose(Employee employee);

    public void updateEmp(Employee employee);

    //查询员工id'在给定集合中的
    public List<Employee> getEmpsByConditionForeach(@Param("ids")List<Integer> ids);

    public void addEmps(@Param("emps")List<Employee> emps);
}
