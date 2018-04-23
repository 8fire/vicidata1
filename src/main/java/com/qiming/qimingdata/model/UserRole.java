/*
package com.qiming.qimingdata.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

*/
/**
 * @author qiming
 * create 2018-04-11 下午 4:54
 **//*

@Entity
@Table(name = "user_role")
public class UserRole implements Serializable {
    private int id;
    private int uid;
    private int rid;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }
}*/
