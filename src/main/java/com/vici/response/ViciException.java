package com.vici.response;

/**
 * 自定义异常
 *
 * @author csjscm
 * create 2018-05-25 上午 8:39
 **/
public class ViciException extends RuntimeException{
    public ViciException(String message) {
        super(message);
    }
}
