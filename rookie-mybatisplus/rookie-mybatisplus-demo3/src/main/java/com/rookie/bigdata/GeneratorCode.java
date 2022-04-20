package com.rookie.bigdata;

import com.baomidou.mybatisplus.core.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * @Classname GeneratorCode
 * @Description 代码生成  https://baomidou.com/pages/779a6e/#%E4%BD%BF%E7%94%A8
 * @Author rookie
 * @Date 2022/4/20 16:53
 * @Version 1.0
 */
public class GeneratorCode {

    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/mp", "root", "root")
                .globalConfig(builder -> {
                    builder.author("rookie") // 设置作者
                           // .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("C:\\work\\IDEAWorkSpace\\rookie-project\\haizhilangzigithub\\rookie-project-learning\\rookie-mybatisplus\\rookie-mybatisplus-demo3\\src\\main\\java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.rookie.bigdata") // 设置父包名
                           // .moduleName("system") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, "C:\\work\\IDEAWorkSpace\\rookie-project\\haizhilangzigithub\\rookie-project-learning\\rookie-mybatisplus\\rookie-mybatisplus-demo3\\src\\main\\resources\\mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("tbl_employee"); // 设置需要生成的表名
                            //.addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();



//        //1. 全局配置
//        GlobalConfig config = new GlobalConfig();
//        config.setActiveRecord(true) // 是否支持AR模式
//                .setAuthor("weiyunhui") // 作者
//                .setOutputDir("D:\\workspace_mp\\mp03\\src\\main\\java") // 生成路径
//                .setFileOverride(true)  // 文件覆盖
//                .setIdType(IdType.AUTO) // 主键策略
//                .setServiceName("%sService")  // 设置生成的service接口的名字的首字母是否为I
//                // IEmployeeService
//                .setBaseResultMap(true)
//                .setBaseColumnList(true);
//
//        //2. 数据源配置
//        DataSourceConfig  dsConfig  = new DataSourceConfig();
//        dsConfig.setDbType(DbType.MYSQL)  // 设置数据库类型
//                .setDriverName("com.mysql.jdbc.Driver")
//                .setUrl("jdbc:mysql://localhost:3306/mp")
//                .setUsername("root")
//                .setPassword("1234");
//
//        //3. 策略配置
//        StrategyConfig stConfig = new StrategyConfig();
//        stConfig.setCapitalMode(true) //全局大写命名
//                .setDbColumnUnderline(true)  // 指定表名 字段名是否使用下划线
//                .setNaming(NamingStrategy.underline_to_camel) // 数据库表映射到实体的命名策略
//                .setTablePrefix("tbl_")
//                .setInclude("tbl_employee");  // 生成的表
//
//        //4. 包名策略配置
//        PackageConfig pkConfig = new PackageConfig();
//        pkConfig.setParent("com.atguigu.mp")
//                .setMapper("mapper")
//                .setService("service")
//                .setController("controller")
//                .setEntity("beans")
//                .setXml("mapper");
//
//        //5. 整合配置
//        AutoGenerator  ag = new AutoGenerator();
//
//        ag.setGlobalConfig(config)
//                .setDataSource(dsConfig)
//                .setStrategy(stConfig)
//                .setPackageInfo(pkConfig);
//
//        //6. 执行
//        ag.execute();
    }
}
