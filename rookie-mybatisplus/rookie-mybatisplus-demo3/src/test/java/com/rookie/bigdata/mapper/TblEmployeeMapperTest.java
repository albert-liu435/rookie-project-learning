package com.rookie.bigdata.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.rookie.bigdata.entity.TblEmployee;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Classname TblEmployeeMapperTest
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/20 17:13
 * @Version 1.0
 */
public class TblEmployeeMapperTest {

    private ApplicationContext ioc =
            new ClassPathXmlApplicationContext("applicationContext.xml");

    private TblEmployeeMapper employeeMapper =
            ioc.getBean("tblEmployeeMapper",TblEmployeeMapper.class);


    /**
     * 测试 乐观锁插件
     */

    @Test
    public void testOptimisticLocker() {
        //更新操作
        TblEmployee employee = new TblEmployee();
        employee.setId(15);
        employee.setLastName("TomAA");
        employee.setEmail("tomAA@sina.com");
        employee.setGender("1");
        employee.setAge(22);
        //employee.setVersion(3);

        employeeMapper.updateById(employee);

    }

    /**
     * 测试 性能分析插件
     */
    @Test
    public void testPerformance() {
        TblEmployee employee = new TblEmployee();
        employee.setLastName("玛利亚老师");
        employee.setEmail("mly@sina.com");
        employee.setGender("0");
        employee.setAge(22);

        employeeMapper.insert(employee);

    }

    /**
     * 测试SQL执行分析插件
     */
    @Test
    public void testSQLExplain() {

        employeeMapper.delete(null);  // 全表删除
    }

    /**
     * 测试分页插件
     */
    @Test
    public void testPage() {

        Page<TblEmployee> page = new Page<>(1,1);

        IPage<TblEmployee > emps =
                employeeMapper.selectPage(page, null);
        System.out.println(emps);


        System.out.println("===============获取分页相关的一些信息======================");

        System.out.println("总条数:" +page.getTotal());
        System.out.println("当前页码: "+  page.getCurrent());
        System.out.println("总页码:" + page.getPages());
        System.out.println("每页显示的条数:" + page.getSize());
        System.out.println("是否有上一页: " + page.hasPrevious());
        System.out.println("是否有下一页: " + page.hasNext());

        //将查询的结果封装到page对象中
       // page.setRecords(emps);


    }

}