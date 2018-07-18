package com.vici.response;

/**
 * @program: vicidata
 * @description: 错误返回实体类
 * @author: 没用的阿吉
 * @create: 2018-07-18 11:46
 */
public class ErrMessageConstants {

    public static final String ERR_OLD_PASSWORD="老密码错误！";

    public static final String NOT_EQUALS_PASSWORD="两次输入的密码不一致！";

    public static final String NOT_EQUALS_OLDANDNEWPASSWORD="新老密码不能相同！";

    public static final String SYSTEM_ERROR_INFO="请联系管理员";

    public static final String LOGIN_SUCCESS_INFO="登录成功";

    public static final String PASSWORD_ERROR_INFO="密码错误,您还有【%s】次输入机会！";

    public static final String  FREEZE_ACCOUT_INFO="登录失败，该用户已被冻结";

    public static final String  NOEXIST_ACCOUT_INFO="该用户不存在";

    public static final String  PASSWORD_ERROR_FIVE="密码错误次数超过5次,账户已锁定，请稍后再试";
}
