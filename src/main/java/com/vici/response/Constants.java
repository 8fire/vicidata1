package com.vici.response;


/**
 * 常量定义
 */
public class Constants {
    public static final String SYSTEM_CHECK_USER="sysadmin";
    public static final String SYSTEM_CHECK_ADVICE="系统审核通过";

    public static final String DATA="data";

    public static final Integer NO_IS_DELETE=0;
    public static final Integer IS_DELETE=1;

    //用户登录次数计数  redisKey 前缀
    public static final String SHIRO_LOGIN_COUNT = "shiro_login_count_";
    //用户登录是否被锁定    一小时 redisKey 前缀
    public static final String SHIRO_IS_LOCK = "shiro_is_lock_";
}
