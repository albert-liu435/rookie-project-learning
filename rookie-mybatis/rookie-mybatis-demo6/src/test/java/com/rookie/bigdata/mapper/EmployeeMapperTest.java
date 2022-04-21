//package com.rookie.bigdata.mapper;
//
//import com.rookie.bigdata.domain.Employee;
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//import org.junit.Test;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import static org.junit.Assert.*;
//
///**
// * @Classname EmployeeMapperTest
// * @Description TODO
// * @Author rookie
// * @Date 2022/4/21 10:30
// * @Version 1.0
// */
//public class EmployeeMapperTest {
//
//
//    public SqlSessionFactory getSqlSessionFactory() throws IOException {
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        return new SqlSessionFactoryBuilder().build(inputStream);
//    }
//
//    @Test
//    public void getEmpByLastNameLikeReturnMap()throws IOException {
//
//
//        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
//        //1、获取到的SqlSession不会自动提交数据
//        SqlSession openSession = sqlSessionFactory.openSession();
//
//        try{
//            EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);
//
//
//
//			Map<String, Employee> map = mapper.getEmpByLastNameLikeReturnMap("%r%");
//			System.out.println(map);
//
//        }finally{
//            openSession.close();
//        }
//    }
//
//    @Test
//    public void getEmpByIdReturnMap()throws IOException {
//
//        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
//        //1、获取到的SqlSession不会自动提交数据
//        SqlSession openSession = sqlSessionFactory.openSession();
//
//        try{
//            EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);
//
//
//			Map<String, Object> map = mapper.getEmpByIdReturnMap(1);
//			System.out.println(map);
//
//
//        }finally{
//            openSession.close();
//        }
//
//    }
//
//    @Test
//    public void getEmpsByLastNameLike() throws IOException{
//        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
//        //1、获取到的SqlSession不会自动提交数据
//        SqlSession openSession = sqlSessionFactory.openSession();
//
//        try{
//            EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);
//            //Employee employee = mapper.getEmpByIdAndLastName(1, "tom");
//
//            List<Employee> like = mapper.getEmpsByLastNameLike("%e%");
//            for (Employee employee : like) {
//                System.out.println(employee);
//            }
//
//        }finally{
//            openSession.close();
//        }
//    }
//
//    @Test
//    public void getEmpByMap() throws IOException{
//
//        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
//        //1、获取到的SqlSession不会自动提交数据
//        SqlSession openSession = sqlSessionFactory.openSession();
//
//        try{
//            EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);
//            //Employee employee = mapper.getEmpByIdAndLastName(1, "tom");
//            Map<String, Object> map = new HashMap<>();
//            map.put("id", 2);
//            map.put("lastName", "Tom");
//            map.put("tableName", "tbl_employee");
//            Employee employee = mapper.getEmpByMap(map);
//
//            System.out.println(employee);
//
//        }finally{
//            openSession.close();
//        }
//
//    }
//
//    @Test
//    public void getEmpByIdAndLastName() throws IOException{
//
//        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
//        //1、获取到的SqlSession不会自动提交数据
//        SqlSession openSession = sqlSessionFactory.openSession();
//
//        try{
//            EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);
//            Employee employee = mapper.getEmpByIdAndLastName(1, "tom");
//
//            System.out.println(employee);
//
//        }finally{
//            openSession.close();
//        }
//
//
//    }
//
//    @Test
//    public void getEmpById() throws IOException{
//
////        // 2、获取sqlSession实例，能直接执行已经映射的sql语句
////        // sql的唯一标识：statement Unique identifier matching the statement to use.
////        // 执行sql要用的参数：parameter A parameter object to pass to the statement.
////        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
////
////        SqlSession openSession = sqlSessionFactory.openSession();
////        try {
////            Employee employee = openSession.selectOne(
////                    "com.rookie.bigdata.mapper.EmployeeMapper.getEmpById", 1);
////            System.out.println(employee);
////        } finally {
////            openSession.close();
////        }
//
//        // 1、获取sqlSessionFactory对象
//        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
//        // 2、获取sqlSession对象
//        SqlSession openSession = sqlSessionFactory.openSession();
//        try {
//            // 3、获取接口的实现类对象
//            //会为接口自动的创建一个代理对象，代理对象去执行增删改查方法
//            EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);
//            Employee employee = mapper.getEmpById(1);
//            System.out.println(mapper.getClass());
//            System.out.println(employee);
//        } finally {
//            openSession.close();
//        }
//
//    }
//
//    @Test
//    public void addEmp() throws IOException{
//
//        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
//        //1、获取到的SqlSession不会自动提交数据
//        SqlSession openSession = sqlSessionFactory.openSession();
//
//        try{
//            EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);
////            //测试添加
//            Employee employee = new Employee(null, "jerry4",null, "1");
//            mapper.addEmp(employee);
//            System.out.println(employee.getId());
////            //2、手动提交数据
//            openSession.commit();
//        }finally{
//            openSession.close();
//        }
//
//    }
//
//    @Test
//    public void updateEmp() throws IOException{
//
//        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
//        //1、获取到的SqlSession不会自动提交数据
//        SqlSession openSession = sqlSessionFactory.openSession();
//
//        try{
//            EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);
//
//            //测试修改
//            Employee employee = new Employee(6, "Tom", "jerry@atguigu.com", "1");
//            boolean updateEmp = mapper.updateEmp(employee);
//            System.out.println(updateEmp);
//            //测试删除
//            //mapper.deleteEmpById(6);
//            //2、手动提交数据
//            openSession.commit();
//        }finally{
//            openSession.close();
//        }
//    }
//
//    @Test
//    public void deleteEmpById() throws IOException{
//
//
//        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
//        //1、获取到的SqlSession不会自动提交数据
//        SqlSession openSession = sqlSessionFactory.openSession();
//
//        try{
//            EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);
//
//            //测试删除
//            mapper.deleteEmpById(6);
//            //2、手动提交数据
//            openSession.commit();
//        }finally{
//            openSession.close();
//        }
//    }
//}