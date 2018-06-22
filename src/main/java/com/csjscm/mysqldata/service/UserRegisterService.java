package com.csjscm.mysqldata.service;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户注册
 *
 * @author csjscm
 * create 2018-06-13 下午 3:34
 **/
public interface UserRegisterService {
    int userRegister(HttpServletRequest request);
}
