package com.csjscm.oracledata.model;

import java.math.BigDecimal;

public class PURCHORDER {
    private String id;

    private String requestid;

    private String ticketno;

    private String customer;

    private String customname;

    private String servicer;

    private String servvicername;

    private String enterprise;

    private String enterprisename;

    private String createuser;

    private String createdate;

    private String createtime;

    private String status;

    private String checkuser;

    private String checkdate;

    private String checktime;

    private String checkadvice;

    private BigDecimal sumordernum;

    private BigDecimal sumamount;

    private String memos;

    private String customerorderno;

    private String linkusername;

    private String linktel;

    private String receiveaddress;

    private String revstore;

    private String revstorename;

    private String tkttype;

    private String fromorderno;

    private String planarrivedate;

    private String deliverway;

    private String applyuser;

    private BigDecimal sumpackunitnum;

    private Long closed;

    private String rate;

    private String paymethod;

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

    public String getCustomname() {
        return customname;
    }

    public void setCustomname(String customname) {
        this.customname = customname == null ? null : customname.trim();
    }

    public String getServicer() {
        return servicer;
    }

    public void setServicer(String servicer) {
        this.servicer = servicer == null ? null : servicer.trim();
    }

    public String getServvicername() {
        return servvicername;
    }

    public void setServvicername(String servvicername) {
        this.servvicername = servvicername == null ? null : servvicername.trim();
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

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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

    public String getChecktime() {
        return checktime;
    }

    public void setChecktime(String checktime) {
        this.checktime = checktime == null ? null : checktime.trim();
    }

    public String getCheckadvice() {
        return checkadvice;
    }

    public void setCheckadvice(String checkadvice) {
        this.checkadvice = checkadvice == null ? null : checkadvice.trim();
    }

    public BigDecimal getSumordernum() {
        return sumordernum;
    }

    public void setSumordernum(BigDecimal sumordernum) {
        this.sumordernum = sumordernum;
    }

    public BigDecimal getSumamount() {
        return sumamount;
    }

    public void setSumamount(BigDecimal sumamount) {
        this.sumamount = sumamount;
    }

    public String getMemos() {
        return memos;
    }

    public void setMemos(String memos) {
        this.memos = memos == null ? null : memos.trim();
    }

    public String getCustomerorderno() {
        return customerorderno;
    }

    public void setCustomerorderno(String customerorderno) {
        this.customerorderno = customerorderno == null ? null : customerorderno.trim();
    }

    public String getLinkusername() {
        return linkusername;
    }

    public void setLinkusername(String linkusername) {
        this.linkusername = linkusername == null ? null : linkusername.trim();
    }

    public String getLinktel() {
        return linktel;
    }

    public void setLinktel(String linktel) {
        this.linktel = linktel == null ? null : linktel.trim();
    }

    public String getReceiveaddress() {
        return receiveaddress;
    }

    public void setReceiveaddress(String receiveaddress) {
        this.receiveaddress = receiveaddress == null ? null : receiveaddress.trim();
    }

    public String getRevstore() {
        return revstore;
    }

    public void setRevstore(String revstore) {
        this.revstore = revstore == null ? null : revstore.trim();
    }

    public String getRevstorename() {
        return revstorename;
    }

    public void setRevstorename(String revstorename) {
        this.revstorename = revstorename == null ? null : revstorename.trim();
    }

    public String getTkttype() {
        return tkttype;
    }

    public void setTkttype(String tkttype) {
        this.tkttype = tkttype == null ? null : tkttype.trim();
    }

    public String getFromorderno() {
        return fromorderno;
    }

    public void setFromorderno(String fromorderno) {
        this.fromorderno = fromorderno == null ? null : fromorderno.trim();
    }

    public String getPlanarrivedate() {
        return planarrivedate;
    }

    public void setPlanarrivedate(String planarrivedate) {
        this.planarrivedate = planarrivedate == null ? null : planarrivedate.trim();
    }

    public String getDeliverway() {
        return deliverway;
    }

    public void setDeliverway(String deliverway) {
        this.deliverway = deliverway == null ? null : deliverway.trim();
    }

    public String getApplyuser() {
        return applyuser;
    }

    public void setApplyuser(String applyuser) {
        this.applyuser = applyuser == null ? null : applyuser.trim();
    }

    public BigDecimal getSumpackunitnum() {
        return sumpackunitnum;
    }

    public void setSumpackunitnum(BigDecimal sumpackunitnum) {
        this.sumpackunitnum = sumpackunitnum;
    }

    public Long getClosed() {
        return closed;
    }

    public void setClosed(Long closed) {
        this.closed = closed;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate == null ? null : rate.trim();
    }

    public String getPaymethod() {
        return paymethod;
    }

    public void setPaymethod(String paymethod) {
        this.paymethod = paymethod == null ? null : paymethod.trim();
    }
}