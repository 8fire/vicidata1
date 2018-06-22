package com.vici;

import java.util.UUID;

/**
 * UUID
 *
 * @author csjscm
 * create 2018-03-27 上午 11:24
 **/
public class UUIDUtils {
    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static void main(String[] args) {
        System.out.println("格式前的UUID ： " + UUID.randomUUID().toString());
        System.out.println("格式化后的UUID ：" + getUUID());
    }
}
