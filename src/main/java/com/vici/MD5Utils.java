package com.vici;


import org.apache.shiro.util.ByteSource;
/**
 * MD5
 *
 * @author csjscm
 * create 2018-04-08 下午 1:13
 **/
public class MD5Utils {
    private MD5Utils() {
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    /**
     * MD5加密
     */
    public static String encryptMD5(String loginPassword,String loginPhone) {
        String hashAlgorithmName = "MD5";//加密方式
        ByteSource salt = ByteSource.Util.bytes(loginPhone);//以账号作为盐值
        System.out.println(salt.toString());
        //int hashIterations = 1024;//加密1024次
        String newPassword = new org.apache.shiro.crypto.hash.SimpleHash(
                hashAlgorithmName,           //加密算法
                loginPassword,      //密码
                salt,  //salt盐   username + salt
                2   //迭代次数
        ).toHex();
        return newPassword;
    }
    public static void main (String[] args){
        System.out.println(encryptMD5("",""));
    }
}
