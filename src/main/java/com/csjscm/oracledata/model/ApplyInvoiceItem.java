package com.csjscm.oracledata.model;

import java.math.BigDecimal;

public class ApplyInvoiceItem {
    private String id;

    private String ticketno;

    private String itemno;

    private String outorder;

    private String outorderitemid;

    private String material;

    private String materialno;

    private String custommaterialno;

    private String materialname;

    private String materialrule;

    private String materialsize;

    private String materialtag;

    private String orderunit;

    private String contractno;

    private String saleorder;

    private BigDecimal price;

    private BigDecimal planinvoicenum;

    private BigDecimal planinvoiceamount;

    private BigDecimal taxrate;

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

    public String getOutorder() {
        return outorder;
    }

    public void setOutorder(String outorder) {
        this.outorder = outorder == null ? null : outorder.trim();
    }

    public String getOutorderitemid() {
        return outorderitemid;
    }

    public void setOutorderitemid(String outorderitemid) {
        this.outorderitemid = outorderitemid == null ? null : outorderitemid.trim();
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

    public String getContractno() {
        return contractno;
    }

    public void setContractno(String contractno) {
        this.contractno = contractno == null ? null : contractno.trim();
    }

    public String getSaleorder() {
        return saleorder;
    }

    public void setSaleorder(String saleorder) {
        this.saleorder = saleorder == null ? null : saleorder.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPlaninvoicenum() {
        return planinvoicenum;
    }

    public void setPlaninvoicenum(BigDecimal planinvoicenum) {
        this.planinvoicenum = planinvoicenum;
    }

    public BigDecimal getPlaninvoiceamount() {
        return planinvoiceamount;
    }

    public void setPlaninvoiceamount(BigDecimal planinvoiceamount) {
        this.planinvoiceamount = planinvoiceamount;
    }

    public BigDecimal getTaxrate() {
        return taxrate;
    }

    public void setTaxrate(BigDecimal taxrate) {
        this.taxrate = taxrate;
    }
}