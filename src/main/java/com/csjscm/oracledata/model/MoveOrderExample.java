package com.csjscm.oracledata.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MoveOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MoveOrderExample() {
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

        public Criteria andOutstoreIsNull() {
            addCriterion("OUTSTORE is null");
            return (Criteria) this;
        }

        public Criteria andOutstoreIsNotNull() {
            addCriterion("OUTSTORE is not null");
            return (Criteria) this;
        }

        public Criteria andOutstoreEqualTo(String value) {
            addCriterion("OUTSTORE =", value, "outstore");
            return (Criteria) this;
        }

        public Criteria andOutstoreNotEqualTo(String value) {
            addCriterion("OUTSTORE <>", value, "outstore");
            return (Criteria) this;
        }

        public Criteria andOutstoreGreaterThan(String value) {
            addCriterion("OUTSTORE >", value, "outstore");
            return (Criteria) this;
        }

        public Criteria andOutstoreGreaterThanOrEqualTo(String value) {
            addCriterion("OUTSTORE >=", value, "outstore");
            return (Criteria) this;
        }

        public Criteria andOutstoreLessThan(String value) {
            addCriterion("OUTSTORE <", value, "outstore");
            return (Criteria) this;
        }

        public Criteria andOutstoreLessThanOrEqualTo(String value) {
            addCriterion("OUTSTORE <=", value, "outstore");
            return (Criteria) this;
        }

        public Criteria andOutstoreLike(String value) {
            addCriterion("OUTSTORE like", value, "outstore");
            return (Criteria) this;
        }

        public Criteria andOutstoreNotLike(String value) {
            addCriterion("OUTSTORE not like", value, "outstore");
            return (Criteria) this;
        }

        public Criteria andOutstoreIn(List<String> values) {
            addCriterion("OUTSTORE in", values, "outstore");
            return (Criteria) this;
        }

        public Criteria andOutstoreNotIn(List<String> values) {
            addCriterion("OUTSTORE not in", values, "outstore");
            return (Criteria) this;
        }

        public Criteria andOutstoreBetween(String value1, String value2) {
            addCriterion("OUTSTORE between", value1, value2, "outstore");
            return (Criteria) this;
        }

        public Criteria andOutstoreNotBetween(String value1, String value2) {
            addCriterion("OUTSTORE not between", value1, value2, "outstore");
            return (Criteria) this;
        }

        public Criteria andOutstorenameIsNull() {
            addCriterion("OUTSTORENAME is null");
            return (Criteria) this;
        }

        public Criteria andOutstorenameIsNotNull() {
            addCriterion("OUTSTORENAME is not null");
            return (Criteria) this;
        }

        public Criteria andOutstorenameEqualTo(String value) {
            addCriterion("OUTSTORENAME =", value, "outstorename");
            return (Criteria) this;
        }

        public Criteria andOutstorenameNotEqualTo(String value) {
            addCriterion("OUTSTORENAME <>", value, "outstorename");
            return (Criteria) this;
        }

        public Criteria andOutstorenameGreaterThan(String value) {
            addCriterion("OUTSTORENAME >", value, "outstorename");
            return (Criteria) this;
        }

        public Criteria andOutstorenameGreaterThanOrEqualTo(String value) {
            addCriterion("OUTSTORENAME >=", value, "outstorename");
            return (Criteria) this;
        }

        public Criteria andOutstorenameLessThan(String value) {
            addCriterion("OUTSTORENAME <", value, "outstorename");
            return (Criteria) this;
        }

        public Criteria andOutstorenameLessThanOrEqualTo(String value) {
            addCriterion("OUTSTORENAME <=", value, "outstorename");
            return (Criteria) this;
        }

        public Criteria andOutstorenameLike(String value) {
            addCriterion("OUTSTORENAME like", value, "outstorename");
            return (Criteria) this;
        }

        public Criteria andOutstorenameNotLike(String value) {
            addCriterion("OUTSTORENAME not like", value, "outstorename");
            return (Criteria) this;
        }

        public Criteria andOutstorenameIn(List<String> values) {
            addCriterion("OUTSTORENAME in", values, "outstorename");
            return (Criteria) this;
        }

        public Criteria andOutstorenameNotIn(List<String> values) {
            addCriterion("OUTSTORENAME not in", values, "outstorename");
            return (Criteria) this;
        }

        public Criteria andOutstorenameBetween(String value1, String value2) {
            addCriterion("OUTSTORENAME between", value1, value2, "outstorename");
            return (Criteria) this;
        }

        public Criteria andOutstorenameNotBetween(String value1, String value2) {
            addCriterion("OUTSTORENAME not between", value1, value2, "outstorename");
            return (Criteria) this;
        }

        public Criteria andInstoreIsNull() {
            addCriterion("INSTORE is null");
            return (Criteria) this;
        }

        public Criteria andInstoreIsNotNull() {
            addCriterion("INSTORE is not null");
            return (Criteria) this;
        }

        public Criteria andInstoreEqualTo(String value) {
            addCriterion("INSTORE =", value, "instore");
            return (Criteria) this;
        }

        public Criteria andInstoreNotEqualTo(String value) {
            addCriterion("INSTORE <>", value, "instore");
            return (Criteria) this;
        }

        public Criteria andInstoreGreaterThan(String value) {
            addCriterion("INSTORE >", value, "instore");
            return (Criteria) this;
        }

        public Criteria andInstoreGreaterThanOrEqualTo(String value) {
            addCriterion("INSTORE >=", value, "instore");
            return (Criteria) this;
        }

        public Criteria andInstoreLessThan(String value) {
            addCriterion("INSTORE <", value, "instore");
            return (Criteria) this;
        }

        public Criteria andInstoreLessThanOrEqualTo(String value) {
            addCriterion("INSTORE <=", value, "instore");
            return (Criteria) this;
        }

        public Criteria andInstoreLike(String value) {
            addCriterion("INSTORE like", value, "instore");
            return (Criteria) this;
        }

        public Criteria andInstoreNotLike(String value) {
            addCriterion("INSTORE not like", value, "instore");
            return (Criteria) this;
        }

        public Criteria andInstoreIn(List<String> values) {
            addCriterion("INSTORE in", values, "instore");
            return (Criteria) this;
        }

        public Criteria andInstoreNotIn(List<String> values) {
            addCriterion("INSTORE not in", values, "instore");
            return (Criteria) this;
        }

        public Criteria andInstoreBetween(String value1, String value2) {
            addCriterion("INSTORE between", value1, value2, "instore");
            return (Criteria) this;
        }

        public Criteria andInstoreNotBetween(String value1, String value2) {
            addCriterion("INSTORE not between", value1, value2, "instore");
            return (Criteria) this;
        }

        public Criteria andInstorenameIsNull() {
            addCriterion("INSTORENAME is null");
            return (Criteria) this;
        }

        public Criteria andInstorenameIsNotNull() {
            addCriterion("INSTORENAME is not null");
            return (Criteria) this;
        }

        public Criteria andInstorenameEqualTo(String value) {
            addCriterion("INSTORENAME =", value, "instorename");
            return (Criteria) this;
        }

        public Criteria andInstorenameNotEqualTo(String value) {
            addCriterion("INSTORENAME <>", value, "instorename");
            return (Criteria) this;
        }

        public Criteria andInstorenameGreaterThan(String value) {
            addCriterion("INSTORENAME >", value, "instorename");
            return (Criteria) this;
        }

        public Criteria andInstorenameGreaterThanOrEqualTo(String value) {
            addCriterion("INSTORENAME >=", value, "instorename");
            return (Criteria) this;
        }

        public Criteria andInstorenameLessThan(String value) {
            addCriterion("INSTORENAME <", value, "instorename");
            return (Criteria) this;
        }

        public Criteria andInstorenameLessThanOrEqualTo(String value) {
            addCriterion("INSTORENAME <=", value, "instorename");
            return (Criteria) this;
        }

        public Criteria andInstorenameLike(String value) {
            addCriterion("INSTORENAME like", value, "instorename");
            return (Criteria) this;
        }

        public Criteria andInstorenameNotLike(String value) {
            addCriterion("INSTORENAME not like", value, "instorename");
            return (Criteria) this;
        }

        public Criteria andInstorenameIn(List<String> values) {
            addCriterion("INSTORENAME in", values, "instorename");
            return (Criteria) this;
        }

        public Criteria andInstorenameNotIn(List<String> values) {
            addCriterion("INSTORENAME not in", values, "instorename");
            return (Criteria) this;
        }

        public Criteria andInstorenameBetween(String value1, String value2) {
            addCriterion("INSTORENAME between", value1, value2, "instorename");
            return (Criteria) this;
        }

        public Criteria andInstorenameNotBetween(String value1, String value2) {
            addCriterion("INSTORENAME not between", value1, value2, "instorename");
            return (Criteria) this;
        }

        public Criteria andDevicenoIsNull() {
            addCriterion("DEVICENO is null");
            return (Criteria) this;
        }

        public Criteria andDevicenoIsNotNull() {
            addCriterion("DEVICENO is not null");
            return (Criteria) this;
        }

        public Criteria andDevicenoEqualTo(String value) {
            addCriterion("DEVICENO =", value, "deviceno");
            return (Criteria) this;
        }

        public Criteria andDevicenoNotEqualTo(String value) {
            addCriterion("DEVICENO <>", value, "deviceno");
            return (Criteria) this;
        }

        public Criteria andDevicenoGreaterThan(String value) {
            addCriterion("DEVICENO >", value, "deviceno");
            return (Criteria) this;
        }

        public Criteria andDevicenoGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICENO >=", value, "deviceno");
            return (Criteria) this;
        }

        public Criteria andDevicenoLessThan(String value) {
            addCriterion("DEVICENO <", value, "deviceno");
            return (Criteria) this;
        }

        public Criteria andDevicenoLessThanOrEqualTo(String value) {
            addCriterion("DEVICENO <=", value, "deviceno");
            return (Criteria) this;
        }

        public Criteria andDevicenoLike(String value) {
            addCriterion("DEVICENO like", value, "deviceno");
            return (Criteria) this;
        }

        public Criteria andDevicenoNotLike(String value) {
            addCriterion("DEVICENO not like", value, "deviceno");
            return (Criteria) this;
        }

        public Criteria andDevicenoIn(List<String> values) {
            addCriterion("DEVICENO in", values, "deviceno");
            return (Criteria) this;
        }

        public Criteria andDevicenoNotIn(List<String> values) {
            addCriterion("DEVICENO not in", values, "deviceno");
            return (Criteria) this;
        }

        public Criteria andDevicenoBetween(String value1, String value2) {
            addCriterion("DEVICENO between", value1, value2, "deviceno");
            return (Criteria) this;
        }

        public Criteria andDevicenoNotBetween(String value1, String value2) {
            addCriterion("DEVICENO not between", value1, value2, "deviceno");
            return (Criteria) this;
        }

        public Criteria andPlandateIsNull() {
            addCriterion("PLANDATE is null");
            return (Criteria) this;
        }

        public Criteria andPlandateIsNotNull() {
            addCriterion("PLANDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPlandateEqualTo(String value) {
            addCriterion("PLANDATE =", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotEqualTo(String value) {
            addCriterion("PLANDATE <>", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateGreaterThan(String value) {
            addCriterion("PLANDATE >", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateGreaterThanOrEqualTo(String value) {
            addCriterion("PLANDATE >=", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateLessThan(String value) {
            addCriterion("PLANDATE <", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateLessThanOrEqualTo(String value) {
            addCriterion("PLANDATE <=", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateLike(String value) {
            addCriterion("PLANDATE like", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotLike(String value) {
            addCriterion("PLANDATE not like", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateIn(List<String> values) {
            addCriterion("PLANDATE in", values, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotIn(List<String> values) {
            addCriterion("PLANDATE not in", values, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateBetween(String value1, String value2) {
            addCriterion("PLANDATE between", value1, value2, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotBetween(String value1, String value2) {
            addCriterion("PLANDATE not between", value1, value2, "plandate");
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

        public Criteria andLinaddressIsNull() {
            addCriterion("LINADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andLinaddressIsNotNull() {
            addCriterion("LINADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andLinaddressEqualTo(String value) {
            addCriterion("LINADDRESS =", value, "linaddress");
            return (Criteria) this;
        }

        public Criteria andLinaddressNotEqualTo(String value) {
            addCriterion("LINADDRESS <>", value, "linaddress");
            return (Criteria) this;
        }

        public Criteria andLinaddressGreaterThan(String value) {
            addCriterion("LINADDRESS >", value, "linaddress");
            return (Criteria) this;
        }

        public Criteria andLinaddressGreaterThanOrEqualTo(String value) {
            addCriterion("LINADDRESS >=", value, "linaddress");
            return (Criteria) this;
        }

        public Criteria andLinaddressLessThan(String value) {
            addCriterion("LINADDRESS <", value, "linaddress");
            return (Criteria) this;
        }

        public Criteria andLinaddressLessThanOrEqualTo(String value) {
            addCriterion("LINADDRESS <=", value, "linaddress");
            return (Criteria) this;
        }

        public Criteria andLinaddressLike(String value) {
            addCriterion("LINADDRESS like", value, "linaddress");
            return (Criteria) this;
        }

        public Criteria andLinaddressNotLike(String value) {
            addCriterion("LINADDRESS not like", value, "linaddress");
            return (Criteria) this;
        }

        public Criteria andLinaddressIn(List<String> values) {
            addCriterion("LINADDRESS in", values, "linaddress");
            return (Criteria) this;
        }

        public Criteria andLinaddressNotIn(List<String> values) {
            addCriterion("LINADDRESS not in", values, "linaddress");
            return (Criteria) this;
        }

        public Criteria andLinaddressBetween(String value1, String value2) {
            addCriterion("LINADDRESS between", value1, value2, "linaddress");
            return (Criteria) this;
        }

        public Criteria andLinaddressNotBetween(String value1, String value2) {
            addCriterion("LINADDRESS not between", value1, value2, "linaddress");
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

        public Criteria andSumoutnumIsNull() {
            addCriterion("SUMOUTNUM is null");
            return (Criteria) this;
        }

        public Criteria andSumoutnumIsNotNull() {
            addCriterion("SUMOUTNUM is not null");
            return (Criteria) this;
        }

        public Criteria andSumoutnumEqualTo(BigDecimal value) {
            addCriterion("SUMOUTNUM =", value, "sumoutnum");
            return (Criteria) this;
        }

        public Criteria andSumoutnumNotEqualTo(BigDecimal value) {
            addCriterion("SUMOUTNUM <>", value, "sumoutnum");
            return (Criteria) this;
        }

        public Criteria andSumoutnumGreaterThan(BigDecimal value) {
            addCriterion("SUMOUTNUM >", value, "sumoutnum");
            return (Criteria) this;
        }

        public Criteria andSumoutnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUMOUTNUM >=", value, "sumoutnum");
            return (Criteria) this;
        }

        public Criteria andSumoutnumLessThan(BigDecimal value) {
            addCriterion("SUMOUTNUM <", value, "sumoutnum");
            return (Criteria) this;
        }

        public Criteria andSumoutnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUMOUTNUM <=", value, "sumoutnum");
            return (Criteria) this;
        }

        public Criteria andSumoutnumIn(List<BigDecimal> values) {
            addCriterion("SUMOUTNUM in", values, "sumoutnum");
            return (Criteria) this;
        }

        public Criteria andSumoutnumNotIn(List<BigDecimal> values) {
            addCriterion("SUMOUTNUM not in", values, "sumoutnum");
            return (Criteria) this;
        }

        public Criteria andSumoutnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUMOUTNUM between", value1, value2, "sumoutnum");
            return (Criteria) this;
        }

        public Criteria andSumoutnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUMOUTNUM not between", value1, value2, "sumoutnum");
            return (Criteria) this;
        }

        public Criteria andSuminnumIsNull() {
            addCriterion("SUMINNUM is null");
            return (Criteria) this;
        }

        public Criteria andSuminnumIsNotNull() {
            addCriterion("SUMINNUM is not null");
            return (Criteria) this;
        }

        public Criteria andSuminnumEqualTo(BigDecimal value) {
            addCriterion("SUMINNUM =", value, "suminnum");
            return (Criteria) this;
        }

        public Criteria andSuminnumNotEqualTo(BigDecimal value) {
            addCriterion("SUMINNUM <>", value, "suminnum");
            return (Criteria) this;
        }

        public Criteria andSuminnumGreaterThan(BigDecimal value) {
            addCriterion("SUMINNUM >", value, "suminnum");
            return (Criteria) this;
        }

        public Criteria andSuminnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUMINNUM >=", value, "suminnum");
            return (Criteria) this;
        }

        public Criteria andSuminnumLessThan(BigDecimal value) {
            addCriterion("SUMINNUM <", value, "suminnum");
            return (Criteria) this;
        }

        public Criteria andSuminnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUMINNUM <=", value, "suminnum");
            return (Criteria) this;
        }

        public Criteria andSuminnumIn(List<BigDecimal> values) {
            addCriterion("SUMINNUM in", values, "suminnum");
            return (Criteria) this;
        }

        public Criteria andSuminnumNotIn(List<BigDecimal> values) {
            addCriterion("SUMINNUM not in", values, "suminnum");
            return (Criteria) this;
        }

        public Criteria andSuminnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUMINNUM between", value1, value2, "suminnum");
            return (Criteria) this;
        }

        public Criteria andSuminnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUMINNUM not between", value1, value2, "suminnum");
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

        public Criteria andClosedEqualTo(Short value) {
            addCriterion("CLOSED =", value, "closed");
            return (Criteria) this;
        }

        public Criteria andClosedNotEqualTo(Short value) {
            addCriterion("CLOSED <>", value, "closed");
            return (Criteria) this;
        }

        public Criteria andClosedGreaterThan(Short value) {
            addCriterion("CLOSED >", value, "closed");
            return (Criteria) this;
        }

        public Criteria andClosedGreaterThanOrEqualTo(Short value) {
            addCriterion("CLOSED >=", value, "closed");
            return (Criteria) this;
        }

        public Criteria andClosedLessThan(Short value) {
            addCriterion("CLOSED <", value, "closed");
            return (Criteria) this;
        }

        public Criteria andClosedLessThanOrEqualTo(Short value) {
            addCriterion("CLOSED <=", value, "closed");
            return (Criteria) this;
        }

        public Criteria andClosedIn(List<Short> values) {
            addCriterion("CLOSED in", values, "closed");
            return (Criteria) this;
        }

        public Criteria andClosedNotIn(List<Short> values) {
            addCriterion("CLOSED not in", values, "closed");
            return (Criteria) this;
        }

        public Criteria andClosedBetween(Short value1, Short value2) {
            addCriterion("CLOSED between", value1, value2, "closed");
            return (Criteria) this;
        }

        public Criteria andClosedNotBetween(Short value1, Short value2) {
            addCriterion("CLOSED not between", value1, value2, "closed");
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