package com.vici.vicidata.service.impl;

import com.vici.vicidata.dao.UserMapper;
import com.vici.vicidata.model.UserModel;
import com.vici.vicidata.service.UserService;
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
