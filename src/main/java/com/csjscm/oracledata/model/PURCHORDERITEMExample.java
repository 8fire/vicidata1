package com.csjscm.oracledata.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PURCHORDERITEMExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PURCHORDERITEMExample() {
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

        public Criteria andItemnoIsNull() {
            addCriterion("ITEMNO is null");
            return (Criteria) this;
        }

        public Criteria andItemnoIsNotNull() {
            addCriterion("ITEMNO is not null");
            return (Criteria) this;
        }

        public Criteria andItemnoEqualTo(String value) {
            addCriterion("ITEMNO =", value, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoNotEqualTo(String value) {
            addCriterion("ITEMNO <>", value, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoGreaterThan(String value) {
            addCriterion("ITEMNO >", value, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoGreaterThanOrEqualTo(String value) {
            addCriterion("ITEMNO >=", value, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoLessThan(String value) {
            addCriterion("ITEMNO <", value, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoLessThanOrEqualTo(String value) {
            addCriterion("ITEMNO <=", value, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoLike(String value) {
            addCriterion("ITEMNO like", value, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoNotLike(String value) {
            addCriterion("ITEMNO not like", value, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoIn(List<String> values) {
            addCriterion("ITEMNO in", values, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoNotIn(List<String> values) {
            addCriterion("ITEMNO not in", values, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoBetween(String value1, String value2) {
            addCriterion("ITEMNO between", value1, value2, "itemno");
            return (Criteria) this;
        }

        public Criteria andItemnoNotBetween(String value1, String value2) {
            addCriterion("ITEMNO not between", value1, value2, "itemno");
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

        public Criteria andMaterialnruleIsNull() {
            addCriterion("MATERIALNRULE is null");
            return (Criteria) this;
        }

        public Criteria andMaterialnruleIsNotNull() {
            addCriterion("MATERIALNRULE is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialnruleEqualTo(String value) {
            addCriterion("MATERIALNRULE =", value, "materialnrule");
            return (Criteria) this;
        }

        public Criteria andMaterialnruleNotEqualTo(String value) {
            addCriterion("MATERIALNRULE <>", value, "materialnrule");
            return (Criteria) this;
        }

        public Criteria andMaterialnruleGreaterThan(String value) {
            addCriterion("MATERIALNRULE >", value, "materialnrule");
            return (Criteria) this;
        }

        public Criteria andMaterialnruleGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIALNRULE >=", value, "materialnrule");
            return (Criteria) this;
        }

        public Criteria andMaterialnruleLessThan(String value) {
            addCriterion("MATERIALNRULE <", value, "materialnrule");
            return (Criteria) this;
        }

        public Criteria andMaterialnruleLessThanOrEqualTo(String value) {
            addCriterion("MATERIALNRULE <=", value, "materialnrule");
            return (Criteria) this;
        }

        public Criteria andMaterialnruleLike(String value) {
            addCriterion("MATERIALNRULE like", value, "materialnrule");
            return (Criteria) this;
        }

        public Criteria andMaterialnruleNotLike(String value) {
            addCriterion("MATERIALNRULE not like", value, "materialnrule");
            return (Criteria) this;
        }

        public Criteria andMaterialnruleIn(List<String> values) {
            addCriterion("MATERIALNRULE in", values, "materialnrule");
            return (Criteria) this;
        }

        public Criteria andMaterialnruleNotIn(List<String> values) {
            addCriterion("MATERIALNRULE not in", values, "materialnrule");
            return (Criteria) this;
        }

        public Criteria andMaterialnruleBetween(String value1, String value2) {
            addCriterion("MATERIALNRULE between", value1, value2, "materialnrule");
            return (Criteria) this;
        }

        public Criteria andMaterialnruleNotBetween(String value1, String value2) {
            addCriterion("MATERIALNRULE not between", value1, value2, "materialnrule");
            return (Criteria) this;
        }

        public Criteria andMaterialnsizeIsNull() {
            addCriterion("MATERIALNSIZE is null");
            return (Criteria) this;
        }

        public Criteria andMaterialnsizeIsNotNull() {
            addCriterion("MATERIALNSIZE is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialnsizeEqualTo(String value) {
            addCriterion("MATERIALNSIZE =", value, "materialnsize");
            return (Criteria) this;
        }

        public Criteria andMaterialnsizeNotEqualTo(String value) {
            addCriterion("MATERIALNSIZE <>", value, "materialnsize");
            return (Criteria) this;
        }

        public Criteria andMaterialnsizeGreaterThan(String value) {
            addCriterion("MATERIALNSIZE >", value, "materialnsize");
            return (Criteria) this;
        }

        public Criteria andMaterialnsizeGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIALNSIZE >=", value, "materialnsize");
            return (Criteria) this;
        }

        public Criteria andMaterialnsizeLessThan(String value) {
            addCriterion("MATERIALNSIZE <", value, "materialnsize");
            return (Criteria) this;
        }

        public Criteria andMaterialnsizeLessThanOrEqualTo(String value) {
            addCriterion("MATERIALNSIZE <=", value, "materialnsize");
            return (Criteria) this;
        }

        public Criteria andMaterialnsizeLike(String value) {
            addCriterion("MATERIALNSIZE like", value, "materialnsize");
            return (Criteria) this;
        }

        public Criteria andMaterialnsizeNotLike(String value) {
            addCriterion("MATERIALNSIZE not like", value, "materialnsize");
            return (Criteria) this;
        }

        public Criteria andMaterialnsizeIn(List<String> values) {
            addCriterion("MATERIALNSIZE in", values, "materialnsize");
            return (Criteria) this;
        }

        public Criteria andMaterialnsizeNotIn(List<String> values) {
            addCriterion("MATERIALNSIZE not in", values, "materialnsize");
            return (Criteria) this;
        }

        public Criteria andMaterialnsizeBetween(String value1, String value2) {
            addCriterion("MATERIALNSIZE between", value1, value2, "materialnsize");
            return (Criteria) this;
        }

        public Criteria andMaterialnsizeNotBetween(String value1, String value2) {
            addCriterion("MATERIALNSIZE not between", value1, value2, "materialnsize");
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

        public Criteria andOrderpriceIsNull() {
            addCriterion("ORDERPRICE is null");
            return (Criteria) this;
        }

        public Criteria andOrderpriceIsNotNull() {
            addCriterion("ORDERPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderpriceEqualTo(BigDecimal value) {
            addCriterion("ORDERPRICE =", value, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceNotEqualTo(BigDecimal value) {
            addCriterion("ORDERPRICE <>", value, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceGreaterThan(BigDecimal value) {
            addCriterion("ORDERPRICE >", value, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDERPRICE >=", value, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceLessThan(BigDecimal value) {
            addCriterion("ORDERPRICE <", value, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDERPRICE <=", value, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceIn(List<BigDecimal> values) {
            addCriterion("ORDERPRICE in", values, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceNotIn(List<BigDecimal> values) {
            addCriterion("ORDERPRICE not in", values, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDERPRICE between", value1, value2, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDERPRICE not between", value1, value2, "orderprice");
            return (Criteria) this;
        }

        public Criteria andOrderamountIsNull() {
            addCriterion("ORDERAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andOrderamountIsNotNull() {
            addCriterion("ORDERAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOrderamountEqualTo(BigDecimal value) {
            addCriterion("ORDERAMOUNT =", value, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOrderamountNotEqualTo(BigDecimal value) {
            addCriterion("ORDERAMOUNT <>", value, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOrderamountGreaterThan(BigDecimal value) {
            addCriterion("ORDERAMOUNT >", value, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOrderamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDERAMOUNT >=", value, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOrderamountLessThan(BigDecimal value) {
            addCriterion("ORDERAMOUNT <", value, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOrderamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDERAMOUNT <=", value, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOrderamountIn(List<BigDecimal> values) {
            addCriterion("ORDERAMOUNT in", values, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOrderamountNotIn(List<BigDecimal> values) {
            addCriterion("ORDERAMOUNT not in", values, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOrderamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDERAMOUNT between", value1, value2, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOrderamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDERAMOUNT not between", value1, value2, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOrdernumIsNull() {
            addCriterion("ORDERNUM is null");
            return (Criteria) this;
        }

        public Criteria andOrdernumIsNotNull() {
            addCriterion("ORDERNUM is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernumEqualTo(BigDecimal value) {
            addCriterion("ORDERNUM =", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotEqualTo(BigDecimal value) {
            addCriterion("ORDERNUM <>", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumGreaterThan(BigDecimal value) {
            addCriterion("ORDERNUM >", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDERNUM >=", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLessThan(BigDecimal value) {
            addCriterion("ORDERNUM <", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDERNUM <=", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumIn(List<BigDecimal> values) {
            addCriterion("ORDERNUM in", values, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotIn(List<BigDecimal> values) {
            addCriterion("ORDERNUM not in", values, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDERNUM between", value1, value2, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDERNUM not between", value1, value2, "ordernum");
            return (Criteria) this;
        }

        public Criteria andFactsendnumIsNull() {
            addCriterion("FACTSENDNUM is null");
            return (Criteria) this;
        }

        public Criteria andFactsendnumIsNotNull() {
            addCriterion("FACTSENDNUM is not null");
            return (Criteria) this;
        }

        public Criteria andFactsendnumEqualTo(BigDecimal value) {
            addCriterion("FACTSENDNUM =", value, "factsendnum");
            return (Criteria) this;
        }

        public Criteria andFactsendnumNotEqualTo(BigDecimal value) {
            addCriterion("FACTSENDNUM <>", value, "factsendnum");
            return (Criteria) this;
        }

        public Criteria andFactsendnumGreaterThan(BigDecimal value) {
            addCriterion("FACTSENDNUM >", value, "factsendnum");
            return (Criteria) this;
        }

        public Criteria andFactsendnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FACTSENDNUM >=", value, "factsendnum");
            return (Criteria) this;
        }

        public Criteria andFactsendnumLessThan(BigDecimal value) {
            addCriterion("FACTSENDNUM <", value, "factsendnum");
            return (Criteria) this;
        }

        public Criteria andFactsendnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FACTSENDNUM <=", value, "factsendnum");
            return (Criteria) this;
        }

        public Criteria andFactsendnumIn(List<BigDecimal> values) {
            addCriterion("FACTSENDNUM in", values, "factsendnum");
            return (Criteria) this;
        }

        public Criteria andFactsendnumNotIn(List<BigDecimal> values) {
            addCriterion("FACTSENDNUM not in", values, "factsendnum");
            return (Criteria) this;
        }

        public Criteria andFactsendnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FACTSENDNUM between", value1, value2, "factsendnum");
            return (Criteria) this;
        }

        public Criteria andFactsendnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FACTSENDNUM not between", value1, value2, "factsendnum");
            return (Criteria) this;
        }

        public Criteria andInvunitnameIsNull() {
            addCriterion("INVUNITNAME is null");
            return (Criteria) this;
        }

        public Criteria andInvunitnameIsNotNull() {
            addCriterion("INVUNITNAME is not null");
            return (Criteria) this;
        }

        public Criteria andInvunitnameEqualTo(String value) {
            addCriterion("INVUNITNAME =", value, "invunitname");
            return (Criteria) this;
        }

        public Criteria andInvunitnameNotEqualTo(String value) {
            addCriterion("INVUNITNAME <>", value, "invunitname");
            return (Criteria) this;
        }

        public Criteria andInvunitnameGreaterThan(String value) {
            addCriterion("INVUNITNAME >", value, "invunitname");
            return (Criteria) this;
        }

        public Criteria andInvunitnameGreaterThanOrEqualTo(String value) {
            addCriterion("INVUNITNAME >=", value, "invunitname");
            return (Criteria) this;
        }

        public Criteria andInvunitnameLessThan(String value) {
            addCriterion("INVUNITNAME <", value, "invunitname");
            return (Criteria) this;
        }

        public Criteria andInvunitnameLessThanOrEqualTo(String value) {
            addCriterion("INVUNITNAME <=", value, "invunitname");
            return (Criteria) this;
        }

        public Criteria andInvunitnameLike(String value) {
            addCriterion("INVUNITNAME like", value, "invunitname");
            return (Criteria) this;
        }

        public Criteria andInvunitnameNotLike(String value) {
            addCriterion("INVUNITNAME not like", value, "invunitname");
            return (Criteria) this;
        }

        public Criteria andInvunitnameIn(List<String> values) {
            addCriterion("INVUNITNAME in", values, "invunitname");
            return (Criteria) this;
        }

        public Criteria andInvunitnameNotIn(List<String> values) {
            addCriterion("INVUNITNAME not in", values, "invunitname");
            return (Criteria) this;
        }

        public Criteria andInvunitnameBetween(String value1, String value2) {
            addCriterion("INVUNITNAME between", value1, value2, "invunitname");
            return (Criteria) this;
        }

        public Criteria andInvunitnameNotBetween(String value1, String value2) {
            addCriterion("INVUNITNAME not between", value1, value2, "invunitname");
            return (Criteria) this;
        }

        public Criteria andSalerateIsNull() {
            addCriterion("SALERATE is null");
            return (Criteria) this;
        }

        public Criteria andSalerateIsNotNull() {
            addCriterion("SALERATE is not null");
            return (Criteria) this;
        }

        public Criteria andSalerateEqualTo(BigDecimal value) {
            addCriterion("SALERATE =", value, "salerate");
            return (Criteria) this;
        }

        public Criteria andSalerateNotEqualTo(BigDecimal value) {
            addCriterion("SALERATE <>", value, "salerate");
            return (Criteria) this;
        }

        public Criteria andSalerateGreaterThan(BigDecimal value) {
            addCriterion("SALERATE >", value, "salerate");
            return (Criteria) this;
        }

        public Criteria andSalerateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SALERATE >=", value, "salerate");
            return (Criteria) this;
        }

        public Criteria andSalerateLessThan(BigDecimal value) {
            addCriterion("SALERATE <", value, "salerate");
            return (Criteria) this;
        }

        public Criteria andSalerateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SALERATE <=", value, "salerate");
            return (Criteria) this;
        }

        public Criteria andSalerateIn(List<BigDecimal> values) {
            addCriterion("SALERATE in", values, "salerate");
            return (Criteria) this;
        }

        public Criteria andSalerateNotIn(List<BigDecimal> values) {
            addCriterion("SALERATE not in", values, "salerate");
            return (Criteria) this;
        }

        public Criteria andSalerateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SALERATE between", value1, value2, "salerate");
            return (Criteria) this;
        }

        public Criteria andSalerateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SALERATE not between", value1, value2, "salerate");
            return (Criteria) this;
        }

        public Criteria andInvunitnumIsNull() {
            addCriterion("INVUNITNUM is null");
            return (Criteria) this;
        }

        public Criteria andInvunitnumIsNotNull() {
            addCriterion("INVUNITNUM is not null");
            return (Criteria) this;
        }

        public Criteria andInvunitnumEqualTo(BigDecimal value) {
            addCriterion("INVUNITNUM =", value, "invunitnum");
            return (Criteria) this;
        }

        public Criteria andInvunitnumNotEqualTo(BigDecimal value) {
            addCriterion("INVUNITNUM <>", value, "invunitnum");
            return (Criteria) this;
        }

        public Criteria andInvunitnumGreaterThan(BigDecimal value) {
            addCriterion("INVUNITNUM >", value, "invunitnum");
            return (Criteria) this;
        }

        public Criteria andInvunitnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVUNITNUM >=", value, "invunitnum");
            return (Criteria) this;
        }

        public Criteria andInvunitnumLessThan(BigDecimal value) {
            addCriterion("INVUNITNUM <", value, "invunitnum");
            return (Criteria) this;
        }

        public Criteria andInvunitnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVUNITNUM <=", value, "invunitnum");
            return (Criteria) this;
        }

        public Criteria andInvunitnumIn(List<BigDecimal> values) {
            addCriterion("INVUNITNUM in", values, "invunitnum");
            return (Criteria) this;
        }

        public Criteria andInvunitnumNotIn(List<BigDecimal> values) {
            addCriterion("INVUNITNUM not in", values, "invunitnum");
            return (Criteria) this;
        }

        public Criteria andInvunitnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVUNITNUM between", value1, value2, "invunitnum");
            return (Criteria) this;
        }

        public Criteria andInvunitnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVUNITNUM not between", value1, value2, "invunitnum");
            return (Criteria) this;
        }

        public Criteria andPackunitnameIsNull() {
            addCriterion("PACKUNITNAME is null");
            return (Criteria) this;
        }

        public Criteria andPackunitnameIsNotNull() {
            addCriterion("PACKUNITNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPackunitnameEqualTo(String value) {
            addCriterion("PACKUNITNAME =", value, "packunitname");
            return (Criteria) this;
        }

        public Criteria andPackunitnameNotEqualTo(String value) {
            addCriterion("PACKUNITNAME <>", value, "packunitname");
            return (Criteria) this;
        }

        public Criteria andPackunitnameGreaterThan(String value) {
            addCriterion("PACKUNITNAME >", value, "packunitname");
            return (Criteria) this;
        }

        public Criteria andPackunitnameGreaterThanOrEqualTo(String value) {
            addCriterion("PACKUNITNAME >=", value, "packunitname");
            return (Criteria) this;
        }

        public Criteria andPackunitnameLessThan(String value) {
            addCriterion("PACKUNITNAME <", value, "packunitname");
            return (Criteria) this;
        }

        public Criteria andPackunitnameLessThanOrEqualTo(String value) {
            addCriterion("PACKUNITNAME <=", value, "packunitname");
            return (Criteria) this;
        }

        public Criteria andPackunitnameLike(String value) {
            addCriterion("PACKUNITNAME like", value, "packunitname");
            return (Criteria) this;
        }

        public Criteria andPackunitnameNotLike(String value) {
            addCriterion("PACKUNITNAME not like", value, "packunitname");
            return (Criteria) this;
        }

        public Criteria andPackunitnameIn(List<String> values) {
            addCriterion("PACKUNITNAME in", values, "packunitname");
            return (Criteria) this;
        }

        public Criteria andPackunitnameNotIn(List<String> values) {
            addCriterion("PACKUNITNAME not in", values, "packunitname");
            return (Criteria) this;
        }

        public Criteria andPackunitnameBetween(String value1, String value2) {
            addCriterion("PACKUNITNAME between", value1, value2, "packunitname");
            return (Criteria) this;
        }

        public Criteria andPackunitnameNotBetween(String value1, String value2) {
            addCriterion("PACKUNITNAME not between", value1, value2, "packunitname");
            return (Criteria) this;
        }

        public Criteria andPackrateIsNull() {
            addCriterion("PACKRATE is null");
            return (Criteria) this;
        }

        public Criteria andPackrateIsNotNull() {
            addCriterion("PACKRATE is not null");
            return (Criteria) this;
        }

        public Criteria andPackrateEqualTo(BigDecimal value) {
            addCriterion("PACKRATE =", value, "packrate");
            return (Criteria) this;
        }

        public Criteria andPackrateNotEqualTo(BigDecimal value) {
            addCriterion("PACKRATE <>", value, "packrate");
            return (Criteria) this;
        }

        public Criteria andPackrateGreaterThan(BigDecimal value) {
            addCriterion("PACKRATE >", value, "packrate");
            return (Criteria) this;
        }

        public Criteria andPackrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PACKRATE >=", value, "packrate");
            return (Criteria) this;
        }

        public Criteria andPackrateLessThan(BigDecimal value) {
            addCriterion("PACKRATE <", value, "packrate");
            return (Criteria) this;
        }

        public Criteria andPackrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PACKRATE <=", value, "packrate");
            return (Criteria) this;
        }

        public Criteria andPackrateIn(List<BigDecimal> values) {
            addCriterion("PACKRATE in", values, "packrate");
            return (Criteria) this;
        }

        public Criteria andPackrateNotIn(List<BigDecimal> values) {
            addCriterion("PACKRATE not in", values, "packrate");
            return (Criteria) this;
        }

        public Criteria andPackrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PACKRATE between", value1, value2, "packrate");
            return (Criteria) this;
        }

        public Criteria andPackrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PACKRATE not between", value1, value2, "packrate");
            return (Criteria) this;
        }

        public Criteria andPackunitnumIsNull() {
            addCriterion("PACKUNITNUM is null");
            return (Criteria) this;
        }

        public Criteria andPackunitnumIsNotNull() {
            addCriterion("PACKUNITNUM is not null");
            return (Criteria) this;
        }

        public Criteria andPackunitnumEqualTo(BigDecimal value) {
            addCriterion("PACKUNITNUM =", value, "packunitnum");
            return (Criteria) this;
        }

        public Criteria andPackunitnumNotEqualTo(BigDecimal value) {
            addCriterion("PACKUNITNUM <>", value, "packunitnum");
            return (Criteria) this;
        }

        public Criteria andPackunitnumGreaterThan(BigDecimal value) {
            addCriterion("PACKUNITNUM >", value, "packunitnum");
            return (Criteria) this;
        }

        public Criteria andPackunitnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PACKUNITNUM >=", value, "packunitnum");
            return (Criteria) this;
        }

        public Criteria andPackunitnumLessThan(BigDecimal value) {
            addCriterion("PACKUNITNUM <", value, "packunitnum");
            return (Criteria) this;
        }

        public Criteria andPackunitnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PACKUNITNUM <=", value, "packunitnum");
            return (Criteria) this;
        }

        public Criteria andPackunitnumIn(List<BigDecimal> values) {
            addCriterion("PACKUNITNUM in", values, "packunitnum");
            return (Criteria) this;
        }

        public Criteria andPackunitnumNotIn(List<BigDecimal> values) {
            addCriterion("PACKUNITNUM not in", values, "packunitnum");
            return (Criteria) this;
        }

        public Criteria andPackunitnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PACKUNITNUM between", value1, value2, "packunitnum");
            return (Criteria) this;
        }

        public Criteria andPackunitnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PACKUNITNUM not between", value1, value2, "packunitnum");
            return (Criteria) this;
        }

        public Criteria andPickpriceIsNull() {
            addCriterion("PICKPRICE is null");
            return (Criteria) this;
        }

        public Criteria andPickpriceIsNotNull() {
            addCriterion("PICKPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPickpriceEqualTo(BigDecimal value) {
            addCriterion("PICKPRICE =", value, "pickprice");
            return (Criteria) this;
        }

        public Criteria andPickpriceNotEqualTo(BigDecimal value) {
            addCriterion("PICKPRICE <>", value, "pickprice");
            return (Criteria) this;
        }

        public Criteria andPickpriceGreaterThan(BigDecimal value) {
            addCriterion("PICKPRICE >", value, "pickprice");
            return (Criteria) this;
        }

        public Criteria andPickpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PICKPRICE >=", value, "pickprice");
            return (Criteria) this;
        }

        public Criteria andPickpriceLessThan(BigDecimal value) {
            addCriterion("PICKPRICE <", value, "pickprice");
            return (Criteria) this;
        }

        public Criteria andPickpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PICKPRICE <=", value, "pickprice");
            return (Criteria) this;
        }

        public Criteria andPickpriceIn(List<BigDecimal> values) {
            addCriterion("PICKPRICE in", values, "pickprice");
            return (Criteria) this;
        }

        public Criteria andPickpriceNotIn(List<BigDecimal> values) {
            addCriterion("PICKPRICE not in", values, "pickprice");
            return (Criteria) this;
        }

        public Criteria andPickpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PICKPRICE between", value1, value2, "pickprice");
            return (Criteria) this;
        }

        public Criteria andPickpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PICKPRICE not between", value1, value2, "pickprice");
            return (Criteria) this;
        }

        public Criteria andClosedcodeIsNull() {
            addCriterion("CLOSEDCODE is null");
            return (Criteria) this;
        }

        public Criteria andClosedcodeIsNotNull() {
            addCriterion("CLOSEDCODE is not null");
            return (Criteria) this;
        }

        public Criteria andClosedcodeEqualTo(String value) {
            addCriterion("CLOSEDCODE =", value, "closedcode");
            return (Criteria) this;
        }

        public Criteria andClosedcodeNotEqualTo(String value) {
            addCriterion("CLOSEDCODE <>", value, "closedcode");
            return (Criteria) this;
        }

        public Criteria andClosedcodeGreaterThan(String value) {
            addCriterion("CLOSEDCODE >", value, "closedcode");
            return (Criteria) this;
        }

        public Criteria andClosedcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CLOSEDCODE >=", value, "closedcode");
            return (Criteria) this;
        }

        public Criteria andClosedcodeLessThan(String value) {
            addCriterion("CLOSEDCODE <", value, "closedcode");
            return (Criteria) this;
        }

        public Criteria andClosedcodeLessThanOrEqualTo(String value) {
            addCriterion("CLOSEDCODE <=", value, "closedcode");
            return (Criteria) this;
        }

        public Criteria andClosedcodeLike(String value) {
            addCriterion("CLOSEDCODE like", value, "closedcode");
            return (Criteria) this;
        }

        public Criteria andClosedcodeNotLike(String value) {
            addCriterion("CLOSEDCODE not like", value, "closedcode");
            return (Criteria) this;
        }

        public Criteria andClosedcodeIn(List<String> values) {
            addCriterion("CLOSEDCODE in", values, "closedcode");
            return (Criteria) this;
        }

        public Criteria andClosedcodeNotIn(List<String> values) {
            addCriterion("CLOSEDCODE not in", values, "closedcode");
            return (Criteria) this;
        }

        public Criteria andClosedcodeBetween(String value1, String value2) {
            addCriterion("CLOSEDCODE between", value1, value2, "closedcode");
            return (Criteria) this;
        }

        public Criteria andClosedcodeNotBetween(String value1, String value2) {
            addCriterion("CLOSEDCODE not between", value1, value2, "closedcode");
            return (Criteria) this;
        }

        public Criteria andTaxrateIsNull() {
            addCriterion("TAXRATE is null");
            return (Criteria) this;
        }

        public Criteria andTaxrateIsNotNull() {
            addCriterion("TAXRATE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxrateEqualTo(String value) {
            addCriterion("TAXRATE =", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotEqualTo(String value) {
            addCriterion("TAXRATE <>", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateGreaterThan(String value) {
            addCriterion("TAXRATE >", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateGreaterThanOrEqualTo(String value) {
            addCriterion("TAXRATE >=", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateLessThan(String value) {
            addCriterion("TAXRATE <", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateLessThanOrEqualTo(String value) {
            addCriterion("TAXRATE <=", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateLike(String value) {
            addCriterion("TAXRATE like", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotLike(String value) {
            addCriterion("TAXRATE not like", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateIn(List<String> values) {
            addCriterion("TAXRATE in", values, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotIn(List<String> values) {
            addCriterion("TAXRATE not in", values, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateBetween(String value1, String value2) {
            addCriterion("TAXRATE between", value1, value2, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotBetween(String value1, String value2) {
            addCriterion("TAXRATE not between", value1, value2, "taxrate");
            return (Criteria) this;
        }

        public Criteria andMemosIsNull() {
            addCriterion("MEMOS is null");
            return (Criteria) this;
        }

        public Criteria andMemosIsNotNull() {
            addCriterion("MEMOS is not null");
            return (Criteria) this;
        }

        public Criteria andMemosEqualTo(String value) {
            addCriterion("MEMOS =", value, "memos");
            return (Criteria) this;
        }

        public Criteria andMemosNotEqualTo(String value) {
            addCriterion("MEMOS <>", value, "memos");
            return (Criteria) this;
        }

        public Criteria andMemosGreaterThan(String value) {
            addCriterion("MEMOS >", value, "memos");
            return (Criteria) this;
        }

        public Criteria andMemosGreaterThanOrEqualTo(String value) {
            addCriterion("MEMOS >=", value, "memos");
            return (Criteria) this;
        }

        public Criteria andMemosLessThan(String value) {
            addCriterion("MEMOS <", value, "memos");
            return (Criteria) this;
        }

        public Criteria andMemosLessThanOrEqualTo(String value) {
            addCriterion("MEMOS <=", value, "memos");
            return (Criteria) this;
        }

        public Criteria andMemosLike(String value) {
            addCriterion("MEMOS like", value, "memos");
            return (Criteria) this;
        }

        public Criteria andMemosNotLike(String value) {
            addCriterion("MEMOS not like", value, "memos");
            return (Criteria) this;
        }

        public Criteria andMemosIn(List<String> values) {
            addCriterion("MEMOS in", values, "memos");
            return (Criteria) this;
        }

        public Criteria andMemosNotIn(List<String> values) {
            addCriterion("MEMOS not in", values, "memos");
            return (Criteria) this;
        }

        public Criteria andMemosBetween(String value1, String value2) {
            addCriterion("MEMOS between", value1, value2, "memos");
            return (Criteria) this;
        }

        public Criteria andMemosNotBetween(String value1, String value2) {
            addCriterion("MEMOS not between", value1, value2, "memos");
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