package com.qiming.qimingdata.service.impl;

import com.qiming.qimingdata.dao.UserMapper;
import com.qiming.qimingdata.model.UserModel;
import com.qiming.qimingdata.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<UserModel> selectUser() {
        return userMapper.selectUser();
    }
}
