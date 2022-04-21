package com.rookie.bigdata.service;

import com.rookie.bigdata.domain.Employee;
import com.rookie.bigdata.mapper.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname EmployeeService
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/21 15:57
 * @Version 1.0
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private SqlSession sqlSession;

    public List<Employee> getEmps(){
        //
        //EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        return employeeMapper.getEmps();
    }

}