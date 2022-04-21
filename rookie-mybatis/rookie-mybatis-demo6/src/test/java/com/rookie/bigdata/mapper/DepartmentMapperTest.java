//package com.rookie.bigdata.mapper;
//
//
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//import org.junit.Test;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.List;
//
//import static org.junit.Assert.*;
//
///**
// * @Classname DepartmentMapperTest
// * @Description TODO
// * @Author rookie
// * @Date 2022/4/21 10:58
// * @Version 1.0
// */
//public class DepartmentMapperTest {
//
//
//
//    public SqlSessionFactory getSqlSessionFactory() throws IOException {
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        return new SqlSessionFactoryBuilder().build(inputStream);
//    }
//
//
//    @Test
//    public void getDeptById() throws IOException{
//
//        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
//        SqlSession openSession = sqlSessionFactory.openSession();
//        try{
//            DepartmentMapper mapper = openSession.getMapper(DepartmentMapper.class);
//            Department department = mapper.getDeptById(1);
//            System.out.println(department);
//        }finally{
//            openSession.close();
//        }
//
//    }
//
//    @Test
//    public void getDeptByIdPlus() throws IOException{
//
//
//        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
//        SqlSession openSession = sqlSessionFactory.openSession();
//        try{
//            DepartmentMapper mapper = openSession.getMapper(DepartmentMapper.class);
//            Department department = mapper.getDeptByIdPlus(1);
//            System.out.println(department);
//
//            List<Employee> emps = department.getEmps();
//            for (Employee emp : emps) {
//                System.out.println(emp);
//            }
//        }finally{
//            openSession.close();
//        }
//    }
//
//    @Test
//    public void getDeptByIdStep() throws IOException{
//
//
//        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
//        SqlSession openSession = sqlSessionFactory.openSession();
//        try{
//            DepartmentMapper mapper = openSession.getMapper(DepartmentMapper.class);
//            Department department = mapper.getDeptByIdStep(1);
//            System.out.println(department);
//
//            List<Employee> emps = department.getEmps();
//            for (Employee emp : emps) {
//                System.out.println(emp);
//            }
//        }finally{
//            openSession.close();
//        }
//    }
//}