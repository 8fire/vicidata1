package com.csjscm.oracledata.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ReceivableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReceivableExample() {
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

        public Criteria andSaleorderIsNull() {
            addCriterion("SALEORDER is null");
            return (Criteria) this;
        }

        public Criteria andSaleorderIsNotNull() {
            addCriterion("SALEORDER is not null");
            return (Criteria) this;
        }

        public Criteria andSaleorderEqualTo(String value) {
            addCriterion("SALEORDER =", value, "saleorder");
            return (Criteria) this;
        }

        public Criteria andSaleorderNotEqualTo(String value) {
            addCriterion("SALEORDER <>", value, "saleorder");
            return (Criteria) this;
        }

        public Criteria andSaleorderGreaterThan(String value) {
            addCriterion("SALEORDER >", value, "saleorder");
            return (Criteria) this;
        }

        public Criteria andSaleorderGreaterThanOrEqualTo(String value) {
            addCriterion("SALEORDER >=", value, "saleorder");
            return (Criteria) this;
        }

        public Criteria andSaleorderLessThan(String value) {
            addCriterion("SALEORDER <", value, "saleorder");
            return (Criteria) this;
        }

        public Criteria andSaleorderLessThanOrEqualTo(String value) {
            addCriterion("SALEORDER <=", value, "saleorder");
            return (Criteria) this;
        }

        public Criteria andSaleorderLike(String value) {
            addCriterion("SALEORDER like", value, "saleorder");
            return (Criteria) this;
        }

        public Criteria andSaleorderNotLike(String value) {
            addCriterion("SALEORDER not like", value, "saleorder");
            return (Criteria) this;
        }

        public Criteria andSaleorderIn(List<String> values) {
            addCriterion("SALEORDER in", values, "saleorder");
            return (Criteria) this;
        }

        public Criteria andSaleorderNotIn(List<String> values) {
            addCriterion("SALEORDER not in", values, "saleorder");
            return (Criteria) this;
        }

        public Criteria andSaleorderBetween(String value1, String value2) {
            addCriterion("SALEORDER between", value1, value2, "saleorder");
            return (Criteria) this;
        }

        public Criteria andSaleorderNotBetween(String value1, String value2) {
            addCriterion("SALEORDER not between", value1, value2, "saleorder");
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

        public Criteria andFundnatureIsNull() {
            addCriterion("FUNDNATURE is null");
            return (Criteria) this;
        }

        public Criteria andFundnatureIsNotNull() {
            addCriterion("FUNDNATURE is not null");
            return (Criteria) this;
        }

        public Criteria andFundnatureEqualTo(Short value) {
            addCriterion("FUNDNATURE =", value, "fundnature");
            return (Criteria) this;
        }

        public Criteria andFundnatureNotEqualTo(Short value) {
            addCriterion("FUNDNATURE <>", value, "fundnature");
            return (Criteria) this;
        }

        public Criteria andFundnatureGreaterThan(Short value) {
            addCriterion("FUNDNATURE >", value, "fundnature");
            return (Criteria) this;
        }

        public Criteria andFundnatureGreaterThanOrEqualTo(Short value) {
            addCriterion("FUNDNATURE >=", value, "fundnature");
            return (Criteria) this;
        }

        public Criteria andFundnatureLessThan(Short value) {
            addCriterion("FUNDNATURE <", value, "fundnature");
            return (Criteria) this;
        }

        public Criteria andFundnatureLessThanOrEqualTo(Short value) {
            addCriterion("FUNDNATURE <=", value, "fundnature");
            return (Criteria) this;
        }

        public Criteria andFundnatureIn(List<Short> values) {
            addCriterion("FUNDNATURE in", values, "fundnature");
            return (Criteria) this;
        }

        public Criteria andFundnatureNotIn(List<Short> values) {
            addCriterion("FUNDNATURE not in", values, "fundnature");
            return (Criteria) this;
        }

        public Criteria andFundnatureBetween(Short value1, Short value2) {
            addCriterion("FUNDNATURE between", value1, value2, "fundnature");
            return (Criteria) this;
        }

        public Criteria andFundnatureNotBetween(Short value1, Short value2) {
            addCriterion("FUNDNATURE not between", value1, value2, "fundnature");
            return (Criteria) this;
        }

        public Criteria andSettlementmethodIsNull() {
            addCriterion("SETTLEMENTMETHOD is null");
            return (Criteria) this;
        }

        public Criteria andSettlementmethodIsNotNull() {
            addCriterion("SETTLEMENTMETHOD is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementmethodEqualTo(Short value) {
            addCriterion("SETTLEMENTMETHOD =", value, "settlementmethod");
            return (Criteria) this;
        }

        public Criteria andSettlementmethodNotEqualTo(Short value) {
            addCriterion("SETTLEMENTMETHOD <>", value, "settlementmethod");
            return (Criteria) this;
        }

        public Criteria andSettlementmethodGreaterThan(Short value) {
            addCriterion("SETTLEMENTMETHOD >", value, "settlementmethod");
            return (Criteria) this;
        }

        public Criteria andSettlementmethodGreaterThanOrEqualTo(Short value) {
            addCriterion("SETTLEMENTMETHOD >=", value, "settlementmethod");
            return (Criteria) this;
        }

        public Criteria andSettlementmethodLessThan(Short value) {
            addCriterion("SETTLEMENTMETHOD <", value, "settlementmethod");
            return (Criteria) this;
        }

        public Criteria andSettlementmethodLessThanOrEqualTo(Short value) {
            addCriterion("SETTLEMENTMETHOD <=", value, "settlementmethod");
            return (Criteria) this;
        }

        public Criteria andSettlementmethodIn(List<Short> values) {
            addCriterion("SETTLEMENTMETHOD in", values, "settlementmethod");
            return (Criteria) this;
        }

        public Criteria andSettlementmethodNotIn(List<Short> values) {
            addCriterion("SETTLEMENTMETHOD not in", values, "settlementmethod");
            return (Criteria) this;
        }

        public Criteria andSettlementmethodBetween(Short value1, Short value2) {
            addCriterion("SETTLEMENTMETHOD between", value1, value2, "settlementmethod");
            return (Criteria) this;
        }

        public Criteria andSettlementmethodNotBetween(Short value1, Short value2) {
            addCriterion("SETTLEMENTMETHOD not between", value1, value2, "settlementmethod");
            return (Criteria) this;
        }

        public Criteria andPayerIsNull() {
            addCriterion("PAYER is null");
            return (Criteria) this;
        }

        public Criteria andPayerIsNotNull() {
            addCriterion("PAYER is not null");
            return (Criteria) this;
        }

        public Criteria andPayerEqualTo(String value) {
            addCriterion("PAYER =", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotEqualTo(String value) {
            addCriterion("PAYER <>", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerGreaterThan(String value) {
            addCriterion("PAYER >", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerGreaterThanOrEqualTo(String value) {
            addCriterion("PAYER >=", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLessThan(String value) {
            addCriterion("PAYER <", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLessThanOrEqualTo(String value) {
            addCriterion("PAYER <=", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLike(String value) {
            addCriterion("PAYER like", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotLike(String value) {
            addCriterion("PAYER not like", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerIn(List<String> values) {
            addCriterion("PAYER in", values, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotIn(List<String> values) {
            addCriterion("PAYER not in", values, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerBetween(String value1, String value2) {
            addCriterion("PAYER between", value1, value2, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotBetween(String value1, String value2) {
            addCriterion("PAYER not between", value1, value2, "payer");
            return (Criteria) this;
        }

        public Criteria andPayernameIsNull() {
            addCriterion("PAYERNAME is null");
            return (Criteria) this;
        }

        public Criteria andPayernameIsNotNull() {
            addCriterion("PAYERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPayernameEqualTo(String value) {
            addCriterion("PAYERNAME =", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameNotEqualTo(String value) {
            addCriterion("PAYERNAME <>", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameGreaterThan(String value) {
            addCriterion("PAYERNAME >", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameGreaterThanOrEqualTo(String value) {
            addCriterion("PAYERNAME >=", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameLessThan(String value) {
            addCriterion("PAYERNAME <", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameLessThanOrEqualTo(String value) {
            addCriterion("PAYERNAME <=", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameLike(String value) {
            addCriterion("PAYERNAME like", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameNotLike(String value) {
            addCriterion("PAYERNAME not like", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameIn(List<String> values) {
            addCriterion("PAYERNAME in", values, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameNotIn(List<String> values) {
            addCriterion("PAYERNAME not in", values, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameBetween(String value1, String value2) {
            addCriterion("PAYERNAME between", value1, value2, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameNotBetween(String value1, String value2) {
            addCriterion("PAYERNAME not between", value1, value2, "payername");
            return (Criteria) this;
        }

        public Criteria andReceivablesIsNull() {
            addCriterion("RECEIVABLES is null");
            return (Criteria) this;
        }

        public Criteria andReceivablesIsNotNull() {
            addCriterion("RECEIVABLES is not null");
            return (Criteria) this;
        }

        public Criteria andReceivablesEqualTo(String value) {
            addCriterion("RECEIVABLES =", value, "receivables");
            return (Criteria) this;
        }

        public Criteria andReceivablesNotEqualTo(String value) {
            addCriterion("RECEIVABLES <>", value, "receivables");
            return (Criteria) this;
        }

        public Criteria andReceivablesGreaterThan(String value) {
            addCriterion("RECEIVABLES >", value, "receivables");
            return (Criteria) this;
        }

        public Criteria andReceivablesGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVABLES >=", value, "receivables");
            return (Criteria) this;
        }

        public Criteria andReceivablesLessThan(String value) {
            addCriterion("RECEIVABLES <", value, "receivables");
            return (Criteria) this;
        }

        public Criteria andReceivablesLessThanOrEqualTo(String value) {
            addCriterion("RECEIVABLES <=", value, "receivables");
            return (Criteria) this;
        }

        public Criteria andReceivablesLike(String value) {
            addCriterion("RECEIVABLES like", value, "receivables");
            return (Criteria) this;
        }

        public Criteria andReceivablesNotLike(String value) {
            addCriterion("RECEIVABLES not like", value, "receivables");
            return (Criteria) this;
        }

        public Criteria andReceivablesIn(List<String> values) {
            addCriterion("RECEIVABLES in", values, "receivables");
            return (Criteria) this;
        }

        public Criteria andReceivablesNotIn(List<String> values) {
            addCriterion("RECEIVABLES not in", values, "receivables");
            return (Criteria) this;
        }

        public Criteria andReceivablesBetween(String value1, String value2) {
            addCriterion("RECEIVABLES between", value1, value2, "receivables");
            return (Criteria) this;
        }

        public Criteria andReceivablesNotBetween(String value1, String value2) {
            addCriterion("RECEIVABLES not between", value1, value2, "receivables");
            return (Criteria) this;
        }

        public Criteria andReceivablesnameIsNull() {
            addCriterion("RECEIVABLESNAME is null");
            return (Criteria) this;
        }

        public Criteria andReceivablesnameIsNotNull() {
            addCriterion("RECEIVABLESNAME is not null");
            return (Criteria) this;
        }

        public Criteria andReceivablesnameEqualTo(String value) {
            addCriterion("RECEIVABLESNAME =", value, "receivablesname");
            return (Criteria) this;
        }

        public Criteria andReceivablesnameNotEqualTo(String value) {
            addCriterion("RECEIVABLESNAME <>", value, "receivablesname");
            return (Criteria) this;
        }

        public Criteria andReceivablesnameGreaterThan(String value) {
            addCriterion("RECEIVABLESNAME >", value, "receivablesname");
            return (Criteria) this;
        }

        public Criteria andReceivablesnameGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVABLESNAME >=", value, "receivablesname");
            return (Criteria) this;
        }

        public Criteria andReceivablesnameLessThan(String value) {
            addCriterion("RECEIVABLESNAME <", value, "receivablesname");
            return (Criteria) this;
        }

        public Criteria andReceivablesnameLessThanOrEqualTo(String value) {
            addCriterion("RECEIVABLESNAME <=", value, "receivablesname");
            return (Criteria) this;
        }

        public Criteria andReceivablesnameLike(String value) {
            addCriterion("RECEIVABLESNAME like", value, "receivablesname");
            return (Criteria) this;
        }

        public Criteria andReceivablesnameNotLike(String value) {
            addCriterion("RECEIVABLESNAME not like", value, "receivablesname");
            return (Criteria) this;
        }

        public Criteria andReceivablesnameIn(List<String> values) {
            addCriterion("RECEIVABLESNAME in", values, "receivablesname");
            return (Criteria) this;
        }

        public Criteria andReceivablesnameNotIn(List<String> values) {
            addCriterion("RECEIVABLESNAME not in", values, "receivablesname");
            return (Criteria) this;
        }

        public Criteria andReceivablesnameBetween(String value1, String value2) {
            addCriterion("RECEIVABLESNAME between", value1, value2, "receivablesname");
            return (Criteria) this;
        }

        public Criteria andReceivablesnameNotBetween(String value1, String value2) {
            addCriterion("RECEIVABLESNAME not between", value1, value2, "receivablesname");
            return (Criteria) this;
        }

        public Criteria andRecamountIsNull() {
            addCriterion("RECAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRecamountIsNotNull() {
            addCriterion("RECAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRecamountEqualTo(BigDecimal value) {
            addCriterion("RECAMOUNT =", value, "recamount");
            return (Criteria) this;
        }

        public Criteria andRecamountNotEqualTo(BigDecimal value) {
            addCriterion("RECAMOUNT <>", value, "recamount");
            return (Criteria) this;
        }

        public Criteria andRecamountGreaterThan(BigDecimal value) {
            addCriterion("RECAMOUNT >", value, "recamount");
            return (Criteria) this;
        }

        public Criteria andRecamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RECAMOUNT >=", value, "recamount");
            return (Criteria) this;
        }

        public Criteria andRecamountLessThan(BigDecimal value) {
            addCriterion("RECAMOUNT <", value, "recamount");
            return (Criteria) this;
        }

        public Criteria andRecamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RECAMOUNT <=", value, "recamount");
            return (Criteria) this;
        }

        public Criteria andRecamountIn(List<BigDecimal> values) {
            addCriterion("RECAMOUNT in", values, "recamount");
            return (Criteria) this;
        }

        public Criteria andRecamountNotIn(List<BigDecimal> values) {
            addCriterion("RECAMOUNT not in", values, "recamount");
            return (Criteria) this;
        }

        public Criteria andRecamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECAMOUNT between", value1, value2, "recamount");
            return (Criteria) this;
        }

        public Criteria andRecamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECAMOUNT not between", value1, value2, "recamount");
            return (Criteria) this;
        }

        public Criteria andRecdateIsNull() {
            addCriterion("RECDATE is null");
            return (Criteria) this;
        }

        public Criteria andRecdateIsNotNull() {
            addCriterion("RECDATE is not null");
            return (Criteria) this;
        }

        public Criteria andRecdateEqualTo(String value) {
            addCriterion("RECDATE =", value, "recdate");
            return (Criteria) this;
        }

        public Criteria andRecdateNotEqualTo(String value) {
            addCriterion("RECDATE <>", value, "recdate");
            return (Criteria) this;
        }

        public Criteria andRecdateGreaterThan(String value) {
            addCriterion("RECDATE >", value, "recdate");
            return (Criteria) this;
        }

        public Criteria andRecdateGreaterThanOrEqualTo(String value) {
            addCriterion("RECDATE >=", value, "recdate");
            return (Criteria) this;
        }

        public Criteria andRecdateLessThan(String value) {
            addCriterion("RECDATE <", value, "recdate");
            return (Criteria) this;
        }

        public Criteria andRecdateLessThanOrEqualTo(String value) {
            addCriterion("RECDATE <=", value, "recdate");
            return (Criteria) this;
        }

        public Criteria andRecdateLike(String value) {
            addCriterion("RECDATE like", value, "recdate");
            return (Criteria) this;
        }

        public Criteria andRecdateNotLike(String value) {
            addCriterion("RECDATE not like", value, "recdate");
            return (Criteria) this;
        }

        public Criteria andRecdateIn(List<String> values) {
            addCriterion("RECDATE in", values, "recdate");
            return (Criteria) this;
        }

        public Criteria andRecdateNotIn(List<String> values) {
            addCriterion("RECDATE not in", values, "recdate");
            return (Criteria) this;
        }

        public Criteria andRecdateBetween(String value1, String value2) {
            addCriterion("RECDATE between", value1, value2, "recdate");
            return (Criteria) this;
        }

        public Criteria andRecdateNotBetween(String value1, String value2) {
            addCriterion("RECDATE not between", value1, value2, "recdate");
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

        public Criteria andEnclosureIsNull() {
            addCriterion("ENCLOSURE is null");
            return (Criteria) this;
        }

        public Criteria andEnclosureIsNotNull() {
            addCriterion("ENCLOSURE is not null");
            return (Criteria) this;
        }

        public Criteria andEnclosureEqualTo(String value) {
            addCriterion("ENCLOSURE =", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureNotEqualTo(String value) {
            addCriterion("ENCLOSURE <>", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureGreaterThan(String value) {
            addCriterion("ENCLOSURE >", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureGreaterThanOrEqualTo(String value) {
            addCriterion("ENCLOSURE >=", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureLessThan(String value) {
            addCriterion("ENCLOSURE <", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureLessThanOrEqualTo(String value) {
            addCriterion("ENCLOSURE <=", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureLike(String value) {
            addCriterion("ENCLOSURE like", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureNotLike(String value) {
            addCriterion("ENCLOSURE not like", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureIn(List<String> values) {
            addCriterion("ENCLOSURE in", values, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureNotIn(List<String> values) {
            addCriterion("ENCLOSURE not in", values, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureBetween(String value1, String value2) {
            addCriterion("ENCLOSURE between", value1, value2, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureNotBetween(String value1, String value2) {
            addCriterion("ENCLOSURE not between", value1, value2, "enclosure");
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