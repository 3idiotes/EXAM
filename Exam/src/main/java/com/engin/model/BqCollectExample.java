package com.engin.model;

import java.util.ArrayList;
import java.util.List;

public class BqCollectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BqCollectExample() {
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

        public Criteria andBqcidIsNull() {
            addCriterion("bqcid is null");
            return (Criteria) this;
        }

        public Criteria andBqcidIsNotNull() {
            addCriterion("bqcid is not null");
            return (Criteria) this;
        }

        public Criteria andBqcidEqualTo(Integer value) {
            addCriterion("bqcid =", value, "bqcid");
            return (Criteria) this;
        }

        public Criteria andBqcidNotEqualTo(Integer value) {
            addCriterion("bqcid <>", value, "bqcid");
            return (Criteria) this;
        }

        public Criteria andBqcidGreaterThan(Integer value) {
            addCriterion("bqcid >", value, "bqcid");
            return (Criteria) this;
        }

        public Criteria andBqcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bqcid >=", value, "bqcid");
            return (Criteria) this;
        }

        public Criteria andBqcidLessThan(Integer value) {
            addCriterion("bqcid <", value, "bqcid");
            return (Criteria) this;
        }

        public Criteria andBqcidLessThanOrEqualTo(Integer value) {
            addCriterion("bqcid <=", value, "bqcid");
            return (Criteria) this;
        }

        public Criteria andBqcidIn(List<Integer> values) {
            addCriterion("bqcid in", values, "bqcid");
            return (Criteria) this;
        }

        public Criteria andBqcidNotIn(List<Integer> values) {
            addCriterion("bqcid not in", values, "bqcid");
            return (Criteria) this;
        }

        public Criteria andBqcidBetween(Integer value1, Integer value2) {
            addCriterion("bqcid between", value1, value2, "bqcid");
            return (Criteria) this;
        }

        public Criteria andBqcidNotBetween(Integer value1, Integer value2) {
            addCriterion("bqcid not between", value1, value2, "bqcid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andBqidIsNull() {
            addCriterion("bqid is null");
            return (Criteria) this;
        }

        public Criteria andBqidIsNotNull() {
            addCriterion("bqid is not null");
            return (Criteria) this;
        }

        public Criteria andBqidEqualTo(Integer value) {
            addCriterion("bqid =", value, "bqid");
            return (Criteria) this;
        }

        public Criteria andBqidNotEqualTo(Integer value) {
            addCriterion("bqid <>", value, "bqid");
            return (Criteria) this;
        }

        public Criteria andBqidGreaterThan(Integer value) {
            addCriterion("bqid >", value, "bqid");
            return (Criteria) this;
        }

        public Criteria andBqidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bqid >=", value, "bqid");
            return (Criteria) this;
        }

        public Criteria andBqidLessThan(Integer value) {
            addCriterion("bqid <", value, "bqid");
            return (Criteria) this;
        }

        public Criteria andBqidLessThanOrEqualTo(Integer value) {
            addCriterion("bqid <=", value, "bqid");
            return (Criteria) this;
        }

        public Criteria andBqidIn(List<Integer> values) {
            addCriterion("bqid in", values, "bqid");
            return (Criteria) this;
        }

        public Criteria andBqidNotIn(List<Integer> values) {
            addCriterion("bqid not in", values, "bqid");
            return (Criteria) this;
        }

        public Criteria andBqidBetween(Integer value1, Integer value2) {
            addCriterion("bqid between", value1, value2, "bqid");
            return (Criteria) this;
        }

        public Criteria andBqidNotBetween(Integer value1, Integer value2) {
            addCriterion("bqid not between", value1, value2, "bqid");
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