package com.csjscm.oracledata.model;

import java.math.BigDecimal;

public class Stock {
    private String id;

    private String material;

    private String materialno;

    private String custommaterialno;

    private String materialname;

    private String materialrule;

    private String materialsize;

    private String materialtag;

    private BigDecimal materialnum;

    private BigDecimal price;

    private BigDecimal amount;

    private String store;

    private String storename;

    private String orderunit;

    private String owner;

    private String ownername;

    private String enterprise;

    private String enterprisename;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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

    public BigDecimal getMaterialnum() {
        return materialnum;
    }

    public void setMaterialnum(BigDecimal materialnum) {
        this.materialnum = materialnum;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store == null ? null : store.trim();
    }

    public String getStorename() {
        return storename;
    }

    public void setStorename(String storename) {
        this.storename = storename == null ? null : storename.trim();
    }

    public String getOrderunit() {
        return orderunit;
    }

    public void setOrderunit(String orderunit) {
        this.orderunit = orderunit == null ? null : orderunit.trim();
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername == null ? null : ownername.trim();
    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise == null ? null : enterprise.trim();
    }

    public String getEnterprisename() {
        return enterprisename;
    }

    public void setEnterprisename(String enterprisename) {
        this.enterprisename = enterprisename == null ? null : enterprisename.trim();
    }
}