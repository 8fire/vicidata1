package com.vici.response;

import java.util.HashMap;
import java.util.Map;

/**
 * 包装信息返回类
 *
 * @author csjscm
 * create 2018-04-08 下午 3:40
 **/
public class MsgResponse {
    //状态码，成功200，失败400,201自定义错误
    private int code;

    //错误和成功信息
    private String msg;

    //包含的数据
    private Map<String, Object> data = new HashMap<>();

    //成功信息
    public static MsgResponse success()
    {
        MsgResponse msg = new MsgResponse();
        msg.setCode(200);
        msg.setMsg("调用API成功!");
        return msg;
    }

    //失败信息
    public static MsgResponse fail()
    {
        MsgResponse msg = new MsgResponse();
        msg.setCode(400);
        msg.setMsg("调用API失败!");
        return msg;
    }
    public static MsgResponse isDefine(String info)
    {
        MsgResponse msg = new MsgResponse();
        msg.setCode(201);
        msg.setMsg(info);
        return msg;
    }
    //添加包含的数据
    public MsgResponse add(String key, Object value)
    {
        this.getExtend().put(key, value);
        return this;
    }

    public int getCode()
    {
        return code;
    }

    public void setCode(int code)
    {
        this.code = code;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    public Map<String, Object> getExtend()
    {
        return data;
    }

    public void setExtend(Map<String, Object> data)
    {
        this.data = data;
    }
}
