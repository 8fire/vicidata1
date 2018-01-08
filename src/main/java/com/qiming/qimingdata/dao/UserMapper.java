package com.qiming.qimingdata.dao;

import com.qiming.qimingdata.model.UserModel;

import java.util.List;

public interface UserMapper {

    List<UserModel> selectUser();
}
