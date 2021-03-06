package com.rookie.bigdata;




import com.rookie.bigdata.domain.Employee;
import com.rookie.bigdata.mapper.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @Classname MyBatisTest
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/21 16:10
 * @Version 1.0
 */
public class MyBatisTest {
    public SqlSessionFactory getSqlSessionFactory() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        return new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testMbg() throws Exception {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        File configFile = new File("C:\\work\\IDEAWorkSpace\\rookie-project\\haizhilangzigithub\\rookie-project-learning\\rookie-mybatis\\rookie-mybatis-demo6\\src\\main\\resources\\mbg.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
                callback, warnings);
        myBatisGenerator.generate(null);
    }

    @Test
    public void testMyBatis3Simple() throws IOException{
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        SqlSession openSession = sqlSessionFactory.openSession();
        try{
            EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);
            List<Employee> list = mapper.selectByExample(null);
            for (Employee employee : list) {
                System.out.println(employee.getId());
            }
        }finally{
            openSession.close();
        }
    }
//
//    @Test
//    public void testMyBatis3() throws IOException{
//        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
//        SqlSession openSession = sqlSessionFactory.openSession();
//        try{
//            EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);
//            //xxxExample???????????????????????????
//            //1???????????????
//            //List<Employee> emps = mapper.selectByExample(null);
//            //2???????????????????????????e??????????????????????????????1???
//            //???????????????????????????example
//            EmployeeExample example = new EmployeeExample();
//            //????????????Criteria?????????Criteria????????????????????????
//            //select id, last_name, email, gender, d_id from tbl_employee
//            //WHERE ( last_name like ? and gender = ? ) or email like "%e%"
//            Criteria criteria = example.createCriteria();
//            criteria.andLastNameLike("%e%");
//            criteria.andGenderEqualTo("1");
//
//            Criteria criteria2 = example.createCriteria();
//            criteria2.andEmailLike("%e%");
//            example.or(criteria2);
//
//            List<Employee> list = mapper.selectByExample(example);
//            for (Employee employee : list) {
//                System.out.println(employee.getId());
//            }
//
//        }finally{
//            openSession.close();
//        }
//    }


}
