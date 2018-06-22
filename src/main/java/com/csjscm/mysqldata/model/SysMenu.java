package com.csjscm.mysqldata.model;

import lombok.Data;

import java.util.Date;
import java.util.List;
@Data
public class SysMenu {
    private Integer id;

    private String menuName;

    private Integer userRoleId;

    private Date gmtTime;

    private Integer status;

    private Date gmtModified;

    private Integer parentId;
    private String syImage;
    private String url;
    List<SysMenu1> sysMenuList;

    public List<SysMenu1> getSysMenuList() {
        return sysMenuList;
    }

    public void setSysMenuList(List<SysMenu1> sysMenuList) {
        this.sysMenuList = sysMenuList;
    }

    public String getSyImage() {
        return syImage;
    }

    public void setSyImage(String syImage) {
        this.syImage = syImage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public Integer getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    public Date getGmtTime() {
        return gmtTime;
    }

    public void setGmtTime(Date gmtTime) {
        this.gmtTime = gmtTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /*public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }*/

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}