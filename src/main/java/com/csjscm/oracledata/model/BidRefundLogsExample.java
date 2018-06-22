package com.csjscm.oracledata.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BidRefundLogsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BidRefundLogsExample() {
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

        public Criteria andNorefundIsNull() {
            addCriterion("NOREFUND is null");
            return (Criteria) this;
        }

        public Criteria andNorefundIsNotNull() {
            addCriterion("NOREFUND is not null");
            return (Criteria) this;
        }

        public Criteria andNorefundEqualTo(String value) {
            addCriterion("NOREFUND =", value, "norefund");
            return (Criteria) this;
        }

        public Criteria andNorefundNotEqualTo(String value) {
            addCriterion("NOREFUND <>", value, "norefund");
            return (Criteria) this;
        }

        public Criteria andNorefundGreaterThan(String value) {
            addCriterion("NOREFUND >", value, "norefund");
            return (Criteria) this;
        }

        public Criteria andNorefundGreaterThanOrEqualTo(String value) {
            addCriterion("NOREFUND >=", value, "norefund");
            return (Criteria) this;
        }

        public Criteria andNorefundLessThan(String value) {
            addCriterion("NOREFUND <", value, "norefund");
            return (Criteria) this;
        }

        public Criteria andNorefundLessThanOrEqualTo(String value) {
            addCriterion("NOREFUND <=", value, "norefund");
            return (Criteria) this;
        }

        public Criteria andNorefundLike(String value) {
            addCriterion("NOREFUND like", value, "norefund");
            return (Criteria) this;
        }

        public Criteria andNorefundNotLike(String value) {
            addCriterion("NOREFUND not like", value, "norefund");
            return (Criteria) this;
        }

        public Criteria andNorefundIn(List<String> values) {
            addCriterion("NOREFUND in", values, "norefund");
            return (Criteria) this;
        }

        public Criteria andNorefundNotIn(List<String> values) {
            addCriterion("NOREFUND not in", values, "norefund");
            return (Criteria) this;
        }

        public Criteria andNorefundBetween(String value1, String value2) {
            addCriterion("NOREFUND between", value1, value2, "norefund");
            return (Criteria) this;
        }

        public Criteria andNorefundNotBetween(String value1, String value2) {
            addCriterion("NOREFUND not between", value1, value2, "norefund");
            return (Criteria) this;
        }

        public Criteria andRefunddateIsNull() {
            addCriterion("REFUNDDATE is null");
            return (Criteria) this;
        }

        public Criteria andRefunddateIsNotNull() {
            addCriterion("REFUNDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andRefunddateEqualTo(String value) {
            addCriterion("REFUNDDATE =", value, "refunddate");
            return (Criteria) this;
        }

        public Criteria andRefunddateNotEqualTo(String value) {
            addCriterion("REFUNDDATE <>", value, "refunddate");
            return (Criteria) this;
        }

        public Criteria andRefunddateGreaterThan(String value) {
            addCriterion("REFUNDDATE >", value, "refunddate");
            return (Criteria) this;
        }

        public Criteria andRefunddateGreaterThanOrEqualTo(String value) {
            addCriterion("REFUNDDATE >=", value, "refunddate");
            return (Criteria) this;
        }

        public Criteria andRefunddateLessThan(String value) {
            addCriterion("REFUNDDATE <", value, "refunddate");
            return (Criteria) this;
        }

        public Criteria andRefunddateLessThanOrEqualTo(String value) {
            addCriterion("REFUNDDATE <=", value, "refunddate");
            return (Criteria) this;
        }

        public Criteria andRefunddateLike(String value) {
            addCriterion("REFUNDDATE like", value, "refunddate");
            return (Criteria) this;
        }

        public Criteria andRefunddateNotLike(String value) {
            addCriterion("REFUNDDATE not like", value, "refunddate");
            return (Criteria) this;
        }

        public Criteria andRefunddateIn(List<String> values) {
            addCriterion("REFUNDDATE in", values, "refunddate");
            return (Criteria) this;
        }

        public Criteria andRefunddateNotIn(List<String> values) {
            addCriterion("REFUNDDATE not in", values, "refunddate");
            return (Criteria) this;
        }

        public Criteria andRefunddateBetween(String value1, String value2) {
            addCriterion("REFUNDDATE between", value1, value2, "refunddate");
            return (Criteria) this;
        }

        public Criteria andRefunddateNotBetween(String value1, String value2) {
            addCriterion("REFUNDDATE not between", value1, value2, "refunddate");
            return (Criteria) this;
        }

        public Criteria andRefundtimeIsNull() {
            addCriterion("REFUNDTIME is null");
            return (Criteria) this;
        }

        public Criteria andRefundtimeIsNotNull() {
            addCriterion("REFUNDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andRefundtimeEqualTo(String value) {
            addCriterion("REFUNDTIME =", value, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeNotEqualTo(String value) {
            addCriterion("REFUNDTIME <>", value, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeGreaterThan(String value) {
            addCriterion("REFUNDTIME >", value, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeGreaterThanOrEqualTo(String value) {
            addCriterion("REFUNDTIME >=", value, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeLessThan(String value) {
            addCriterion("REFUNDTIME <", value, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeLessThanOrEqualTo(String value) {
            addCriterion("REFUNDTIME <=", value, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeLike(String value) {
            addCriterion("REFUNDTIME like", value, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeNotLike(String value) {
            addCriterion("REFUNDTIME not like", value, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeIn(List<String> values) {
            addCriterion("REFUNDTIME in", values, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeNotIn(List<String> values) {
            addCriterion("REFUNDTIME not in", values, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeBetween(String value1, String value2) {
            addCriterion("REFUNDTIME between", value1, value2, "refundtime");
            return (Criteria) this;
        }

        public Criteria andRefundtimeNotBetween(String value1, String value2) {
            addCriterion("REFUNDTIME not between", value1, value2, "refundtime");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNull() {
            addCriterion("ORDERNO is null");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNotNull() {
            addCriterion("ORDERNO is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernoEqualTo(String value) {
            addCriterion("ORDERNO =", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotEqualTo(String value) {
            addCriterion("ORDERNO <>", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThan(String value) {
            addCriterion("ORDERNO >", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERNO >=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThan(String value) {
            addCriterion("ORDERNO <", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThanOrEqualTo(String value) {
            addCriterion("ORDERNO <=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLike(String value) {
            addCriterion("ORDERNO like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotLike(String value) {
            addCriterion("ORDERNO not like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoIn(List<String> values) {
            addCriterion("ORDERNO in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotIn(List<String> values) {
            addCriterion("ORDERNO not in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoBetween(String value1, String value2) {
            addCriterion("ORDERNO between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotBetween(String value1, String value2) {
            addCriterion("ORDERNO not between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrderdtIsNull() {
            addCriterion("ORDERDT is null");
            return (Criteria) this;
        }

        public Criteria andOrderdtIsNotNull() {
            addCriterion("ORDERDT is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdtEqualTo(String value) {
            addCriterion("ORDERDT =", value, "orderdt");
            return (Criteria) this;
        }

        public Criteria andOrderdtNotEqualTo(String value) {
            addCriterion("ORDERDT <>", value, "orderdt");
            return (Criteria) this;
        }

        public Criteria andOrderdtGreaterThan(String value) {
            addCriterion("ORDERDT >", value, "orderdt");
            return (Criteria) this;
        }

        public Criteria andOrderdtGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERDT >=", value, "orderdt");
            return (Criteria) this;
        }

        public Criteria andOrderdtLessThan(String value) {
            addCriterion("ORDERDT <", value, "orderdt");
            return (Criteria) this;
        }

        public Criteria andOrderdtLessThanOrEqualTo(String value) {
            addCriterion("ORDERDT <=", value, "orderdt");
            return (Criteria) this;
        }

        public Criteria andOrderdtLike(String value) {
            addCriterion("ORDERDT like", value, "orderdt");
            return (Criteria) this;
        }

        public Criteria andOrderdtNotLike(String value) {
            addCriterion("ORDERDT not like", value, "orderdt");
            return (Criteria) this;
        }

        public Criteria andOrderdtIn(List<String> values) {
            addCriterion("ORDERDT in", values, "orderdt");
            return (Criteria) this;
        }

        public Criteria andOrderdtNotIn(List<String> values) {
            addCriterion("ORDERDT not in", values, "orderdt");
            return (Criteria) this;
        }

        public Criteria andOrderdtBetween(String value1, String value2) {
            addCriterion("ORDERDT between", value1, value2, "orderdt");
            return (Criteria) this;
        }

        public Criteria andOrderdtNotBetween(String value1, String value2) {
            addCriterion("ORDERDT not between", value1, value2, "orderdt");
            return (Criteria) this;
        }

        public Criteria andRefundmoneyIsNull() {
            addCriterion("REFUNDMONEY is null");
            return (Criteria) this;
        }

        public Criteria andRefundmoneyIsNotNull() {
            addCriterion("REFUNDMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andRefundmoneyEqualTo(BigDecimal value) {
            addCriterion("REFUNDMONEY =", value, "refundmoney");
            return (Criteria) this;
        }

        public Criteria andRefundmoneyNotEqualTo(BigDecimal value) {
            addCriterion("REFUNDMONEY <>", value, "refundmoney");
            return (Criteria) this;
        }

        public Criteria andRefundmoneyGreaterThan(BigDecimal value) {
            addCriterion("REFUNDMONEY >", value, "refundmoney");
            return (Criteria) this;
        }

        public Criteria andRefundmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REFUNDMONEY >=", value, "refundmoney");
            return (Criteria) this;
        }

        public Criteria andRefundmoneyLessThan(BigDecimal value) {
            addCriterion("REFUNDMONEY <", value, "refundmoney");
            return (Criteria) this;
        }

        public Criteria andRefundmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REFUNDMONEY <=", value, "refundmoney");
            return (Criteria) this;
        }

        public Criteria andRefundmoneyIn(List<BigDecimal> values) {
            addCriterion("REFUNDMONEY in", values, "refundmoney");
            return (Criteria) this;
        }

        public Criteria andRefundmoneyNotIn(List<BigDecimal> values) {
            addCriterion("REFUNDMONEY not in", values, "refundmoney");
            return (Criteria) this;
        }

        public Criteria andRefundmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REFUNDMONEY between", value1, value2, "refundmoney");
            return (Criteria) this;
        }

        public Criteria andRefundmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REFUNDMONEY not between", value1, value2, "refundmoney");
            return (Criteria) this;
        }

        public Criteria andInaccountIsNull() {
            addCriterion("INACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andInaccountIsNotNull() {
            addCriterion("INACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andInaccountEqualTo(String value) {
            addCriterion("INACCOUNT =", value, "inaccount");
            return (Criteria) this;
        }

        public Criteria andInaccountNotEqualTo(String value) {
            addCriterion("INACCOUNT <>", value, "inaccount");
            return (Criteria) this;
        }

        public Criteria andInaccountGreaterThan(String value) {
            addCriterion("INACCOUNT >", value, "inaccount");
            return (Criteria) this;
        }

        public Criteria andInaccountGreaterThanOrEqualTo(String value) {
            addCriterion("INACCOUNT >=", value, "inaccount");
            return (Criteria) this;
        }

        public Criteria andInaccountLessThan(String value) {
            addCriterion("INACCOUNT <", value, "inaccount");
            return (Criteria) this;
        }

        public Criteria andInaccountLessThanOrEqualTo(String value) {
            addCriterion("INACCOUNT <=", value, "inaccount");
            return (Criteria) this;
        }

        public Criteria andInaccountLike(String value) {
            addCriterion("INACCOUNT like", value, "inaccount");
            return (Criteria) this;
        }

        public Criteria andInaccountNotLike(String value) {
            addCriterion("INACCOUNT not like", value, "inaccount");
            return (Criteria) this;
        }

        public Criteria andInaccountIn(List<String> values) {
            addCriterion("INACCOUNT in", values, "inaccount");
            return (Criteria) this;
        }

        public Criteria andInaccountNotIn(List<String> values) {
            addCriterion("INACCOUNT not in", values, "inaccount");
            return (Criteria) this;
        }

        public Criteria andInaccountBetween(String value1, String value2) {
            addCriterion("INACCOUNT between", value1, value2, "inaccount");
            return (Criteria) this;
        }

        public Criteria andInaccountNotBetween(String value1, String value2) {
            addCriterion("INACCOUNT not between", value1, value2, "inaccount");
            return (Criteria) this;
        }

        public Criteria andOutaccountIsNull() {
            addCriterion("OUTACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andOutaccountIsNotNull() {
            addCriterion("OUTACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOutaccountEqualTo(String value) {
            addCriterion("OUTACCOUNT =", value, "outaccount");
            return (Criteria) this;
        }

        public Criteria andOutaccountNotEqualTo(String value) {
            addCriterion("OUTACCOUNT <>", value, "outaccount");
            return (Criteria) this;
        }

        public Criteria andOutaccountGreaterThan(String value) {
            addCriterion("OUTACCOUNT >", value, "outaccount");
            return (Criteria) this;
        }

        public Criteria andOutaccountGreaterThanOrEqualTo(String value) {
            addCriterion("OUTACCOUNT >=", value, "outaccount");
            return (Criteria) this;
        }

        public Criteria andOutaccountLessThan(String value) {
            addCriterion("OUTACCOUNT <", value, "outaccount");
            return (Criteria) this;
        }

        public Criteria andOutaccountLessThanOrEqualTo(String value) {
            addCriterion("OUTACCOUNT <=", value, "outaccount");
            return (Criteria) this;
        }

        public Criteria andOutaccountLike(String value) {
            addCriterion("OUTACCOUNT like", value, "outaccount");
            return (Criteria) this;
        }

        public Criteria andOutaccountNotLike(String value) {
            addCriterion("OUTACCOUNT not like", value, "outaccount");
            return (Criteria) this;
        }

        public Criteria andOutaccountIn(List<String> values) {
            addCriterion("OUTACCOUNT in", values, "outaccount");
            return (Criteria) this;
        }

        public Criteria andOutaccountNotIn(List<String> values) {
            addCriterion("OUTACCOUNT not in", values, "outaccount");
            return (Criteria) this;
        }

        public Criteria andOutaccountBetween(String value1, String value2) {
            addCriterion("OUTACCOUNT between", value1, value2, "outaccount");
            return (Criteria) this;
        }

        public Criteria andOutaccountNotBetween(String value1, String value2) {
            addCriterion("OUTACCOUNT not between", value1, value2, "outaccount");
            return (Criteria) this;
        }

        public Criteria andRefundstatusIsNull() {
            addCriterion("REFUNDSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andRefundstatusIsNotNull() {
            addCriterion("REFUNDSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andRefundstatusEqualTo(String value) {
            addCriterion("REFUNDSTATUS =", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusNotEqualTo(String value) {
            addCriterion("REFUNDSTATUS <>", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusGreaterThan(String value) {
            addCriterion("REFUNDSTATUS >", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusGreaterThanOrEqualTo(String value) {
            addCriterion("REFUNDSTATUS >=", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusLessThan(String value) {
            addCriterion("REFUNDSTATUS <", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusLessThanOrEqualTo(String value) {
            addCriterion("REFUNDSTATUS <=", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusLike(String value) {
            addCriterion("REFUNDSTATUS like", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusNotLike(String value) {
            addCriterion("REFUNDSTATUS not like", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusIn(List<String> values) {
            addCriterion("REFUNDSTATUS in", values, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusNotIn(List<String> values) {
            addCriterion("REFUNDSTATUS not in", values, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusBetween(String value1, String value2) {
            addCriterion("REFUNDSTATUS between", value1, value2, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusNotBetween(String value1, String value2) {
            addCriterion("REFUNDSTATUS not between", value1, value2, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andActualdateIsNull() {
            addCriterion("ACTUALDATE is null");
            return (Criteria) this;
        }

        public Criteria andActualdateIsNotNull() {
            addCriterion("ACTUALDATE is not null");
            return (Criteria) this;
        }

        public Criteria andActualdateEqualTo(String value) {
            addCriterion("ACTUALDATE =", value, "actualdate");
            return (Criteria) this;
        }

        public Criteria andActualdateNotEqualTo(String value) {
            addCriterion("ACTUALDATE <>", value, "actualdate");
            return (Criteria) this;
        }

        public Criteria andActualdateGreaterThan(String value) {
            addCriterion("ACTUALDATE >", value, "actualdate");
            return (Criteria) this;
        }

        public Criteria andActualdateGreaterThanOrEqualTo(String value) {
            addCriterion("ACTUALDATE >=", value, "actualdate");
            return (Criteria) this;
        }

        public Criteria andActualdateLessThan(String value) {
            addCriterion("ACTUALDATE <", value, "actualdate");
            return (Criteria) this;
        }

        public Criteria andActualdateLessThanOrEqualTo(String value) {
            addCriterion("ACTUALDATE <=", value, "actualdate");
            return (Criteria) this;
        }

        public Criteria andActualdateLike(String value) {
            addCriterion("ACTUALDATE like", value, "actualdate");
            return (Criteria) this;
        }

        public Criteria andActualdateNotLike(String value) {
            addCriterion("ACTUALDATE not like", value, "actualdate");
            return (Criteria) this;
        }

        public Criteria andActualdateIn(List<String> values) {
            addCriterion("ACTUALDATE in", values, "actualdate");
            return (Criteria) this;
        }

        public Criteria andActualdateNotIn(List<String> values) {
            addCriterion("ACTUALDATE not in", values, "actualdate");
            return (Criteria) this;
        }

        public Criteria andActualdateBetween(String value1, String value2) {
            addCriterion("ACTUALDATE between", value1, value2, "actualdate");
            return (Criteria) this;
        }

        public Criteria andActualdateNotBetween(String value1, String value2) {
            addCriterion("ACTUALDATE not between", value1, value2, "actualdate");
            return (Criteria) this;
        }

        public Criteria andActualtimeIsNull() {
            addCriterion("ACTUALTIME is null");
            return (Criteria) this;
        }

        public Criteria andActualtimeIsNotNull() {
            addCriterion("ACTUALTIME is not null");
            return (Criteria) this;
        }

        public Criteria andActualtimeEqualTo(String value) {
            addCriterion("ACTUALTIME =", value, "actualtime");
            return (Criteria) this;
        }

        public Criteria andActualtimeNotEqualTo(String value) {
            addCriterion("ACTUALTIME <>", value, "actualtime");
            return (Criteria) this;
        }

        public Criteria andActualtimeGreaterThan(String value) {
            addCriterion("ACTUALTIME >", value, "actualtime");
            return (Criteria) this;
        }

        public Criteria andActualtimeGreaterThanOrEqualTo(String value) {
            addCriterion("ACTUALTIME >=", value, "actualtime");
            return (Criteria) this;
        }

        public Criteria andActualtimeLessThan(String value) {
            addCriterion("ACTUALTIME <", value, "actualtime");
            return (Criteria) this;
        }

        public Criteria andActualtimeLessThanOrEqualTo(String value) {
            addCriterion("ACTUALTIME <=", value, "actualtime");
            return (Criteria) this;
        }

        public Criteria andActualtimeLike(String value) {
            addCriterion("ACTUALTIME like", value, "actualtime");
            return (Criteria) this;
        }

        public Criteria andActualtimeNotLike(String value) {
            addCriterion("ACTUALTIME not like", value, "actualtime");
            return (Criteria) this;
        }

        public Criteria andActualtimeIn(List<String> values) {
            addCriterion("ACTUALTIME in", values, "actualtime");
            return (Criteria) this;
        }

        public Criteria andActualtimeNotIn(List<String> values) {
            addCriterion("ACTUALTIME not in", values, "actualtime");
            return (Criteria) this;
        }

        public Criteria andActualtimeBetween(String value1, String value2) {
            addCriterion("ACTUALTIME between", value1, value2, "actualtime");
            return (Criteria) this;
        }

        public Criteria andActualtimeNotBetween(String value1, String value2) {
            addCriterion("ACTUALTIME not between", value1, value2, "actualtime");
            return (Criteria) this;
        }

        public Criteria andRefundchanelIsNull() {
            addCriterion("REFUNDCHANEL is null");
            return (Criteria) this;
        }

        public Criteria andRefundchanelIsNotNull() {
            addCriterion("REFUNDCHANEL is not null");
            return (Criteria) this;
        }

        public Criteria andRefundchanelEqualTo(String value) {
            addCriterion("REFUNDCHANEL =", value, "refundchanel");
            return (Criteria) this;
        }

        public Criteria andRefundchanelNotEqualTo(String value) {
            addCriterion("REFUNDCHANEL <>", value, "refundchanel");
            return (Criteria) this;
        }

        public Criteria andRefundchanelGreaterThan(String value) {
            addCriterion("REFUNDCHANEL >", value, "refundchanel");
            return (Criteria) this;
        }

        public Criteria andRefundchanelGreaterThanOrEqualTo(String value) {
            addCriterion("REFUNDCHANEL >=", value, "refundchanel");
            return (Criteria) this;
        }

        public Criteria andRefundchanelLessThan(String value) {
            addCriterion("REFUNDCHANEL <", value, "refundchanel");
            return (Criteria) this;
        }

        public Criteria andRefundchanelLessThanOrEqualTo(String value) {
            addCriterion("REFUNDCHANEL <=", value, "refundchanel");
            return (Criteria) this;
        }

        public Criteria andRefundchanelLike(String value) {
            addCriterion("REFUNDCHANEL like", value, "refundchanel");
            return (Criteria) this;
        }

        public Criteria andRefundchanelNotLike(String value) {
            addCriterion("REFUNDCHANEL not like", value, "refundchanel");
            return (Criteria) this;
        }

        public Criteria andRefundchanelIn(List<String> values) {
            addCriterion("REFUNDCHANEL in", values, "refundchanel");
            return (Criteria) this;
        }

        public Criteria andRefundchanelNotIn(List<String> values) {
            addCriterion("REFUNDCHANEL not in", values, "refundchanel");
            return (Criteria) this;
        }

        public Criteria andRefundchanelBetween(String value1, String value2) {
            addCriterion("REFUNDCHANEL between", value1, value2, "refundchanel");
            return (Criteria) this;
        }

        public Criteria andRefundchanelNotBetween(String value1, String value2) {
            addCriterion("REFUNDCHANEL not between", value1, value2, "refundchanel");
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