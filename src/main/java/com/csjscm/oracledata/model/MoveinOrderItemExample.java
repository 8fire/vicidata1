package com.csjscm.oracledata.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MoveinOrderItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MoveinOrderItemExample() {
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

        public Criteria andTicketnoIsNull() {
            addCriterion("TICKETNO is null");
            return (Criteria) this;
        }

        public Criteria andTicketnoIsNotNull() {
            addCriterion("TICKETNO is not null");
            return (Criteria) this;
        }

        public Criteria andTicketnoEqualTo(String value) {
            addCriterion("TICKETNO =", value, "ticketno");
            return (Criteria) this;
        }

        public Criteria andTicketnoNotEqualTo(String value) {
            addCriterion("TICKETNO <>", value, "ticketno");
            return (Criteria) this;
        }

        public Criteria andTicketnoGreaterThan(String value) {
            addCriterion("TICKETNO >", value, "ticketno");
            return (Criteria) this;
        }

        public Criteria andTicketnoGreaterThanOrEqualTo(String value) {
            addCriterion("TICKETNO >=", value, "ticketno");
            return (Criteria) this;
        }

        public Criteria andTicketnoLessThan(String value) {
            addCriterion("TICKETNO <", value, "ticketno");
            return (Criteria) this;
        }

        public Criteria andTicketnoLessThanOrEqualTo(String value) {
            addCriterion("TICKETNO <=", value, "ticketno");
            return (Criteria) this;
        }

        public Criteria andTicketnoLike(String value) {
            addCriterion("TICKETNO like", value, "ticketno");
            return (Criteria) this;
        }

        public Criteria andTicketnoNotLike(String value) {
            addCriterion("TICKETNO not like", value, "ticketno");
            return (Criteria) this;
        }

        public Criteria andTicketnoIn(List<String> values) {
            addCriterion("TICKETNO in", values, "ticketno");
            return (Criteria) this;
        }

        public Criteria andTicketnoNotIn(List<String> values) {
            addCriterion("TICKETNO not in", values, "ticketno");
            return (Criteria) this;
        }

        public Criteria andTicketnoBetween(String value1, String value2) {
            addCriterion("TICKETNO between", value1, value2, "ticketno");
            return (Criteria) this;
        }

        public Criteria andTicketnoNotBetween(String value1, String value2) {
            addCriterion("TICKETNO not between", value1, value2, "ticketno");
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

        public Criteria andInnumIsNull() {
            addCriterion("INNUM is null");
            return (Criteria) this;
        }

        public Criteria andInnumIsNotNull() {
            addCriterion("INNUM is not null");
            return (Criteria) this;
        }

        public Criteria andInnumEqualTo(BigDecimal value) {
            addCriterion("INNUM =", value, "innum");
            return (Criteria) this;
        }

        public Criteria andInnumNotEqualTo(BigDecimal value) {
            addCriterion("INNUM <>", value, "innum");
            return (Criteria) this;
        }

        public Criteria andInnumGreaterThan(BigDecimal value) {
            addCriterion("INNUM >", value, "innum");
            return (Criteria) this;
        }

        public Criteria andInnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INNUM >=", value, "innum");
            return (Criteria) this;
        }

        public Criteria andInnumLessThan(BigDecimal value) {
            addCriterion("INNUM <", value, "innum");
            return (Criteria) this;
        }

        public Criteria andInnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INNUM <=", value, "innum");
            return (Criteria) this;
        }

        public Criteria andInnumIn(List<BigDecimal> values) {
            addCriterion("INNUM in", values, "innum");
            return (Criteria) this;
        }

        public Criteria andInnumNotIn(List<BigDecimal> values) {
            addCriterion("INNUM not in", values, "innum");
            return (Criteria) this;
        }

        public Criteria andInnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INNUM between", value1, value2, "innum");
            return (Criteria) this;
        }

        public Criteria andInnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INNUM not between", value1, value2, "innum");
            return (Criteria) this;
        }

        public Criteria andMoveorderitemidIsNull() {
            addCriterion("MOVEORDERITEMID is null");
            return (Criteria) this;
        }

        public Criteria andMoveorderitemidIsNotNull() {
            addCriterion("MOVEORDERITEMID is not null");
            return (Criteria) this;
        }

        public Criteria andMoveorderitemidEqualTo(String value) {
            addCriterion("MOVEORDERITEMID =", value, "moveorderitemid");
            return (Criteria) this;
        }

        public Criteria andMoveorderitemidNotEqualTo(String value) {
            addCriterion("MOVEORDERITEMID <>", value, "moveorderitemid");
            return (Criteria) this;
        }

        public Criteria andMoveorderitemidGreaterThan(String value) {
            addCriterion("MOVEORDERITEMID >", value, "moveorderitemid");
            return (Criteria) this;
        }

        public Criteria andMoveorderitemidGreaterThanOrEqualTo(String value) {
            addCriterion("MOVEORDERITEMID >=", value, "moveorderitemid");
            return (Criteria) this;
        }

        public Criteria andMoveorderitemidLessThan(String value) {
            addCriterion("MOVEORDERITEMID <", value, "moveorderitemid");
            return (Criteria) this;
        }

        public Criteria andMoveorderitemidLessThanOrEqualTo(String value) {
            addCriterion("MOVEORDERITEMID <=", value, "moveorderitemid");
            return (Criteria) this;
        }

        public Criteria andMoveorderitemidLike(String value) {
            addCriterion("MOVEORDERITEMID like", value, "moveorderitemid");
            return (Criteria) this;
        }

        public Criteria andMoveorderitemidNotLike(String value) {
            addCriterion("MOVEORDERITEMID not like", value, "moveorderitemid");
            return (Criteria) this;
        }

        public Criteria andMoveorderitemidIn(List<String> values) {
            addCriterion("MOVEORDERITEMID in", values, "moveorderitemid");
            return (Criteria) this;
        }

        public Criteria andMoveorderitemidNotIn(List<String> values) {
            addCriterion("MOVEORDERITEMID not in", values, "moveorderitemid");
            return (Criteria) this;
        }

        public Criteria andMoveorderitemidBetween(String value1, String value2) {
            addCriterion("MOVEORDERITEMID between", value1, value2, "moveorderitemid");
            return (Criteria) this;
        }

        public Criteria andMoveorderitemidNotBetween(String value1, String value2) {
            addCriterion("MOVEORDERITEMID not between", value1, value2, "moveorderitemid");
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