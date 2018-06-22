package com.csjscm.oracledata.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockExample() {
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

        public Criteria andMaterialIsNull() {
            addCriterion("MATERIAL is null");
            return (Criteria) this;
        }

        public Criteria andMaterialIsNotNull() {
            addCriterion("MATERIAL is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialEqualTo(String value) {
            addCriterion("MATERIAL =", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotEqualTo(String value) {
            addCriterion("MATERIAL <>", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThan(String value) {
            addCriterion("MATERIAL >", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIAL >=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThan(String value) {
            addCriterion("MATERIAL <", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThanOrEqualTo(String value) {
            addCriterion("MATERIAL <=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLike(String value) {
            addCriterion("MATERIAL like", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotLike(String value) {
            addCriterion("MATERIAL not like", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialIn(List<String> values) {
            addCriterion("MATERIAL in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotIn(List<String> values) {
            addCriterion("MATERIAL not in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialBetween(String value1, String value2) {
            addCriterion("MATERIAL between", value1, value2, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotBetween(String value1, String value2) {
            addCriterion("MATERIAL not between", value1, value2, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialnoIsNull() {
            addCriterion("MATERIALNO is null");
            return (Criteria) this;
        }

        public Criteria andMaterialnoIsNotNull() {
            addCriterion("MATERIALNO is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialnoEqualTo(String value) {
            addCriterion("MATERIALNO =", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoNotEqualTo(String value) {
            addCriterion("MATERIALNO <>", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoGreaterThan(String value) {
            addCriterion("MATERIALNO >", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIALNO >=", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoLessThan(String value) {
            addCriterion("MATERIALNO <", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoLessThanOrEqualTo(String value) {
            addCriterion("MATERIALNO <=", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoLike(String value) {
            addCriterion("MATERIALNO like", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoNotLike(String value) {
            addCriterion("MATERIALNO not like", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoIn(List<String> values) {
            addCriterion("MATERIALNO in", values, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoNotIn(List<String> values) {
            addCriterion("MATERIALNO not in", values, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoBetween(String value1, String value2) {
            addCriterion("MATERIALNO between", value1, value2, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoNotBetween(String value1, String value2) {
            addCriterion("MATERIALNO not between", value1, value2, "materialno");
            return (Criteria) this;
        }

        public Criteria andCustommaterialnoIsNull() {
            addCriterion("CUSTOMMATERIALNO is null");
            return (Criteria) this;
        }

        public Criteria andCustommaterialnoIsNotNull() {
            addCriterion("CUSTOMMATERIALNO is not null");
            return (Criteria) this;
        }

        public Criteria andCustommaterialnoEqualTo(String value) {
            addCriterion("CUSTOMMATERIALNO =", value, "custommaterialno");
            return (Criteria) this;
        }

        public Criteria andCustommaterialnoNotEqualTo(String value) {
            addCriterion("CUSTOMMATERIALNO <>", value, "custommaterialno");
            return (Criteria) this;
        }

        public Criteria andCustommaterialnoGreaterThan(String value) {
            addCriterion("CUSTOMMATERIALNO >", value, "custommaterialno");
            return (Criteria) this;
        }

        public Criteria andCustommaterialnoGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMMATERIALNO >=", value, "custommaterialno");
            return (Criteria) this;
        }

        public Criteria andCustommaterialnoLessThan(String value) {
            addCriterion("CUSTOMMATERIALNO <", value, "custommaterialno");
            return (Criteria) this;
        }

        public Criteria andCustommaterialnoLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMMATERIALNO <=", value, "custommaterialno");
            return (Criteria) this;
        }

        public Criteria andCustommaterialnoLike(String value) {
            addCriterion("CUSTOMMATERIALNO like", value, "custommaterialno");
            return (Criteria) this;
        }

        public Criteria andCustommaterialnoNotLike(String value) {
            addCriterion("CUSTOMMATERIALNO not like", value, "custommaterialno");
            return (Criteria) this;
        }

        public Criteria andCustommaterialnoIn(List<String> values) {
            addCriterion("CUSTOMMATERIALNO in", values, "custommaterialno");
            return (Criteria) this;
        }

        public Criteria andCustommaterialnoNotIn(List<String> values) {
            addCriterion("CUSTOMMATERIALNO not in", values, "custommaterialno");
            return (Criteria) this;
        }

        public Criteria andCustommaterialnoBetween(String value1, String value2) {
            addCriterion("CUSTOMMATERIALNO between", value1, value2, "custommaterialno");
            return (Criteria) this;
        }

        public Criteria andCustommaterialnoNotBetween(String value1, String value2) {
            addCriterion("CUSTOMMATERIALNO not between", value1, value2, "custommaterialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnameIsNull() {
            addCriterion("MATERIALNAME is null");
            return (Criteria) this;
        }

        public Criteria andMaterialnameIsNotNull() {
            addCriterion("MATERIALNAME is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialnameEqualTo(String value) {
            addCriterion("MATERIALNAME =", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotEqualTo(String value) {
            addCriterion("MATERIALNAME <>", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameGreaterThan(String value) {
            addCriterion("MATERIALNAME >", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIALNAME >=", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameLessThan(String value) {
            addCriterion("MATERIALNAME <", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameLessThanOrEqualTo(String value) {
            addCriterion("MATERIALNAME <=", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameLike(String value) {
            addCriterion("MATERIALNAME like", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotLike(String value) {
            addCriterion("MATERIALNAME not like", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameIn(List<String> values) {
            addCriterion("MATERIALNAME in", values, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotIn(List<String> values) {
            addCriterion("MATERIALNAME not in", values, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameBetween(String value1, String value2) {
            addCriterion("MATERIALNAME between", value1, value2, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotBetween(String value1, String value2) {
            addCriterion("MATERIALNAME not between", value1, value2, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialruleIsNull() {
            addCriterion("MATERIALRULE is null");
            return (Criteria) this;
        }

        public Criteria andMaterialruleIsNotNull() {
            addCriterion("MATERIALRULE is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialruleEqualTo(String value) {
            addCriterion("MATERIALRULE =", value, "materialrule");
            return (Criteria) this;
        }

        public Criteria andMaterialruleNotEqualTo(String value) {
            addCriterion("MATERIALRULE <>", value, "materialrule");
            return (Criteria) this;
        }

        public Criteria andMaterialruleGreaterThan(String value) {
            addCriterion("MATERIALRULE >", value, "materialrule");
            return (Criteria) this;
        }

        public Criteria andMaterialruleGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIALRULE >=", value, "materialrule");
            return (Criteria) this;
        }

        public Criteria andMaterialruleLessThan(String value) {
            addCriterion("MATERIALRULE <", value, "materialrule");
            return (Criteria) this;
        }

        public Criteria andMaterialruleLessThanOrEqualTo(String value) {
            addCriterion("MATERIALRULE <=", value, "materialrule");
            return (Criteria) this;
        }

        public Criteria andMaterialruleLike(String value) {
            addCriterion("MATERIALRULE like", value, "materialrule");
            return (Criteria) this;
        }

        public Criteria andMaterialruleNotLike(String value) {
            addCriterion("MATERIALRULE not like", value, "materialrule");
            return (Criteria) this;
        }

        public Criteria andMaterialruleIn(List<String> values) {
            addCriterion("MATERIALRULE in", values, "materialrule");
            return (Criteria) this;
        }

        public Criteria andMaterialruleNotIn(List<String> values) {
            addCriterion("MATERIALRULE not in", values, "materialrule");
            return (Criteria) this;
        }

        public Criteria andMaterialruleBetween(String value1, String value2) {
            addCriterion("MATERIALRULE between", value1, value2, "materialrule");
            return (Criteria) this;
        }

        public Criteria andMaterialruleNotBetween(String value1, String value2) {
            addCriterion("MATERIALRULE not between", value1, value2, "materialrule");
            return (Criteria) this;
        }

        public Criteria andMaterialsizeIsNull() {
            addCriterion("MATERIALSIZE is null");
            return (Criteria) this;
        }

        public Criteria andMaterialsizeIsNotNull() {
            addCriterion("MATERIALSIZE is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialsizeEqualTo(String value) {
            addCriterion("MATERIALSIZE =", value, "materialsize");
            return (Criteria) this;
        }

        public Criteria andMaterialsizeNotEqualTo(String value) {
            addCriterion("MATERIALSIZE <>", value, "materialsize");
            return (Criteria) this;
        }

        public Criteria andMaterialsizeGreaterThan(String value) {
            addCriterion("MATERIALSIZE >", value, "materialsize");
            return (Criteria) this;
        }

        public Criteria andMaterialsizeGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIALSIZE >=", value, "materialsize");
            return (Criteria) this;
        }

        public Criteria andMaterialsizeLessThan(String value) {
            addCriterion("MATERIALSIZE <", value, "materialsize");
            return (Criteria) this;
        }

        public Criteria andMaterialsizeLessThanOrEqualTo(String value) {
            addCriterion("MATERIALSIZE <=", value, "materialsize");
            return (Criteria) this;
        }

        public Criteria andMaterialsizeLike(String value) {
            addCriterion("MATERIALSIZE like", value, "materialsize");
            return (Criteria) this;
        }

        public Criteria andMaterialsizeNotLike(String value) {
            addCriterion("MATERIALSIZE not like", value, "materialsize");
            return (Criteria) this;
        }

        public Criteria andMaterialsizeIn(List<String> values) {
            addCriterion("MATERIALSIZE in", values, "materialsize");
            return (Criteria) this;
        }

        public Criteria andMaterialsizeNotIn(List<String> values) {
            addCriterion("MATERIALSIZE not in", values, "materialsize");
            return (Criteria) this;
        }

        public Criteria andMaterialsizeBetween(String value1, String value2) {
            addCriterion("MATERIALSIZE between", value1, value2, "materialsize");
            return (Criteria) this;
        }

        public Criteria andMaterialsizeNotBetween(String value1, String value2) {
            addCriterion("MATERIALSIZE not between", value1, value2, "materialsize");
            return (Criteria) this;
        }

        public Criteria andMaterialtagIsNull() {
            addCriterion("MATERIALTAG is null");
            return (Criteria) this;
        }

        public Criteria andMaterialtagIsNotNull() {
            addCriterion("MATERIALTAG is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialtagEqualTo(String value) {
            addCriterion("MATERIALTAG =", value, "materialtag");
            return (Criteria) this;
        }

        public Criteria andMaterialtagNotEqualTo(String value) {
            addCriterion("MATERIALTAG <>", value, "materialtag");
            return (Criteria) this;
        }

        public Criteria andMaterialtagGreaterThan(String value) {
            addCriterion("MATERIALTAG >", value, "materialtag");
            return (Criteria) this;
        }

        public Criteria andMaterialtagGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIALTAG >=", value, "materialtag");
            return (Criteria) this;
        }

        public Criteria andMaterialtagLessThan(String value) {
            addCriterion("MATERIALTAG <", value, "materialtag");
            return (Criteria) this;
        }

        public Criteria andMaterialtagLessThanOrEqualTo(String value) {
            addCriterion("MATERIALTAG <=", value, "materialtag");
            return (Criteria) this;
        }

        public Criteria andMaterialtagLike(String value) {
            addCriterion("MATERIALTAG like", value, "materialtag");
            return (Criteria) this;
        }

        public Criteria andMaterialtagNotLike(String value) {
            addCriterion("MATERIALTAG not like", value, "materialtag");
            return (Criteria) this;
        }

        public Criteria andMaterialtagIn(List<String> values) {
            addCriterion("MATERIALTAG in", values, "materialtag");
            return (Criteria) this;
        }

        public Criteria andMaterialtagNotIn(List<String> values) {
            addCriterion("MATERIALTAG not in", values, "materialtag");
            return (Criteria) this;
        }

        public Criteria andMaterialtagBetween(String value1, String value2) {
            addCriterion("MATERIALTAG between", value1, value2, "materialtag");
            return (Criteria) this;
        }

        public Criteria andMaterialtagNotBetween(String value1, String value2) {
            addCriterion("MATERIALTAG not between", value1, value2, "materialtag");
            return (Criteria) this;
        }

        public Criteria andMaterialnumIsNull() {
            addCriterion("MATERIALNUM is null");
            return (Criteria) this;
        }

        public Criteria andMaterialnumIsNotNull() {
            addCriterion("MATERIALNUM is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialnumEqualTo(BigDecimal value) {
            addCriterion("MATERIALNUM =", value, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumNotEqualTo(BigDecimal value) {
            addCriterion("MATERIALNUM <>", value, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumGreaterThan(BigDecimal value) {
            addCriterion("MATERIALNUM >", value, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MATERIALNUM >=", value, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumLessThan(BigDecimal value) {
            addCriterion("MATERIALNUM <", value, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MATERIALNUM <=", value, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumIn(List<BigDecimal> values) {
            addCriterion("MATERIALNUM in", values, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumNotIn(List<BigDecimal> values) {
            addCriterion("MATERIALNUM not in", values, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MATERIALNUM between", value1, value2, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MATERIALNUM not between", value1, value2, "materialnum");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("PRICE =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("PRICE <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("PRICE >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("PRICE <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("PRICE in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("PRICE not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE not between", value1, value2, "price");
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

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andStoreIsNull() {
            addCriterion("STORE is null");
            return (Criteria) this;
        }

        public Criteria andStoreIsNotNull() {
            addCriterion("STORE is not null");
            return (Criteria) this;
        }

        public Criteria andStoreEqualTo(String value) {
            addCriterion("STORE =", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreNotEqualTo(String value) {
            addCriterion("STORE <>", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreGreaterThan(String value) {
            addCriterion("STORE >", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreGreaterThanOrEqualTo(String value) {
            addCriterion("STORE >=", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreLessThan(String value) {
            addCriterion("STORE <", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreLessThanOrEqualTo(String value) {
            addCriterion("STORE <=", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreLike(String value) {
            addCriterion("STORE like", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreNotLike(String value) {
            addCriterion("STORE not like", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreIn(List<String> values) {
            addCriterion("STORE in", values, "store");
            return (Criteria) this;
        }

        public Criteria andStoreNotIn(List<String> values) {
            addCriterion("STORE not in", values, "store");
            return (Criteria) this;
        }

        public Criteria andStoreBetween(String value1, String value2) {
            addCriterion("STORE between", value1, value2, "store");
            return (Criteria) this;
        }

        public Criteria andStoreNotBetween(String value1, String value2) {
            addCriterion("STORE not between", value1, value2, "store");
            return (Criteria) this;
        }

        public Criteria andStorenameIsNull() {
            addCriterion("STORENAME is null");
            return (Criteria) this;
        }

        public Criteria andStorenameIsNotNull() {
            addCriterion("STORENAME is not null");
            return (Criteria) this;
        }

        public Criteria andStorenameEqualTo(String value) {
            addCriterion("STORENAME =", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameNotEqualTo(String value) {
            addCriterion("STORENAME <>", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameGreaterThan(String value) {
            addCriterion("STORENAME >", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameGreaterThanOrEqualTo(String value) {
            addCriterion("STORENAME >=", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameLessThan(String value) {
            addCriterion("STORENAME <", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameLessThanOrEqualTo(String value) {
            addCriterion("STORENAME <=", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameLike(String value) {
            addCriterion("STORENAME like", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameNotLike(String value) {
            addCriterion("STORENAME not like", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameIn(List<String> values) {
            addCriterion("STORENAME in", values, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameNotIn(List<String> values) {
            addCriterion("STORENAME not in", values, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameBetween(String value1, String value2) {
            addCriterion("STORENAME between", value1, value2, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameNotBetween(String value1, String value2) {
            addCriterion("STORENAME not between", value1, value2, "storename");
            return (Criteria) this;
        }

        public Criteria andOrderunitIsNull() {
            addCriterion("ORDERUNIT is null");
            return (Criteria) this;
        }

        public Criteria andOrderunitIsNotNull() {
            addCriterion("ORDERUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andOrderunitEqualTo(String value) {
            addCriterion("ORDERUNIT =", value, "orderunit");
            return (Criteria) this;
        }

        public Criteria andOrderunitNotEqualTo(String value) {
            addCriterion("ORDERUNIT <>", value, "orderunit");
            return (Criteria) this;
        }

        public Criteria andOrderunitGreaterThan(String value) {
            addCriterion("ORDERUNIT >", value, "orderunit");
            return (Criteria) this;
        }

        public Criteria andOrderunitGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERUNIT >=", value, "orderunit");
            return (Criteria) this;
        }

        public Criteria andOrderunitLessThan(String value) {
            addCriterion("ORDERUNIT <", value, "orderunit");
            return (Criteria) this;
        }

        public Criteria andOrderunitLessThanOrEqualTo(String value) {
            addCriterion("ORDERUNIT <=", value, "orderunit");
            return (Criteria) this;
        }

        public Criteria andOrderunitLike(String value) {
            addCriterion("ORDERUNIT like", value, "orderunit");
            return (Criteria) this;
        }

        public Criteria andOrderunitNotLike(String value) {
            addCriterion("ORDERUNIT not like", value, "orderunit");
            return (Criteria) this;
        }

        public Criteria andOrderunitIn(List<String> values) {
            addCriterion("ORDERUNIT in", values, "orderunit");
            return (Criteria) this;
        }

        public Criteria andOrderunitNotIn(List<String> values) {
            addCriterion("ORDERUNIT not in", values, "orderunit");
            return (Criteria) this;
        }

        public Criteria andOrderunitBetween(String value1, String value2) {
            addCriterion("ORDERUNIT between", value1, value2, "orderunit");
            return (Criteria) this;
        }

        public Criteria andOrderunitNotBetween(String value1, String value2) {
            addCriterion("ORDERUNIT not between", value1, value2, "orderunit");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNull() {
            addCriterion("OWNER is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("OWNER is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(String value) {
            addCriterion("OWNER =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(String value) {
            addCriterion("OWNER <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(String value) {
            addCriterion("OWNER >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("OWNER >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(String value) {
            addCriterion("OWNER <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(String value) {
            addCriterion("OWNER <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLike(String value) {
            addCriterion("OWNER like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotLike(String value) {
            addCriterion("OWNER not like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<String> values) {
            addCriterion("OWNER in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<String> values) {
            addCriterion("OWNER not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(String value1, String value2) {
            addCriterion("OWNER between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(String value1, String value2) {
            addCriterion("OWNER not between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnernameIsNull() {
            addCriterion("OWNERNAME is null");
            return (Criteria) this;
        }

        public Criteria andOwnernameIsNotNull() {
            addCriterion("OWNERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOwnernameEqualTo(String value) {
            addCriterion("OWNERNAME =", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameNotEqualTo(String value) {
            addCriterion("OWNERNAME <>", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameGreaterThan(String value) {
            addCriterion("OWNERNAME >", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameGreaterThanOrEqualTo(String value) {
            addCriterion("OWNERNAME >=", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameLessThan(String value) {
            addCriterion("OWNERNAME <", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameLessThanOrEqualTo(String value) {
            addCriterion("OWNERNAME <=", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameLike(String value) {
            addCriterion("OWNERNAME like", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameNotLike(String value) {
            addCriterion("OWNERNAME not like", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameIn(List<String> values) {
            addCriterion("OWNERNAME in", values, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameNotIn(List<String> values) {
            addCriterion("OWNERNAME not in", values, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameBetween(String value1, String value2) {
            addCriterion("OWNERNAME between", value1, value2, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameNotBetween(String value1, String value2) {
            addCriterion("OWNERNAME not between", value1, value2, "ownername");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIsNull() {
            addCriterion("ENTERPRISE is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIsNotNull() {
            addCriterion("ENTERPRISE is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEqualTo(String value) {
            addCriterion("ENTERPRISE =", value, "enterprise");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNotEqualTo(String value) {
            addCriterion("ENTERPRISE <>", value, "enterprise");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGreaterThan(String value) {
            addCriterion("ENTERPRISE >", value, "enterprise");
            return (Criteria) this;
        }

        public Criteria andEnterpriseGreaterThanOrEqualTo(String value) {
            addCriterion("ENTERPRISE >=", value, "enterprise");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLessThan(String value) {
            addCriterion("ENTERPRISE <", value, "enterprise");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLessThanOrEqualTo(String value) {
            addCriterion("ENTERPRISE <=", value, "enterprise");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLike(String value) {
            addCriterion("ENTERPRISE like", value, "enterprise");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNotLike(String value) {
            addCriterion("ENTERPRISE not like", value, "enterprise");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIn(List<String> values) {
            addCriterion("ENTERPRISE in", values, "enterprise");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNotIn(List<String> values) {
            addCriterion("ENTERPRISE not in", values, "enterprise");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBetween(String value1, String value2) {
            addCriterion("ENTERPRISE between", value1, value2, "enterprise");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNotBetween(String value1, String value2) {
            addCriterion("ENTERPRISE not between", value1, value2, "enterprise");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameIsNull() {
            addCriterion("ENTERPRISENAME is null");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameIsNotNull() {
            addCriterion("ENTERPRISENAME is not null");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameEqualTo(String value) {
            addCriterion("ENTERPRISENAME =", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameNotEqualTo(String value) {
            addCriterion("ENTERPRISENAME <>", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameGreaterThan(String value) {
            addCriterion("ENTERPRISENAME >", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameGreaterThanOrEqualTo(String value) {
            addCriterion("ENTERPRISENAME >=", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameLessThan(String value) {
            addCriterion("ENTERPRISENAME <", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameLessThanOrEqualTo(String value) {
            addCriterion("ENTERPRISENAME <=", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameLike(String value) {
            addCriterion("ENTERPRISENAME like", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameNotLike(String value) {
            addCriterion("ENTERPRISENAME not like", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameIn(List<String> values) {
            addCriterion("ENTERPRISENAME in", values, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameNotIn(List<String> values) {
            addCriterion("ENTERPRISENAME not in", values, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameBetween(String value1, String value2) {
            addCriterion("ENTERPRISENAME between", value1, value2, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameNotBetween(String value1, String value2) {
            addCriterion("ENTERPRISENAME not between", value1, value2, "enterprisename");
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