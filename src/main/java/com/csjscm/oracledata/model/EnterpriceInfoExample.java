package com.csjscm.oracledata.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EnterpriceInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnterpriceInfoExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCorporationIsNull() {
            addCriterion("CORPORATION is null");
            return (Criteria) this;
        }

        public Criteria andCorporationIsNotNull() {
            addCriterion("CORPORATION is not null");
            return (Criteria) this;
        }

        public Criteria andCorporationEqualTo(String value) {
            addCriterion("CORPORATION =", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationNotEqualTo(String value) {
            addCriterion("CORPORATION <>", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationGreaterThan(String value) {
            addCriterion("CORPORATION >", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationGreaterThanOrEqualTo(String value) {
            addCriterion("CORPORATION >=", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationLessThan(String value) {
            addCriterion("CORPORATION <", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationLessThanOrEqualTo(String value) {
            addCriterion("CORPORATION <=", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationLike(String value) {
            addCriterion("CORPORATION like", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationNotLike(String value) {
            addCriterion("CORPORATION not like", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationIn(List<String> values) {
            addCriterion("CORPORATION in", values, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationNotIn(List<String> values) {
            addCriterion("CORPORATION not in", values, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationBetween(String value1, String value2) {
            addCriterion("CORPORATION between", value1, value2, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationNotBetween(String value1, String value2) {
            addCriterion("CORPORATION not between", value1, value2, "corporation");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("CREATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CREATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(String value) {
            addCriterion("CREATEDATE =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(String value) {
            addCriterion("CREATEDATE <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(String value) {
            addCriterion("CREATEDATE >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEDATE >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(String value) {
            addCriterion("CREATEDATE <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(String value) {
            addCriterion("CREATEDATE <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLike(String value) {
            addCriterion("CREATEDATE like", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotLike(String value) {
            addCriterion("CREATEDATE not like", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<String> values) {
            addCriterion("CREATEDATE in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<String> values) {
            addCriterion("CREATEDATE not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(String value1, String value2) {
            addCriterion("CREATEDATE between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(String value1, String value2) {
            addCriterion("CREATEDATE not between", value1, value2, "createdate");
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

        public Criteria andTaxnoIsNull() {
            addCriterion("TAXNO is null");
            return (Criteria) this;
        }

        public Criteria andTaxnoIsNotNull() {
            addCriterion("TAXNO is not null");
            return (Criteria) this;
        }

        public Criteria andTaxnoEqualTo(String value) {
            addCriterion("TAXNO =", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoNotEqualTo(String value) {
            addCriterion("TAXNO <>", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoGreaterThan(String value) {
            addCriterion("TAXNO >", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoGreaterThanOrEqualTo(String value) {
            addCriterion("TAXNO >=", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoLessThan(String value) {
            addCriterion("TAXNO <", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoLessThanOrEqualTo(String value) {
            addCriterion("TAXNO <=", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoLike(String value) {
            addCriterion("TAXNO like", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoNotLike(String value) {
            addCriterion("TAXNO not like", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoIn(List<String> values) {
            addCriterion("TAXNO in", values, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoNotIn(List<String> values) {
            addCriterion("TAXNO not in", values, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoBetween(String value1, String value2) {
            addCriterion("TAXNO between", value1, value2, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoNotBetween(String value1, String value2) {
            addCriterion("TAXNO not between", value1, value2, "taxno");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andCheckuserIsNull() {
            addCriterion("CHECKUSER is null");
            return (Criteria) this;
        }

        public Criteria andCheckuserIsNotNull() {
            addCriterion("CHECKUSER is not null");
            return (Criteria) this;
        }

        public Criteria andCheckuserEqualTo(String value) {
            addCriterion("CHECKUSER =", value, "checkuser");
            return (Criteria) this;
        }

        public Criteria andCheckuserNotEqualTo(String value) {
            addCriterion("CHECKUSER <>", value, "checkuser");
            return (Criteria) this;
        }

        public Criteria andCheckuserGreaterThan(String value) {
            addCriterion("CHECKUSER >", value, "checkuser");
            return (Criteria) this;
        }

        public Criteria andCheckuserGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKUSER >=", value, "checkuser");
            return (Criteria) this;
        }

        public Criteria andCheckuserLessThan(String value) {
            addCriterion("CHECKUSER <", value, "checkuser");
            return (Criteria) this;
        }

        public Criteria andCheckuserLessThanOrEqualTo(String value) {
            addCriterion("CHECKUSER <=", value, "checkuser");
            return (Criteria) this;
        }

        public Criteria andCheckuserLike(String value) {
            addCriterion("CHECKUSER like", value, "checkuser");
            return (Criteria) this;
        }

        public Criteria andCheckuserNotLike(String value) {
            addCriterion("CHECKUSER not like", value, "checkuser");
            return (Criteria) this;
        }

        public Criteria andCheckuserIn(List<String> values) {
            addCriterion("CHECKUSER in", values, "checkuser");
            return (Criteria) this;
        }

        public Criteria andCheckuserNotIn(List<String> values) {
            addCriterion("CHECKUSER not in", values, "checkuser");
            return (Criteria) this;
        }

        public Criteria andCheckuserBetween(String value1, String value2) {
            addCriterion("CHECKUSER between", value1, value2, "checkuser");
            return (Criteria) this;
        }

        public Criteria andCheckuserNotBetween(String value1, String value2) {
            addCriterion("CHECKUSER not between", value1, value2, "checkuser");
            return (Criteria) this;
        }

        public Criteria andActivationIsNull() {
            addCriterion("ACTIVATION is null");
            return (Criteria) this;
        }

        public Criteria andActivationIsNotNull() {
            addCriterion("ACTIVATION is not null");
            return (Criteria) this;
        }

        public Criteria andActivationEqualTo(String value) {
            addCriterion("ACTIVATION =", value, "activation");
            return (Criteria) this;
        }

        public Criteria andActivationNotEqualTo(String value) {
            addCriterion("ACTIVATION <>", value, "activation");
            return (Criteria) this;
        }

        public Criteria andActivationGreaterThan(String value) {
            addCriterion("ACTIVATION >", value, "activation");
            return (Criteria) this;
        }

        public Criteria andActivationGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVATION >=", value, "activation");
            return (Criteria) this;
        }

        public Criteria andActivationLessThan(String value) {
            addCriterion("ACTIVATION <", value, "activation");
            return (Criteria) this;
        }

        public Criteria andActivationLessThanOrEqualTo(String value) {
            addCriterion("ACTIVATION <=", value, "activation");
            return (Criteria) this;
        }

        public Criteria andActivationLike(String value) {
            addCriterion("ACTIVATION like", value, "activation");
            return (Criteria) this;
        }

        public Criteria andActivationNotLike(String value) {
            addCriterion("ACTIVATION not like", value, "activation");
            return (Criteria) this;
        }

        public Criteria andActivationIn(List<String> values) {
            addCriterion("ACTIVATION in", values, "activation");
            return (Criteria) this;
        }

        public Criteria andActivationNotIn(List<String> values) {
            addCriterion("ACTIVATION not in", values, "activation");
            return (Criteria) this;
        }

        public Criteria andActivationBetween(String value1, String value2) {
            addCriterion("ACTIVATION between", value1, value2, "activation");
            return (Criteria) this;
        }

        public Criteria andActivationNotBetween(String value1, String value2) {
            addCriterion("ACTIVATION not between", value1, value2, "activation");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIsNull() {
            addCriterion("CHECKSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIsNotNull() {
            addCriterion("CHECKSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCheckstatusEqualTo(String value) {
            addCriterion("CHECKSTATUS =", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotEqualTo(String value) {
            addCriterion("CHECKSTATUS <>", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusGreaterThan(String value) {
            addCriterion("CHECKSTATUS >", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKSTATUS >=", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLessThan(String value) {
            addCriterion("CHECKSTATUS <", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLessThanOrEqualTo(String value) {
            addCriterion("CHECKSTATUS <=", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLike(String value) {
            addCriterion("CHECKSTATUS like", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotLike(String value) {
            addCriterion("CHECKSTATUS not like", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIn(List<String> values) {
            addCriterion("CHECKSTATUS in", values, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotIn(List<String> values) {
            addCriterion("CHECKSTATUS not in", values, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusBetween(String value1, String value2) {
            addCriterion("CHECKSTATUS between", value1, value2, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotBetween(String value1, String value2) {
            addCriterion("CHECKSTATUS not between", value1, value2, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andOpenbankIsNull() {
            addCriterion("OPENBANK is null");
            return (Criteria) this;
        }

        public Criteria andOpenbankIsNotNull() {
            addCriterion("OPENBANK is not null");
            return (Criteria) this;
        }

        public Criteria andOpenbankEqualTo(String value) {
            addCriterion("OPENBANK =", value, "openbank");
            return (Criteria) this;
        }

        public Criteria andOpenbankNotEqualTo(String value) {
            addCriterion("OPENBANK <>", value, "openbank");
            return (Criteria) this;
        }

        public Criteria andOpenbankGreaterThan(String value) {
            addCriterion("OPENBANK >", value, "openbank");
            return (Criteria) this;
        }

        public Criteria andOpenbankGreaterThanOrEqualTo(String value) {
            addCriterion("OPENBANK >=", value, "openbank");
            return (Criteria) this;
        }

        public Criteria andOpenbankLessThan(String value) {
            addCriterion("OPENBANK <", value, "openbank");
            return (Criteria) this;
        }

        public Criteria andOpenbankLessThanOrEqualTo(String value) {
            addCriterion("OPENBANK <=", value, "openbank");
            return (Criteria) this;
        }

        public Criteria andOpenbankLike(String value) {
            addCriterion("OPENBANK like", value, "openbank");
            return (Criteria) this;
        }

        public Criteria andOpenbankNotLike(String value) {
            addCriterion("OPENBANK not like", value, "openbank");
            return (Criteria) this;
        }

        public Criteria andOpenbankIn(List<String> values) {
            addCriterion("OPENBANK in", values, "openbank");
            return (Criteria) this;
        }

        public Criteria andOpenbankNotIn(List<String> values) {
            addCriterion("OPENBANK not in", values, "openbank");
            return (Criteria) this;
        }

        public Criteria andOpenbankBetween(String value1, String value2) {
            addCriterion("OPENBANK between", value1, value2, "openbank");
            return (Criteria) this;
        }

        public Criteria andOpenbankNotBetween(String value1, String value2) {
            addCriterion("OPENBANK not between", value1, value2, "openbank");
            return (Criteria) this;
        }

        public Criteria andBankaccountIsNull() {
            addCriterion("BANKACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBankaccountIsNotNull() {
            addCriterion("BANKACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBankaccountEqualTo(String value) {
            addCriterion("BANKACCOUNT =", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotEqualTo(String value) {
            addCriterion("BANKACCOUNT <>", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountGreaterThan(String value) {
            addCriterion("BANKACCOUNT >", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountGreaterThanOrEqualTo(String value) {
            addCriterion("BANKACCOUNT >=", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountLessThan(String value) {
            addCriterion("BANKACCOUNT <", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountLessThanOrEqualTo(String value) {
            addCriterion("BANKACCOUNT <=", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountLike(String value) {
            addCriterion("BANKACCOUNT like", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotLike(String value) {
            addCriterion("BANKACCOUNT not like", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountIn(List<String> values) {
            addCriterion("BANKACCOUNT in", values, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotIn(List<String> values) {
            addCriterion("BANKACCOUNT not in", values, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountBetween(String value1, String value2) {
            addCriterion("BANKACCOUNT between", value1, value2, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotBetween(String value1, String value2) {
            addCriterion("BANKACCOUNT not between", value1, value2, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("IDCARD is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("IDCARD is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("IDCARD =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("IDCARD <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("IDCARD >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("IDCARD >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("IDCARD <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("IDCARD <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("IDCARD like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("IDCARD not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("IDCARD in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("IDCARD not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("IDCARD between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("IDCARD not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andOpeninglicenseIsNull() {
            addCriterion("OPENINGLICENSE is null");
            return (Criteria) this;
        }

        public Criteria andOpeninglicenseIsNotNull() {
            addCriterion("OPENINGLICENSE is not null");
            return (Criteria) this;
        }

        public Criteria andOpeninglicenseEqualTo(String value) {
            addCriterion("OPENINGLICENSE =", value, "openinglicense");
            return (Criteria) this;
        }

        public Criteria andOpeninglicenseNotEqualTo(String value) {
            addCriterion("OPENINGLICENSE <>", value, "openinglicense");
            return (Criteria) this;
        }

        public Criteria andOpeninglicenseGreaterThan(String value) {
            addCriterion("OPENINGLICENSE >", value, "openinglicense");
            return (Criteria) this;
        }

        public Criteria andOpeninglicenseGreaterThanOrEqualTo(String value) {
            addCriterion("OPENINGLICENSE >=", value, "openinglicense");
            return (Criteria) this;
        }

        public Criteria andOpeninglicenseLessThan(String value) {
            addCriterion("OPENINGLICENSE <", value, "openinglicense");
            return (Criteria) this;
        }

        public Criteria andOpeninglicenseLessThanOrEqualTo(String value) {
            addCriterion("OPENINGLICENSE <=", value, "openinglicense");
            return (Criteria) this;
        }

        public Criteria andOpeninglicenseLike(String value) {
            addCriterion("OPENINGLICENSE like", value, "openinglicense");
            return (Criteria) this;
        }

        public Criteria andOpeninglicenseNotLike(String value) {
            addCriterion("OPENINGLICENSE not like", value, "openinglicense");
            return (Criteria) this;
        }

        public Criteria andOpeninglicenseIn(List<String> values) {
            addCriterion("OPENINGLICENSE in", values, "openinglicense");
            return (Criteria) this;
        }

        public Criteria andOpeninglicenseNotIn(List<String> values) {
            addCriterion("OPENINGLICENSE not in", values, "openinglicense");
            return (Criteria) this;
        }

        public Criteria andOpeninglicenseBetween(String value1, String value2) {
            addCriterion("OPENINGLICENSE between", value1, value2, "openinglicense");
            return (Criteria) this;
        }

        public Criteria andOpeninglicenseNotBetween(String value1, String value2) {
            addCriterion("OPENINGLICENSE not between", value1, value2, "openinglicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIsNull() {
            addCriterion("BUSINESSLICENSE is null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIsNotNull() {
            addCriterion("BUSINESSLICENSE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseEqualTo(String value) {
            addCriterion("BUSINESSLICENSE =", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNotEqualTo(String value) {
            addCriterion("BUSINESSLICENSE <>", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseGreaterThan(String value) {
            addCriterion("BUSINESSLICENSE >", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSLICENSE >=", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseLessThan(String value) {
            addCriterion("BUSINESSLICENSE <", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSLICENSE <=", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseLike(String value) {
            addCriterion("BUSINESSLICENSE like", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNotLike(String value) {
            addCriterion("BUSINESSLICENSE not like", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIn(List<String> values) {
            addCriterion("BUSINESSLICENSE in", values, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNotIn(List<String> values) {
            addCriterion("BUSINESSLICENSE not in", values, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseBetween(String value1, String value2) {
            addCriterion("BUSINESSLICENSE between", value1, value2, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNotBetween(String value1, String value2) {
            addCriterion("BUSINESSLICENSE not between", value1, value2, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andLinkuserIsNull() {
            addCriterion("LINKUSER is null");
            return (Criteria) this;
        }

        public Criteria andLinkuserIsNotNull() {
            addCriterion("LINKUSER is not null");
            return (Criteria) this;
        }

        public Criteria andLinkuserEqualTo(String value) {
            addCriterion("LINKUSER =", value, "linkuser");
            return (Criteria) this;
        }

        public Criteria andLinkuserNotEqualTo(String value) {
            addCriterion("LINKUSER <>", value, "linkuser");
            return (Criteria) this;
        }

        public Criteria andLinkuserGreaterThan(String value) {
            addCriterion("LINKUSER >", value, "linkuser");
            return (Criteria) this;
        }

        public Criteria andLinkuserGreaterThanOrEqualTo(String value) {
            addCriterion("LINKUSER >=", value, "linkuser");
            return (Criteria) this;
        }

        public Criteria andLinkuserLessThan(String value) {
            addCriterion("LINKUSER <", value, "linkuser");
            return (Criteria) this;
        }

        public Criteria andLinkuserLessThanOrEqualTo(String value) {
            addCriterion("LINKUSER <=", value, "linkuser");
            return (Criteria) this;
        }

        public Criteria andLinkuserLike(String value) {
            addCriterion("LINKUSER like", value, "linkuser");
            return (Criteria) this;
        }

        public Criteria andLinkuserNotLike(String value) {
            addCriterion("LINKUSER not like", value, "linkuser");
            return (Criteria) this;
        }

        public Criteria andLinkuserIn(List<String> values) {
            addCriterion("LINKUSER in", values, "linkuser");
            return (Criteria) this;
        }

        public Criteria andLinkuserNotIn(List<String> values) {
            addCriterion("LINKUSER not in", values, "linkuser");
            return (Criteria) this;
        }

        public Criteria andLinkuserBetween(String value1, String value2) {
            addCriterion("LINKUSER between", value1, value2, "linkuser");
            return (Criteria) this;
        }

        public Criteria andLinkuserNotBetween(String value1, String value2) {
            addCriterion("LINKUSER not between", value1, value2, "linkuser");
            return (Criteria) this;
        }

        public Criteria andLinktelIsNull() {
            addCriterion("LINKTEL is null");
            return (Criteria) this;
        }

        public Criteria andLinktelIsNotNull() {
            addCriterion("LINKTEL is not null");
            return (Criteria) this;
        }

        public Criteria andLinktelEqualTo(String value) {
            addCriterion("LINKTEL =", value, "linktel");
            return (Criteria) this;
        }

        public Criteria andLinktelNotEqualTo(String value) {
            addCriterion("LINKTEL <>", value, "linktel");
            return (Criteria) this;
        }

        public Criteria andLinktelGreaterThan(String value) {
            addCriterion("LINKTEL >", value, "linktel");
            return (Criteria) this;
        }

        public Criteria andLinktelGreaterThanOrEqualTo(String value) {
            addCriterion("LINKTEL >=", value, "linktel");
            return (Criteria) this;
        }

        public Criteria andLinktelLessThan(String value) {
            addCriterion("LINKTEL <", value, "linktel");
            return (Criteria) this;
        }

        public Criteria andLinktelLessThanOrEqualTo(String value) {
            addCriterion("LINKTEL <=", value, "linktel");
            return (Criteria) this;
        }

        public Criteria andLinktelLike(String value) {
            addCriterion("LINKTEL like", value, "linktel");
            return (Criteria) this;
        }

        public Criteria andLinktelNotLike(String value) {
            addCriterion("LINKTEL not like", value, "linktel");
            return (Criteria) this;
        }

        public Criteria andLinktelIn(List<String> values) {
            addCriterion("LINKTEL in", values, "linktel");
            return (Criteria) this;
        }

        public Criteria andLinktelNotIn(List<String> values) {
            addCriterion("LINKTEL not in", values, "linktel");
            return (Criteria) this;
        }

        public Criteria andLinktelBetween(String value1, String value2) {
            addCriterion("LINKTEL between", value1, value2, "linktel");
            return (Criteria) this;
        }

        public Criteria andLinktelNotBetween(String value1, String value2) {
            addCriterion("LINKTEL not between", value1, value2, "linktel");
            return (Criteria) this;
        }

        public Criteria andLinkemailIsNull() {
            addCriterion("LINKEMAIL is null");
            return (Criteria) this;
        }

        public Criteria andLinkemailIsNotNull() {
            addCriterion("LINKEMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andLinkemailEqualTo(String value) {
            addCriterion("LINKEMAIL =", value, "linkemail");
            return (Criteria) this;
        }

        public Criteria andLinkemailNotEqualTo(String value) {
            addCriterion("LINKEMAIL <>", value, "linkemail");
            return (Criteria) this;
        }

        public Criteria andLinkemailGreaterThan(String value) {
            addCriterion("LINKEMAIL >", value, "linkemail");
            return (Criteria) this;
        }

        public Criteria andLinkemailGreaterThanOrEqualTo(String value) {
            addCriterion("LINKEMAIL >=", value, "linkemail");
            return (Criteria) this;
        }

        public Criteria andLinkemailLessThan(String value) {
            addCriterion("LINKEMAIL <", value, "linkemail");
            return (Criteria) this;
        }

        public Criteria andLinkemailLessThanOrEqualTo(String value) {
            addCriterion("LINKEMAIL <=", value, "linkemail");
            return (Criteria) this;
        }

        public Criteria andLinkemailLike(String value) {
            addCriterion("LINKEMAIL like", value, "linkemail");
            return (Criteria) this;
        }

        public Criteria andLinkemailNotLike(String value) {
            addCriterion("LINKEMAIL not like", value, "linkemail");
            return (Criteria) this;
        }

        public Criteria andLinkemailIn(List<String> values) {
            addCriterion("LINKEMAIL in", values, "linkemail");
            return (Criteria) this;
        }

        public Criteria andLinkemailNotIn(List<String> values) {
            addCriterion("LINKEMAIL not in", values, "linkemail");
            return (Criteria) this;
        }

        public Criteria andLinkemailBetween(String value1, String value2) {
            addCriterion("LINKEMAIL between", value1, value2, "linkemail");
            return (Criteria) this;
        }

        public Criteria andLinkemailNotBetween(String value1, String value2) {
            addCriterion("LINKEMAIL not between", value1, value2, "linkemail");
            return (Criteria) this;
        }

        public Criteria andCashpoolIsNull() {
            addCriterion("CASHPOOL is null");
            return (Criteria) this;
        }

        public Criteria andCashpoolIsNotNull() {
            addCriterion("CASHPOOL is not null");
            return (Criteria) this;
        }

        public Criteria andCashpoolEqualTo(BigDecimal value) {
            addCriterion("CASHPOOL =", value, "cashpool");
            return (Criteria) this;
        }

        public Criteria andCashpoolNotEqualTo(BigDecimal value) {
            addCriterion("CASHPOOL <>", value, "cashpool");
            return (Criteria) this;
        }

        public Criteria andCashpoolGreaterThan(BigDecimal value) {
            addCriterion("CASHPOOL >", value, "cashpool");
            return (Criteria) this;
        }

        public Criteria andCashpoolGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CASHPOOL >=", value, "cashpool");
            return (Criteria) this;
        }

        public Criteria andCashpoolLessThan(BigDecimal value) {
            addCriterion("CASHPOOL <", value, "cashpool");
            return (Criteria) this;
        }

        public Criteria andCashpoolLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CASHPOOL <=", value, "cashpool");
            return (Criteria) this;
        }

        public Criteria andCashpoolIn(List<BigDecimal> values) {
            addCriterion("CASHPOOL in", values, "cashpool");
            return (Criteria) this;
        }

        public Criteria andCashpoolNotIn(List<BigDecimal> values) {
            addCriterion("CASHPOOL not in", values, "cashpool");
            return (Criteria) this;
        }

        public Criteria andCashpoolBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASHPOOL between", value1, value2, "cashpool");
            return (Criteria) this;
        }

        public Criteria andCashpoolNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASHPOOL not between", value1, value2, "cashpool");
            return (Criteria) this;
        }

        public Criteria andOccupiedamountIsNull() {
            addCriterion("OCCUPIEDAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andOccupiedamountIsNotNull() {
            addCriterion("OCCUPIEDAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOccupiedamountEqualTo(BigDecimal value) {
            addCriterion("OCCUPIEDAMOUNT =", value, "occupiedamount");
            return (Criteria) this;
        }

        public Criteria andOccupiedamountNotEqualTo(BigDecimal value) {
            addCriterion("OCCUPIEDAMOUNT <>", value, "occupiedamount");
            return (Criteria) this;
        }

        public Criteria andOccupiedamountGreaterThan(BigDecimal value) {
            addCriterion("OCCUPIEDAMOUNT >", value, "occupiedamount");
            return (Criteria) this;
        }

        public Criteria andOccupiedamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OCCUPIEDAMOUNT >=", value, "occupiedamount");
            return (Criteria) this;
        }

        public Criteria andOccupiedamountLessThan(BigDecimal value) {
            addCriterion("OCCUPIEDAMOUNT <", value, "occupiedamount");
            return (Criteria) this;
        }

        public Criteria andOccupiedamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OCCUPIEDAMOUNT <=", value, "occupiedamount");
            return (Criteria) this;
        }

        public Criteria andOccupiedamountIn(List<BigDecimal> values) {
            addCriterion("OCCUPIEDAMOUNT in", values, "occupiedamount");
            return (Criteria) this;
        }

        public Criteria andOccupiedamountNotIn(List<BigDecimal> values) {
            addCriterion("OCCUPIEDAMOUNT not in", values, "occupiedamount");
            return (Criteria) this;
        }

        public Criteria andOccupiedamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OCCUPIEDAMOUNT between", value1, value2, "occupiedamount");
            return (Criteria) this;
        }

        public Criteria andOccupiedamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OCCUPIEDAMOUNT not between", value1, value2, "occupiedamount");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("RATE is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("RATE is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(BigDecimal value) {
            addCriterion("RATE =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(BigDecimal value) {
            addCriterion("RATE <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(BigDecimal value) {
            addCriterion("RATE >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RATE >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(BigDecimal value) {
            addCriterion("RATE <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RATE <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<BigDecimal> values) {
            addCriterion("RATE in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<BigDecimal> values) {
            addCriterion("RATE not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RATE between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RATE not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andLockpoolIsNull() {
            addCriterion("LOCKPOOL is null");
            return (Criteria) this;
        }

        public Criteria andLockpoolIsNotNull() {
            addCriterion("LOCKPOOL is not null");
            return (Criteria) this;
        }

        public Criteria andLockpoolEqualTo(BigDecimal value) {
            addCriterion("LOCKPOOL =", value, "lockpool");
            return (Criteria) this;
        }

        public Criteria andLockpoolNotEqualTo(BigDecimal value) {
            addCriterion("LOCKPOOL <>", value, "lockpool");
            return (Criteria) this;
        }

        public Criteria andLockpoolGreaterThan(BigDecimal value) {
            addCriterion("LOCKPOOL >", value, "lockpool");
            return (Criteria) this;
        }

        public Criteria andLockpoolGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOCKPOOL >=", value, "lockpool");
            return (Criteria) this;
        }

        public Criteria andLockpoolLessThan(BigDecimal value) {
            addCriterion("LOCKPOOL <", value, "lockpool");
            return (Criteria) this;
        }

        public Criteria andLockpoolLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOCKPOOL <=", value, "lockpool");
            return (Criteria) this;
        }

        public Criteria andLockpoolIn(List<BigDecimal> values) {
            addCriterion("LOCKPOOL in", values, "lockpool");
            return (Criteria) this;
        }

        public Criteria andLockpoolNotIn(List<BigDecimal> values) {
            addCriterion("LOCKPOOL not in", values, "lockpool");
            return (Criteria) this;
        }

        public Criteria andLockpoolBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOCKPOOL between", value1, value2, "lockpool");
            return (Criteria) this;
        }

        public Criteria andLockpoolNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOCKPOOL not between", value1, value2, "lockpool");
            return (Criteria) this;
        }

        public Criteria andGxmarketIsNull() {
            addCriterion("GXMARKET is null");
            return (Criteria) this;
        }

        public Criteria andGxmarketIsNotNull() {
            addCriterion("GXMARKET is not null");
            return (Criteria) this;
        }

        public Criteria andGxmarketEqualTo(String value) {
            addCriterion("GXMARKET =", value, "gxmarket");
            return (Criteria) this;
        }

        public Criteria andGxmarketNotEqualTo(String value) {
            addCriterion("GXMARKET <>", value, "gxmarket");
            return (Criteria) this;
        }

        public Criteria andGxmarketGreaterThan(String value) {
            addCriterion("GXMARKET >", value, "gxmarket");
            return (Criteria) this;
        }

        public Criteria andGxmarketGreaterThanOrEqualTo(String value) {
            addCriterion("GXMARKET >=", value, "gxmarket");
            return (Criteria) this;
        }

        public Criteria andGxmarketLessThan(String value) {
            addCriterion("GXMARKET <", value, "gxmarket");
            return (Criteria) this;
        }

        public Criteria andGxmarketLessThanOrEqualTo(String value) {
            addCriterion("GXMARKET <=", value, "gxmarket");
            return (Criteria) this;
        }

        public Criteria andGxmarketLike(String value) {
            addCriterion("GXMARKET like", value, "gxmarket");
            return (Criteria) this;
        }

        public Criteria andGxmarketNotLike(String value) {
            addCriterion("GXMARKET not like", value, "gxmarket");
            return (Criteria) this;
        }

        public Criteria andGxmarketIn(List<String> values) {
            addCriterion("GXMARKET in", values, "gxmarket");
            return (Criteria) this;
        }

        public Criteria andGxmarketNotIn(List<String> values) {
            addCriterion("GXMARKET not in", values, "gxmarket");
            return (Criteria) this;
        }

        public Criteria andGxmarketBetween(String value1, String value2) {
            addCriterion("GXMARKET between", value1, value2, "gxmarket");
            return (Criteria) this;
        }

        public Criteria andGxmarketNotBetween(String value1, String value2) {
            addCriterion("GXMARKET not between", value1, value2, "gxmarket");
            return (Criteria) this;
        }

        public Criteria andPurchaseIsNull() {
            addCriterion("PURCHASE is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseIsNotNull() {
            addCriterion("PURCHASE is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseEqualTo(Long value) {
            addCriterion("PURCHASE =", value, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseNotEqualTo(Long value) {
            addCriterion("PURCHASE <>", value, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseGreaterThan(Long value) {
            addCriterion("PURCHASE >", value, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseGreaterThanOrEqualTo(Long value) {
            addCriterion("PURCHASE >=", value, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseLessThan(Long value) {
            addCriterion("PURCHASE <", value, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseLessThanOrEqualTo(Long value) {
            addCriterion("PURCHASE <=", value, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseIn(List<Long> values) {
            addCriterion("PURCHASE in", values, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseNotIn(List<Long> values) {
            addCriterion("PURCHASE not in", values, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseBetween(Long value1, Long value2) {
            addCriterion("PURCHASE between", value1, value2, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseNotBetween(Long value1, Long value2) {
            addCriterion("PURCHASE not between", value1, value2, "purchase");
            return (Criteria) this;
        }

        public Criteria andSaleIsNull() {
            addCriterion("SALE is null");
            return (Criteria) this;
        }

        public Criteria andSaleIsNotNull() {
            addCriterion("SALE is not null");
            return (Criteria) this;
        }

        public Criteria andSaleEqualTo(Long value) {
            addCriterion("SALE =", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleNotEqualTo(Long value) {
            addCriterion("SALE <>", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleGreaterThan(Long value) {
            addCriterion("SALE >", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleGreaterThanOrEqualTo(Long value) {
            addCriterion("SALE >=", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleLessThan(Long value) {
            addCriterion("SALE <", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleLessThanOrEqualTo(Long value) {
            addCriterion("SALE <=", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleIn(List<Long> values) {
            addCriterion("SALE in", values, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleNotIn(List<Long> values) {
            addCriterion("SALE not in", values, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleBetween(Long value1, Long value2) {
            addCriterion("SALE between", value1, value2, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleNotBetween(Long value1, Long value2) {
            addCriterion("SALE not between", value1, value2, "sale");
            return (Criteria) this;
        }

        public Criteria andBiddingIsNull() {
            addCriterion("BIDDING is null");
            return (Criteria) this;
        }

        public Criteria andBiddingIsNotNull() {
            addCriterion("BIDDING is not null");
            return (Criteria) this;
        }

        public Criteria andBiddingEqualTo(Long value) {
            addCriterion("BIDDING =", value, "bidding");
            return (Criteria) this;
        }

        public Criteria andBiddingNotEqualTo(Long value) {
            addCriterion("BIDDING <>", value, "bidding");
            return (Criteria) this;
        }

        public Criteria andBiddingGreaterThan(Long value) {
            addCriterion("BIDDING >", value, "bidding");
            return (Criteria) this;
        }

        public Criteria andBiddingGreaterThanOrEqualTo(Long value) {
            addCriterion("BIDDING >=", value, "bidding");
            return (Criteria) this;
        }

        public Criteria andBiddingLessThan(Long value) {
            addCriterion("BIDDING <", value, "bidding");
            return (Criteria) this;
        }

        public Criteria andBiddingLessThanOrEqualTo(Long value) {
            addCriterion("BIDDING <=", value, "bidding");
            return (Criteria) this;
        }

        public Criteria andBiddingIn(List<Long> values) {
            addCriterion("BIDDING in", values, "bidding");
            return (Criteria) this;
        }

        public Criteria andBiddingNotIn(List<Long> values) {
            addCriterion("BIDDING not in", values, "bidding");
            return (Criteria) this;
        }

        public Criteria andBiddingBetween(Long value1, Long value2) {
            addCriterion("BIDDING between", value1, value2, "bidding");
            return (Criteria) this;
        }

        public Criteria andBiddingNotBetween(Long value1, Long value2) {
            addCriterion("BIDDING not between", value1, value2, "bidding");
            return (Criteria) this;
        }

        public Criteria andValidityIsNull() {
            addCriterion("VALIDITY is null");
            return (Criteria) this;
        }

        public Criteria andValidityIsNotNull() {
            addCriterion("VALIDITY is not null");
            return (Criteria) this;
        }

        public Criteria andValidityEqualTo(Long value) {
            addCriterion("VALIDITY =", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityNotEqualTo(Long value) {
            addCriterion("VALIDITY <>", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityGreaterThan(Long value) {
            addCriterion("VALIDITY >", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityGreaterThanOrEqualTo(Long value) {
            addCriterion("VALIDITY >=", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityLessThan(Long value) {
            addCriterion("VALIDITY <", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityLessThanOrEqualTo(Long value) {
            addCriterion("VALIDITY <=", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityIn(List<Long> values) {
            addCriterion("VALIDITY in", values, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityNotIn(List<Long> values) {
            addCriterion("VALIDITY not in", values, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityBetween(Long value1, Long value2) {
            addCriterion("VALIDITY between", value1, value2, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityNotBetween(Long value1, Long value2) {
            addCriterion("VALIDITY not between", value1, value2, "validity");
            return (Criteria) this;
        }

        public Criteria andCapitalIsNull() {
            addCriterion("CAPITAL is null");
            return (Criteria) this;
        }

        public Criteria andCapitalIsNotNull() {
            addCriterion("CAPITAL is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalEqualTo(String value) {
            addCriterion("CAPITAL =", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotEqualTo(String value) {
            addCriterion("CAPITAL <>", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalGreaterThan(String value) {
            addCriterion("CAPITAL >", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalGreaterThanOrEqualTo(String value) {
            addCriterion("CAPITAL >=", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalLessThan(String value) {
            addCriterion("CAPITAL <", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalLessThanOrEqualTo(String value) {
            addCriterion("CAPITAL <=", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalLike(String value) {
            addCriterion("CAPITAL like", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotLike(String value) {
            addCriterion("CAPITAL not like", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalIn(List<String> values) {
            addCriterion("CAPITAL in", values, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotIn(List<String> values) {
            addCriterion("CAPITAL not in", values, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalBetween(String value1, String value2) {
            addCriterion("CAPITAL between", value1, value2, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotBetween(String value1, String value2) {
            addCriterion("CAPITAL not between", value1, value2, "capital");
            return (Criteria) this;
        }

        public Criteria andAcrrateIsNull() {
            addCriterion("ACRRATE is null");
            return (Criteria) this;
        }

        public Criteria andAcrrateIsNotNull() {
            addCriterion("ACRRATE is not null");
            return (Criteria) this;
        }

        public Criteria andAcrrateEqualTo(BigDecimal value) {
            addCriterion("ACRRATE =", value, "acrrate");
            return (Criteria) this;
        }

        public Criteria andAcrrateNotEqualTo(BigDecimal value) {
            addCriterion("ACRRATE <>", value, "acrrate");
            return (Criteria) this;
        }

        public Criteria andAcrrateGreaterThan(BigDecimal value) {
            addCriterion("ACRRATE >", value, "acrrate");
            return (Criteria) this;
        }

        public Criteria andAcrrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACRRATE >=", value, "acrrate");
            return (Criteria) this;
        }

        public Criteria andAcrrateLessThan(BigDecimal value) {
            addCriterion("ACRRATE <", value, "acrrate");
            return (Criteria) this;
        }

        public Criteria andAcrrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACRRATE <=", value, "acrrate");
            return (Criteria) this;
        }

        public Criteria andAcrrateIn(List<BigDecimal> values) {
            addCriterion("ACRRATE in", values, "acrrate");
            return (Criteria) this;
        }

        public Criteria andAcrrateNotIn(List<BigDecimal> values) {
            addCriterion("ACRRATE not in", values, "acrrate");
            return (Criteria) this;
        }

        public Criteria andAcrrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACRRATE between", value1, value2, "acrrate");
            return (Criteria) this;
        }

        public Criteria andAcrrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACRRATE not between", value1, value2, "acrrate");
            return (Criteria) this;
        }

        public Criteria andBidbailamountIsNull() {
            addCriterion("BIDBAILAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBidbailamountIsNotNull() {
            addCriterion("BIDBAILAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBidbailamountEqualTo(BigDecimal value) {
            addCriterion("BIDBAILAMOUNT =", value, "bidbailamount");
            return (Criteria) this;
        }

        public Criteria andBidbailamountNotEqualTo(BigDecimal value) {
            addCriterion("BIDBAILAMOUNT <>", value, "bidbailamount");
            return (Criteria) this;
        }

        public Criteria andBidbailamountGreaterThan(BigDecimal value) {
            addCriterion("BIDBAILAMOUNT >", value, "bidbailamount");
            return (Criteria) this;
        }

        public Criteria andBidbailamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BIDBAILAMOUNT >=", value, "bidbailamount");
            return (Criteria) this;
        }

        public Criteria andBidbailamountLessThan(BigDecimal value) {
            addCriterion("BIDBAILAMOUNT <", value, "bidbailamount");
            return (Criteria) this;
        }

        public Criteria andBidbailamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BIDBAILAMOUNT <=", value, "bidbailamount");
            return (Criteria) this;
        }

        public Criteria andBidbailamountIn(List<BigDecimal> values) {
            addCriterion("BIDBAILAMOUNT in", values, "bidbailamount");
            return (Criteria) this;
        }

        public Criteria andBidbailamountNotIn(List<BigDecimal> values) {
            addCriterion("BIDBAILAMOUNT not in", values, "bidbailamount");
            return (Criteria) this;
        }

        public Criteria andBidbailamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BIDBAILAMOUNT between", value1, value2, "bidbailamount");
            return (Criteria) this;
        }

        public Criteria andBidbailamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BIDBAILAMOUNT not between", value1, value2, "bidbailamount");
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