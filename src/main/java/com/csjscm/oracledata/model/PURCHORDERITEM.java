package com.csjscm.oracledata.model;

import java.math.BigDecimal;

public class PURCHORDERITEM {
    private String id;

    private String requestid;

    private String itemno;

    private String material;

    private String materialno;

    private String custommaterialno;

    private String materialname;

    private String materialnrule;

    private String materialnsize;

    private String materialtag;

    private String orderunit;

    private BigDecimal orderprice;

    private BigDecimal orderamount;

    private BigDecimal ordernum;

    private BigDecimal factsendnum;

    private String invunitname;

    private BigDecimal salerate;

    private BigDecimal invunitnum;

    private String packunitname;

    private BigDecimal packrate;

    private BigDecimal packunitnum;

    private BigDecimal pickprice;

    private String closedcode;

    private String taxrate;

    private String memos;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRequestid() {
        return requestid;
    }

    public void setRequestid(String requestid) {
        this.requestid = requestid == null ? null : requestid.trim();
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

    public String getMaterialnrule() {
        return materialnrule;
    }

    public void setMaterialnrule(String materialnrule) {
        this.materialnrule = materialnrule == null ? null : materialnrule.trim();
    }

    public String getMaterialnsize() {
        return materialnsize;
    }

    public void setMaterialnsize(String materialnsize) {
        this.materialnsize = materialnsize == null ? null : materialnsize.trim();
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

    public BigDecimal getOrderprice() {
        return orderprice;
    }

    public void setOrderprice(BigDecimal orderprice) {
        this.orderprice = orderprice;
    }

    public BigDecimal getOrderamount() {
        return orderamount;
    }

    public void setOrderamount(BigDecimal orderamount) {
        this.orderamount = orderamount;
    }

    public BigDecimal getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(BigDecimal ordernum) {
        this.ordernum = ordernum;
    }

    public BigDecimal getFactsendnum() {
        return factsendnum;
    }

    public void setFactsendnum(BigDecimal factsendnum) {
        this.factsendnum = factsendnum;
    }

    public String getInvunitname() {
        return invunitname;
    }

    public void setInvunitname(String invunitname) {
        this.invunitname = invunitname == null ? null : invunitname.trim();
    }

    public BigDecimal getSalerate() {
        return salerate;
    }

    public void setSalerate(BigDecimal salerate) {
        this.salerate = salerate;
    }

    public BigDecimal getInvunitnum() {
        return invunitnum;
    }

    public void setInvunitnum(BigDecimal invunitnum) {
        this.invunitnum = invunitnum;
    }

    public String getPackunitname() {
        return packunitname;
    }

    public void setPackunitname(String packunitname) {
        this.packunitname = packunitname == null ? null : packunitname.trim();
    }

    public BigDecimal getPackrate() {
        return packrate;
    }

    public void setPackrate(BigDecimal packrate) {
        this.packrate = packrate;
    }

    public BigDecimal getPackunitnum() {
        return packunitnum;
    }

    public void setPackunitnum(BigDecimal packunitnum) {
        this.packunitnum = packunitnum;
    }

    public BigDecimal getPickprice() {
        return pickprice;
    }

    public void setPickprice(BigDecimal pickprice) {
        this.pickprice = pickprice;
    }

    public String getClosedcode() {
        return closedcode;
    }

    public void setClosedcode(String closedcode) {
        this.closedcode = closedcode == null ? null : closedcode.trim();
    }

    public String getTaxrate() {
        return taxrate;
    }

    public void setTaxrate(String taxrate) {
        this.taxrate = taxrate == null ? null : taxrate.trim();
    }

    public String getMemos() {
        return memos;
    }

    public void setMemos(String memos) {
        this.memos = memos == null ? null : memos.trim();
    }
}