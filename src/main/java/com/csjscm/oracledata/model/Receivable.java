package com.csjscm.oracledata.model;

import java.math.BigDecimal;

public class Receivable {
    private String ticketno;

    private String saleorder;

    private String contractno;

    private Short fundnature;

    private Short settlementmethod;

    private String payer;

    private String payername;

    private String receivables;

    private String receivablesname;

    private BigDecimal recamount;

    private String recdate;

    private Short status;

    private String createuser;

    private String createdate;

    private String checkuser;

    private String checkdate;

    private String checkadvice;

    private String enclosure;

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

    public String getSaleorder() {
        return saleorder;
    }

    public void setSaleorder(String saleorder) {
        this.saleorder = saleorder == null ? null : saleorder.trim();
    }

    public String getContractno() {
        return contractno;
    }

    public void setContractno(String contractno) {
        this.contractno = contractno == null ? null : contractno.trim();
    }

    public Short getFundnature() {
        return fundnature;
    }

    public void setFundnature(Short fundnature) {
        this.fundnature = fundnature;
    }

    public Short getSettlementmethod() {
        return settlementmethod;
    }

    public void setSettlementmethod(Short settlementmethod) {
        this.settlementmethod = settlementmethod;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer == null ? null : payer.trim();
    }

    public String getPayername() {
        return payername;
    }

    public void setPayername(String payername) {
        this.payername = payername == null ? null : payername.trim();
    }

    public String getReceivables() {
        return receivables;
    }

    public void setReceivables(String receivables) {
        this.receivables = receivables == null ? null : receivables.trim();
    }

    public String getReceivablesname() {
        return receivablesname;
    }

    public void setReceivablesname(String receivablesname) {
        this.receivablesname = receivablesname == null ? null : receivablesname.trim();
    }

    public BigDecimal getRecamount() {
        return recamount;
    }

    public void setRecamount(BigDecimal recamount) {
        this.recamount = recamount;
    }

    public String getRecdate() {
        return recdate;
    }

    public void setRecdate(String recdate) {
        this.recdate = recdate == null ? null : recdate.trim();
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

    public String getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(String enclosure) {
        this.enclosure = enclosure == null ? null : enclosure.trim();
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