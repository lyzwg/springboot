package com.zjy.springboot.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TFollowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TFollowExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andFollowdataidIsNull() {
            addCriterion("FOLLOWDATAID is null");
            return (Criteria) this;
        }

        public Criteria andFollowdataidIsNotNull() {
            addCriterion("FOLLOWDATAID is not null");
            return (Criteria) this;
        }

        public Criteria andFollowdataidEqualTo(Long value) {
            addCriterion("FOLLOWDATAID =", value, "followdataid");
            return (Criteria) this;
        }

        public Criteria andFollowdataidNotEqualTo(Long value) {
            addCriterion("FOLLOWDATAID <>", value, "followdataid");
            return (Criteria) this;
        }

        public Criteria andFollowdataidGreaterThan(Long value) {
            addCriterion("FOLLOWDATAID >", value, "followdataid");
            return (Criteria) this;
        }

        public Criteria andFollowdataidGreaterThanOrEqualTo(Long value) {
            addCriterion("FOLLOWDATAID >=", value, "followdataid");
            return (Criteria) this;
        }

        public Criteria andFollowdataidLessThan(Long value) {
            addCriterion("FOLLOWDATAID <", value, "followdataid");
            return (Criteria) this;
        }

        public Criteria andFollowdataidLessThanOrEqualTo(Long value) {
            addCriterion("FOLLOWDATAID <=", value, "followdataid");
            return (Criteria) this;
        }

        public Criteria andFollowdataidIn(List<Long> values) {
            addCriterion("FOLLOWDATAID in", values, "followdataid");
            return (Criteria) this;
        }

        public Criteria andFollowdataidNotIn(List<Long> values) {
            addCriterion("FOLLOWDATAID not in", values, "followdataid");
            return (Criteria) this;
        }

        public Criteria andFollowdataidBetween(Long value1, Long value2) {
            addCriterion("FOLLOWDATAID between", value1, value2, "followdataid");
            return (Criteria) this;
        }

        public Criteria andFollowdataidNotBetween(Long value1, Long value2) {
            addCriterion("FOLLOWDATAID not between", value1, value2, "followdataid");
            return (Criteria) this;
        }

        public Criteria andFollowtypeIsNull() {
            addCriterion("FOLLOWTYPE is null");
            return (Criteria) this;
        }

        public Criteria andFollowtypeIsNotNull() {
            addCriterion("FOLLOWTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFollowtypeEqualTo(String value) {
            addCriterion("FOLLOWTYPE =", value, "followtype");
            return (Criteria) this;
        }

        public Criteria andFollowtypeNotEqualTo(String value) {
            addCriterion("FOLLOWTYPE <>", value, "followtype");
            return (Criteria) this;
        }

        public Criteria andFollowtypeGreaterThan(String value) {
            addCriterion("FOLLOWTYPE >", value, "followtype");
            return (Criteria) this;
        }

        public Criteria andFollowtypeGreaterThanOrEqualTo(String value) {
            addCriterion("FOLLOWTYPE >=", value, "followtype");
            return (Criteria) this;
        }

        public Criteria andFollowtypeLessThan(String value) {
            addCriterion("FOLLOWTYPE <", value, "followtype");
            return (Criteria) this;
        }

        public Criteria andFollowtypeLessThanOrEqualTo(String value) {
            addCriterion("FOLLOWTYPE <=", value, "followtype");
            return (Criteria) this;
        }

        public Criteria andFollowtypeLike(String value) {
            addCriterion("FOLLOWTYPE like", value, "followtype");
            return (Criteria) this;
        }

        public Criteria andFollowtypeNotLike(String value) {
            addCriterion("FOLLOWTYPE not like", value, "followtype");
            return (Criteria) this;
        }

        public Criteria andFollowtypeIn(List<String> values) {
            addCriterion("FOLLOWTYPE in", values, "followtype");
            return (Criteria) this;
        }

        public Criteria andFollowtypeNotIn(List<String> values) {
            addCriterion("FOLLOWTYPE not in", values, "followtype");
            return (Criteria) this;
        }

        public Criteria andFollowtypeBetween(String value1, String value2) {
            addCriterion("FOLLOWTYPE between", value1, value2, "followtype");
            return (Criteria) this;
        }

        public Criteria andFollowtypeNotBetween(String value1, String value2) {
            addCriterion("FOLLOWTYPE not between", value1, value2, "followtype");
            return (Criteria) this;
        }

        public Criteria andFollowtimeIsNull() {
            addCriterion("FOLLOWTIME is null");
            return (Criteria) this;
        }

        public Criteria andFollowtimeIsNotNull() {
            addCriterion("FOLLOWTIME is not null");
            return (Criteria) this;
        }

        public Criteria andFollowtimeEqualTo(Date value) {
            addCriterion("FOLLOWTIME =", value, "followtime");
            return (Criteria) this;
        }

        public Criteria andFollowtimeNotEqualTo(Date value) {
            addCriterion("FOLLOWTIME <>", value, "followtime");
            return (Criteria) this;
        }

        public Criteria andFollowtimeGreaterThan(Date value) {
            addCriterion("FOLLOWTIME >", value, "followtime");
            return (Criteria) this;
        }

        public Criteria andFollowtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FOLLOWTIME >=", value, "followtime");
            return (Criteria) this;
        }

        public Criteria andFollowtimeLessThan(Date value) {
            addCriterion("FOLLOWTIME <", value, "followtime");
            return (Criteria) this;
        }

        public Criteria andFollowtimeLessThanOrEqualTo(Date value) {
            addCriterion("FOLLOWTIME <=", value, "followtime");
            return (Criteria) this;
        }

        public Criteria andFollowtimeIn(List<Date> values) {
            addCriterion("FOLLOWTIME in", values, "followtime");
            return (Criteria) this;
        }

        public Criteria andFollowtimeNotIn(List<Date> values) {
            addCriterion("FOLLOWTIME not in", values, "followtime");
            return (Criteria) this;
        }

        public Criteria andFollowtimeBetween(Date value1, Date value2) {
            addCriterion("FOLLOWTIME between", value1, value2, "followtime");
            return (Criteria) this;
        }

        public Criteria andFollowtimeNotBetween(Date value1, Date value2) {
            addCriterion("FOLLOWTIME not between", value1, value2, "followtime");
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