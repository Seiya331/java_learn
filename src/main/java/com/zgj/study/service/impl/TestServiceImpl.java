package com.zgj.study.service.impl;

import com.zgj.study.entity.Test;
import com.zgj.study.mapper.TestMapper;
import com.zgj.study.service.ITestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lyle
 * @since 2019-11-05
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {

}
