package com.csjscm.mysqldata.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysPermissionInitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysPermissionInitExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andPermissionInitIsNull() {
            addCriterion("permission_init is null");
            return (Criteria) this;
        }

        public Criteria andPermissionInitIsNotNull() {
            addCriterion("permission_init is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionInitEqualTo(String value) {
            addCriterion("permission_init =", value, "permissionInit");
            return (Criteria) this;
        }

        public Criteria andPermissionInitNotEqualTo(String value) {
            addCriterion("permission_init <>", value, "permissionInit");
            return (Criteria) this;
        }

        public Criteria andPermissionInitGreaterThan(String value) {
            addCriterion("permission_init >", value, "permissionInit");
            return (Criteria) this;
        }

        public Criteria andPermissionInitGreaterThanOrEqualTo(String value) {
            addCriterion("permission_init >=", value, "permissionInit");
            return (Criteria) this;
        }

        public Criteria andPermissionInitLessThan(String value) {
            addCriterion("permission_init <", value, "permissionInit");
            return (Criteria) this;
        }

        public Criteria andPermissionInitLessThanOrEqualTo(String value) {
            addCriterion("permission_init <=", value, "permissionInit");
            return (Criteria) this;
        }

        public Criteria andPermissionInitLike(String value) {
            addCriterion("permission_init like", value, "permissionInit");
            return (Criteria) this;
        }

        public Criteria andPermissionInitNotLike(String value) {
            addCriterion("permission_init not like", value, "permissionInit");
            return (Criteria) this;
        }

        public Criteria andPermissionInitIn(List<String> values) {
            addCriterion("permission_init in", values, "permissionInit");
            return (Criteria) this;
        }

        public Criteria andPermissionInitNotIn(List<String> values) {
            addCriterion("permission_init not in", values, "permissionInit");
            return (Criteria) this;
        }

        public Criteria andPermissionInitBetween(String value1, String value2) {
            addCriterion("permission_init between", value1, value2, "permissionInit");
            return (Criteria) this;
        }

        public Criteria andPermissionInitNotBetween(String value1, String value2) {
            addCriterion("permission_init not between", value1, value2, "permissionInit");
            return (Criteria) this;
        }

        public Criteria andGmtModifyIsNull() {
            addCriterion("gmt_modify is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifyIsNotNull() {
            addCriterion("gmt_modify is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifyEqualTo(Date value) {
            addCriterion("gmt_modify =", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyNotEqualTo(Date value) {
            addCriterion("gmt_modify <>", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyGreaterThan(Date value) {
            addCriterion("gmt_modify >", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modify >=", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyLessThan(Date value) {
            addCriterion("gmt_modify <", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modify <=", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyIn(List<Date> values) {
            addCriterion("gmt_modify in", values, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyNotIn(List<Date> values) {
            addCriterion("gmt_modify not in", values, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyBetween(Date value1, Date value2) {
            addCriterion("gmt_modify between", value1, value2, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modify not between", value1, value2, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeIsNull() {
            addCriterion("permission_type is null");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeIsNotNull() {
            addCriterion("permission_type is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeEqualTo(String value) {
            addCriterion("permission_type =", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeNotEqualTo(String value) {
            addCriterion("permission_type <>", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeGreaterThan(String value) {
            addCriterion("permission_type >", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("permission_type >=", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeLessThan(String value) {
            addCriterion("permission_type <", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeLessThanOrEqualTo(String value) {
            addCriterion("permission_type <=", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeLike(String value) {
            addCriterion("permission_type like", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeNotLike(String value) {
            addCriterion("permission_type not like", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeIn(List<String> values) {
            addCriterion("permission_type in", values, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeNotIn(List<String> values) {
            addCriterion("permission_type not in", values, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeBetween(String value1, String value2) {
            addCriterion("permission_type between", value1, value2, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeNotBetween(String value1, String value2) {
            addCriterion("permission_type not between", value1, value2, "permissionType");
            return (Criteria) this;
        }

        public Criteria andObligateIsNull() {
            addCriterion("obligate is null");
            return (Criteria) this;
        }

        public Criteria andObligateIsNotNull() {
            addCriterion("obligate is not null");
            return (Criteria) this;
        }

        public Criteria andObligateEqualTo(String value) {
            addCriterion("obligate =", value, "obligate");
            return (Criteria) this;
        }

        public Criteria andObligateNotEqualTo(String value) {
            addCriterion("obligate <>", value, "obligate");
            return (Criteria) this;
        }

        public Criteria andObligateGreaterThan(String value) {
            addCriterion("obligate >", value, "obligate");
            return (Criteria) this;
        }

        public Criteria andObligateGreaterThanOrEqualTo(String value) {
            addCriterion("obligate >=", value, "obligate");
            return (Criteria) this;
        }

        public Criteria andObligateLessThan(String value) {
            addCriterion("obligate <", value, "obligate");
            return (Criteria) this;
        }

        public Criteria andObligateLessThanOrEqualTo(String value) {
            addCriterion("obligate <=", value, "obligate");
            return (Criteria) this;
        }

        public Criteria andObligateLike(String value) {
            addCriterion("obligate like", value, "obligate");
            return (Criteria) this;
        }

        public Criteria andObligateNotLike(String value) {
            addCriterion("obligate not like", value, "obligate");
            return (Criteria) this;
        }

        public Criteria andObligateIn(List<String> values) {
            addCriterion("obligate in", values, "obligate");
            return (Criteria) this;
        }

        public Criteria andObligateNotIn(List<String> values) {
            addCriterion("obligate not in", values, "obligate");
            return (Criteria) this;
        }

        public Criteria andObligateBetween(String value1, String value2) {
            addCriterion("obligate between", value1, value2, "obligate");
            return (Criteria) this;
        }

        public Criteria andObligateNotBetween(String value1, String value2) {
            addCriterion("obligate not between", value1, value2, "obligate");
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