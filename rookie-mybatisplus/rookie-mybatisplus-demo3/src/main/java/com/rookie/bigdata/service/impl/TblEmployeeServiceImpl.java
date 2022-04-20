package com.rookie.bigdata.service.impl;

import com.rookie.bigdata.entity.TblEmployee;
import com.rookie.bigdata.mapper.TblEmployeeMapper;
import com.rookie.bigdata.service.ITblEmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author rookie
 * @since 2022-04-20
 */
@Service
public class TblEmployeeServiceImpl extends ServiceImpl<TblEmployeeMapper, TblEmployee> implements ITblEmployeeService {

}
