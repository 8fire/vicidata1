package com.csjscm.oracledata.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PURCHORDERExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PURCHORDERExample() {
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

        public Criteria andCustomnameIsNull() {
            addCriterion("CUSTOMNAME is null");
            return (Criteria) this;
        }

        public Criteria andCustomnameIsNotNull() {
            addCriterion("CUSTOMNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustomnameEqualTo(String value) {
            addCriterion("CUSTOMNAME =", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameNotEqualTo(String value) {
            addCriterion("CUSTOMNAME <>", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameGreaterThan(String value) {
            addCriterion("CUSTOMNAME >", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMNAME >=", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameLessThan(String value) {
            addCriterion("CUSTOMNAME <", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMNAME <=", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameLike(String value) {
            addCriterion("CUSTOMNAME like", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameNotLike(String value) {
            addCriterion("CUSTOMNAME not like", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameIn(List<String> values) {
            addCriterion("CUSTOMNAME in", values, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameNotIn(List<String> values) {
            addCriterion("CUSTOMNAME not in", values, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameBetween(String value1, String value2) {
            addCriterion("CUSTOMNAME between", value1, value2, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameNotBetween(String value1, String value2) {
            addCriterion("CUSTOMNAME not between", value1, value2, "customname");
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

        public Criteria andServvicernameIsNull() {
            addCriterion("SERVVICERNAME is null");
            return (Criteria) this;
        }

        public Criteria andServvicernameIsNotNull() {
            addCriterion("SERVVICERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andServvicernameEqualTo(String value) {
            addCriterion("SERVVICERNAME =", value, "servvicername");
            return (Criteria) this;
        }

        public Criteria andServvicernameNotEqualTo(String value) {
            addCriterion("SERVVICERNAME <>", value, "servvicername");
            return (Criteria) this;
        }

        public Criteria andServvicernameGreaterThan(String value) {
            addCriterion("SERVVICERNAME >", value, "servvicername");
            return (Criteria) this;
        }

        public Criteria andServvicernameGreaterThanOrEqualTo(String value) {
            addCriterion("SERVVICERNAME >=", value, "servvicername");
            return (Criteria) this;
        }

        public Criteria andServvicernameLessThan(String value) {
            addCriterion("SERVVICERNAME <", value, "servvicername");
            return (Criteria) this;
        }

        public Criteria andServvicernameLessThanOrEqualTo(String value) {
            addCriterion("SERVVICERNAME <=", value, "servvicername");
            return (Criteria) this;
        }

        public Criteria andServvicernameLike(String value) {
            addCriterion("SERVVICERNAME like", value, "servvicername");
            return (Criteria) this;
        }

        public Criteria andServvicernameNotLike(String value) {
            addCriterion("SERVVICERNAME not like", value, "servvicername");
            return (Criteria) this;
        }

        public Criteria andServvicernameIn(List<String> values) {
            addCriterion("SERVVICERNAME in", values, "servvicername");
            return (Criteria) this;
        }

        public Criteria andServvicernameNotIn(List<String> values) {
            addCriterion("SERVVICERNAME not in", values, "servvicername");
            return (Criteria) this;
        }

        public Criteria andServvicernameBetween(String value1, String value2) {
            addCriterion("SERVVICERNAME between", value1, value2, "servvicername");
            return (Criteria) this;
        }

        public Criteria andServvicernameNotBetween(String value1, String value2) {
            addCriterion("SERVVICERNAME not between", value1, value2, "servvicername");
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

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("CREATETIME like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("CREATETIME not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
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

        public Criteria andChecktimeIsNull() {
            addCriterion("CHECKTIME is null");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNotNull() {
            addCriterion("CHECKTIME is not null");
            return (Criteria) this;
        }

        public Criteria andChecktimeEqualTo(String value) {
            addCriterion("CHECKTIME =", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotEqualTo(String value) {
            addCriterion("CHECKTIME <>", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThan(String value) {
            addCriterion("CHECKTIME >", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKTIME >=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThan(String value) {
            addCriterion("CHECKTIME <", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThanOrEqualTo(String value) {
            addCriterion("CHECKTIME <=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLike(String value) {
            addCriterion("CHECKTIME like", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotLike(String value) {
            addCriterion("CHECKTIME not like", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeIn(List<String> values) {
            addCriterion("CHECKTIME in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotIn(List<String> values) {
            addCriterion("CHECKTIME not in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeBetween(String value1, String value2) {
            addCriterion("CHECKTIME between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotBetween(String value1, String value2) {
            addCriterion("CHECKTIME not between", value1, value2, "checktime");
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

        public Criteria andSumordernumIsNull() {
            addCriterion("SUMORDERNUM is null");
            return (Criteria) this;
        }

        public Criteria andSumordernumIsNotNull() {
            addCriterion("SUMORDERNUM is not null");
            return (Criteria) this;
        }

        public Criteria andSumordernumEqualTo(BigDecimal value) {
            addCriterion("SUMORDERNUM =", value, "sumordernum");
            return (Criteria) this;
        }

        public Criteria andSumordernumNotEqualTo(BigDecimal value) {
            addCriterion("SUMORDERNUM <>", value, "sumordernum");
            return (Criteria) this;
        }

        public Criteria andSumordernumGreaterThan(BigDecimal value) {
            addCriterion("SUMORDERNUM >", value, "sumordernum");
            return (Criteria) this;
        }

        public Criteria andSumordernumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUMORDERNUM >=", value, "sumordernum");
            return (Criteria) this;
        }

        public Criteria andSumordernumLessThan(BigDecimal value) {
            addCriterion("SUMORDERNUM <", value, "sumordernum");
            return (Criteria) this;
        }

        public Criteria andSumordernumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUMORDERNUM <=", value, "sumordernum");
            return (Criteria) this;
        }

        public Criteria andSumordernumIn(List<BigDecimal> values) {
            addCriterion("SUMORDERNUM in", values, "sumordernum");
            return (Criteria) this;
        }

        public Criteria andSumordernumNotIn(List<BigDecimal> values) {
            addCriterion("SUMORDERNUM not in", values, "sumordernum");
            return (Criteria) this;
        }

        public Criteria andSumordernumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUMORDERNUM between", value1, value2, "sumordernum");
            return (Criteria) this;
        }

        public Criteria andSumordernumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUMORDERNUM not between", value1, value2, "sumordernum");
            return (Criteria) this;
        }

        public Criteria andSumamountIsNull() {
            addCriterion("SUMAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andSumamountIsNotNull() {
            addCriterion("SUMAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andSumamountEqualTo(BigDecimal value) {
            addCriterion("SUMAMOUNT =", value, "sumamount");
            return (Criteria) this;
        }

        public Criteria andSumamountNotEqualTo(BigDecimal value) {
            addCriterion("SUMAMOUNT <>", value, "sumamount");
            return (Criteria) this;
        }

        public Criteria andSumamountGreaterThan(BigDecimal value) {
            addCriterion("SUMAMOUNT >", value, "sumamount");
            return (Criteria) this;
        }

        public Criteria andSumamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUMAMOUNT >=", value, "sumamount");
            return (Criteria) this;
        }

        public Criteria andSumamountLessThan(BigDecimal value) {
            addCriterion("SUMAMOUNT <", value, "sumamount");
            return (Criteria) this;
        }

        public Criteria andSumamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUMAMOUNT <=", value, "sumamount");
            return (Criteria) this;
        }

        public Criteria andSumamountIn(List<BigDecimal> values) {
            addCriterion("SUMAMOUNT in", values, "sumamount");
            return (Criteria) this;
        }

        public Criteria andSumamountNotIn(List<BigDecimal> values) {
            addCriterion("SUMAMOUNT not in", values, "sumamount");
            return (Criteria) this;
        }

        public Criteria andSumamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUMAMOUNT between", value1, value2, "sumamount");
            return (Criteria) this;
        }

        public Criteria andSumamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUMAMOUNT not between", value1, value2, "sumamount");
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

        public Criteria andCustomerordernoIsNull() {
            addCriterion("CUSTOMERORDERNO is null");
            return (Criteria) this;
        }

        public Criteria andCustomerordernoIsNotNull() {
            addCriterion("CUSTOMERORDERNO is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerordernoEqualTo(String value) {
            addCriterion("CUSTOMERORDERNO =", value, "customerorderno");
            return (Criteria) this;
        }

        public Criteria andCustomerordernoNotEqualTo(String value) {
            addCriterion("CUSTOMERORDERNO <>", value, "customerorderno");
            return (Criteria) this;
        }

        public Criteria andCustomerordernoGreaterThan(String value) {
            addCriterion("CUSTOMERORDERNO >", value, "customerorderno");
            return (Criteria) this;
        }

        public Criteria andCustomerordernoGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERORDERNO >=", value, "customerorderno");
            return (Criteria) this;
        }

        public Criteria andCustomerordernoLessThan(String value) {
            addCriterion("CUSTOMERORDERNO <", value, "customerorderno");
            return (Criteria) this;
        }

        public Criteria andCustomerordernoLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERORDERNO <=", value, "customerorderno");
            return (Criteria) this;
        }

        public Criteria andCustomerordernoLike(String value) {
            addCriterion("CUSTOMERORDERNO like", value, "customerorderno");
            return (Criteria) this;
        }

        public Criteria andCustomerordernoNotLike(String value) {
            addCriterion("CUSTOMERORDERNO not like", value, "customerorderno");
            return (Criteria) this;
        }

        public Criteria andCustomerordernoIn(List<String> values) {
            addCriterion("CUSTOMERORDERNO in", values, "customerorderno");
            return (Criteria) this;
        }

        public Criteria andCustomerordernoNotIn(List<String> values) {
            addCriterion("CUSTOMERORDERNO not in", values, "customerorderno");
            return (Criteria) this;
        }

        public Criteria andCustomerordernoBetween(String value1, String value2) {
            addCriterion("CUSTOMERORDERNO between", value1, value2, "customerorderno");
            return (Criteria) this;
        }

        public Criteria andCustomerordernoNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERORDERNO not between", value1, value2, "customerorderno");
            return (Criteria) this;
        }

        public Criteria andLinkusernameIsNull() {
            addCriterion("LINKUSERNAME is null");
            return (Criteria) this;
        }

        public Criteria andLinkusernameIsNotNull() {
            addCriterion("LINKUSERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andLinkusernameEqualTo(String value) {
            addCriterion("LINKUSERNAME =", value, "linkusername");
            return (Criteria) this;
        }

        public Criteria andLinkusernameNotEqualTo(String value) {
            addCriterion("LINKUSERNAME <>", value, "linkusername");
            return (Criteria) this;
        }

        public Criteria andLinkusernameGreaterThan(String value) {
            addCriterion("LINKUSERNAME >", value, "linkusername");
            return (Criteria) this;
        }

        public Criteria andLinkusernameGreaterThanOrEqualTo(String value) {
            addCriterion("LINKUSERNAME >=", value, "linkusername");
            return (Criteria) this;
        }

        public Criteria andLinkusernameLessThan(String value) {
            addCriterion("LINKUSERNAME <", value, "linkusername");
            return (Criteria) this;
        }

        public Criteria andLinkusernameLessThanOrEqualTo(String value) {
            addCriterion("LINKUSERNAME <=", value, "linkusername");
            return (Criteria) this;
        }

        public Criteria andLinkusernameLike(String value) {
            addCriterion("LINKUSERNAME like", value, "linkusername");
            return (Criteria) this;
        }

        public Criteria andLinkusernameNotLike(String value) {
            addCriterion("LINKUSERNAME not like", value, "linkusername");
            return (Criteria) this;
        }

        public Criteria andLinkusernameIn(List<String> values) {
            addCriterion("LINKUSERNAME in", values, "linkusername");
            return (Criteria) this;
        }

        public Criteria andLinkusernameNotIn(List<String> values) {
            addCriterion("LINKUSERNAME not in", values, "linkusername");
            return (Criteria) this;
        }

        public Criteria andLinkusernameBetween(String value1, String value2) {
            addCriterion("LINKUSERNAME between", value1, value2, "linkusername");
            return (Criteria) this;
        }

        public Criteria andLinkusernameNotBetween(String value1, String value2) {
            addCriterion("LINKUSERNAME not between", value1, value2, "linkusername");
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

        public Criteria andReceiveaddressIsNull() {
            addCriterion("RECEIVEADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressIsNotNull() {
            addCriterion("RECEIVEADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressEqualTo(String value) {
            addCriterion("RECEIVEADDRESS =", value, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressNotEqualTo(String value) {
            addCriterion("RECEIVEADDRESS <>", value, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressGreaterThan(String value) {
            addCriterion("RECEIVEADDRESS >", value, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVEADDRESS >=", value, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressLessThan(String value) {
            addCriterion("RECEIVEADDRESS <", value, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressLessThanOrEqualTo(String value) {
            addCriterion("RECEIVEADDRESS <=", value, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressLike(String value) {
            addCriterion("RECEIVEADDRESS like", value, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressNotLike(String value) {
            addCriterion("RECEIVEADDRESS not like", value, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressIn(List<String> values) {
            addCriterion("RECEIVEADDRESS in", values, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressNotIn(List<String> values) {
            addCriterion("RECEIVEADDRESS not in", values, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressBetween(String value1, String value2) {
            addCriterion("RECEIVEADDRESS between", value1, value2, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressNotBetween(String value1, String value2) {
            addCriterion("RECEIVEADDRESS not between", value1, value2, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andRevstoreIsNull() {
            addCriterion("REVSTORE is null");
            return (Criteria) this;
        }

        public Criteria andRevstoreIsNotNull() {
            addCriterion("REVSTORE is not null");
            return (Criteria) this;
        }

        public Criteria andRevstoreEqualTo(String value) {
            addCriterion("REVSTORE =", value, "revstore");
            return (Criteria) this;
        }

        public Criteria andRevstoreNotEqualTo(String value) {
            addCriterion("REVSTORE <>", value, "revstore");
            return (Criteria) this;
        }

        public Criteria andRevstoreGreaterThan(String value) {
            addCriterion("REVSTORE >", value, "revstore");
            return (Criteria) this;
        }

        public Criteria andRevstoreGreaterThanOrEqualTo(String value) {
            addCriterion("REVSTORE >=", value, "revstore");
            return (Criteria) this;
        }

        public Criteria andRevstoreLessThan(String value) {
            addCriterion("REVSTORE <", value, "revstore");
            return (Criteria) this;
        }

        public Criteria andRevstoreLessThanOrEqualTo(String value) {
            addCriterion("REVSTORE <=", value, "revstore");
            return (Criteria) this;
        }

        public Criteria andRevstoreLike(String value) {
            addCriterion("REVSTORE like", value, "revstore");
            return (Criteria) this;
        }

        public Criteria andRevstoreNotLike(String value) {
            addCriterion("REVSTORE not like", value, "revstore");
            return (Criteria) this;
        }

        public Criteria andRevstoreIn(List<String> values) {
            addCriterion("REVSTORE in", values, "revstore");
            return (Criteria) this;
        }

        public Criteria andRevstoreNotIn(List<String> values) {
            addCriterion("REVSTORE not in", values, "revstore");
            return (Criteria) this;
        }

        public Criteria andRevstoreBetween(String value1, String value2) {
            addCriterion("REVSTORE between", value1, value2, "revstore");
            return (Criteria) this;
        }

        public Criteria andRevstoreNotBetween(String value1, String value2) {
            addCriterion("REVSTORE not between", value1, value2, "revstore");
            return (Criteria) this;
        }

        public Criteria andRevstorenameIsNull() {
            addCriterion("REVSTORENAME is null");
            return (Criteria) this;
        }

        public Criteria andRevstorenameIsNotNull() {
            addCriterion("REVSTORENAME is not null");
            return (Criteria) this;
        }

        public Criteria andRevstorenameEqualTo(String value) {
            addCriterion("REVSTORENAME =", value, "revstorename");
            return (Criteria) this;
        }

        public Criteria andRevstorenameNotEqualTo(String value) {
            addCriterion("REVSTORENAME <>", value, "revstorename");
            return (Criteria) this;
        }

        public Criteria andRevstorenameGreaterThan(String value) {
            addCriterion("REVSTORENAME >", value, "revstorename");
            return (Criteria) this;
        }

        public Criteria andRevstorenameGreaterThanOrEqualTo(String value) {
            addCriterion("REVSTORENAME >=", value, "revstorename");
            return (Criteria) this;
        }

        public Criteria andRevstorenameLessThan(String value) {
            addCriterion("REVSTORENAME <", value, "revstorename");
            return (Criteria) this;
        }

        public Criteria andRevstorenameLessThanOrEqualTo(String value) {
            addCriterion("REVSTORENAME <=", value, "revstorename");
            return (Criteria) this;
        }

        public Criteria andRevstorenameLike(String value) {
            addCriterion("REVSTORENAME like", value, "revstorename");
            return (Criteria) this;
        }

        public Criteria andRevstorenameNotLike(String value) {
            addCriterion("REVSTORENAME not like", value, "revstorename");
            return (Criteria) this;
        }

        public Criteria andRevstorenameIn(List<String> values) {
            addCriterion("REVSTORENAME in", values, "revstorename");
            return (Criteria) this;
        }

        public Criteria andRevstorenameNotIn(List<String> values) {
            addCriterion("REVSTORENAME not in", values, "revstorename");
            return (Criteria) this;
        }

        public Criteria andRevstorenameBetween(String value1, String value2) {
            addCriterion("REVSTORENAME between", value1, value2, "revstorename");
            return (Criteria) this;
        }

        public Criteria andRevstorenameNotBetween(String value1, String value2) {
            addCriterion("REVSTORENAME not between", value1, value2, "revstorename");
            return (Criteria) this;
        }

        public Criteria andTkttypeIsNull() {
            addCriterion("TKTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andTkttypeIsNotNull() {
            addCriterion("TKTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTkttypeEqualTo(String value) {
            addCriterion("TKTTYPE =", value, "tkttype");
            return (Criteria) this;
        }

        public Criteria andTkttypeNotEqualTo(String value) {
            addCriterion("TKTTYPE <>", value, "tkttype");
            return (Criteria) this;
        }

        public Criteria andTkttypeGreaterThan(String value) {
            addCriterion("TKTTYPE >", value, "tkttype");
            return (Criteria) this;
        }

        public Criteria andTkttypeGreaterThanOrEqualTo(String value) {
            addCriterion("TKTTYPE >=", value, "tkttype");
            return (Criteria) this;
        }

        public Criteria andTkttypeLessThan(String value) {
            addCriterion("TKTTYPE <", value, "tkttype");
            return (Criteria) this;
        }

        public Criteria andTkttypeLessThanOrEqualTo(String value) {
            addCriterion("TKTTYPE <=", value, "tkttype");
            return (Criteria) this;
        }

        public Criteria andTkttypeLike(String value) {
            addCriterion("TKTTYPE like", value, "tkttype");
            return (Criteria) this;
        }

        public Criteria andTkttypeNotLike(String value) {
            addCriterion("TKTTYPE not like", value, "tkttype");
            return (Criteria) this;
        }

        public Criteria andTkttypeIn(List<String> values) {
            addCriterion("TKTTYPE in", values, "tkttype");
            return (Criteria) this;
        }

        public Criteria andTkttypeNotIn(List<String> values) {
            addCriterion("TKTTYPE not in", values, "tkttype");
            return (Criteria) this;
        }

        public Criteria andTkttypeBetween(String value1, String value2) {
            addCriterion("TKTTYPE between", value1, value2, "tkttype");
            return (Criteria) this;
        }

        public Criteria andTkttypeNotBetween(String value1, String value2) {
            addCriterion("TKTTYPE not between", value1, value2, "tkttype");
            return (Criteria) this;
        }

        public Criteria andFromordernoIsNull() {
            addCriterion("FROMORDERNO is null");
            return (Criteria) this;
        }

        public Criteria andFromordernoIsNotNull() {
            addCriterion("FROMORDERNO is not null");
            return (Criteria) this;
        }

        public Criteria andFromordernoEqualTo(String value) {
            addCriterion("FROMORDERNO =", value, "fromorderno");
            return (Criteria) this;
        }

        public Criteria andFromordernoNotEqualTo(String value) {
            addCriterion("FROMORDERNO <>", value, "fromorderno");
            return (Criteria) this;
        }

        public Criteria andFromordernoGreaterThan(String value) {
            addCriterion("FROMORDERNO >", value, "fromorderno");
            return (Criteria) this;
        }

        public Criteria andFromordernoGreaterThanOrEqualTo(String value) {
            addCriterion("FROMORDERNO >=", value, "fromorderno");
            return (Criteria) this;
        }

        public Criteria andFromordernoLessThan(String value) {
            addCriterion("FROMORDERNO <", value, "fromorderno");
            return (Criteria) this;
        }

        public Criteria andFromordernoLessThanOrEqualTo(String value) {
            addCriterion("FROMORDERNO <=", value, "fromorderno");
            return (Criteria) this;
        }

        public Criteria andFromordernoLike(String value) {
            addCriterion("FROMORDERNO like", value, "fromorderno");
            return (Criteria) this;
        }

        public Criteria andFromordernoNotLike(String value) {
            addCriterion("FROMORDERNO not like", value, "fromorderno");
            return (Criteria) this;
        }

        public Criteria andFromordernoIn(List<String> values) {
            addCriterion("FROMORDERNO in", values, "fromorderno");
            return (Criteria) this;
        }

        public Criteria andFromordernoNotIn(List<String> values) {
            addCriterion("FROMORDERNO not in", values, "fromorderno");
            return (Criteria) this;
        }

        public Criteria andFromordernoBetween(String value1, String value2) {
            addCriterion("FROMORDERNO between", value1, value2, "fromorderno");
            return (Criteria) this;
        }

        public Criteria andFromordernoNotBetween(String value1, String value2) {
            addCriterion("FROMORDERNO not between", value1, value2, "fromorderno");
            return (Criteria) this;
        }

        public Criteria andPlanarrivedateIsNull() {
            addCriterion("PLANARRIVEDATE is null");
            return (Criteria) this;
        }

        public Criteria andPlanarrivedateIsNotNull() {
            addCriterion("PLANARRIVEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPlanarrivedateEqualTo(String value) {
            addCriterion("PLANARRIVEDATE =", value, "planarrivedate");
            return (Criteria) this;
        }

        public Criteria andPlanarrivedateNotEqualTo(String value) {
            addCriterion("PLANARRIVEDATE <>", value, "planarrivedate");
            return (Criteria) this;
        }

        public Criteria andPlanarrivedateGreaterThan(String value) {
            addCriterion("PLANARRIVEDATE >", value, "planarrivedate");
            return (Criteria) this;
        }

        public Criteria andPlanarrivedateGreaterThanOrEqualTo(String value) {
            addCriterion("PLANARRIVEDATE >=", value, "planarrivedate");
            return (Criteria) this;
        }

        public Criteria andPlanarrivedateLessThan(String value) {
            addCriterion("PLANARRIVEDATE <", value, "planarrivedate");
            return (Criteria) this;
        }

        public Criteria andPlanarrivedateLessThanOrEqualTo(String value) {
            addCriterion("PLANARRIVEDATE <=", value, "planarrivedate");
            return (Criteria) this;
        }

        public Criteria andPlanarrivedateLike(String value) {
            addCriterion("PLANARRIVEDATE like", value, "planarrivedate");
            return (Criteria) this;
        }

        public Criteria andPlanarrivedateNotLike(String value) {
            addCriterion("PLANARRIVEDATE not like", value, "planarrivedate");
            return (Criteria) this;
        }

        public Criteria andPlanarrivedateIn(List<String> values) {
            addCriterion("PLANARRIVEDATE in", values, "planarrivedate");
            return (Criteria) this;
        }

        public Criteria andPlanarrivedateNotIn(List<String> values) {
            addCriterion("PLANARRIVEDATE not in", values, "planarrivedate");
            return (Criteria) this;
        }

        public Criteria andPlanarrivedateBetween(String value1, String value2) {
            addCriterion("PLANARRIVEDATE between", value1, value2, "planarrivedate");
            return (Criteria) this;
        }

        public Criteria andPlanarrivedateNotBetween(String value1, String value2) {
            addCriterion("PLANARRIVEDATE not between", value1, value2, "planarrivedate");
            return (Criteria) this;
        }

        public Criteria andDeliverwayIsNull() {
            addCriterion("DELIVERWAY is null");
            return (Criteria) this;
        }

        public Criteria andDeliverwayIsNotNull() {
            addCriterion("DELIVERWAY is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverwayEqualTo(String value) {
            addCriterion("DELIVERWAY =", value, "deliverway");
            return (Criteria) this;
        }

        public Criteria andDeliverwayNotEqualTo(String value) {
            addCriterion("DELIVERWAY <>", value, "deliverway");
            return (Criteria) this;
        }

        public Criteria andDeliverwayGreaterThan(String value) {
            addCriterion("DELIVERWAY >", value, "deliverway");
            return (Criteria) this;
        }

        public Criteria andDeliverwayGreaterThanOrEqualTo(String value) {
            addCriterion("DELIVERWAY >=", value, "deliverway");
            return (Criteria) this;
        }

        public Criteria andDeliverwayLessThan(String value) {
            addCriterion("DELIVERWAY <", value, "deliverway");
            return (Criteria) this;
        }

        public Criteria andDeliverwayLessThanOrEqualTo(String value) {
            addCriterion("DELIVERWAY <=", value, "deliverway");
            return (Criteria) this;
        }

        public Criteria andDeliverwayLike(String value) {
            addCriterion("DELIVERWAY like", value, "deliverway");
            return (Criteria) this;
        }

        public Criteria andDeliverwayNotLike(String value) {
            addCriterion("DELIVERWAY not like", value, "deliverway");
            return (Criteria) this;
        }

        public Criteria andDeliverwayIn(List<String> values) {
            addCriterion("DELIVERWAY in", values, "deliverway");
            return (Criteria) this;
        }

        public Criteria andDeliverwayNotIn(List<String> values) {
            addCriterion("DELIVERWAY not in", values, "deliverway");
            return (Criteria) this;
        }

        public Criteria andDeliverwayBetween(String value1, String value2) {
            addCriterion("DELIVERWAY between", value1, value2, "deliverway");
            return (Criteria) this;
        }

        public Criteria andDeliverwayNotBetween(String value1, String value2) {
            addCriterion("DELIVERWAY not between", value1, value2, "deliverway");
            return (Criteria) this;
        }

        public Criteria andApplyuserIsNull() {
            addCriterion("APPLYUSER is null");
            return (Criteria) this;
        }

        public Criteria andApplyuserIsNotNull() {
            addCriterion("APPLYUSER is not null");
            return (Criteria) this;
        }

        public Criteria andApplyuserEqualTo(String value) {
            addCriterion("APPLYUSER =", value, "applyuser");
            return (Criteria) this;
        }

        public Criteria andApplyuserNotEqualTo(String value) {
            addCriterion("APPLYUSER <>", value, "applyuser");
            return (Criteria) this;
        }

        public Criteria andApplyuserGreaterThan(String value) {
            addCriterion("APPLYUSER >", value, "applyuser");
            return (Criteria) this;
        }

        public Criteria andApplyuserGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYUSER >=", value, "applyuser");
            return (Criteria) this;
        }

        public Criteria andApplyuserLessThan(String value) {
            addCriterion("APPLYUSER <", value, "applyuser");
            return (Criteria) this;
        }

        public Criteria andApplyuserLessThanOrEqualTo(String value) {
            addCriterion("APPLYUSER <=", value, "applyuser");
            return (Criteria) this;
        }

        public Criteria andApplyuserLike(String value) {
            addCriterion("APPLYUSER like", value, "applyuser");
            return (Criteria) this;
        }

        public Criteria andApplyuserNotLike(String value) {
            addCriterion("APPLYUSER not like", value, "applyuser");
            return (Criteria) this;
        }

        public Criteria andApplyuserIn(List<String> values) {
            addCriterion("APPLYUSER in", values, "applyuser");
            return (Criteria) this;
        }

        public Criteria andApplyuserNotIn(List<String> values) {
            addCriterion("APPLYUSER not in", values, "applyuser");
            return (Criteria) this;
        }

        public Criteria andApplyuserBetween(String value1, String value2) {
            addCriterion("APPLYUSER between", value1, value2, "applyuser");
            return (Criteria) this;
        }

        public Criteria andApplyuserNotBetween(String value1, String value2) {
            addCriterion("APPLYUSER not between", value1, value2, "applyuser");
            return (Criteria) this;
        }

        public Criteria andSumpackunitnumIsNull() {
            addCriterion("SUMPACKUNITNUM is null");
            return (Criteria) this;
        }

        public Criteria andSumpackunitnumIsNotNull() {
            addCriterion("SUMPACKUNITNUM is not null");
            return (Criteria) this;
        }

        public Criteria andSumpackunitnumEqualTo(BigDecimal value) {
            addCriterion("SUMPACKUNITNUM =", value, "sumpackunitnum");
            return (Criteria) this;
        }

        public Criteria andSumpackunitnumNotEqualTo(BigDecimal value) {
            addCriterion("SUMPACKUNITNUM <>", value, "sumpackunitnum");
            return (Criteria) this;
        }

        public Criteria andSumpackunitnumGreaterThan(BigDecimal value) {
            addCriterion("SUMPACKUNITNUM >", value, "sumpackunitnum");
            return (Criteria) this;
        }

        public Criteria andSumpackunitnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUMPACKUNITNUM >=", value, "sumpackunitnum");
            return (Criteria) this;
        }

        public Criteria andSumpackunitnumLessThan(BigDecimal value) {
            addCriterion("SUMPACKUNITNUM <", value, "sumpackunitnum");
            return (Criteria) this;
        }

        public Criteria andSumpackunitnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUMPACKUNITNUM <=", value, "sumpackunitnum");
            return (Criteria) this;
        }

        public Criteria andSumpackunitnumIn(List<BigDecimal> values) {
            addCriterion("SUMPACKUNITNUM in", values, "sumpackunitnum");
            return (Criteria) this;
        }

        public Criteria andSumpackunitnumNotIn(List<BigDecimal> values) {
            addCriterion("SUMPACKUNITNUM not in", values, "sumpackunitnum");
            return (Criteria) this;
        }

        public Criteria andSumpackunitnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUMPACKUNITNUM between", value1, value2, "sumpackunitnum");
            return (Criteria) this;
        }

        public Criteria andSumpackunitnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUMPACKUNITNUM not between", value1, value2, "sumpackunitnum");
            return (Criteria) this;
        }

        public Criteria andClosedIsNull() {
            addCriterion("CLOSED is null");
            return (Criteria) this;
        }

        public Criteria andClosedIsNotNull() {
            addCriterion("CLOSED is not null");
            return (Criteria) this;
        }

        public Criteria andClosedEqualTo(Long value) {
            addCriterion("CLOSED =", value, "closed");
            return (Criteria) this;
        }

        public Criteria andClosedNotEqualTo(Long value) {
            addCriterion("CLOSED <>", value, "closed");
            return (Criteria) this;
        }

        public Criteria andClosedGreaterThan(Long value) {
            addCriterion("CLOSED >", value, "closed");
            return (Criteria) this;
        }

        public Criteria andClosedGreaterThanOrEqualTo(Long value) {
            addCriterion("CLOSED >=", value, "closed");
            return (Criteria) this;
        }

        public Criteria andClosedLessThan(Long value) {
            addCriterion("CLOSED <", value, "closed");
            return (Criteria) this;
        }

        public Criteria andClosedLessThanOrEqualTo(Long value) {
            addCriterion("CLOSED <=", value, "closed");
            return (Criteria) this;
        }

        public Criteria andClosedIn(List<Long> values) {
            addCriterion("CLOSED in", values, "closed");
            return (Criteria) this;
        }

        public Criteria andClosedNotIn(List<Long> values) {
            addCriterion("CLOSED not in", values, "closed");
            return (Criteria) this;
        }

        public Criteria andClosedBetween(Long value1, Long value2) {
            addCriterion("CLOSED between", value1, value2, "closed");
            return (Criteria) this;
        }

        public Criteria andClosedNotBetween(Long value1, Long value2) {
            addCriterion("CLOSED not between", value1, value2, "closed");
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

        public Criteria andRateEqualTo(String value) {
            addCriterion("RATE =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(String value) {
            addCriterion("RATE <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(String value) {
            addCriterion("RATE >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(String value) {
            addCriterion("RATE >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(String value) {
            addCriterion("RATE <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(String value) {
            addCriterion("RATE <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLike(String value) {
            addCriterion("RATE like", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotLike(String value) {
            addCriterion("RATE not like", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<String> values) {
            addCriterion("RATE in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<String> values) {
            addCriterion("RATE not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(String value1, String value2) {
            addCriterion("RATE between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(String value1, String value2) {
            addCriterion("RATE not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andPaymethodIsNull() {
            addCriterion("PAYMETHOD is null");
            return (Criteria) this;
        }

        public Criteria andPaymethodIsNotNull() {
            addCriterion("PAYMETHOD is not null");
            return (Criteria) this;
        }

        public Criteria andPaymethodEqualTo(String value) {
            addCriterion("PAYMETHOD =", value, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodNotEqualTo(String value) {
            addCriterion("PAYMETHOD <>", value, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodGreaterThan(String value) {
            addCriterion("PAYMETHOD >", value, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMETHOD >=", value, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodLessThan(String value) {
            addCriterion("PAYMETHOD <", value, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodLessThanOrEqualTo(String value) {
            addCriterion("PAYMETHOD <=", value, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodLike(String value) {
            addCriterion("PAYMETHOD like", value, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodNotLike(String value) {
            addCriterion("PAYMETHOD not like", value, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodIn(List<String> values) {
            addCriterion("PAYMETHOD in", values, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodNotIn(List<String> values) {
            addCriterion("PAYMETHOD not in", values, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodBetween(String value1, String value2) {
            addCriterion("PAYMETHOD between", value1, value2, "paymethod");
            return (Criteria) this;
        }

        public Criteria andPaymethodNotBetween(String value1, String value2) {
            addCriterion("PAYMETHOD not between", value1, value2, "paymethod");
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