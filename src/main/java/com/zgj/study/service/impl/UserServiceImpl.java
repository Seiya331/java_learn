package com.zgj.study.service.impl;

import com.zgj.study.entity.User;
import com.zgj.study.mapper.UserMapper;
import com.zgj.study.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zgj
 * @since 2019-11-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
