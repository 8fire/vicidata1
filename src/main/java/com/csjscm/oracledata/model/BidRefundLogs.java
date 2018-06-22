package com.csjscm.oracledata.model;

import java.math.BigDecimal;

public class BidRefundLogs {
    private String id;

    private String requestid;

    private String nodeid;

    private String rowindex;

    private String norefund;

    private String refunddate;

    private String refundtime;

    private String orderno;

    private String orderdt;

    private BigDecimal refundmoney;

    private String inaccount;

    private String outaccount;

    private String refundstatus;

    private String actualdate;

    private String actualtime;

    private String refundchanel;

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

    public String getNodeid() {
        return nodeid;
    }

    public void setNodeid(String nodeid) {
        this.nodeid = nodeid == null ? null : nodeid.trim();
    }

    public String getRowindex() {
        return rowindex;
    }

    public void setRowindex(String rowindex) {
        this.rowindex = rowindex == null ? null : rowindex.trim();
    }

    public String getNorefund() {
        return norefund;
    }

    public void setNorefund(String norefund) {
        this.norefund = norefund == null ? null : norefund.trim();
    }

    public String getRefunddate() {
        return refunddate;
    }

    public void setRefunddate(String refunddate) {
        this.refunddate = refunddate == null ? null : refunddate.trim();
    }

    public String getRefundtime() {
        return refundtime;
    }

    public void setRefundtime(String refundtime) {
        this.refundtime = refundtime == null ? null : refundtime.trim();
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public String getOrderdt() {
        return orderdt;
    }

    public void setOrderdt(String orderdt) {
        this.orderdt = orderdt == null ? null : orderdt.trim();
    }

    public BigDecimal getRefundmoney() {
        return refundmoney;
    }

    public void setRefundmoney(BigDecimal refundmoney) {
        this.refundmoney = refundmoney;
    }

    public String getInaccount() {
        return inaccount;
    }

    public void setInaccount(String inaccount) {
        this.inaccount = inaccount == null ? null : inaccount.trim();
    }

    public String getOutaccount() {
        return outaccount;
    }

    public void setOutaccount(String outaccount) {
        this.outaccount = outaccount == null ? null : outaccount.trim();
    }

    public String getRefundstatus() {
        return refundstatus;
    }

    public void setRefundstatus(String refundstatus) {
        this.refundstatus = refundstatus == null ? null : refundstatus.trim();
    }

    public String getActualdate() {
        return actualdate;
    }

    public void setActualdate(String actualdate) {
        this.actualdate = actualdate == null ? null : actualdate.trim();
    }

    public String getActualtime() {
        return actualtime;
    }

    public void setActualtime(String actualtime) {
        this.actualtime = actualtime == null ? null : actualtime.trim();
    }

    public String getRefundchanel() {
        return refundchanel;
    }

    public void setRefundchanel(String refundchanel) {
        this.refundchanel = refundchanel == null ? null : refundchanel.trim();
    }
}