package com.csjscm.mysqldata.shiro;

import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;

/**
 * 验证器，增加登录次数效验功能
 *
 * @author csjscm
 * create 2018-05-15 下午 2:10
 **/
@Slf4j
public class RetryLimitCredentialsMatcher extends HashedCredentialsMatcher{

}
