package com.csjscm.oracledata.model;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class ModelExecl {
    private String id;

    private Short headno;

    private String itemno;

    private String servicer;

    private String servicername;

    private String material;

    private String materialno;

    private String custommaterialno;

    private String materialname;

    private String materialrule;

    private String materialsize;

    private String materialtag;

    private String orderunit;

    private BigDecimal orderprice;

    private BigDecimal orderamount;

    private BigDecimal ordernum;

    private String warrantydate;

    private String supplydate;

    private String memos;

    private Short tailno;

    private String headinfo;

    private String fileurl;

    private String categoryname;

    private String enterpriceName;


}