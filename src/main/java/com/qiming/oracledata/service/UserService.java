package com.qiming.oracledata.service;

import com.qiming.oracledata.model.UserModel;

import java.util.List;

public interface UserService {
    List<UserModel> selectUser();
}
