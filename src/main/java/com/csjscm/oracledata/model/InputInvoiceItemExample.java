package com.csjscm.oracledata.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class InputInvoiceItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InputInvoiceItemExample() {
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

        public Criteria andInorderIsNull() {
            addCriterion("INORDER is null");
            return (Criteria) this;
        }

        public Criteria andInorderIsNotNull() {
            addCriterion("INORDER is not null");
            return (Criteria) this;
        }

        public Criteria andInorderEqualTo(String value) {
            addCriterion("INORDER =", value, "inorder");
            return (Criteria) this;
        }

        public Criteria andInorderNotEqualTo(String value) {
            addCriterion("INORDER <>", value, "inorder");
            return (Criteria) this;
        }

        public Criteria andInorderGreaterThan(String value) {
            addCriterion("INORDER >", value, "inorder");
            return (Criteria) this;
        }

        public Criteria andInorderGreaterThanOrEqualTo(String value) {
            addCriterion("INORDER >=", value, "inorder");
            return (Criteria) this;
        }

        public Criteria andInorderLessThan(String value) {
            addCriterion("INORDER <", value, "inorder");
            return (Criteria) this;
        }

        public Criteria andInorderLessThanOrEqualTo(String value) {
            addCriterion("INORDER <=", value, "inorder");
            return (Criteria) this;
        }

        public Criteria andInorderLike(String value) {
            addCriterion("INORDER like", value, "inorder");
            return (Criteria) this;
        }

        public Criteria andInorderNotLike(String value) {
            addCriterion("INORDER not like", value, "inorder");
            return (Criteria) this;
        }

        public Criteria andInorderIn(List<String> values) {
            addCriterion("INORDER in", values, "inorder");
            return (Criteria) this;
        }

        public Criteria andInorderNotIn(List<String> values) {
            addCriterion("INORDER not in", values, "inorder");
            return (Criteria) this;
        }

        public Criteria andInorderBetween(String value1, String value2) {
            addCriterion("INORDER between", value1, value2, "inorder");
            return (Criteria) this;
        }

        public Criteria andInorderNotBetween(String value1, String value2) {
            addCriterion("INORDER not between", value1, value2, "inorder");
            return (Criteria) this;
        }

        public Criteria andInorderitemidIsNull() {
            addCriterion("INORDERITEMID is null");
            return (Criteria) this;
        }

        public Criteria andInorderitemidIsNotNull() {
            addCriterion("INORDERITEMID is not null");
            return (Criteria) this;
        }

        public Criteria andInorderitemidEqualTo(String value) {
            addCriterion("INORDERITEMID =", value, "inorderitemid");
            return (Criteria) this;
        }

        public Criteria andInorderitemidNotEqualTo(String value) {
            addCriterion("INORDERITEMID <>", value, "inorderitemid");
            return (Criteria) this;
        }

        public Criteria andInorderitemidGreaterThan(String value) {
            addCriterion("INORDERITEMID >", value, "inorderitemid");
            return (Criteria) this;
        }

        public Criteria andInorderitemidGreaterThanOrEqualTo(String value) {
            addCriterion("INORDERITEMID >=", value, "inorderitemid");
            return (Criteria) this;
        }

        public Criteria andInorderitemidLessThan(String value) {
            addCriterion("INORDERITEMID <", value, "inorderitemid");
            return (Criteria) this;
        }

        public Criteria andInorderitemidLessThanOrEqualTo(String value) {
            addCriterion("INORDERITEMID <=", value, "inorderitemid");
            return (Criteria) this;
        }

        public Criteria andInorderitemidLike(String value) {
            addCriterion("INORDERITEMID like", value, "inorderitemid");
            return (Criteria) this;
        }

        public Criteria andInorderitemidNotLike(String value) {
            addCriterion("INORDERITEMID not like", value, "inorderitemid");
            return (Criteria) this;
        }

        public Criteria andInorderitemidIn(List<String> values) {
            addCriterion("INORDERITEMID in", values, "inorderitemid");
            return (Criteria) this;
        }

        public Criteria andInorderitemidNotIn(List<String> values) {
            addCriterion("INORDERITEMID not in", values, "inorderitemid");
            return (Criteria) this;
        }

        public Criteria andInorderitemidBetween(String value1, String value2) {
            addCriterion("INORDERITEMID between", value1, value2, "inorderitemid");
            return (Criteria) this;
        }

        public Criteria andInorderitemidNotBetween(String value1, String value2) {
            addCriterion("INORDERITEMID not between", value1, value2, "inorderitemid");
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

        public Criteria andContractnoIsNull() {
            addCriterion("CONTRACTNO is null");
            return (Criteria) this;
        }

        public Criteria andContractnoIsNotNull() {
            addCriterion("CONTRACTNO is not null");
            return (Criteria) this;
        }

        public Criteria andContractnoEqualTo(String value) {
            addCriterion("CONTRACTNO =", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoNotEqualTo(String value) {
            addCriterion("CONTRACTNO <>", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoGreaterThan(String value) {
            addCriterion("CONTRACTNO >", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACTNO >=", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoLessThan(String value) {
            addCriterion("CONTRACTNO <", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoLessThanOrEqualTo(String value) {
            addCriterion("CONTRACTNO <=", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoLike(String value) {
            addCriterion("CONTRACTNO like", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoNotLike(String value) {
            addCriterion("CONTRACTNO not like", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoIn(List<String> values) {
            addCriterion("CONTRACTNO in", values, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoNotIn(List<String> values) {
            addCriterion("CONTRACTNO not in", values, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoBetween(String value1, String value2) {
            addCriterion("CONTRACTNO between", value1, value2, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoNotBetween(String value1, String value2) {
            addCriterion("CONTRACTNO not between", value1, value2, "contractno");
            return (Criteria) this;
        }

        public Criteria andPurchorderIsNull() {
            addCriterion("PURCHORDER is null");
            return (Criteria) this;
        }

        public Criteria andPurchorderIsNotNull() {
            addCriterion("PURCHORDER is not null");
            return (Criteria) this;
        }

        public Criteria andPurchorderEqualTo(String value) {
            addCriterion("PURCHORDER =", value, "purchorder");
            return (Criteria) this;
        }

        public Criteria andPurchorderNotEqualTo(String value) {
            addCriterion("PURCHORDER <>", value, "purchorder");
            return (Criteria) this;
        }

        public Criteria andPurchorderGreaterThan(String value) {
            addCriterion("PURCHORDER >", value, "purchorder");
            return (Criteria) this;
        }

        public Criteria andPurchorderGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHORDER >=", value, "purchorder");
            return (Criteria) this;
        }

        public Criteria andPurchorderLessThan(String value) {
            addCriterion("PURCHORDER <", value, "purchorder");
            return (Criteria) this;
        }

        public Criteria andPurchorderLessThanOrEqualTo(String value) {
            addCriterion("PURCHORDER <=", value, "purchorder");
            return (Criteria) this;
        }

        public Criteria andPurchorderLike(String value) {
            addCriterion("PURCHORDER like", value, "purchorder");
            return (Criteria) this;
        }

        public Criteria andPurchorderNotLike(String value) {
            addCriterion("PURCHORDER not like", value, "purchorder");
            return (Criteria) this;
        }

        public Criteria andPurchorderIn(List<String> values) {
            addCriterion("PURCHORDER in", values, "purchorder");
            return (Criteria) this;
        }

        public Criteria andPurchorderNotIn(List<String> values) {
            addCriterion("PURCHORDER not in", values, "purchorder");
            return (Criteria) this;
        }

        public Criteria andPurchorderBetween(String value1, String value2) {
            addCriterion("PURCHORDER between", value1, value2, "purchorder");
            return (Criteria) this;
        }

        public Criteria andPurchorderNotBetween(String value1, String value2) {
            addCriterion("PURCHORDER not between", value1, value2, "purchorder");
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

        public Criteria andPlaninvoicenumIsNull() {
            addCriterion("PLANINVOICENUM is null");
            return (Criteria) this;
        }

        public Criteria andPlaninvoicenumIsNotNull() {
            addCriterion("PLANINVOICENUM is not null");
            return (Criteria) this;
        }

        public Criteria andPlaninvoicenumEqualTo(BigDecimal value) {
            addCriterion("PLANINVOICENUM =", value, "planinvoicenum");
            return (Criteria) this;
        }

        public Criteria andPlaninvoicenumNotEqualTo(BigDecimal value) {
            addCriterion("PLANINVOICENUM <>", value, "planinvoicenum");
            return (Criteria) this;
        }

        public Criteria andPlaninvoicenumGreaterThan(BigDecimal value) {
            addCriterion("PLANINVOICENUM >", value, "planinvoicenum");
            return (Criteria) this;
        }

        public Criteria andPlaninvoicenumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PLANINVOICENUM >=", value, "planinvoicenum");
            return (Criteria) this;
        }

        public Criteria andPlaninvoicenumLessThan(BigDecimal value) {
            addCriterion("PLANINVOICENUM <", value, "planinvoicenum");
            return (Criteria) this;
        }

        public Criteria andPlaninvoicenumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PLANINVOICENUM <=", value, "planinvoicenum");
            return (Criteria) this;
        }

        public Criteria andPlaninvoicenumIn(List<BigDecimal> values) {
            addCriterion("PLANINVOICENUM in", values, "planinvoicenum");
            return (Criteria) this;
        }

        public Criteria andPlaninvoicenumNotIn(List<BigDecimal> values) {
            addCriterion("PLANINVOICENUM not in", values, "planinvoicenum");
            return (Criteria) this;
        }

        public Criteria andPlaninvoicenumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PLANINVOICENUM between", value1, value2, "planinvoicenum");
            return (Criteria) this;
        }

        public Criteria andPlaninvoicenumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PLANINVOICENUM not between", value1, value2, "planinvoicenum");
            return (Criteria) this;
        }

        public Criteria andPlaninvoiceamountIsNull() {
            addCriterion("PLANINVOICEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPlaninvoiceamountIsNotNull() {
            addCriterion("PLANINVOICEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPlaninvoiceamountEqualTo(BigDecimal value) {
            addCriterion("PLANINVOICEAMOUNT =", value, "planinvoiceamount");
            return (Criteria) this;
        }

        public Criteria andPlaninvoiceamountNotEqualTo(BigDecimal value) {
            addCriterion("PLANINVOICEAMOUNT <>", value, "planinvoiceamount");
            return (Criteria) this;
        }

        public Criteria andPlaninvoiceamountGreaterThan(BigDecimal value) {
            addCriterion("PLANINVOICEAMOUNT >", value, "planinvoiceamount");
            return (Criteria) this;
        }

        public Criteria andPlaninvoiceamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PLANINVOICEAMOUNT >=", value, "planinvoiceamount");
            return (Criteria) this;
        }

        public Criteria andPlaninvoiceamountLessThan(BigDecimal value) {
            addCriterion("PLANINVOICEAMOUNT <", value, "planinvoiceamount");
            return (Criteria) this;
        }

        public Criteria andPlaninvoiceamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PLANINVOICEAMOUNT <=", value, "planinvoiceamount");
            return (Criteria) this;
        }

        public Criteria andPlaninvoiceamountIn(List<BigDecimal> values) {
            addCriterion("PLANINVOICEAMOUNT in", values, "planinvoiceamount");
            return (Criteria) this;
        }

        public Criteria andPlaninvoiceamountNotIn(List<BigDecimal> values) {
            addCriterion("PLANINVOICEAMOUNT not in", values, "planinvoiceamount");
            return (Criteria) this;
        }

        public Criteria andPlaninvoiceamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PLANINVOICEAMOUNT between", value1, value2, "planinvoiceamount");
            return (Criteria) this;
        }

        public Criteria andPlaninvoiceamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PLANINVOICEAMOUNT not between", value1, value2, "planinvoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoicenumIsNull() {
            addCriterion("INVOICENUM is null");
            return (Criteria) this;
        }

        public Criteria andInvoicenumIsNotNull() {
            addCriterion("INVOICENUM is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicenumEqualTo(BigDecimal value) {
            addCriterion("INVOICENUM =", value, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumNotEqualTo(BigDecimal value) {
            addCriterion("INVOICENUM <>", value, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumGreaterThan(BigDecimal value) {
            addCriterion("INVOICENUM >", value, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICENUM >=", value, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumLessThan(BigDecimal value) {
            addCriterion("INVOICENUM <", value, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICENUM <=", value, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumIn(List<BigDecimal> values) {
            addCriterion("INVOICENUM in", values, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumNotIn(List<BigDecimal> values) {
            addCriterion("INVOICENUM not in", values, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICENUM between", value1, value2, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICENUM not between", value1, value2, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountIsNull() {
            addCriterion("INVOICEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountIsNotNull() {
            addCriterion("INVOICEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountEqualTo(BigDecimal value) {
            addCriterion("INVOICEAMOUNT =", value, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountNotEqualTo(BigDecimal value) {
            addCriterion("INVOICEAMOUNT <>", value, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountGreaterThan(BigDecimal value) {
            addCriterion("INVOICEAMOUNT >", value, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICEAMOUNT >=", value, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountLessThan(BigDecimal value) {
            addCriterion("INVOICEAMOUNT <", value, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICEAMOUNT <=", value, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountIn(List<BigDecimal> values) {
            addCriterion("INVOICEAMOUNT in", values, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountNotIn(List<BigDecimal> values) {
            addCriterion("INVOICEAMOUNT not in", values, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICEAMOUNT between", value1, value2, "invoiceamount");
            return (Criteria) this;
        }

        public Criteria andInvoiceamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICEAMOUNT not between", value1, value2, "invoiceamount");
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

        public Criteria andTaxrateEqualTo(BigDecimal value) {
            addCriterion("TAXRATE =", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotEqualTo(BigDecimal value) {
            addCriterion("TAXRATE <>", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateGreaterThan(BigDecimal value) {
            addCriterion("TAXRATE >", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXRATE >=", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateLessThan(BigDecimal value) {
            addCriterion("TAXRATE <", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXRATE <=", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateIn(List<BigDecimal> values) {
            addCriterion("TAXRATE in", values, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotIn(List<BigDecimal> values) {
            addCriterion("TAXRATE not in", values, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXRATE between", value1, value2, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXRATE not between", value1, value2, "taxrate");
            return (Criteria) this;
        }

        public Criteria andPretaxamountIsNull() {
            addCriterion("PRETAXAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPretaxamountIsNotNull() {
            addCriterion("PRETAXAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPretaxamountEqualTo(BigDecimal value) {
            addCriterion("PRETAXAMOUNT =", value, "pretaxamount");
            return (Criteria) this;
        }

        public Criteria andPretaxamountNotEqualTo(BigDecimal value) {
            addCriterion("PRETAXAMOUNT <>", value, "pretaxamount");
            return (Criteria) this;
        }

        public Criteria andPretaxamountGreaterThan(BigDecimal value) {
            addCriterion("PRETAXAMOUNT >", value, "pretaxamount");
            return (Criteria) this;
        }

        public Criteria andPretaxamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRETAXAMOUNT >=", value, "pretaxamount");
            return (Criteria) this;
        }

        public Criteria andPretaxamountLessThan(BigDecimal value) {
            addCriterion("PRETAXAMOUNT <", value, "pretaxamount");
            return (Criteria) this;
        }

        public Criteria andPretaxamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRETAXAMOUNT <=", value, "pretaxamount");
            return (Criteria) this;
        }

        public Criteria andPretaxamountIn(List<BigDecimal> values) {
            addCriterion("PRETAXAMOUNT in", values, "pretaxamount");
            return (Criteria) this;
        }

        public Criteria andPretaxamountNotIn(List<BigDecimal> values) {
            addCriterion("PRETAXAMOUNT not in", values, "pretaxamount");
            return (Criteria) this;
        }

        public Criteria andPretaxamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRETAXAMOUNT between", value1, value2, "pretaxamount");
            return (Criteria) this;
        }

        public Criteria andPretaxamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRETAXAMOUNT not between", value1, value2, "pretaxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountIsNull() {
            addCriterion("TAXAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTaxamountIsNotNull() {
            addCriterion("TAXAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTaxamountEqualTo(BigDecimal value) {
            addCriterion("TAXAMOUNT =", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountNotEqualTo(BigDecimal value) {
            addCriterion("TAXAMOUNT <>", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountGreaterThan(BigDecimal value) {
            addCriterion("TAXAMOUNT >", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXAMOUNT >=", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountLessThan(BigDecimal value) {
            addCriterion("TAXAMOUNT <", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXAMOUNT <=", value, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountIn(List<BigDecimal> values) {
            addCriterion("TAXAMOUNT in", values, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountNotIn(List<BigDecimal> values) {
            addCriterion("TAXAMOUNT not in", values, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXAMOUNT between", value1, value2, "taxamount");
            return (Criteria) this;
        }

        public Criteria andTaxamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXAMOUNT not between", value1, value2, "taxamount");
            return (Criteria) this;
        }

        public Criteria andBigcategorynameIsNull() {
            addCriterion("BIGCATEGORYNAME is null");
            return (Criteria) this;
        }

        public Criteria andBigcategorynameIsNotNull() {
            addCriterion("BIGCATEGORYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andBigcategorynameEqualTo(String value) {
            addCriterion("BIGCATEGORYNAME =", value, "bigcategoryname");
            return (Criteria) this;
        }

        public Criteria andBigcategorynameNotEqualTo(String value) {
            addCriterion("BIGCATEGORYNAME <>", value, "bigcategoryname");
            return (Criteria) this;
        }

        public Criteria andBigcategorynameGreaterThan(String value) {
            addCriterion("BIGCATEGORYNAME >", value, "bigcategoryname");
            return (Criteria) this;
        }

        public Criteria andBigcategorynameGreaterThanOrEqualTo(String value) {
            addCriterion("BIGCATEGORYNAME >=", value, "bigcategoryname");
            return (Criteria) this;
        }

        public Criteria andBigcategorynameLessThan(String value) {
            addCriterion("BIGCATEGORYNAME <", value, "bigcategoryname");
            return (Criteria) this;
        }

        public Criteria andBigcategorynameLessThanOrEqualTo(String value) {
            addCriterion("BIGCATEGORYNAME <=", value, "bigcategoryname");
            return (Criteria) this;
        }

        public Criteria andBigcategorynameLike(String value) {
            addCriterion("BIGCATEGORYNAME like", value, "bigcategoryname");
            return (Criteria) this;
        }

        public Criteria andBigcategorynameNotLike(String value) {
            addCriterion("BIGCATEGORYNAME not like", value, "bigcategoryname");
            return (Criteria) this;
        }

        public Criteria andBigcategorynameIn(List<String> values) {
            addCriterion("BIGCATEGORYNAME in", values, "bigcategoryname");
            return (Criteria) this;
        }

        public Criteria andBigcategorynameNotIn(List<String> values) {
            addCriterion("BIGCATEGORYNAME not in", values, "bigcategoryname");
            return (Criteria) this;
        }

        public Criteria andBigcategorynameBetween(String value1, String value2) {
            addCriterion("BIGCATEGORYNAME between", value1, value2, "bigcategoryname");
            return (Criteria) this;
        }

        public Criteria andBigcategorynameNotBetween(String value1, String value2) {
            addCriterion("BIGCATEGORYNAME not between", value1, value2, "bigcategoryname");
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