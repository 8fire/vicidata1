package com.qiming.qimingdata.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * 分页查询的基础实体类
 *
 * @author qiming
 * create 2018-01-10 下午 3:56
 **/
@Data

public class BaseQuery implements Serializable{
    private Integer pagesize;
    private Integer pageindex;
}
