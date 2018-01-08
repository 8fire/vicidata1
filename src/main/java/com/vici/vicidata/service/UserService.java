package com.vici.vicidata.service;

import com.vici.vicidata.model.UserModel;

import java.util.List;

public interface UserService {
    List<UserModel> selectUser();
}
