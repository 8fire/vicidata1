package com.vici;



import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
        /*byte[] data = securityStr.getBytes();
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
            md5.update(data);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] resultBytes = md5.digest();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < resultBytes.length; i++) {
            if (Integer.toHexString(0xFF & resultBytes[i]).length() == 1) {
                builder.append("0").append(
                        Integer.toHexString(0xFF & resultBytes[i]));
            } else {
                builder.append(Integer.toHexString(0xFF & resultBytes[i]));
            }
        }
        return builder.toString();*/

        String hashAlgorithmName = "MD5";//加密方式

        ByteSource salt = ByteSource.Util.bytes("15938742930123456");//以账号作为盐值
        System.out.println(salt.toString());
        //int hashIterations = 1024;//加密1024次
        String newPassword = new org.apache.shiro.crypto.hash.SimpleHash(
                hashAlgorithmName,           //加密算法
                loginPassword,      //密码
                salt,  //salt盐   username + salt
                2   //迭代次数
        ).toHex();
        System.out.println("===============>"+newPassword);
        return newPassword;
    }
    public static void main (String[] args){
        System.out.println(encryptMD5("",""));
    }
}
