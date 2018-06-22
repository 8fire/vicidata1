package com.csjscm.oracledata.model;

import java.math.BigDecimal;

public class MoveOrder {
    private String ticketno;

    private String outstore;

    private String outstorename;

    private String instore;

    private String instorename;

    private String deviceno;

    private String plandate;

    private Short status;

    private String createuser;

    private String createdate;

    private String checkuser;

    private String checkdate;

    private String checkadvice;

    private String linkuser;

    private String linktel;

    private String linaddress;

    private BigDecimal sumordernum;

    private BigDecimal sumoutnum;

    private BigDecimal suminnum;

    private Short closed;

    private String memos;

    private String enterprice;

    private String enterpricename;

    private Short isdelete;

    public String getTicketno() {
        return ticketno;
    }

    public void setTicketno(String ticketno) {
        this.ticketno = ticketno == null ? null : ticketno.trim();
    }

    public String getOutstore() {
        return outstore;
    }

    public void setOutstore(String outstore) {
        this.outstore = outstore == null ? null : outstore.trim();
    }

    public String getOutstorename() {
        return outstorename;
    }

    public void setOutstorename(String outstorename) {
        this.outstorename = outstorename == null ? null : outstorename.trim();
    }

    public String getInstore() {
        return instore;
    }

    public void setInstore(String instore) {
        this.instore = instore == null ? null : instore.trim();
    }

    public String getInstorename() {
        return instorename;
    }

    public void setInstorename(String instorename) {
        this.instorename = instorename == null ? null : instorename.trim();
    }

    public String getDeviceno() {
        return deviceno;
    }

    public void setDeviceno(String deviceno) {
        this.deviceno = deviceno == null ? null : deviceno.trim();
    }

    public String getPlandate() {
        return plandate;
    }

    public void setPlandate(String plandate) {
        this.plandate = plandate == null ? null : plandate.trim();
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

    public String getLinkuser() {
        return linkuser;
    }

    public void setLinkuser(String linkuser) {
        this.linkuser = linkuser == null ? null : linkuser.trim();
    }

    public String getLinktel() {
        return linktel;
    }

    public void setLinktel(String linktel) {
        this.linktel = linktel == null ? null : linktel.trim();
    }

    public String getLinaddress() {
        return linaddress;
    }

    public void setLinaddress(String linaddress) {
        this.linaddress = linaddress == null ? null : linaddress.trim();
    }

    public BigDecimal getSumordernum() {
        return sumordernum;
    }

    public void setSumordernum(BigDecimal sumordernum) {
        this.sumordernum = sumordernum;
    }

    public BigDecimal getSumoutnum() {
        return sumoutnum;
    }

    public void setSumoutnum(BigDecimal sumoutnum) {
        this.sumoutnum = sumoutnum;
    }

    public BigDecimal getSuminnum() {
        return suminnum;
    }

    public void setSuminnum(BigDecimal suminnum) {
        this.suminnum = suminnum;
    }

    public Short getClosed() {
        return closed;
    }

    public void setClosed(Short closed) {
        this.closed = closed;
    }

    public String getMemos() {
        return memos;
    }

    public void setMemos(String memos) {
        this.memos = memos == null ? null : memos.trim();
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

    public Short getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Short isdelete) {
        this.isdelete = isdelete;
    }
}