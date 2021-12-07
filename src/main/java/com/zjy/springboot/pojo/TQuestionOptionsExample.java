package com.zjy.springboot.pojo;

import java.util.ArrayList;
import java.util.List;

public class TQuestionOptionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TQuestionOptionsExample() {
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

        public Criteria andQuestionIdIsNull() {
            addCriterion("QUESTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNotNull() {
            addCriterion("QUESTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdEqualTo(Long value) {
            addCriterion("QUESTION_ID =", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotEqualTo(Long value) {
            addCriterion("QUESTION_ID <>", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThan(Long value) {
            addCriterion("QUESTION_ID >", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("QUESTION_ID >=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThan(Long value) {
            addCriterion("QUESTION_ID <", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThanOrEqualTo(Long value) {
            addCriterion("QUESTION_ID <=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIn(List<Long> values) {
            addCriterion("QUESTION_ID in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotIn(List<Long> values) {
            addCriterion("QUESTION_ID not in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdBetween(Long value1, Long value2) {
            addCriterion("QUESTION_ID between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotBetween(Long value1, Long value2) {
            addCriterion("QUESTION_ID not between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andOption1IsNull() {
            addCriterion("OPTION1 is null");
            return (Criteria) this;
        }

        public Criteria andOption1IsNotNull() {
            addCriterion("OPTION1 is not null");
            return (Criteria) this;
        }

        public Criteria andOption1EqualTo(String value) {
            addCriterion("OPTION1 =", value, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1NotEqualTo(String value) {
            addCriterion("OPTION1 <>", value, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1GreaterThan(String value) {
            addCriterion("OPTION1 >", value, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1GreaterThanOrEqualTo(String value) {
            addCriterion("OPTION1 >=", value, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1LessThan(String value) {
            addCriterion("OPTION1 <", value, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1LessThanOrEqualTo(String value) {
            addCriterion("OPTION1 <=", value, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1Like(String value) {
            addCriterion("OPTION1 like", value, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1NotLike(String value) {
            addCriterion("OPTION1 not like", value, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1In(List<String> values) {
            addCriterion("OPTION1 in", values, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1NotIn(List<String> values) {
            addCriterion("OPTION1 not in", values, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1Between(String value1, String value2) {
            addCriterion("OPTION1 between", value1, value2, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1NotBetween(String value1, String value2) {
            addCriterion("OPTION1 not between", value1, value2, "option1");
            return (Criteria) this;
        }

        public Criteria andOption2IsNull() {
            addCriterion("OPTION2 is null");
            return (Criteria) this;
        }

        public Criteria andOption2IsNotNull() {
            addCriterion("OPTION2 is not null");
            return (Criteria) this;
        }

        public Criteria andOption2EqualTo(String value) {
            addCriterion("OPTION2 =", value, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2NotEqualTo(String value) {
            addCriterion("OPTION2 <>", value, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2GreaterThan(String value) {
            addCriterion("OPTION2 >", value, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2GreaterThanOrEqualTo(String value) {
            addCriterion("OPTION2 >=", value, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2LessThan(String value) {
            addCriterion("OPTION2 <", value, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2LessThanOrEqualTo(String value) {
            addCriterion("OPTION2 <=", value, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2Like(String value) {
            addCriterion("OPTION2 like", value, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2NotLike(String value) {
            addCriterion("OPTION2 not like", value, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2In(List<String> values) {
            addCriterion("OPTION2 in", values, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2NotIn(List<String> values) {
            addCriterion("OPTION2 not in", values, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2Between(String value1, String value2) {
            addCriterion("OPTION2 between", value1, value2, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2NotBetween(String value1, String value2) {
            addCriterion("OPTION2 not between", value1, value2, "option2");
            return (Criteria) this;
        }

        public Criteria andOption3IsNull() {
            addCriterion("OPTION3 is null");
            return (Criteria) this;
        }

        public Criteria andOption3IsNotNull() {
            addCriterion("OPTION3 is not null");
            return (Criteria) this;
        }

        public Criteria andOption3EqualTo(String value) {
            addCriterion("OPTION3 =", value, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3NotEqualTo(String value) {
            addCriterion("OPTION3 <>", value, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3GreaterThan(String value) {
            addCriterion("OPTION3 >", value, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3GreaterThanOrEqualTo(String value) {
            addCriterion("OPTION3 >=", value, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3LessThan(String value) {
            addCriterion("OPTION3 <", value, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3LessThanOrEqualTo(String value) {
            addCriterion("OPTION3 <=", value, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3Like(String value) {
            addCriterion("OPTION3 like", value, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3NotLike(String value) {
            addCriterion("OPTION3 not like", value, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3In(List<String> values) {
            addCriterion("OPTION3 in", values, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3NotIn(List<String> values) {
            addCriterion("OPTION3 not in", values, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3Between(String value1, String value2) {
            addCriterion("OPTION3 between", value1, value2, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3NotBetween(String value1, String value2) {
            addCriterion("OPTION3 not between", value1, value2, "option3");
            return (Criteria) this;
        }

        public Criteria andOption4IsNull() {
            addCriterion("OPTION4 is null");
            return (Criteria) this;
        }

        public Criteria andOption4IsNotNull() {
            addCriterion("OPTION4 is not null");
            return (Criteria) this;
        }

        public Criteria andOption4EqualTo(String value) {
            addCriterion("OPTION4 =", value, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4NotEqualTo(String value) {
            addCriterion("OPTION4 <>", value, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4GreaterThan(String value) {
            addCriterion("OPTION4 >", value, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4GreaterThanOrEqualTo(String value) {
            addCriterion("OPTION4 >=", value, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4LessThan(String value) {
            addCriterion("OPTION4 <", value, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4LessThanOrEqualTo(String value) {
            addCriterion("OPTION4 <=", value, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4Like(String value) {
            addCriterion("OPTION4 like", value, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4NotLike(String value) {
            addCriterion("OPTION4 not like", value, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4In(List<String> values) {
            addCriterion("OPTION4 in", values, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4NotIn(List<String> values) {
            addCriterion("OPTION4 not in", values, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4Between(String value1, String value2) {
            addCriterion("OPTION4 between", value1, value2, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4NotBetween(String value1, String value2) {
            addCriterion("OPTION4 not between", value1, value2, "option4");
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