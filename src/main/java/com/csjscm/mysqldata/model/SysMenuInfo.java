package com.csjscm.mysqldata.model;

import lombok.Data;

/**
 * 系统菜单
 *
 * @author csjscm
 * create 2018-05-02 上午 10:55
 **/
@Data
public class SysMenuInfo {
    private int syId;
    private String syMenuName;
    private String syUrl;
    private int smId;
    private String smMenuName;
    private String smUrl;
    private int smParentId;
    private String syImage;

    public int getSyId() {
        return syId;
    }

    public void setSyId(int syId) {
        this.syId = syId;
    }

    public String getSyMenuName() {
        return syMenuName;
    }

    public void setSyMenuName(String syMenuName) {
        this.syMenuName = syMenuName;
    }

    public String getSyUrl() {
        return syUrl;
    }

    public void setSyUrl(String syUrl) {
        this.syUrl = syUrl;
    }

    public int getSmId() {
        return smId;
    }

    public void setSmId(int smId) {
        this.smId = smId;
    }

    public String getSmMenuName() {
        return smMenuName;
    }

    public void setSmMenuName(String smMenuName) {
        this.smMenuName = smMenuName;
    }

    public String getSmUrl() {
        return smUrl;
    }

    public void setSmUrl(String smUrl) {
        this.smUrl = smUrl;
    }

    public int getSmParentId() {
        return smParentId;
    }

    public void setSmParentId(int smParentId) {
        this.smParentId = smParentId;
    }

    public String getSyImage() {
        return syImage;
    }

    public void setSyImage(String syImage) {
        this.syImage = syImage;
    }
}
