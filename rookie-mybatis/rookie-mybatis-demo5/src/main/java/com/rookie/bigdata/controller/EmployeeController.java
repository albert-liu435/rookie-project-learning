package com.rookie.bigdata.controller;

import com.rookie.bigdata.domain.Employee;
import com.rookie.bigdata.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * @Classname EmployeeController
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/21 15:56
 * @Version 1.0
 */

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/getemps")
    public String emps(Map<String,Object> map){
        List<Employee> emps = employeeService.getEmps();
        map.put("allEmps", emps);
        return "list";
    }

}
