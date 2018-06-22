package com.csjscm.oracledata.model;

import java.math.BigDecimal;

public class MoveinOrderItem {
    private String id;

    private String ticketno;

    private String itemno;

    private String material;

    private String materialno;

    private String custommaterialno;

    private String materialname;

    private String materialrule;

    private String materialsize;

    private String materialtag;

    private String orderunit;

    private BigDecimal ordernum;

    private BigDecimal innum;

    private String moveorderitemid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTicketno() {
        return ticketno;
    }

    public void setTicketno(String ticketno) {
        this.ticketno = ticketno == null ? null : ticketno.trim();
    }

    public String getItemno() {
        return itemno;
    }

    public void setItemno(String itemno) {
        this.itemno = itemno == null ? null : itemno.trim();
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material == null ? null : material.trim();
    }

    public String getMaterialno() {
        return materialno;
    }

    public void setMaterialno(String materialno) {
        this.materialno = materialno == null ? null : materialno.trim();
    }

    public String getCustommaterialno() {
        return custommaterialno;
    }

    public void setCustommaterialno(String custommaterialno) {
        this.custommaterialno = custommaterialno == null ? null : custommaterialno.trim();
    }

    public String getMaterialname() {
        return materialname;
    }

    public void setMaterialname(String materialname) {
        this.materialname = materialname == null ? null : materialname.trim();
    }

    public String getMaterialrule() {
        return materialrule;
    }

    public void setMaterialrule(String materialrule) {
        this.materialrule = materialrule == null ? null : materialrule.trim();
    }

    public String getMaterialsize() {
        return materialsize;
    }

    public void setMaterialsize(String materialsize) {
        this.materialsize = materialsize == null ? null : materialsize.trim();
    }

    public String getMaterialtag() {
        return materialtag;
    }

    public void setMaterialtag(String materialtag) {
        this.materialtag = materialtag == null ? null : materialtag.trim();
    }

    public String getOrderunit() {
        return orderunit;
    }

    public void setOrderunit(String orderunit) {
        this.orderunit = orderunit == null ? null : orderunit.trim();
    }

    public BigDecimal getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(BigDecimal ordernum) {
        this.ordernum = ordernum;
    }

    public BigDecimal getInnum() {
        return innum;
    }

    public void setInnum(BigDecimal innum) {
        this.innum = innum;
    }

    public String getMoveorderitemid() {
        return moveorderitemid;
    }

    public void setMoveorderitemid(String moveorderitemid) {
        this.moveorderitemid = moveorderitemid == null ? null : moveorderitemid.trim();
    }
}