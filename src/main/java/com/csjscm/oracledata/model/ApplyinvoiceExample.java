package com.csjscm.oracledata.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ApplyinvoiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApplyinvoiceExample() {
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

        public Criteria andCustomerIsNull() {
            addCriterion("CUSTOMER is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIsNotNull() {
            addCriterion("CUSTOMER is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerEqualTo(String value) {
            addCriterion("CUSTOMER =", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotEqualTo(String value) {
            addCriterion("CUSTOMER <>", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThan(String value) {
            addCriterion("CUSTOMER >", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER >=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThan(String value) {
            addCriterion("CUSTOMER <", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER <=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLike(String value) {
            addCriterion("CUSTOMER like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotLike(String value) {
            addCriterion("CUSTOMER not like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerIn(List<String> values) {
            addCriterion("CUSTOMER in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotIn(List<String> values) {
            addCriterion("CUSTOMER not in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerBetween(String value1, String value2) {
            addCriterion("CUSTOMER between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER not between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNull() {
            addCriterion("CUSTOMERNAME is null");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNotNull() {
            addCriterion("CUSTOMERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernameEqualTo(String value) {
            addCriterion("CUSTOMERNAME =", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotEqualTo(String value) {
            addCriterion("CUSTOMERNAME <>", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThan(String value) {
            addCriterion("CUSTOMERNAME >", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERNAME >=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThan(String value) {
            addCriterion("CUSTOMERNAME <", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERNAME <=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLike(String value) {
            addCriterion("CUSTOMERNAME like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotLike(String value) {
            addCriterion("CUSTOMERNAME not like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameIn(List<String> values) {
            addCriterion("CUSTOMERNAME in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotIn(List<String> values) {
            addCriterion("CUSTOMERNAME not in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameBetween(String value1, String value2) {
            addCriterion("CUSTOMERNAME between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERNAME not between", value1, value2, "customername");
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

        public Criteria andLastinvoicedateIsNull() {
            addCriterion("LASTINVOICEDATE is null");
            return (Criteria) this;
        }

        public Criteria andLastinvoicedateIsNotNull() {
            addCriterion("LASTINVOICEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastinvoicedateEqualTo(String value) {
            addCriterion("LASTINVOICEDATE =", value, "lastinvoicedate");
            return (Criteria) this;
        }

        public Criteria andLastinvoicedateNotEqualTo(String value) {
            addCriterion("LASTINVOICEDATE <>", value, "lastinvoicedate");
            return (Criteria) this;
        }

        public Criteria andLastinvoicedateGreaterThan(String value) {
            addCriterion("LASTINVOICEDATE >", value, "lastinvoicedate");
            return (Criteria) this;
        }

        public Criteria andLastinvoicedateGreaterThanOrEqualTo(String value) {
            addCriterion("LASTINVOICEDATE >=", value, "lastinvoicedate");
            return (Criteria) this;
        }

        public Criteria andLastinvoicedateLessThan(String value) {
            addCriterion("LASTINVOICEDATE <", value, "lastinvoicedate");
            return (Criteria) this;
        }

        public Criteria andLastinvoicedateLessThanOrEqualTo(String value) {
            addCriterion("LASTINVOICEDATE <=", value, "lastinvoicedate");
            return (Criteria) this;
        }

        public Criteria andLastinvoicedateLike(String value) {
            addCriterion("LASTINVOICEDATE like", value, "lastinvoicedate");
            return (Criteria) this;
        }

        public Criteria andLastinvoicedateNotLike(String value) {
            addCriterion("LASTINVOICEDATE not like", value, "lastinvoicedate");
            return (Criteria) this;
        }

        public Criteria andLastinvoicedateIn(List<String> values) {
            addCriterion("LASTINVOICEDATE in", values, "lastinvoicedate");
            return (Criteria) this;
        }

        public Criteria andLastinvoicedateNotIn(List<String> values) {
            addCriterion("LASTINVOICEDATE not in", values, "lastinvoicedate");
            return (Criteria) this;
        }

        public Criteria andLastinvoicedateBetween(String value1, String value2) {
            addCriterion("LASTINVOICEDATE between", value1, value2, "lastinvoicedate");
            return (Criteria) this;
        }

        public Criteria andLastinvoicedateNotBetween(String value1, String value2) {
            addCriterion("LASTINVOICEDATE not between", value1, value2, "lastinvoicedate");
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