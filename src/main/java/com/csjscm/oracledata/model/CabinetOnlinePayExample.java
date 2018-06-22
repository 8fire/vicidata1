package com.csjscm.oracledata.model;

import java.util.ArrayList;
import java.util.List;

public class CabinetOnlinePayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CabinetOnlinePayExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRequestidIsNull() {
            addCriterion("REQUESTID is null");
            return (Criteria) this;
        }

        public Criteria andRequestidIsNotNull() {
            addCriterion("REQUESTID is not null");
            return (Criteria) this;
        }

        public Criteria andRequestidEqualTo(String value) {
            addCriterion("REQUESTID =", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidNotEqualTo(String value) {
            addCriterion("REQUESTID <>", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidGreaterThan(String value) {
            addCriterion("REQUESTID >", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidGreaterThanOrEqualTo(String value) {
            addCriterion("REQUESTID >=", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidLessThan(String value) {
            addCriterion("REQUESTID <", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidLessThanOrEqualTo(String value) {
            addCriterion("REQUESTID <=", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidLike(String value) {
            addCriterion("REQUESTID like", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidNotLike(String value) {
            addCriterion("REQUESTID not like", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidIn(List<String> values) {
            addCriterion("REQUESTID in", values, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidNotIn(List<String> values) {
            addCriterion("REQUESTID not in", values, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidBetween(String value1, String value2) {
            addCriterion("REQUESTID between", value1, value2, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidNotBetween(String value1, String value2) {
            addCriterion("REQUESTID not between", value1, value2, "requestid");
            return (Criteria) this;
        }

        public Criteria andNodeidIsNull() {
            addCriterion("NODEID is null");
            return (Criteria) this;
        }

        public Criteria andNodeidIsNotNull() {
            addCriterion("NODEID is not null");
            return (Criteria) this;
        }

        public Criteria andNodeidEqualTo(String value) {
            addCriterion("NODEID =", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidNotEqualTo(String value) {
            addCriterion("NODEID <>", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidGreaterThan(String value) {
            addCriterion("NODEID >", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidGreaterThanOrEqualTo(String value) {
            addCriterion("NODEID >=", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidLessThan(String value) {
            addCriterion("NODEID <", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidLessThanOrEqualTo(String value) {
            addCriterion("NODEID <=", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidLike(String value) {
            addCriterion("NODEID like", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidNotLike(String value) {
            addCriterion("NODEID not like", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidIn(List<String> values) {
            addCriterion("NODEID in", values, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidNotIn(List<String> values) {
            addCriterion("NODEID not in", values, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidBetween(String value1, String value2) {
            addCriterion("NODEID between", value1, value2, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidNotBetween(String value1, String value2) {
            addCriterion("NODEID not between", value1, value2, "nodeid");
            return (Criteria) this;
        }

        public Criteria andRowindexIsNull() {
            addCriterion("ROWINDEX is null");
            return (Criteria) this;
        }

        public Criteria andRowindexIsNotNull() {
            addCriterion("ROWINDEX is not null");
            return (Criteria) this;
        }

        public Criteria andRowindexEqualTo(String value) {
            addCriterion("ROWINDEX =", value, "rowindex");
            return (Criteria) this;
        }

        public Criteria andRowindexNotEqualTo(String value) {
            addCriterion("ROWINDEX <>", value, "rowindex");
            return (Criteria) this;
        }

        public Criteria andRowindexGreaterThan(String value) {
            addCriterion("ROWINDEX >", value, "rowindex");
            return (Criteria) this;
        }

        public Criteria andRowindexGreaterThanOrEqualTo(String value) {
            addCriterion("ROWINDEX >=", value, "rowindex");
            return (Criteria) this;
        }

        public Criteria andRowindexLessThan(String value) {
            addCriterion("ROWINDEX <", value, "rowindex");
            return (Criteria) this;
        }

        public Criteria andRowindexLessThanOrEqualTo(String value) {
            addCriterion("ROWINDEX <=", value, "rowindex");
            return (Criteria) this;
        }

        public Criteria andRowindexLike(String value) {
            addCriterion("ROWINDEX like", value, "rowindex");
            return (Criteria) this;
        }

        public Criteria andRowindexNotLike(String value) {
            addCriterion("ROWINDEX not like", value, "rowindex");
            return (Criteria) this;
        }

        public Criteria andRowindexIn(List<String> values) {
            addCriterion("ROWINDEX in", values, "rowindex");
            return (Criteria) this;
        }

        public Criteria andRowindexNotIn(List<String> values) {
            addCriterion("ROWINDEX not in", values, "rowindex");
            return (Criteria) this;
        }

        public Criteria andRowindexBetween(String value1, String value2) {
            addCriterion("ROWINDEX between", value1, value2, "rowindex");
            return (Criteria) this;
        }

        public Criteria andRowindexNotBetween(String value1, String value2) {
            addCriterion("ROWINDEX not between", value1, value2, "rowindex");
            return (Criteria) this;
        }

        public Criteria andMerchantnameIsNull() {
            addCriterion("MERCHANTNAME is null");
            return (Criteria) this;
        }

        public Criteria andMerchantnameIsNotNull() {
            addCriterion("MERCHANTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantnameEqualTo(String value) {
            addCriterion("MERCHANTNAME =", value, "merchantname");
            return (Criteria) this;
        }

        public Criteria andMerchantnameNotEqualTo(String value) {
            addCriterion("MERCHANTNAME <>", value, "merchantname");
            return (Criteria) this;
        }

        public Criteria andMerchantnameGreaterThan(String value) {
            addCriterion("MERCHANTNAME >", value, "merchantname");
            return (Criteria) this;
        }

        public Criteria andMerchantnameGreaterThanOrEqualTo(String value) {
            addCriterion("MERCHANTNAME >=", value, "merchantname");
            return (Criteria) this;
        }

        public Criteria andMerchantnameLessThan(String value) {
            addCriterion("MERCHANTNAME <", value, "merchantname");
            return (Criteria) this;
        }

        public Criteria andMerchantnameLessThanOrEqualTo(String value) {
            addCriterion("MERCHANTNAME <=", value, "merchantname");
            return (Criteria) this;
        }

        public Criteria andMerchantnameLike(String value) {
            addCriterion("MERCHANTNAME like", value, "merchantname");
            return (Criteria) this;
        }

        public Criteria andMerchantnameNotLike(String value) {
            addCriterion("MERCHANTNAME not like", value, "merchantname");
            return (Criteria) this;
        }

        public Criteria andMerchantnameIn(List<String> values) {
            addCriterion("MERCHANTNAME in", values, "merchantname");
            return (Criteria) this;
        }

        public Criteria andMerchantnameNotIn(List<String> values) {
            addCriterion("MERCHANTNAME not in", values, "merchantname");
            return (Criteria) this;
        }

        public Criteria andMerchantnameBetween(String value1, String value2) {
            addCriterion("MERCHANTNAME between", value1, value2, "merchantname");
            return (Criteria) this;
        }

        public Criteria andMerchantnameNotBetween(String value1, String value2) {
            addCriterion("MERCHANTNAME not between", value1, value2, "merchantname");
            return (Criteria) this;
        }

        public Criteria andMerchantseqIsNull() {
            addCriterion("MERCHANTSEQ is null");
            return (Criteria) this;
        }

        public Criteria andMerchantseqIsNotNull() {
            addCriterion("MERCHANTSEQ is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantseqEqualTo(String value) {
            addCriterion("MERCHANTSEQ =", value, "merchantseq");
            return (Criteria) this;
        }

        public Criteria andMerchantseqNotEqualTo(String value) {
            addCriterion("MERCHANTSEQ <>", value, "merchantseq");
            return (Criteria) this;
        }

        public Criteria andMerchantseqGreaterThan(String value) {
            addCriterion("MERCHANTSEQ >", value, "merchantseq");
            return (Criteria) this;
        }

        public Criteria andMerchantseqGreaterThanOrEqualTo(String value) {
            addCriterion("MERCHANTSEQ >=", value, "merchantseq");
            return (Criteria) this;
        }

        public Criteria andMerchantseqLessThan(String value) {
            addCriterion("MERCHANTSEQ <", value, "merchantseq");
            return (Criteria) this;
        }

        public Criteria andMerchantseqLessThanOrEqualTo(String value) {
            addCriterion("MERCHANTSEQ <=", value, "merchantseq");
            return (Criteria) this;
        }

        public Criteria andMerchantseqLike(String value) {
            addCriterion("MERCHANTSEQ like", value, "merchantseq");
            return (Criteria) this;
        }

        public Criteria andMerchantseqNotLike(String value) {
            addCriterion("MERCHANTSEQ not like", value, "merchantseq");
            return (Criteria) this;
        }

        public Criteria andMerchantseqIn(List<String> values) {
            addCriterion("MERCHANTSEQ in", values, "merchantseq");
            return (Criteria) this;
        }

        public Criteria andMerchantseqNotIn(List<String> values) {
            addCriterion("MERCHANTSEQ not in", values, "merchantseq");
            return (Criteria) this;
        }

        public Criteria andMerchantseqBetween(String value1, String value2) {
            addCriterion("MERCHANTSEQ between", value1, value2, "merchantseq");
            return (Criteria) this;
        }

        public Criteria andMerchantseqNotBetween(String value1, String value2) {
            addCriterion("MERCHANTSEQ not between", value1, value2, "merchantseq");
            return (Criteria) this;
        }

        public Criteria andOrderinfoIsNull() {
            addCriterion("ORDERINFO is null");
            return (Criteria) this;
        }

        public Criteria andOrderinfoIsNotNull() {
            addCriterion("ORDERINFO is not null");
            return (Criteria) this;
        }

        public Criteria andOrderinfoEqualTo(String value) {
            addCriterion("ORDERINFO =", value, "orderinfo");
            return (Criteria) this;
        }

        public Criteria andOrderinfoNotEqualTo(String value) {
            addCriterion("ORDERINFO <>", value, "orderinfo");
            return (Criteria) this;
        }

        public Criteria andOrderinfoGreaterThan(String value) {
            addCriterion("ORDERINFO >", value, "orderinfo");
            return (Criteria) this;
        }

        public Criteria andOrderinfoGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERINFO >=", value, "orderinfo");
            return (Criteria) this;
        }

        public Criteria andOrderinfoLessThan(String value) {
            addCriterion("ORDERINFO <", value, "orderinfo");
            return (Criteria) this;
        }

        public Criteria andOrderinfoLessThanOrEqualTo(String value) {
            addCriterion("ORDERINFO <=", value, "orderinfo");
            return (Criteria) this;
        }

        public Criteria andOrderinfoLike(String value) {
            addCriterion("ORDERINFO like", value, "orderinfo");
            return (Criteria) this;
        }

        public Criteria andOrderinfoNotLike(String value) {
            addCriterion("ORDERINFO not like", value, "orderinfo");
            return (Criteria) this;
        }

        public Criteria andOrderinfoIn(List<String> values) {
            addCriterion("ORDERINFO in", values, "orderinfo");
            return (Criteria) this;
        }

        public Criteria andOrderinfoNotIn(List<String> values) {
            addCriterion("ORDERINFO not in", values, "orderinfo");
            return (Criteria) this;
        }

        public Criteria andOrderinfoBetween(String value1, String value2) {
            addCriterion("ORDERINFO between", value1, value2, "orderinfo");
            return (Criteria) this;
        }

        public Criteria andOrderinfoNotBetween(String value1, String value2) {
            addCriterion("ORDERINFO not between", value1, value2, "orderinfo");
            return (Criteria) this;
        }

        public Criteria andVouchernoIsNull() {
            addCriterion("VOUCHERNO is null");
            return (Criteria) this;
        }

        public Criteria andVouchernoIsNotNull() {
            addCriterion("VOUCHERNO is not null");
            return (Criteria) this;
        }

        public Criteria andVouchernoEqualTo(String value) {
            addCriterion("VOUCHERNO =", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoNotEqualTo(String value) {
            addCriterion("VOUCHERNO <>", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoGreaterThan(String value) {
            addCriterion("VOUCHERNO >", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoGreaterThanOrEqualTo(String value) {
            addCriterion("VOUCHERNO >=", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoLessThan(String value) {
            addCriterion("VOUCHERNO <", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoLessThanOrEqualTo(String value) {
            addCriterion("VOUCHERNO <=", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoLike(String value) {
            addCriterion("VOUCHERNO like", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoNotLike(String value) {
            addCriterion("VOUCHERNO not like", value, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoIn(List<String> values) {
            addCriterion("VOUCHERNO in", values, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoNotIn(List<String> values) {
            addCriterion("VOUCHERNO not in", values, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoBetween(String value1, String value2) {
            addCriterion("VOUCHERNO between", value1, value2, "voucherno");
            return (Criteria) this;
        }

        public Criteria andVouchernoNotBetween(String value1, String value2) {
            addCriterion("VOUCHERNO not between", value1, value2, "voucherno");
            return (Criteria) this;
        }

        public Criteria andBanktradenoIsNull() {
            addCriterion("BANKTRADENO is null");
            return (Criteria) this;
        }

        public Criteria andBanktradenoIsNotNull() {
            addCriterion("BANKTRADENO is not null");
            return (Criteria) this;
        }

        public Criteria andBanktradenoEqualTo(String value) {
            addCriterion("BANKTRADENO =", value, "banktradeno");
            return (Criteria) this;
        }

        public Criteria andBanktradenoNotEqualTo(String value) {
            addCriterion("BANKTRADENO <>", value, "banktradeno");
            return (Criteria) this;
        }

        public Criteria andBanktradenoGreaterThan(String value) {
            addCriterion("BANKTRADENO >", value, "banktradeno");
            return (Criteria) this;
        }

        public Criteria andBanktradenoGreaterThanOrEqualTo(String value) {
            addCriterion("BANKTRADENO >=", value, "banktradeno");
            return (Criteria) this;
        }

        public Criteria andBanktradenoLessThan(String value) {
            addCriterion("BANKTRADENO <", value, "banktradeno");
            return (Criteria) this;
        }

        public Criteria andBanktradenoLessThanOrEqualTo(String value) {
            addCriterion("BANKTRADENO <=", value, "banktradeno");
            return (Criteria) this;
        }

        public Criteria andBanktradenoLike(String value) {
            addCriterion("BANKTRADENO like", value, "banktradeno");
            return (Criteria) this;
        }

        public Criteria andBanktradenoNotLike(String value) {
            addCriterion("BANKTRADENO not like", value, "banktradeno");
            return (Criteria) this;
        }

        public Criteria andBanktradenoIn(List<String> values) {
            addCriterion("BANKTRADENO in", values, "banktradeno");
            return (Criteria) this;
        }

        public Criteria andBanktradenoNotIn(List<String> values) {
            addCriterion("BANKTRADENO not in", values, "banktradeno");
            return (Criteria) this;
        }

        public Criteria andBanktradenoBetween(String value1, String value2) {
            addCriterion("BANKTRADENO between", value1, value2, "banktradeno");
            return (Criteria) this;
        }

        public Criteria andBanktradenoNotBetween(String value1, String value2) {
            addCriterion("BANKTRADENO not between", value1, value2, "banktradeno");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRefnoIsNull() {
            addCriterion("REFNO is null");
            return (Criteria) this;
        }

        public Criteria andRefnoIsNotNull() {
            addCriterion("REFNO is not null");
            return (Criteria) this;
        }

        public Criteria andRefnoEqualTo(String value) {
            addCriterion("REFNO =", value, "refno");
            return (Criteria) this;
        }

        public Criteria andRefnoNotEqualTo(String value) {
            addCriterion("REFNO <>", value, "refno");
            return (Criteria) this;
        }

        public Criteria andRefnoGreaterThan(String value) {
            addCriterion("REFNO >", value, "refno");
            return (Criteria) this;
        }

        public Criteria andRefnoGreaterThanOrEqualTo(String value) {
            addCriterion("REFNO >=", value, "refno");
            return (Criteria) this;
        }

        public Criteria andRefnoLessThan(String value) {
            addCriterion("REFNO <", value, "refno");
            return (Criteria) this;
        }

        public Criteria andRefnoLessThanOrEqualTo(String value) {
            addCriterion("REFNO <=", value, "refno");
            return (Criteria) this;
        }

        public Criteria andRefnoLike(String value) {
            addCriterion("REFNO like", value, "refno");
            return (Criteria) this;
        }

        public Criteria andRefnoNotLike(String value) {
            addCriterion("REFNO not like", value, "refno");
            return (Criteria) this;
        }

        public Criteria andRefnoIn(List<String> values) {
            addCriterion("REFNO in", values, "refno");
            return (Criteria) this;
        }

        public Criteria andRefnoNotIn(List<String> values) {
            addCriterion("REFNO not in", values, "refno");
            return (Criteria) this;
        }

        public Criteria andRefnoBetween(String value1, String value2) {
            addCriterion("REFNO between", value1, value2, "refno");
            return (Criteria) this;
        }

        public Criteria andRefnoNotBetween(String value1, String value2) {
            addCriterion("REFNO not between", value1, value2, "refno");
            return (Criteria) this;
        }

        public Criteria andBatchnoIsNull() {
            addCriterion("BATCHNO is null");
            return (Criteria) this;
        }

        public Criteria andBatchnoIsNotNull() {
            addCriterion("BATCHNO is not null");
            return (Criteria) this;
        }

        public Criteria andBatchnoEqualTo(String value) {
            addCriterion("BATCHNO =", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotEqualTo(String value) {
            addCriterion("BATCHNO <>", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoGreaterThan(String value) {
            addCriterion("BATCHNO >", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoGreaterThanOrEqualTo(String value) {
            addCriterion("BATCHNO >=", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoLessThan(String value) {
            addCriterion("BATCHNO <", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoLessThanOrEqualTo(String value) {
            addCriterion("BATCHNO <=", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoLike(String value) {
            addCriterion("BATCHNO like", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotLike(String value) {
            addCriterion("BATCHNO not like", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoIn(List<String> values) {
            addCriterion("BATCHNO in", values, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotIn(List<String> values) {
            addCriterion("BATCHNO not in", values, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoBetween(String value1, String value2) {
            addCriterion("BATCHNO between", value1, value2, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotBetween(String value1, String value2) {
            addCriterion("BATCHNO not between", value1, value2, "batchno");
            return (Criteria) this;
        }

        public Criteria andCardtypeIsNull() {
            addCriterion("CARDTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCardtypeIsNotNull() {
            addCriterion("CARDTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCardtypeEqualTo(String value) {
            addCriterion("CARDTYPE =", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotEqualTo(String value) {
            addCriterion("CARDTYPE <>", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeGreaterThan(String value) {
            addCriterion("CARDTYPE >", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeGreaterThanOrEqualTo(String value) {
            addCriterion("CARDTYPE >=", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeLessThan(String value) {
            addCriterion("CARDTYPE <", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeLessThanOrEqualTo(String value) {
            addCriterion("CARDTYPE <=", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeLike(String value) {
            addCriterion("CARDTYPE like", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotLike(String value) {
            addCriterion("CARDTYPE not like", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeIn(List<String> values) {
            addCriterion("CARDTYPE in", values, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotIn(List<String> values) {
            addCriterion("CARDTYPE not in", values, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeBetween(String value1, String value2) {
            addCriterion("CARDTYPE between", value1, value2, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotBetween(String value1, String value2) {
            addCriterion("CARDTYPE not between", value1, value2, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardnoIsNull() {
            addCriterion("CARDNO is null");
            return (Criteria) this;
        }

        public Criteria andCardnoIsNotNull() {
            addCriterion("CARDNO is not null");
            return (Criteria) this;
        }

        public Criteria andCardnoEqualTo(String value) {
            addCriterion("CARDNO =", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotEqualTo(String value) {
            addCriterion("CARDNO <>", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoGreaterThan(String value) {
            addCriterion("CARDNO >", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoGreaterThanOrEqualTo(String value) {
            addCriterion("CARDNO >=", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLessThan(String value) {
            addCriterion("CARDNO <", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLessThanOrEqualTo(String value) {
            addCriterion("CARDNO <=", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLike(String value) {
            addCriterion("CARDNO like", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotLike(String value) {
            addCriterion("CARDNO not like", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoIn(List<String> values) {
            addCriterion("CARDNO in", values, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotIn(List<String> values) {
            addCriterion("CARDNO not in", values, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoBetween(String value1, String value2) {
            addCriterion("CARDNO between", value1, value2, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotBetween(String value1, String value2) {
            addCriterion("CARDNO not between", value1, value2, "cardno");
            return (Criteria) this;
        }

        public Criteria andCbcodeIsNull() {
            addCriterion("CBCODE is null");
            return (Criteria) this;
        }

        public Criteria andCbcodeIsNotNull() {
            addCriterion("CBCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCbcodeEqualTo(String value) {
            addCriterion("CBCODE =", value, "cbcode");
            return (Criteria) this;
        }

        public Criteria andCbcodeNotEqualTo(String value) {
            addCriterion("CBCODE <>", value, "cbcode");
            return (Criteria) this;
        }

        public Criteria andCbcodeGreaterThan(String value) {
            addCriterion("CBCODE >", value, "cbcode");
            return (Criteria) this;
        }

        public Criteria andCbcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CBCODE >=", value, "cbcode");
            return (Criteria) this;
        }

        public Criteria andCbcodeLessThan(String value) {
            addCriterion("CBCODE <", value, "cbcode");
            return (Criteria) this;
        }

        public Criteria andCbcodeLessThanOrEqualTo(String value) {
            addCriterion("CBCODE <=", value, "cbcode");
            return (Criteria) this;
        }

        public Criteria andCbcodeLike(String value) {
            addCriterion("CBCODE like", value, "cbcode");
            return (Criteria) this;
        }

        public Criteria andCbcodeNotLike(String value) {
            addCriterion("CBCODE not like", value, "cbcode");
            return (Criteria) this;
        }

        public Criteria andCbcodeIn(List<String> values) {
            addCriterion("CBCODE in", values, "cbcode");
            return (Criteria) this;
        }

        public Criteria andCbcodeNotIn(List<String> values) {
            addCriterion("CBCODE not in", values, "cbcode");
            return (Criteria) this;
        }

        public Criteria andCbcodeBetween(String value1, String value2) {
            addCriterion("CBCODE between", value1, value2, "cbcode");
            return (Criteria) this;
        }

        public Criteria andCbcodeNotBetween(String value1, String value2) {
            addCriterion("CBCODE not between", value1, value2, "cbcode");
            return (Criteria) this;
        }

        public Criteria andCardnameIsNull() {
            addCriterion("CARDNAME is null");
            return (Criteria) this;
        }

        public Criteria andCardnameIsNotNull() {
            addCriterion("CARDNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCardnameEqualTo(String value) {
            addCriterion("CARDNAME =", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameNotEqualTo(String value) {
            addCriterion("CARDNAME <>", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameGreaterThan(String value) {
            addCriterion("CARDNAME >", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameGreaterThanOrEqualTo(String value) {
            addCriterion("CARDNAME >=", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameLessThan(String value) {
            addCriterion("CARDNAME <", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameLessThanOrEqualTo(String value) {
            addCriterion("CARDNAME <=", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameLike(String value) {
            addCriterion("CARDNAME like", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameNotLike(String value) {
            addCriterion("CARDNAME not like", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameIn(List<String> values) {
            addCriterion("CARDNAME in", values, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameNotIn(List<String> values) {
            addCriterion("CARDNAME not in", values, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameBetween(String value1, String value2) {
            addCriterion("CARDNAME between", value1, value2, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameNotBetween(String value1, String value2) {
            addCriterion("CARDNAME not between", value1, value2, "cardname");
            return (Criteria) this;
        }

        public Criteria andFeeIsNull() {
            addCriterion("FEE is null");
            return (Criteria) this;
        }

        public Criteria andFeeIsNotNull() {
            addCriterion("FEE is not null");
            return (Criteria) this;
        }

        public Criteria andFeeEqualTo(String value) {
            addCriterion("FEE =", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotEqualTo(String value) {
            addCriterion("FEE <>", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThan(String value) {
            addCriterion("FEE >", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThanOrEqualTo(String value) {
            addCriterion("FEE >=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThan(String value) {
            addCriterion("FEE <", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThanOrEqualTo(String value) {
            addCriterion("FEE <=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLike(String value) {
            addCriterion("FEE like", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotLike(String value) {
            addCriterion("FEE not like", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeIn(List<String> values) {
            addCriterion("FEE in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotIn(List<String> values) {
            addCriterion("FEE not in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeBetween(String value1, String value2) {
            addCriterion("FEE between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotBetween(String value1, String value2) {
            addCriterion("FEE not between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andTranstypeIsNull() {
            addCriterion("TRANSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andTranstypeIsNotNull() {
            addCriterion("TRANSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTranstypeEqualTo(String value) {
            addCriterion("TRANSTYPE =", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeNotEqualTo(String value) {
            addCriterion("TRANSTYPE <>", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeGreaterThan(String value) {
            addCriterion("TRANSTYPE >", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSTYPE >=", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeLessThan(String value) {
            addCriterion("TRANSTYPE <", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeLessThanOrEqualTo(String value) {
            addCriterion("TRANSTYPE <=", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeLike(String value) {
            addCriterion("TRANSTYPE like", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeNotLike(String value) {
            addCriterion("TRANSTYPE not like", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeIn(List<String> values) {
            addCriterion("TRANSTYPE in", values, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeNotIn(List<String> values) {
            addCriterion("TRANSTYPE not in", values, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeBetween(String value1, String value2) {
            addCriterion("TRANSTYPE between", value1, value2, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeNotBetween(String value1, String value2) {
            addCriterion("TRANSTYPE not between", value1, value2, "transtype");
            return (Criteria) this;
        }

        public Criteria andCuptermidIsNull() {
            addCriterion("CUPTERMID is null");
            return (Criteria) this;
        }

        public Criteria andCuptermidIsNotNull() {
            addCriterion("CUPTERMID is not null");
            return (Criteria) this;
        }

        public Criteria andCuptermidEqualTo(String value) {
            addCriterion("CUPTERMID =", value, "cuptermid");
            return (Criteria) this;
        }

        public Criteria andCuptermidNotEqualTo(String value) {
            addCriterion("CUPTERMID <>", value, "cuptermid");
            return (Criteria) this;
        }

        public Criteria andCuptermidGreaterThan(String value) {
            addCriterion("CUPTERMID >", value, "cuptermid");
            return (Criteria) this;
        }

        public Criteria andCuptermidGreaterThanOrEqualTo(String value) {
            addCriterion("CUPTERMID >=", value, "cuptermid");
            return (Criteria) this;
        }

        public Criteria andCuptermidLessThan(String value) {
            addCriterion("CUPTERMID <", value, "cuptermid");
            return (Criteria) this;
        }

        public Criteria andCuptermidLessThanOrEqualTo(String value) {
            addCriterion("CUPTERMID <=", value, "cuptermid");
            return (Criteria) this;
        }

        public Criteria andCuptermidLike(String value) {
            addCriterion("CUPTERMID like", value, "cuptermid");
            return (Criteria) this;
        }

        public Criteria andCuptermidNotLike(String value) {
            addCriterion("CUPTERMID not like", value, "cuptermid");
            return (Criteria) this;
        }

        public Criteria andCuptermidIn(List<String> values) {
            addCriterion("CUPTERMID in", values, "cuptermid");
            return (Criteria) this;
        }

        public Criteria andCuptermidNotIn(List<String> values) {
            addCriterion("CUPTERMID not in", values, "cuptermid");
            return (Criteria) this;
        }

        public Criteria andCuptermidBetween(String value1, String value2) {
            addCriterion("CUPTERMID between", value1, value2, "cuptermid");
            return (Criteria) this;
        }

        public Criteria andCuptermidNotBetween(String value1, String value2) {
            addCriterion("CUPTERMID not between", value1, value2, "cuptermid");
            return (Criteria) this;
        }

        public Criteria andCuptsamnoIsNull() {
            addCriterion("CUPTSAMNO is null");
            return (Criteria) this;
        }

        public Criteria andCuptsamnoIsNotNull() {
            addCriterion("CUPTSAMNO is not null");
            return (Criteria) this;
        }

        public Criteria andCuptsamnoEqualTo(String value) {
            addCriterion("CUPTSAMNO =", value, "cuptsamno");
            return (Criteria) this;
        }

        public Criteria andCuptsamnoNotEqualTo(String value) {
            addCriterion("CUPTSAMNO <>", value, "cuptsamno");
            return (Criteria) this;
        }

        public Criteria andCuptsamnoGreaterThan(String value) {
            addCriterion("CUPTSAMNO >", value, "cuptsamno");
            return (Criteria) this;
        }

        public Criteria andCuptsamnoGreaterThanOrEqualTo(String value) {
            addCriterion("CUPTSAMNO >=", value, "cuptsamno");
            return (Criteria) this;
        }

        public Criteria andCuptsamnoLessThan(String value) {
            addCriterion("CUPTSAMNO <", value, "cuptsamno");
            return (Criteria) this;
        }

        public Criteria andCuptsamnoLessThanOrEqualTo(String value) {
            addCriterion("CUPTSAMNO <=", value, "cuptsamno");
            return (Criteria) this;
        }

        public Criteria andCuptsamnoLike(String value) {
            addCriterion("CUPTSAMNO like", value, "cuptsamno");
            return (Criteria) this;
        }

        public Criteria andCuptsamnoNotLike(String value) {
            addCriterion("CUPTSAMNO not like", value, "cuptsamno");
            return (Criteria) this;
        }

        public Criteria andCuptsamnoIn(List<String> values) {
            addCriterion("CUPTSAMNO in", values, "cuptsamno");
            return (Criteria) this;
        }

        public Criteria andCuptsamnoNotIn(List<String> values) {
            addCriterion("CUPTSAMNO not in", values, "cuptsamno");
            return (Criteria) this;
        }

        public Criteria andCuptsamnoBetween(String value1, String value2) {
            addCriterion("CUPTSAMNO between", value1, value2, "cuptsamno");
            return (Criteria) this;
        }

        public Criteria andCuptsamnoNotBetween(String value1, String value2) {
            addCriterion("CUPTSAMNO not between", value1, value2, "cuptsamno");
            return (Criteria) this;
        }

        public Criteria andCenterinfoIsNull() {
            addCriterion("CENTERINFO is null");
            return (Criteria) this;
        }

        public Criteria andCenterinfoIsNotNull() {
            addCriterion("CENTERINFO is not null");
            return (Criteria) this;
        }

        public Criteria andCenterinfoEqualTo(String value) {
            addCriterion("CENTERINFO =", value, "centerinfo");
            return (Criteria) this;
        }

        public Criteria andCenterinfoNotEqualTo(String value) {
            addCriterion("CENTERINFO <>", value, "centerinfo");
            return (Criteria) this;
        }

        public Criteria andCenterinfoGreaterThan(String value) {
            addCriterion("CENTERINFO >", value, "centerinfo");
            return (Criteria) this;
        }

        public Criteria andCenterinfoGreaterThanOrEqualTo(String value) {
            addCriterion("CENTERINFO >=", value, "centerinfo");
            return (Criteria) this;
        }

        public Criteria andCenterinfoLessThan(String value) {
            addCriterion("CENTERINFO <", value, "centerinfo");
            return (Criteria) this;
        }

        public Criteria andCenterinfoLessThanOrEqualTo(String value) {
            addCriterion("CENTERINFO <=", value, "centerinfo");
            return (Criteria) this;
        }

        public Criteria andCenterinfoLike(String value) {
            addCriterion("CENTERINFO like", value, "centerinfo");
            return (Criteria) this;
        }

        public Criteria andCenterinfoNotLike(String value) {
            addCriterion("CENTERINFO not like", value, "centerinfo");
            return (Criteria) this;
        }

        public Criteria andCenterinfoIn(List<String> values) {
            addCriterion("CENTERINFO in", values, "centerinfo");
            return (Criteria) this;
        }

        public Criteria andCenterinfoNotIn(List<String> values) {
            addCriterion("CENTERINFO not in", values, "centerinfo");
            return (Criteria) this;
        }

        public Criteria andCenterinfoBetween(String value1, String value2) {
            addCriterion("CENTERINFO between", value1, value2, "centerinfo");
            return (Criteria) this;
        }

        public Criteria andCenterinfoNotBetween(String value1, String value2) {
            addCriterion("CENTERINFO not between", value1, value2, "centerinfo");
            return (Criteria) this;
        }

        public Criteria andCenterseqidIsNull() {
            addCriterion("CENTERSEQID is null");
            return (Criteria) this;
        }

        public Criteria andCenterseqidIsNotNull() {
            addCriterion("CENTERSEQID is not null");
            return (Criteria) this;
        }

        public Criteria andCenterseqidEqualTo(String value) {
            addCriterion("CENTERSEQID =", value, "centerseqid");
            return (Criteria) this;
        }

        public Criteria andCenterseqidNotEqualTo(String value) {
            addCriterion("CENTERSEQID <>", value, "centerseqid");
            return (Criteria) this;
        }

        public Criteria andCenterseqidGreaterThan(String value) {
            addCriterion("CENTERSEQID >", value, "centerseqid");
            return (Criteria) this;
        }

        public Criteria andCenterseqidGreaterThanOrEqualTo(String value) {
            addCriterion("CENTERSEQID >=", value, "centerseqid");
            return (Criteria) this;
        }

        public Criteria andCenterseqidLessThan(String value) {
            addCriterion("CENTERSEQID <", value, "centerseqid");
            return (Criteria) this;
        }

        public Criteria andCenterseqidLessThanOrEqualTo(String value) {
            addCriterion("CENTERSEQID <=", value, "centerseqid");
            return (Criteria) this;
        }

        public Criteria andCenterseqidLike(String value) {
            addCriterion("CENTERSEQID like", value, "centerseqid");
            return (Criteria) this;
        }

        public Criteria andCenterseqidNotLike(String value) {
            addCriterion("CENTERSEQID not like", value, "centerseqid");
            return (Criteria) this;
        }

        public Criteria andCenterseqidIn(List<String> values) {
            addCriterion("CENTERSEQID in", values, "centerseqid");
            return (Criteria) this;
        }

        public Criteria andCenterseqidNotIn(List<String> values) {
            addCriterion("CENTERSEQID not in", values, "centerseqid");
            return (Criteria) this;
        }

        public Criteria andCenterseqidBetween(String value1, String value2) {
            addCriterion("CENTERSEQID between", value1, value2, "centerseqid");
            return (Criteria) this;
        }

        public Criteria andCenterseqidNotBetween(String value1, String value2) {
            addCriterion("CENTERSEQID not between", value1, value2, "centerseqid");
            return (Criteria) this;
        }

        public Criteria andBankordernoIsNull() {
            addCriterion("BANKORDERNO is null");
            return (Criteria) this;
        }

        public Criteria andBankordernoIsNotNull() {
            addCriterion("BANKORDERNO is not null");
            return (Criteria) this;
        }

        public Criteria andBankordernoEqualTo(String value) {
            addCriterion("BANKORDERNO =", value, "bankorderno");
            return (Criteria) this;
        }

        public Criteria andBankordernoNotEqualTo(String value) {
            addCriterion("BANKORDERNO <>", value, "bankorderno");
            return (Criteria) this;
        }

        public Criteria andBankordernoGreaterThan(String value) {
            addCriterion("BANKORDERNO >", value, "bankorderno");
            return (Criteria) this;
        }

        public Criteria andBankordernoGreaterThanOrEqualTo(String value) {
            addCriterion("BANKORDERNO >=", value, "bankorderno");
            return (Criteria) this;
        }

        public Criteria andBankordernoLessThan(String value) {
            addCriterion("BANKORDERNO <", value, "bankorderno");
            return (Criteria) this;
        }

        public Criteria andBankordernoLessThanOrEqualTo(String value) {
            addCriterion("BANKORDERNO <=", value, "bankorderno");
            return (Criteria) this;
        }

        public Criteria andBankordernoLike(String value) {
            addCriterion("BANKORDERNO like", value, "bankorderno");
            return (Criteria) this;
        }

        public Criteria andBankordernoNotLike(String value) {
            addCriterion("BANKORDERNO not like", value, "bankorderno");
            return (Criteria) this;
        }

        public Criteria andBankordernoIn(List<String> values) {
            addCriterion("BANKORDERNO in", values, "bankorderno");
            return (Criteria) this;
        }

        public Criteria andBankordernoNotIn(List<String> values) {
            addCriterion("BANKORDERNO not in", values, "bankorderno");
            return (Criteria) this;
        }

        public Criteria andBankordernoBetween(String value1, String value2) {
            addCriterion("BANKORDERNO between", value1, value2, "bankorderno");
            return (Criteria) this;
        }

        public Criteria andBankordernoNotBetween(String value1, String value2) {
            addCriterion("BANKORDERNO not between", value1, value2, "bankorderno");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(String value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(String value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(String value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(String value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(String value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(String value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLike(String value) {
            addCriterion("AMOUNT like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotLike(String value) {
            addCriterion("AMOUNT not like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<String> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<String> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(String value1, String value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(String value1, String value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andTransdateIsNull() {
            addCriterion("TRANSDATE is null");
            return (Criteria) this;
        }

        public Criteria andTransdateIsNotNull() {
            addCriterion("TRANSDATE is not null");
            return (Criteria) this;
        }

        public Criteria andTransdateEqualTo(String value) {
            addCriterion("TRANSDATE =", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateNotEqualTo(String value) {
            addCriterion("TRANSDATE <>", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateGreaterThan(String value) {
            addCriterion("TRANSDATE >", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSDATE >=", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateLessThan(String value) {
            addCriterion("TRANSDATE <", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateLessThanOrEqualTo(String value) {
            addCriterion("TRANSDATE <=", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateLike(String value) {
            addCriterion("TRANSDATE like", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateNotLike(String value) {
            addCriterion("TRANSDATE not like", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateIn(List<String> values) {
            addCriterion("TRANSDATE in", values, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateNotIn(List<String> values) {
            addCriterion("TRANSDATE not in", values, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateBetween(String value1, String value2) {
            addCriterion("TRANSDATE between", value1, value2, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateNotBetween(String value1, String value2) {
            addCriterion("TRANSDATE not between", value1, value2, "transdate");
            return (Criteria) this;
        }

        public Criteria andTranstimeIsNull() {
            addCriterion("TRANSTIME is null");
            return (Criteria) this;
        }

        public Criteria andTranstimeIsNotNull() {
            addCriterion("TRANSTIME is not null");
            return (Criteria) this;
        }

        public Criteria andTranstimeEqualTo(String value) {
            addCriterion("TRANSTIME =", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeNotEqualTo(String value) {
            addCriterion("TRANSTIME <>", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeGreaterThan(String value) {
            addCriterion("TRANSTIME >", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSTIME >=", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeLessThan(String value) {
            addCriterion("TRANSTIME <", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeLessThanOrEqualTo(String value) {
            addCriterion("TRANSTIME <=", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeLike(String value) {
            addCriterion("TRANSTIME like", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeNotLike(String value) {
            addCriterion("TRANSTIME not like", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeIn(List<String> values) {
            addCriterion("TRANSTIME in", values, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeNotIn(List<String> values) {
            addCriterion("TRANSTIME not in", values, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeBetween(String value1, String value2) {
            addCriterion("TRANSTIME between", value1, value2, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeNotBetween(String value1, String value2) {
            addCriterion("TRANSTIME not between", value1, value2, "transtime");
            return (Criteria) this;
        }

        public Criteria andTradestatusIsNull() {
            addCriterion("TRADESTATUS is null");
            return (Criteria) this;
        }

        public Criteria andTradestatusIsNotNull() {
            addCriterion("TRADESTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTradestatusEqualTo(String value) {
            addCriterion("TRADESTATUS =", value, "tradestatus");
            return (Criteria) this;
        }

        public Criteria andTradestatusNotEqualTo(String value) {
            addCriterion("TRADESTATUS <>", value, "tradestatus");
            return (Criteria) this;
        }

        public Criteria andTradestatusGreaterThan(String value) {
            addCriterion("TRADESTATUS >", value, "tradestatus");
            return (Criteria) this;
        }

        public Criteria andTradestatusGreaterThanOrEqualTo(String value) {
            addCriterion("TRADESTATUS >=", value, "tradestatus");
            return (Criteria) this;
        }

        public Criteria andTradestatusLessThan(String value) {
            addCriterion("TRADESTATUS <", value, "tradestatus");
            return (Criteria) this;
        }

        public Criteria andTradestatusLessThanOrEqualTo(String value) {
            addCriterion("TRADESTATUS <=", value, "tradestatus");
            return (Criteria) this;
        }

        public Criteria andTradestatusLike(String value) {
            addCriterion("TRADESTATUS like", value, "tradestatus");
            return (Criteria) this;
        }

        public Criteria andTradestatusNotLike(String value) {
            addCriterion("TRADESTATUS not like", value, "tradestatus");
            return (Criteria) this;
        }

        public Criteria andTradestatusIn(List<String> values) {
            addCriterion("TRADESTATUS in", values, "tradestatus");
            return (Criteria) this;
        }

        public Criteria andTradestatusNotIn(List<String> values) {
            addCriterion("TRADESTATUS not in", values, "tradestatus");
            return (Criteria) this;
        }

        public Criteria andTradestatusBetween(String value1, String value2) {
            addCriterion("TRADESTATUS between", value1, value2, "tradestatus");
            return (Criteria) this;
        }

        public Criteria andTradestatusNotBetween(String value1, String value2) {
            addCriterion("TRADESTATUS not between", value1, value2, "tradestatus");
            return (Criteria) this;
        }

        public Criteria andSelecttradetypeIsNull() {
            addCriterion("SELECTTRADETYPE is null");
            return (Criteria) this;
        }

        public Criteria andSelecttradetypeIsNotNull() {
            addCriterion("SELECTTRADETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSelecttradetypeEqualTo(String value) {
            addCriterion("SELECTTRADETYPE =", value, "selecttradetype");
            return (Criteria) this;
        }

        public Criteria andSelecttradetypeNotEqualTo(String value) {
            addCriterion("SELECTTRADETYPE <>", value, "selecttradetype");
            return (Criteria) this;
        }

        public Criteria andSelecttradetypeGreaterThan(String value) {
            addCriterion("SELECTTRADETYPE >", value, "selecttradetype");
            return (Criteria) this;
        }

        public Criteria andSelecttradetypeGreaterThanOrEqualTo(String value) {
            addCriterion("SELECTTRADETYPE >=", value, "selecttradetype");
            return (Criteria) this;
        }

        public Criteria andSelecttradetypeLessThan(String value) {
            addCriterion("SELECTTRADETYPE <", value, "selecttradetype");
            return (Criteria) this;
        }

        public Criteria andSelecttradetypeLessThanOrEqualTo(String value) {
            addCriterion("SELECTTRADETYPE <=", value, "selecttradetype");
            return (Criteria) this;
        }

        public Criteria andSelecttradetypeLike(String value) {
            addCriterion("SELECTTRADETYPE like", value, "selecttradetype");
            return (Criteria) this;
        }

        public Criteria andSelecttradetypeNotLike(String value) {
            addCriterion("SELECTTRADETYPE not like", value, "selecttradetype");
            return (Criteria) this;
        }

        public Criteria andSelecttradetypeIn(List<String> values) {
            addCriterion("SELECTTRADETYPE in", values, "selecttradetype");
            return (Criteria) this;
        }

        public Criteria andSelecttradetypeNotIn(List<String> values) {
            addCriterion("SELECTTRADETYPE not in", values, "selecttradetype");
            return (Criteria) this;
        }

        public Criteria andSelecttradetypeBetween(String value1, String value2) {
            addCriterion("SELECTTRADETYPE between", value1, value2, "selecttradetype");
            return (Criteria) this;
        }

        public Criteria andSelecttradetypeNotBetween(String value1, String value2) {
            addCriterion("SELECTTRADETYPE not between", value1, value2, "selecttradetype");
            return (Criteria) this;
        }

        public Criteria andPingorderidIsNull() {
            addCriterion("PINGORDERID is null");
            return (Criteria) this;
        }

        public Criteria andPingorderidIsNotNull() {
            addCriterion("PINGORDERID is not null");
            return (Criteria) this;
        }

        public Criteria andPingorderidEqualTo(String value) {
            addCriterion("PINGORDERID =", value, "pingorderid");
            return (Criteria) this;
        }

        public Criteria andPingorderidNotEqualTo(String value) {
            addCriterion("PINGORDERID <>", value, "pingorderid");
            return (Criteria) this;
        }

        public Criteria andPingorderidGreaterThan(String value) {
            addCriterion("PINGORDERID >", value, "pingorderid");
            return (Criteria) this;
        }

        public Criteria andPingorderidGreaterThanOrEqualTo(String value) {
            addCriterion("PINGORDERID >=", value, "pingorderid");
            return (Criteria) this;
        }

        public Criteria andPingorderidLessThan(String value) {
            addCriterion("PINGORDERID <", value, "pingorderid");
            return (Criteria) this;
        }

        public Criteria andPingorderidLessThanOrEqualTo(String value) {
            addCriterion("PINGORDERID <=", value, "pingorderid");
            return (Criteria) this;
        }

        public Criteria andPingorderidLike(String value) {
            addCriterion("PINGORDERID like", value, "pingorderid");
            return (Criteria) this;
        }

        public Criteria andPingorderidNotLike(String value) {
            addCriterion("PINGORDERID not like", value, "pingorderid");
            return (Criteria) this;
        }

        public Criteria andPingorderidIn(List<String> values) {
            addCriterion("PINGORDERID in", values, "pingorderid");
            return (Criteria) this;
        }

        public Criteria andPingorderidNotIn(List<String> values) {
            addCriterion("PINGORDERID not in", values, "pingorderid");
            return (Criteria) this;
        }

        public Criteria andPingorderidBetween(String value1, String value2) {
            addCriterion("PINGORDERID between", value1, value2, "pingorderid");
            return (Criteria) this;
        }

        public Criteria andPingorderidNotBetween(String value1, String value2) {
            addCriterion("PINGORDERID not between", value1, value2, "pingorderid");
            return (Criteria) this;
        }

        public Criteria andHbfqnumIsNull() {
            addCriterion("HBFQNUM is null");
            return (Criteria) this;
        }

        public Criteria andHbfqnumIsNotNull() {
            addCriterion("HBFQNUM is not null");
            return (Criteria) this;
        }

        public Criteria andHbfqnumEqualTo(String value) {
            addCriterion("HBFQNUM =", value, "hbfqnum");
            return (Criteria) this;
        }

        public Criteria andHbfqnumNotEqualTo(String value) {
            addCriterion("HBFQNUM <>", value, "hbfqnum");
            return (Criteria) this;
        }

        public Criteria andHbfqnumGreaterThan(String value) {
            addCriterion("HBFQNUM >", value, "hbfqnum");
            return (Criteria) this;
        }

        public Criteria andHbfqnumGreaterThanOrEqualTo(String value) {
            addCriterion("HBFQNUM >=", value, "hbfqnum");
            return (Criteria) this;
        }

        public Criteria andHbfqnumLessThan(String value) {
            addCriterion("HBFQNUM <", value, "hbfqnum");
            return (Criteria) this;
        }

        public Criteria andHbfqnumLessThanOrEqualTo(String value) {
            addCriterion("HBFQNUM <=", value, "hbfqnum");
            return (Criteria) this;
        }

        public Criteria andHbfqnumLike(String value) {
            addCriterion("HBFQNUM like", value, "hbfqnum");
            return (Criteria) this;
        }

        public Criteria andHbfqnumNotLike(String value) {
            addCriterion("HBFQNUM not like", value, "hbfqnum");
            return (Criteria) this;
        }

        public Criteria andHbfqnumIn(List<String> values) {
            addCriterion("HBFQNUM in", values, "hbfqnum");
            return (Criteria) this;
        }

        public Criteria andHbfqnumNotIn(List<String> values) {
            addCriterion("HBFQNUM not in", values, "hbfqnum");
            return (Criteria) this;
        }

        public Criteria andHbfqnumBetween(String value1, String value2) {
            addCriterion("HBFQNUM between", value1, value2, "hbfqnum");
            return (Criteria) this;
        }

        public Criteria andHbfqnumNotBetween(String value1, String value2) {
            addCriterion("HBFQNUM not between", value1, value2, "hbfqnum");
            return (Criteria) this;
        }

        public Criteria andCsjroyalityamountIsNull() {
            addCriterion("CSJROYALITYAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCsjroyalityamountIsNotNull() {
            addCriterion("CSJROYALITYAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCsjroyalityamountEqualTo(String value) {
            addCriterion("CSJROYALITYAMOUNT =", value, "csjroyalityamount");
            return (Criteria) this;
        }

        public Criteria andCsjroyalityamountNotEqualTo(String value) {
            addCriterion("CSJROYALITYAMOUNT <>", value, "csjroyalityamount");
            return (Criteria) this;
        }

        public Criteria andCsjroyalityamountGreaterThan(String value) {
            addCriterion("CSJROYALITYAMOUNT >", value, "csjroyalityamount");
            return (Criteria) this;
        }

        public Criteria andCsjroyalityamountGreaterThanOrEqualTo(String value) {
            addCriterion("CSJROYALITYAMOUNT >=", value, "csjroyalityamount");
            return (Criteria) this;
        }

        public Criteria andCsjroyalityamountLessThan(String value) {
            addCriterion("CSJROYALITYAMOUNT <", value, "csjroyalityamount");
            return (Criteria) this;
        }

        public Criteria andCsjroyalityamountLessThanOrEqualTo(String value) {
            addCriterion("CSJROYALITYAMOUNT <=", value, "csjroyalityamount");
            return (Criteria) this;
        }

        public Criteria andCsjroyalityamountLike(String value) {
            addCriterion("CSJROYALITYAMOUNT like", value, "csjroyalityamount");
            return (Criteria) this;
        }

        public Criteria andCsjroyalityamountNotLike(String value) {
            addCriterion("CSJROYALITYAMOUNT not like", value, "csjroyalityamount");
            return (Criteria) this;
        }

        public Criteria andCsjroyalityamountIn(List<String> values) {
            addCriterion("CSJROYALITYAMOUNT in", values, "csjroyalityamount");
            return (Criteria) this;
        }

        public Criteria andCsjroyalityamountNotIn(List<String> values) {
            addCriterion("CSJROYALITYAMOUNT not in", values, "csjroyalityamount");
            return (Criteria) this;
        }

        public Criteria andCsjroyalityamountBetween(String value1, String value2) {
            addCriterion("CSJROYALITYAMOUNT between", value1, value2, "csjroyalityamount");
            return (Criteria) this;
        }

        public Criteria andCsjroyalityamountNotBetween(String value1, String value2) {
            addCriterion("CSJROYALITYAMOUNT not between", value1, value2, "csjroyalityamount");
            return (Criteria) this;
        }

        public Criteria andCusroyalityamountIsNull() {
            addCriterion("CUSROYALITYAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCusroyalityamountIsNotNull() {
            addCriterion("CUSROYALITYAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCusroyalityamountEqualTo(String value) {
            addCriterion("CUSROYALITYAMOUNT =", value, "cusroyalityamount");
            return (Criteria) this;
        }

        public Criteria andCusroyalityamountNotEqualTo(String value) {
            addCriterion("CUSROYALITYAMOUNT <>", value, "cusroyalityamount");
            return (Criteria) this;
        }

        public Criteria andCusroyalityamountGreaterThan(String value) {
            addCriterion("CUSROYALITYAMOUNT >", value, "cusroyalityamount");
            return (Criteria) this;
        }

        public Criteria andCusroyalityamountGreaterThanOrEqualTo(String value) {
            addCriterion("CUSROYALITYAMOUNT >=", value, "cusroyalityamount");
            return (Criteria) this;
        }

        public Criteria andCusroyalityamountLessThan(String value) {
            addCriterion("CUSROYALITYAMOUNT <", value, "cusroyalityamount");
            return (Criteria) this;
        }

        public Criteria andCusroyalityamountLessThanOrEqualTo(String value) {
            addCriterion("CUSROYALITYAMOUNT <=", value, "cusroyalityamount");
            return (Criteria) this;
        }

        public Criteria andCusroyalityamountLike(String value) {
            addCriterion("CUSROYALITYAMOUNT like", value, "cusroyalityamount");
            return (Criteria) this;
        }

        public Criteria andCusroyalityamountNotLike(String value) {
            addCriterion("CUSROYALITYAMOUNT not like", value, "cusroyalityamount");
            return (Criteria) this;
        }

        public Criteria andCusroyalityamountIn(List<String> values) {
            addCriterion("CUSROYALITYAMOUNT in", values, "cusroyalityamount");
            return (Criteria) this;
        }

        public Criteria andCusroyalityamountNotIn(List<String> values) {
            addCriterion("CUSROYALITYAMOUNT not in", values, "cusroyalityamount");
            return (Criteria) this;
        }

        public Criteria andCusroyalityamountBetween(String value1, String value2) {
            addCriterion("CUSROYALITYAMOUNT between", value1, value2, "cusroyalityamount");
            return (Criteria) this;
        }

        public Criteria andCusroyalityamountNotBetween(String value1, String value2) {
            addCriterion("CUSROYALITYAMOUNT not between", value1, value2, "cusroyalityamount");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}