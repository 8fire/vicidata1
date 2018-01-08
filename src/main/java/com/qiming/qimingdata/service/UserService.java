package com.qiming.qimingdata.service;

import com.qiming.qimingdata.model.UserModel;

import java.util.List;

public interface UserService {
    List<UserModel> selectUser();
}
