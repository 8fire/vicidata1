package com.vici.vicidata.dao;

import com.vici.vicidata.model.UserModel;

import java.util.List;

public interface UserMapper {

    List<UserModel> selectUser();
}
