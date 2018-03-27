package com.moudao.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BUserBottleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BUserBottleExample() {
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

        public Criteria andUserBottleIdIsNull() {
            addCriterion("user_bottle_id is null");
            return (Criteria) this;
        }

        public Criteria andUserBottleIdIsNotNull() {
            addCriterion("user_bottle_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserBottleIdEqualTo(Integer value) {
            addCriterion("user_bottle_id =", value, "userBottleId");
            return (Criteria) this;
        }

        public Criteria andUserBottleIdNotEqualTo(Integer value) {
            addCriterion("user_bottle_id <>", value, "userBottleId");
            return (Criteria) this;
        }

        public Criteria andUserBottleIdGreaterThan(Integer value) {
            addCriterion("user_bottle_id >", value, "userBottleId");
            return (Criteria) this;
        }

        public Criteria andUserBottleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_bottle_id >=", value, "userBottleId");
            return (Criteria) this;
        }

        public Criteria andUserBottleIdLessThan(Integer value) {
            addCriterion("user_bottle_id <", value, "userBottleId");
            return (Criteria) this;
        }

        public Criteria andUserBottleIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_bottle_id <=", value, "userBottleId");
            return (Criteria) this;
        }

        public Criteria andUserBottleIdIn(List<Integer> values) {
            addCriterion("user_bottle_id in", values, "userBottleId");
            return (Criteria) this;
        }

        public Criteria andUserBottleIdNotIn(List<Integer> values) {
            addCriterion("user_bottle_id not in", values, "userBottleId");
            return (Criteria) this;
        }

        public Criteria andUserBottleIdBetween(Integer value1, Integer value2) {
            addCriterion("user_bottle_id between", value1, value2, "userBottleId");
            return (Criteria) this;
        }

        public Criteria andUserBottleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_bottle_id not between", value1, value2, "userBottleId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andBottleIdIsNull() {
            addCriterion("bottle_id is null");
            return (Criteria) this;
        }

        public Criteria andBottleIdIsNotNull() {
            addCriterion("bottle_id is not null");
            return (Criteria) this;
        }

        public Criteria andBottleIdEqualTo(Integer value) {
            addCriterion("bottle_id =", value, "bottleId");
            return (Criteria) this;
        }

        public Criteria andBottleIdNotEqualTo(Integer value) {
            addCriterion("bottle_id <>", value, "bottleId");
            return (Criteria) this;
        }

        public Criteria andBottleIdGreaterThan(Integer value) {
            addCriterion("bottle_id >", value, "bottleId");
            return (Criteria) this;
        }

        public Criteria andBottleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bottle_id >=", value, "bottleId");
            return (Criteria) this;
        }

        public Criteria andBottleIdLessThan(Integer value) {
            addCriterion("bottle_id <", value, "bottleId");
            return (Criteria) this;
        }

        public Criteria andBottleIdLessThanOrEqualTo(Integer value) {
            addCriterion("bottle_id <=", value, "bottleId");
            return (Criteria) this;
        }

        public Criteria andBottleIdIn(List<Integer> values) {
            addCriterion("bottle_id in", values, "bottleId");
            return (Criteria) this;
        }

        public Criteria andBottleIdNotIn(List<Integer> values) {
            addCriterion("bottle_id not in", values, "bottleId");
            return (Criteria) this;
        }

        public Criteria andBottleIdBetween(Integer value1, Integer value2) {
            addCriterion("bottle_id between", value1, value2, "bottleId");
            return (Criteria) this;
        }

        public Criteria andBottleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bottle_id not between", value1, value2, "bottleId");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
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