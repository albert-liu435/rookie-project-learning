package com.rookie.bigdata.mapper;

import com.rookie.bigdata.domain.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Classname EmployeeMapperPlusTest
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/21 10:49
 * @Version 1.0
 */
public class EmployeeMapperPlusTest {

    public SqlSessionFactory getSqlSessionFactory() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        return new SqlSessionFactoryBuilder().build(inputStream);
    }


    @Test
    public void getEmpById() throws IOException{
                SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        SqlSession openSession = sqlSessionFactory.openSession();
        try{
            EmployeeMapperPlus mapper = openSession.getMapper(EmployeeMapperPlus.class);
			Employee empById = mapper.getEmpById(1);
			System.out.println(empById);
        }finally{
            openSession.close();
        }


    }

    @Test
    public void getEmpAndDept() throws IOException{
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        SqlSession openSession = sqlSessionFactory.openSession();
        try{
            EmployeeMapperPlus mapper = openSession.getMapper(EmployeeMapperPlus.class);
			Employee empAndDept = mapper.getEmpAndDept(1);
			System.out.println(empAndDept);
			System.out.println(empAndDept.getDept());

        }finally{
            openSession.close();
        }
    }

    @Test
    public void getEmpByIdStep() throws IOException{
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        SqlSession openSession = sqlSessionFactory.openSession();
        try{
            EmployeeMapperPlus mapper = openSession.getMapper(EmployeeMapperPlus.class);
            Employee empAndDept = mapper.getEmpByIdStep(1);
            System.out.println(empAndDept);
            System.out.println(empAndDept.getDept());

        }finally{
            openSession.close();
        }
    }

    @Test
    public void getEmpsByDeptId() throws IOException{
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        SqlSession openSession = sqlSessionFactory.openSession();
        try{
            EmployeeMapperPlus mapper = openSession.getMapper(EmployeeMapperPlus.class);
            List<Employee> emps = mapper.getEmpsByDeptId(1);
            for (Employee emp : emps) {
                System.out.println(emp);
            }
        }finally{
            openSession.close();
        }
    }
}