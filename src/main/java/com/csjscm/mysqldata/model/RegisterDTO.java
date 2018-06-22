package com.csjscm.mysqldata.model;

import lombok.Data;

/**
 * 注册请求实体类
 *
 * @author csjscm
 * create 2018-06-13 下午 3:19
 **/
@Data
public class RegisterDTO {
    private String loginEmail;
    private String loginPhone;
    private String loginPassword;
    private String reloginPassword;
    //条款
    private String agrees;
    //验证码
    private String verifyNo;
    private Integer roleId;
}
