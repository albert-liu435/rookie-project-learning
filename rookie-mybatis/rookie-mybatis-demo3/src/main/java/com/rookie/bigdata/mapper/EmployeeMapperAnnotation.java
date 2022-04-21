package com.rookie.bigdata.mapper;

import com.rookie.bigdata.domain.Employee;
import org.apache.ibatis.annotations.Select;

/**
 * @Classname EmployeeMapperAnnotation
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/21 9:41
 * @Version 1.0
 */
public interface EmployeeMapperAnnotation {

    @Select("select * from tbl_employee where id=#{id}")
    public Employee getEmpById(Integer id);
}
