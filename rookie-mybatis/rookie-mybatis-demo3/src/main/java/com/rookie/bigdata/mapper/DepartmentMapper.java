package com.rookie.bigdata.mapper;

import com.rookie.bigdata.domain.Department;

/**
 * @Classname DepartmentMapper
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/21 10:56
 * @Version 1.0
 */
public interface DepartmentMapper {

    public Department getDeptById(Integer id);

    public Department getDeptByIdPlus(Integer id);

    public Department getDeptByIdStep(Integer id);
}
