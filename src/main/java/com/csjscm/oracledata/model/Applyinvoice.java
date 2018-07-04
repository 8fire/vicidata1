package com.csjscm.oracledata.model;

import java.math.BigDecimal;

public class Applyinvoice {
    private String ticketno;

    private String customer;

    private String customername;

    private Short invoicetype;

    private BigDecimal planinvoicenum;

    private BigDecimal planinvoiceamount;

    private String lastinvoicedate;

    private String enterprise;

    private String enterprisename;

    private Short status;

    private String createuser;

    private String createdate;

    private String checkuser;

    private String checkdate;

    private String checkadvice;

    private String memos;

    private Short isdelete;

    public String getTicketno() {
        return ticketno;
    }

    public void setTicketno(String ticketno) {
        this.ticketno = ticketno == null ? null : ticketno.trim();
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer == null ? null : customer.trim();
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    public Short getInvoicetype() {
        return invoicetype;
    }

    public void setInvoicetype(Short invoicetype) {
        this.invoicetype = invoicetype;
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

    public String getLastinvoicedate() {
        return lastinvoicedate;
    }

    public void setLastinvoicedate(String lastinvoicedate) {
        this.lastinvoicedate = lastinvoicedate == null ? null : lastinvoicedate.trim();
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

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser == null ? null : createuser.trim();
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate == null ? null : createdate.trim();
    }

    public String getCheckuser() {
        return checkuser;
    }

    public void setCheckuser(String checkuser) {
        this.checkuser = checkuser == null ? null : checkuser.trim();
    }

    public String getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(String checkdate) {
        this.checkdate = checkdate == null ? null : checkdate.trim();
    }

    public String getCheckadvice() {
        return checkadvice;
    }

    public void setCheckadvice(String checkadvice) {
        this.checkadvice = checkadvice == null ? null : checkadvice.trim();
    }

    public String getMemos() {
        return memos;
    }

    public void setMemos(String memos) {
        this.memos = memos == null ? null : memos.trim();
    }

    public Short getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Short isdelete) {
        this.isdelete = isdelete;
    }
}