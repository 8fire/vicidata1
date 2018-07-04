package com.csjscm.oracledata.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class InputInvoiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InputInvoiceExample() {
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

        public Criteria andServicerIsNull() {
            addCriterion("SERVICER is null");
            return (Criteria) this;
        }

        public Criteria andServicerIsNotNull() {
            addCriterion("SERVICER is not null");
            return (Criteria) this;
        }

        public Criteria andServicerEqualTo(String value) {
            addCriterion("SERVICER =", value, "servicer");
            return (Criteria) this;
        }

        public Criteria andServicerNotEqualTo(String value) {
            addCriterion("SERVICER <>", value, "servicer");
            return (Criteria) this;
        }

        public Criteria andServicerGreaterThan(String value) {
            addCriterion("SERVICER >", value, "servicer");
            return (Criteria) this;
        }

        public Criteria andServicerGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICER >=", value, "servicer");
            return (Criteria) this;
        }

        public Criteria andServicerLessThan(String value) {
            addCriterion("SERVICER <", value, "servicer");
            return (Criteria) this;
        }

        public Criteria andServicerLessThanOrEqualTo(String value) {
            addCriterion("SERVICER <=", value, "servicer");
            return (Criteria) this;
        }

        public Criteria andServicerLike(String value) {
            addCriterion("SERVICER like", value, "servicer");
            return (Criteria) this;
        }

        public Criteria andServicerNotLike(String value) {
            addCriterion("SERVICER not like", value, "servicer");
            return (Criteria) this;
        }

        public Criteria andServicerIn(List<String> values) {
            addCriterion("SERVICER in", values, "servicer");
            return (Criteria) this;
        }

        public Criteria andServicerNotIn(List<String> values) {
            addCriterion("SERVICER not in", values, "servicer");
            return (Criteria) this;
        }

        public Criteria andServicerBetween(String value1, String value2) {
            addCriterion("SERVICER between", value1, value2, "servicer");
            return (Criteria) this;
        }

        public Criteria andServicerNotBetween(String value1, String value2) {
            addCriterion("SERVICER not between", value1, value2, "servicer");
            return (Criteria) this;
        }

        public Criteria andServicernameIsNull() {
            addCriterion("SERVICERNAME is null");
            return (Criteria) this;
        }

        public Criteria andServicernameIsNotNull() {
            addCriterion("SERVICERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andServicernameEqualTo(String value) {
            addCriterion("SERVICERNAME =", value, "servicername");
            return (Criteria) this;
        }

        public Criteria andServicernameNotEqualTo(String value) {
            addCriterion("SERVICERNAME <>", value, "servicername");
            return (Criteria) this;
        }

        public Criteria andServicernameGreaterThan(String value) {
            addCriterion("SERVICERNAME >", value, "servicername");
            return (Criteria) this;
        }

        public Criteria andServicernameGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICERNAME >=", value, "servicername");
            return (Criteria) this;
        }

        public Criteria andServicernameLessThan(String value) {
            addCriterion("SERVICERNAME <", value, "servicername");
            return (Criteria) this;
        }

        public Criteria andServicernameLessThanOrEqualTo(String value) {
            addCriterion("SERVICERNAME <=", value, "servicername");
            return (Criteria) this;
        }

        public Criteria andServicernameLike(String value) {
            addCriterion("SERVICERNAME like", value, "servicername");
            return (Criteria) this;
        }

        public Criteria andServicernameNotLike(String value) {
            addCriterion("SERVICERNAME not like", value, "servicername");
            return (Criteria) this;
        }

        public Criteria andServicernameIn(List<String> values) {
            addCriterion("SERVICERNAME in", values, "servicername");
            return (Criteria) this;
        }

        public Criteria andServicernameNotIn(List<String> values) {
            addCriterion("SERVICERNAME not in", values, "servicername");
            return (Criteria) this;
        }

        public Criteria andServicernameBetween(String value1, String value2) {
            addCriterion("SERVICERNAME between", value1, value2, "servicername");
            return (Criteria) this;
        }

        public Criteria andServicernameNotBetween(String value1, String value2) {
            addCriterion("SERVICERNAME not between", value1, value2, "servicername");
            return (Criteria) this;
        }

        public Criteria andInvoicenoIsNull() {
            addCriterion("INVOICENO is null");
            return (Criteria) this;
        }

        public Criteria andInvoicenoIsNotNull() {
            addCriterion("INVOICENO is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicenoEqualTo(String value) {
            addCriterion("INVOICENO =", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoNotEqualTo(String value) {
            addCriterion("INVOICENO <>", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoGreaterThan(String value) {
            addCriterion("INVOICENO >", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICENO >=", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoLessThan(String value) {
            addCriterion("INVOICENO <", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoLessThanOrEqualTo(String value) {
            addCriterion("INVOICENO <=", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoLike(String value) {
            addCriterion("INVOICENO like", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoNotLike(String value) {
            addCriterion("INVOICENO not like", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoIn(List<String> values) {
            addCriterion("INVOICENO in", values, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoNotIn(List<String> values) {
            addCriterion("INVOICENO not in", values, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoBetween(String value1, String value2) {
            addCriterion("INVOICENO between", value1, value2, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoNotBetween(String value1, String value2) {
            addCriterion("INVOICENO not between", value1, value2, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeIsNull() {
            addCriterion("INVOICETYPE is null");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeIsNotNull() {
            addCriterion("INVOICETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeEqualTo(Short value) {
            addCriterion("INVOICETYPE =", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeNotEqualTo(Short value) {
            addCriterion("INVOICETYPE <>", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeGreaterThan(Short value) {
            addCriterion("INVOICETYPE >", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeGreaterThanOrEqualTo(Short value) {
            addCriterion("INVOICETYPE >=", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeLessThan(Short value) {
            addCriterion("INVOICETYPE <", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeLessThanOrEqualTo(Short value) {
            addCriterion("INVOICETYPE <=", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeIn(List<Short> values) {
            addCriterion("INVOICETYPE in", values, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeNotIn(List<Short> values) {
            addCriterion("INVOICETYPE not in", values, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeBetween(Short value1, Short value2) {
            addCriterion("INVOICETYPE between", value1, value2, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeNotBetween(Short value1, Short value2) {
            addCriterion("INVOICETYPE not between", value1, value2, "invoicetype");
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

        public Criteria andInvoiceuserIsNull() {
            addCriterion("INVOICEUSER is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceuserIsNotNull() {
            addCriterion("INVOICEUSER is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceuserEqualTo(String value) {
            addCriterion("INVOICEUSER =", value, "invoiceuser");
            return (Criteria) this;
        }

        public Criteria andInvoiceuserNotEqualTo(String value) {
            addCriterion("INVOICEUSER <>", value, "invoiceuser");
            return (Criteria) this;
        }

        public Criteria andInvoiceuserGreaterThan(String value) {
            addCriterion("INVOICEUSER >", value, "invoiceuser");
            return (Criteria) this;
        }

        public Criteria andInvoiceuserGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICEUSER >=", value, "invoiceuser");
            return (Criteria) this;
        }

        public Criteria andInvoiceuserLessThan(String value) {
            addCriterion("INVOICEUSER <", value, "invoiceuser");
            return (Criteria) this;
        }

        public Criteria andInvoiceuserLessThanOrEqualTo(String value) {
            addCriterion("INVOICEUSER <=", value, "invoiceuser");
            return (Criteria) this;
        }

        public Criteria andInvoiceuserLike(String value) {
            addCriterion("INVOICEUSER like", value, "invoiceuser");
            return (Criteria) this;
        }

        public Criteria andInvoiceuserNotLike(String value) {
            addCriterion("INVOICEUSER not like", value, "invoiceuser");
            return (Criteria) this;
        }

        public Criteria andInvoiceuserIn(List<String> values) {
            addCriterion("INVOICEUSER in", values, "invoiceuser");
            return (Criteria) this;
        }

        public Criteria andInvoiceuserNotIn(List<String> values) {
            addCriterion("INVOICEUSER not in", values, "invoiceuser");
            return (Criteria) this;
        }

        public Criteria andInvoiceuserBetween(String value1, String value2) {
            addCriterion("INVOICEUSER between", value1, value2, "invoiceuser");
            return (Criteria) this;
        }

        public Criteria andInvoiceuserNotBetween(String value1, String value2) {
            addCriterion("INVOICEUSER not between", value1, value2, "invoiceuser");
            return (Criteria) this;
        }

        public Criteria andInvoicedateIsNull() {
            addCriterion("INVOICEDATE is null");
            return (Criteria) this;
        }

        public Criteria andInvoicedateIsNotNull() {
            addCriterion("INVOICEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicedateEqualTo(String value) {
            addCriterion("INVOICEDATE =", value, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateNotEqualTo(String value) {
            addCriterion("INVOICEDATE <>", value, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateGreaterThan(String value) {
            addCriterion("INVOICEDATE >", value, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICEDATE >=", value, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateLessThan(String value) {
            addCriterion("INVOICEDATE <", value, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateLessThanOrEqualTo(String value) {
            addCriterion("INVOICEDATE <=", value, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateLike(String value) {
            addCriterion("INVOICEDATE like", value, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateNotLike(String value) {
            addCriterion("INVOICEDATE not like", value, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateIn(List<String> values) {
            addCriterion("INVOICEDATE in", values, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateNotIn(List<String> values) {
            addCriterion("INVOICEDATE not in", values, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateBetween(String value1, String value2) {
            addCriterion("INVOICEDATE between", value1, value2, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateNotBetween(String value1, String value2) {
            addCriterion("INVOICEDATE not between", value1, value2, "invoicedate");
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

        public Criteria andVerifyamountIsNull() {
            addCriterion("VERIFYAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andVerifyamountIsNotNull() {
            addCriterion("VERIFYAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyamountEqualTo(BigDecimal value) {
            addCriterion("VERIFYAMOUNT =", value, "verifyamount");
            return (Criteria) this;
        }

        public Criteria andVerifyamountNotEqualTo(BigDecimal value) {
            addCriterion("VERIFYAMOUNT <>", value, "verifyamount");
            return (Criteria) this;
        }

        public Criteria andVerifyamountGreaterThan(BigDecimal value) {
            addCriterion("VERIFYAMOUNT >", value, "verifyamount");
            return (Criteria) this;
        }

        public Criteria andVerifyamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VERIFYAMOUNT >=", value, "verifyamount");
            return (Criteria) this;
        }

        public Criteria andVerifyamountLessThan(BigDecimal value) {
            addCriterion("VERIFYAMOUNT <", value, "verifyamount");
            return (Criteria) this;
        }

        public Criteria andVerifyamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VERIFYAMOUNT <=", value, "verifyamount");
            return (Criteria) this;
        }

        public Criteria andVerifyamountIn(List<BigDecimal> values) {
            addCriterion("VERIFYAMOUNT in", values, "verifyamount");
            return (Criteria) this;
        }

        public Criteria andVerifyamountNotIn(List<BigDecimal> values) {
            addCriterion("VERIFYAMOUNT not in", values, "verifyamount");
            return (Criteria) this;
        }

        public Criteria andVerifyamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VERIFYAMOUNT between", value1, value2, "verifyamount");
            return (Criteria) this;
        }

        public Criteria andVerifyamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VERIFYAMOUNT not between", value1, value2, "verifyamount");
            return (Criteria) this;
        }

        public Criteria andReceivedateIsNull() {
            addCriterion("RECEIVEDATE is null");
            return (Criteria) this;
        }

        public Criteria andReceivedateIsNotNull() {
            addCriterion("RECEIVEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedateEqualTo(String value) {
            addCriterion("RECEIVEDATE =", value, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateNotEqualTo(String value) {
            addCriterion("RECEIVEDATE <>", value, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateGreaterThan(String value) {
            addCriterion("RECEIVEDATE >", value, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVEDATE >=", value, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateLessThan(String value) {
            addCriterion("RECEIVEDATE <", value, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateLessThanOrEqualTo(String value) {
            addCriterion("RECEIVEDATE <=", value, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateLike(String value) {
            addCriterion("RECEIVEDATE like", value, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateNotLike(String value) {
            addCriterion("RECEIVEDATE not like", value, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateIn(List<String> values) {
            addCriterion("RECEIVEDATE in", values, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateNotIn(List<String> values) {
            addCriterion("RECEIVEDATE not in", values, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateBetween(String value1, String value2) {
            addCriterion("RECEIVEDATE between", value1, value2, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateNotBetween(String value1, String value2) {
            addCriterion("RECEIVEDATE not between", value1, value2, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceiveuserIsNull() {
            addCriterion("RECEIVEUSER is null");
            return (Criteria) this;
        }

        public Criteria andReceiveuserIsNotNull() {
            addCriterion("RECEIVEUSER is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveuserEqualTo(String value) {
            addCriterion("RECEIVEUSER =", value, "receiveuser");
            return (Criteria) this;
        }

        public Criteria andReceiveuserNotEqualTo(String value) {
            addCriterion("RECEIVEUSER <>", value, "receiveuser");
            return (Criteria) this;
        }

        public Criteria andReceiveuserGreaterThan(String value) {
            addCriterion("RECEIVEUSER >", value, "receiveuser");
            return (Criteria) this;
        }

        public Criteria andReceiveuserGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVEUSER >=", value, "receiveuser");
            return (Criteria) this;
        }

        public Criteria andReceiveuserLessThan(String value) {
            addCriterion("RECEIVEUSER <", value, "receiveuser");
            return (Criteria) this;
        }

        public Criteria andReceiveuserLessThanOrEqualTo(String value) {
            addCriterion("RECEIVEUSER <=", value, "receiveuser");
            return (Criteria) this;
        }

        public Criteria andReceiveuserLike(String value) {
            addCriterion("RECEIVEUSER like", value, "receiveuser");
            return (Criteria) this;
        }

        public Criteria andReceiveuserNotLike(String value) {
            addCriterion("RECEIVEUSER not like", value, "receiveuser");
            return (Criteria) this;
        }

        public Criteria andReceiveuserIn(List<String> values) {
            addCriterion("RECEIVEUSER in", values, "receiveuser");
            return (Criteria) this;
        }

        public Criteria andReceiveuserNotIn(List<String> values) {
            addCriterion("RECEIVEUSER not in", values, "receiveuser");
            return (Criteria) this;
        }

        public Criteria andReceiveuserBetween(String value1, String value2) {
            addCriterion("RECEIVEUSER between", value1, value2, "receiveuser");
            return (Criteria) this;
        }

        public Criteria andReceiveuserNotBetween(String value1, String value2) {
            addCriterion("RECEIVEUSER not between", value1, value2, "receiveuser");
            return (Criteria) this;
        }

        public Criteria andEnterpriceIsNull() {
            addCriterion("ENTERPRICE is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriceIsNotNull() {
            addCriterion("ENTERPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriceEqualTo(String value) {
            addCriterion("ENTERPRICE =", value, "enterprice");
            return (Criteria) this;
        }

        public Criteria andEnterpriceNotEqualTo(String value) {
            addCriterion("ENTERPRICE <>", value, "enterprice");
            return (Criteria) this;
        }

        public Criteria andEnterpriceGreaterThan(String value) {
            addCriterion("ENTERPRICE >", value, "enterprice");
            return (Criteria) this;
        }

        public Criteria andEnterpriceGreaterThanOrEqualTo(String value) {
            addCriterion("ENTERPRICE >=", value, "enterprice");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLessThan(String value) {
            addCriterion("ENTERPRICE <", value, "enterprice");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLessThanOrEqualTo(String value) {
            addCriterion("ENTERPRICE <=", value, "enterprice");
            return (Criteria) this;
        }

        public Criteria andEnterpriceLike(String value) {
            addCriterion("ENTERPRICE like", value, "enterprice");
            return (Criteria) this;
        }

        public Criteria andEnterpriceNotLike(String value) {
            addCriterion("ENTERPRICE not like", value, "enterprice");
            return (Criteria) this;
        }

        public Criteria andEnterpriceIn(List<String> values) {
            addCriterion("ENTERPRICE in", values, "enterprice");
            return (Criteria) this;
        }

        public Criteria andEnterpriceNotIn(List<String> values) {
            addCriterion("ENTERPRICE not in", values, "enterprice");
            return (Criteria) this;
        }

        public Criteria andEnterpriceBetween(String value1, String value2) {
            addCriterion("ENTERPRICE between", value1, value2, "enterprice");
            return (Criteria) this;
        }

        public Criteria andEnterpriceNotBetween(String value1, String value2) {
            addCriterion("ENTERPRICE not between", value1, value2, "enterprice");
            return (Criteria) this;
        }

        public Criteria andEnterpricenameIsNull() {
            addCriterion("ENTERPRICENAME is null");
            return (Criteria) this;
        }

        public Criteria andEnterpricenameIsNotNull() {
            addCriterion("ENTERPRICENAME is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpricenameEqualTo(String value) {
            addCriterion("ENTERPRICENAME =", value, "enterpricename");
            return (Criteria) this;
        }

        public Criteria andEnterpricenameNotEqualTo(String value) {
            addCriterion("ENTERPRICENAME <>", value, "enterpricename");
            return (Criteria) this;
        }

        public Criteria andEnterpricenameGreaterThan(String value) {
            addCriterion("ENTERPRICENAME >", value, "enterpricename");
            return (Criteria) this;
        }

        public Criteria andEnterpricenameGreaterThanOrEqualTo(String value) {
            addCriterion("ENTERPRICENAME >=", value, "enterpricename");
            return (Criteria) this;
        }

        public Criteria andEnterpricenameLessThan(String value) {
            addCriterion("ENTERPRICENAME <", value, "enterpricename");
            return (Criteria) this;
        }

        public Criteria andEnterpricenameLessThanOrEqualTo(String value) {
            addCriterion("ENTERPRICENAME <=", value, "enterpricename");
            return (Criteria) this;
        }

        public Criteria andEnterpricenameLike(String value) {
            addCriterion("ENTERPRICENAME like", value, "enterpricename");
            return (Criteria) this;
        }

        public Criteria andEnterpricenameNotLike(String value) {
            addCriterion("ENTERPRICENAME not like", value, "enterpricename");
            return (Criteria) this;
        }

        public Criteria andEnterpricenameIn(List<String> values) {
            addCriterion("ENTERPRICENAME in", values, "enterpricename");
            return (Criteria) this;
        }

        public Criteria andEnterpricenameNotIn(List<String> values) {
            addCriterion("ENTERPRICENAME not in", values, "enterpricename");
            return (Criteria) this;
        }

        public Criteria andEnterpricenameBetween(String value1, String value2) {
            addCriterion("ENTERPRICENAME between", value1, value2, "enterpricename");
            return (Criteria) this;
        }

        public Criteria andEnterpricenameNotBetween(String value1, String value2) {
            addCriterion("ENTERPRICENAME not between", value1, value2, "enterpricename");
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

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNull() {
            addCriterion("CREATEUSER is null");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNotNull() {
            addCriterion("CREATEUSER is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuserEqualTo(String value) {
            addCriterion("CREATEUSER =", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotEqualTo(String value) {
            addCriterion("CREATEUSER <>", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThan(String value) {
            addCriterion("CREATEUSER >", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEUSER >=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThan(String value) {
            addCriterion("CREATEUSER <", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThanOrEqualTo(String value) {
            addCriterion("CREATEUSER <=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLike(String value) {
            addCriterion("CREATEUSER like", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotLike(String value) {
            addCriterion("CREATEUSER not like", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserIn(List<String> values) {
            addCriterion("CREATEUSER in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotIn(List<String> values) {
            addCriterion("CREATEUSER not in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserBetween(String value1, String value2) {
            addCriterion("CREATEUSER between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotBetween(String value1, String value2) {
            addCriterion("CREATEUSER not between", value1, value2, "createuser");
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

        public Criteria andCheckdateIsNull() {
            addCriterion("CHECKDATE is null");
            return (Criteria) this;
        }

        public Criteria andCheckdateIsNotNull() {
            addCriterion("CHECKDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckdateEqualTo(String value) {
            addCriterion("CHECKDATE =", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotEqualTo(String value) {
            addCriterion("CHECKDATE <>", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateGreaterThan(String value) {
            addCriterion("CHECKDATE >", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKDATE >=", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateLessThan(String value) {
            addCriterion("CHECKDATE <", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateLessThanOrEqualTo(String value) {
            addCriterion("CHECKDATE <=", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateLike(String value) {
            addCriterion("CHECKDATE like", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotLike(String value) {
            addCriterion("CHECKDATE not like", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateIn(List<String> values) {
            addCriterion("CHECKDATE in", values, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotIn(List<String> values) {
            addCriterion("CHECKDATE not in", values, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateBetween(String value1, String value2) {
            addCriterion("CHECKDATE between", value1, value2, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotBetween(String value1, String value2) {
            addCriterion("CHECKDATE not between", value1, value2, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckadviceIsNull() {
            addCriterion("CHECKADVICE is null");
            return (Criteria) this;
        }

        public Criteria andCheckadviceIsNotNull() {
            addCriterion("CHECKADVICE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckadviceEqualTo(String value) {
            addCriterion("CHECKADVICE =", value, "checkadvice");
            return (Criteria) this;
        }

        public Criteria andCheckadviceNotEqualTo(String value) {
            addCriterion("CHECKADVICE <>", value, "checkadvice");
            return (Criteria) this;
        }

        public Criteria andCheckadviceGreaterThan(String value) {
            addCriterion("CHECKADVICE >", value, "checkadvice");
            return (Criteria) this;
        }

        public Criteria andCheckadviceGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKADVICE >=", value, "checkadvice");
            return (Criteria) this;
        }

        public Criteria andCheckadviceLessThan(String value) {
            addCriterion("CHECKADVICE <", value, "checkadvice");
            return (Criteria) this;
        }

        public Criteria andCheckadviceLessThanOrEqualTo(String value) {
            addCriterion("CHECKADVICE <=", value, "checkadvice");
            return (Criteria) this;
        }

        public Criteria andCheckadviceLike(String value) {
            addCriterion("CHECKADVICE like", value, "checkadvice");
            return (Criteria) this;
        }

        public Criteria andCheckadviceNotLike(String value) {
            addCriterion("CHECKADVICE not like", value, "checkadvice");
            return (Criteria) this;
        }

        public Criteria andCheckadviceIn(List<String> values) {
            addCriterion("CHECKADVICE in", values, "checkadvice");
            return (Criteria) this;
        }

        public Criteria andCheckadviceNotIn(List<String> values) {
            addCriterion("CHECKADVICE not in", values, "checkadvice");
            return (Criteria) this;
        }

        public Criteria andCheckadviceBetween(String value1, String value2) {
            addCriterion("CHECKADVICE between", value1, value2, "checkadvice");
            return (Criteria) this;
        }

        public Criteria andCheckadviceNotBetween(String value1, String value2) {
            addCriterion("CHECKADVICE not between", value1, value2, "checkadvice");
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

        public Criteria andIsdeleteIsNull() {
            addCriterion("ISDELETE is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("ISDELETE is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(Short value) {
            addCriterion("ISDELETE =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(Short value) {
            addCriterion("ISDELETE <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(Short value) {
            addCriterion("ISDELETE >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(Short value) {
            addCriterion("ISDELETE >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(Short value) {
            addCriterion("ISDELETE <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(Short value) {
            addCriterion("ISDELETE <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<Short> values) {
            addCriterion("ISDELETE in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<Short> values) {
            addCriterion("ISDELETE not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(Short value1, Short value2) {
            addCriterion("ISDELETE between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(Short value1, Short value2) {
            addCriterion("ISDELETE not between", value1, value2, "isdelete");
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