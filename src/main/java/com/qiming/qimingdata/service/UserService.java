package com.qiming.qimingdata.service;


import com.qiming.qimingdata.model.MemberUser;


import java.util.List;

/**
 * Created by lxg
 * on 2017/2/21.
 */
public interface UserService {

    MemberUser findByUsername(String name);

    /*List<User> findAll();*/

}
