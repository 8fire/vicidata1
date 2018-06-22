package com.csjscm.oracledata.model;

import lombok.Data;

@Data
public class Payment {
    private String ticketno;

    private String purchorder;

    private Short fundnature;

    private Short settlementmethod;

    private String payer;

    private String payername;

    private String receivables;

    private String receivablesname;

    private String payamount;

    private String paydate;

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

}