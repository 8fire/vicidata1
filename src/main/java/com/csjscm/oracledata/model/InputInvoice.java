package com.csjscm.oracledata.model;

import java.math.BigDecimal;

public class InputInvoice {
    private String ticketno;

    private String servicer;

    private String servicername;

    private String invoiceno;

    private Short invoicetype;

    private BigDecimal invoicenum;

    private BigDecimal planinvoiceamount;

    private BigDecimal invoiceamount;

    private String invoiceuser;

    private String invoicedate;

    private BigDecimal taxamount;

    private BigDecimal pretaxamount;

    private BigDecimal verifyamount;

    private String receivedate;

    private String receiveuser;

    private String enterprice;

    private String enterpricename;

    private Short status;

    private String createuser;

    private String createdate;

    private String checkuser;

    private String checkdate;

    private String checkadvice;

    private String memos;

    private Short isdelete;

    private BigDecimal planinvoicenum;

    public String getTicketno() {
        return ticketno;
    }

    public void setTicketno(String ticketno) {
        this.ticketno = ticketno == null ? null : ticketno.trim();
    }

    public String getServicer() {
        return servicer;
    }

    public void setServicer(String servicer) {
        this.servicer = servicer == null ? null : servicer.trim();
    }

    public String getServicername() {
        return servicername;
    }

    public void setServicername(String servicername) {
        this.servicername = servicername == null ? null : servicername.trim();
    }

    public String getInvoiceno() {
        return invoiceno;
    }

    public void setInvoiceno(String invoiceno) {
        this.invoiceno = invoiceno == null ? null : invoiceno.trim();
    }

    public Short getInvoicetype() {
        return invoicetype;
    }

    public void setInvoicetype(Short invoicetype) {
        this.invoicetype = invoicetype;
    }

    public BigDecimal getInvoicenum() {
        return invoicenum;
    }

    public void setInvoicenum(BigDecimal invoicenum) {
        this.invoicenum = invoicenum;
    }

    public BigDecimal getPlaninvoiceamount() {
        return planinvoiceamount;
    }

    public void setPlaninvoiceamount(BigDecimal planinvoiceamount) {
        this.planinvoiceamount = planinvoiceamount;
    }

    public BigDecimal getInvoiceamount() {
        return invoiceamount;
    }

    public void setInvoiceamount(BigDecimal invoiceamount) {
        this.invoiceamount = invoiceamount;
    }

    public String getInvoiceuser() {
        return invoiceuser;
    }

    public void setInvoiceuser(String invoiceuser) {
        this.invoiceuser = invoiceuser == null ? null : invoiceuser.trim();
    }

    public String getInvoicedate() {
        return invoicedate;
    }

    public void setInvoicedate(String invoicedate) {
        this.invoicedate = invoicedate == null ? null : invoicedate.trim();
    }

    public BigDecimal getTaxamount() {
        return taxamount;
    }

    public void setTaxamount(BigDecimal taxamount) {
        this.taxamount = taxamount;
    }

    public BigDecimal getPretaxamount() {
        return pretaxamount;
    }

    public void setPretaxamount(BigDecimal pretaxamount) {
        this.pretaxamount = pretaxamount;
    }

    public BigDecimal getVerifyamount() {
        return verifyamount;
    }

    public void setVerifyamount(BigDecimal verifyamount) {
        this.verifyamount = verifyamount;
    }

    public String getReceivedate() {
        return receivedate;
    }

    public void setReceivedate(String receivedate) {
        this.receivedate = receivedate == null ? null : receivedate.trim();
    }

    public String getReceiveuser() {
        return receiveuser;
    }

    public void setReceiveuser(String receiveuser) {
        this.receiveuser = receiveuser == null ? null : receiveuser.trim();
    }

    public String getEnterprice() {
        return enterprice;
    }

    public void setEnterprice(String enterprice) {
        this.enterprice = enterprice == null ? null : enterprice.trim();
    }

    public String getEnterpricename() {
        return enterpricename;
    }

    public void setEnterpricename(String enterpricename) {
        this.enterpricename = enterpricename == null ? null : enterpricename.trim();
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

    public BigDecimal getPlaninvoicenum() {
        return planinvoicenum;
    }

    public void setPlaninvoicenum(BigDecimal planinvoicenum) {
        this.planinvoicenum = planinvoicenum;
    }
}