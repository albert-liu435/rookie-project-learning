package com.rookie.bigdata.mapper;

import com.rookie.bigdata.domain.Department;
import com.rookie.bigdata.domain.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Classname EmployeeMapperDynamicSQLTest
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/21 11:21
 * @Version 1.0
 */
public class EmployeeMapperDynamicSQLTest {

    public SqlSessionFactory getSqlSessionFactory() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        return new SqlSessionFactoryBuilder().build(inputStream);
    }


    @Test
    public void getEmpsTestInnerParameter() throws IOException {
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        SqlSession openSession = sqlSessionFactory.openSession();
        try {
            EmployeeMapperDynamicSQL mapper = openSession.getMapper(EmployeeMapperDynamicSQL.class);
            Employee employee2 = new Employee();
            employee2.setLastName("%e%");
            List<Employee> list = mapper.getEmpsTestInnerParameter(employee2);
            for (Employee employee : list) {
                System.out.println(employee);
            }
        } finally {
            openSession.close();
        }
    }

    @Test
    public void getEmpsByConditionIf() throws IOException {
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        SqlSession openSession = sqlSessionFactory.openSession();
        try {
            EmployeeMapperDynamicSQL mapper = openSession.getMapper(EmployeeMapperDynamicSQL.class);
            //select * from tbl_employee where id=? and last_name like ?
            //测试if\where
            Employee employee = new Employee(1, "Admin", null, null);
            List<Employee> emps = mapper.getEmpsByConditionIf(employee);
            for (Employee emp : emps) {
                System.out.println(emp);
            }

        } finally {
            openSession.close();
        }


    }

    @Test
    public void getEmpsByConditionTrim() throws IOException {
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        SqlSession openSession = sqlSessionFactory.openSession();
        try {
            EmployeeMapperDynamicSQL mapper = openSession.getMapper(EmployeeMapperDynamicSQL.class);
            //select * from tbl_employee where id=? and last_name like ?
            //测试if\where
            Employee employee = new Employee(1, "Admin", null, null);

            //查询的时候如果某些条件没带可能sql拼装会有问题
            //1、给where后面加上1=1，以后的条件都and xxx.
            //2、mybatis使用where标签来将所有的查询条件包括在内。mybatis就会将where标签中拼装的sql，多出来的and或者or去掉
            //where只会去掉第一个多出来的and或者or。

            //测试Trim
			List<Employee> emps2 = mapper.getEmpsByConditionTrim(employee);
			for (Employee emp : emps2) {
				System.out.println(emp);
			}

        } finally {
            openSession.close();
        }


    }

    @Test
    public void getEmpsByConditionChoose() throws IOException {
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        SqlSession openSession = sqlSessionFactory.openSession();
        try {
            EmployeeMapperDynamicSQL mapper = openSession.getMapper(EmployeeMapperDynamicSQL.class);

            Employee employee = new Employee(1, "Admin", null, null);


            //测试choose
			List<Employee> list = mapper.getEmpsByConditionChoose(employee);
			for (Employee emp : list) {
				System.out.println(emp);
			}


        } finally {
            openSession.close();
        }


    }

    @Test
    public void updateEmp() throws IOException {
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        SqlSession openSession = sqlSessionFactory.openSession();
        try {
            EmployeeMapperDynamicSQL mapper = openSession.getMapper(EmployeeMapperDynamicSQL.class);

            Employee employee = new Employee(1, "Admin", null, null);


            //测试set标签
			mapper.updateEmp(employee);
			openSession.commit();


        } finally {
            openSession.close();
        }


    }

    @Test
    public void getEmpsByConditionForeach() throws IOException {
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        SqlSession openSession = sqlSessionFactory.openSession();
        try {
            EmployeeMapperDynamicSQL mapper = openSession.getMapper(EmployeeMapperDynamicSQL.class);

            List<Employee> list = mapper.getEmpsByConditionForeach(Arrays.asList(1,2));
            for (Employee emp : list) {
                System.out.println(emp);
            }

        } finally {
            openSession.close();
        }


    }

    @Test
    public void addEmps() throws IOException {
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        SqlSession openSession = sqlSessionFactory.openSession();
        try{
            EmployeeMapperDynamicSQL mapper = openSession.getMapper(EmployeeMapperDynamicSQL.class);
            List<Employee> emps = new ArrayList<>();
            emps.add(new Employee(null, "smith0x1", "smith0x1@atguigu.com", "1",new Department(1)));
            emps.add(new Employee(null, "allen0x1", "allen0x1@atguigu.com", "0",new Department(1)));
            mapper.addEmps(emps);
            openSession.commit();
        }finally{
            openSession.close();
        }

    }
}