
package com.qiming.qimingdata.model;

import java.io.Serializable;



/**
 * @author qiming
 * create 2018-04-11 下午 4:54
 **/


public class Role implements Serializable {
    private int id;
    private String role_name;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }
}

