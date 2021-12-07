package com.zjy.springboot.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TReportExample() {
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

        public Criteria andReportuserIsNull() {
            addCriterion("REPORTUSER is null");
            return (Criteria) this;
        }

        public Criteria andReportuserIsNotNull() {
            addCriterion("REPORTUSER is not null");
            return (Criteria) this;
        }

        public Criteria andReportuserEqualTo(Long value) {
            addCriterion("REPORTUSER =", value, "reportuser");
            return (Criteria) this;
        }

        public Criteria andReportuserNotEqualTo(Long value) {
            addCriterion("REPORTUSER <>", value, "reportuser");
            return (Criteria) this;
        }

        public Criteria andReportuserGreaterThan(Long value) {
            addCriterion("REPORTUSER >", value, "reportuser");
            return (Criteria) this;
        }

        public Criteria andReportuserGreaterThanOrEqualTo(Long value) {
            addCriterion("REPORTUSER >=", value, "reportuser");
            return (Criteria) this;
        }

        public Criteria andReportuserLessThan(Long value) {
            addCriterion("REPORTUSER <", value, "reportuser");
            return (Criteria) this;
        }

        public Criteria andReportuserLessThanOrEqualTo(Long value) {
            addCriterion("REPORTUSER <=", value, "reportuser");
            return (Criteria) this;
        }

        public Criteria andReportuserIn(List<Long> values) {
            addCriterion("REPORTUSER in", values, "reportuser");
            return (Criteria) this;
        }

        public Criteria andReportuserNotIn(List<Long> values) {
            addCriterion("REPORTUSER not in", values, "reportuser");
            return (Criteria) this;
        }

        public Criteria andReportuserBetween(Long value1, Long value2) {
            addCriterion("REPORTUSER between", value1, value2, "reportuser");
            return (Criteria) this;
        }

        public Criteria andReportuserNotBetween(Long value1, Long value2) {
            addCriterion("REPORTUSER not between", value1, value2, "reportuser");
            return (Criteria) this;
        }

        public Criteria andReporttimeIsNull() {
            addCriterion("REPORTTIME is null");
            return (Criteria) this;
        }

        public Criteria andReporttimeIsNotNull() {
            addCriterion("REPORTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andReporttimeEqualTo(Date value) {
            addCriterion("REPORTTIME =", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeNotEqualTo(Date value) {
            addCriterion("REPORTTIME <>", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeGreaterThan(Date value) {
            addCriterion("REPORTTIME >", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REPORTTIME >=", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeLessThan(Date value) {
            addCriterion("REPORTTIME <", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeLessThanOrEqualTo(Date value) {
            addCriterion("REPORTTIME <=", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeIn(List<Date> values) {
            addCriterion("REPORTTIME in", values, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeNotIn(List<Date> values) {
            addCriterion("REPORTTIME not in", values, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeBetween(Date value1, Date value2) {
            addCriterion("REPORTTIME between", value1, value2, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeNotBetween(Date value1, Date value2) {
            addCriterion("REPORTTIME not between", value1, value2, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttypeIsNull() {
            addCriterion("REPORTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andReporttypeIsNotNull() {
            addCriterion("REPORTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andReporttypeEqualTo(String value) {
            addCriterion("REPORTTYPE =", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeNotEqualTo(String value) {
            addCriterion("REPORTTYPE <>", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeGreaterThan(String value) {
            addCriterion("REPORTTYPE >", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeGreaterThanOrEqualTo(String value) {
            addCriterion("REPORTTYPE >=", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeLessThan(String value) {
            addCriterion("REPORTTYPE <", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeLessThanOrEqualTo(String value) {
            addCriterion("REPORTTYPE <=", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeLike(String value) {
            addCriterion("REPORTTYPE like", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeNotLike(String value) {
            addCriterion("REPORTTYPE not like", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeIn(List<String> values) {
            addCriterion("REPORTTYPE in", values, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeNotIn(List<String> values) {
            addCriterion("REPORTTYPE not in", values, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeBetween(String value1, String value2) {
            addCriterion("REPORTTYPE between", value1, value2, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeNotBetween(String value1, String value2) {
            addCriterion("REPORTTYPE not between", value1, value2, "reporttype");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("CONTENT =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("CONTENT <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("CONTENT >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("CONTENT <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("CONTENT <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("CONTENT like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("CONTENT not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("CONTENT in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("CONTENT not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("CONTENT between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("CONTENT not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andReportdataidIsNull() {
            addCriterion("REPORTDATAID is null");
            return (Criteria) this;
        }

        public Criteria andReportdataidIsNotNull() {
            addCriterion("REPORTDATAID is not null");
            return (Criteria) this;
        }

        public Criteria andReportdataidEqualTo(Long value) {
            addCriterion("REPORTDATAID =", value, "reportdataid");
            return (Criteria) this;
        }

        public Criteria andReportdataidNotEqualTo(Long value) {
            addCriterion("REPORTDATAID <>", value, "reportdataid");
            return (Criteria) this;
        }

        public Criteria andReportdataidGreaterThan(Long value) {
            addCriterion("REPORTDATAID >", value, "reportdataid");
            return (Criteria) this;
        }

        public Criteria andReportdataidGreaterThanOrEqualTo(Long value) {
            addCriterion("REPORTDATAID >=", value, "reportdataid");
            return (Criteria) this;
        }

        public Criteria andReportdataidLessThan(Long value) {
            addCriterion("REPORTDATAID <", value, "reportdataid");
            return (Criteria) this;
        }

        public Criteria andReportdataidLessThanOrEqualTo(Long value) {
            addCriterion("REPORTDATAID <=", value, "reportdataid");
            return (Criteria) this;
        }

        public Criteria andReportdataidIn(List<Long> values) {
            addCriterion("REPORTDATAID in", values, "reportdataid");
            return (Criteria) this;
        }

        public Criteria andReportdataidNotIn(List<Long> values) {
            addCriterion("REPORTDATAID not in", values, "reportdataid");
            return (Criteria) this;
        }

        public Criteria andReportdataidBetween(Long value1, Long value2) {
            addCriterion("REPORTDATAID between", value1, value2, "reportdataid");
            return (Criteria) this;
        }

        public Criteria andReportdataidNotBetween(Long value1, Long value2) {
            addCriterion("REPORTDATAID not between", value1, value2, "reportdataid");
            return (Criteria) this;
        }

        public Criteria andReportdatatypeIsNull() {
            addCriterion("REPORTDATATYPE is null");
            return (Criteria) this;
        }

        public Criteria andReportdatatypeIsNotNull() {
            addCriterion("REPORTDATATYPE is not null");
            return (Criteria) this;
        }

        public Criteria andReportdatatypeEqualTo(String value) {
            addCriterion("REPORTDATATYPE =", value, "reportdatatype");
            return (Criteria) this;
        }

        public Criteria andReportdatatypeNotEqualTo(String value) {
            addCriterion("REPORTDATATYPE <>", value, "reportdatatype");
            return (Criteria) this;
        }

        public Criteria andReportdatatypeGreaterThan(String value) {
            addCriterion("REPORTDATATYPE >", value, "reportdatatype");
            return (Criteria) this;
        }

        public Criteria andReportdatatypeGreaterThanOrEqualTo(String value) {
            addCriterion("REPORTDATATYPE >=", value, "reportdatatype");
            return (Criteria) this;
        }

        public Criteria andReportdatatypeLessThan(String value) {
            addCriterion("REPORTDATATYPE <", value, "reportdatatype");
            return (Criteria) this;
        }

        public Criteria andReportdatatypeLessThanOrEqualTo(String value) {
            addCriterion("REPORTDATATYPE <=", value, "reportdatatype");
            return (Criteria) this;
        }

        public Criteria andReportdatatypeLike(String value) {
            addCriterion("REPORTDATATYPE like", value, "reportdatatype");
            return (Criteria) this;
        }

        public Criteria andReportdatatypeNotLike(String value) {
            addCriterion("REPORTDATATYPE not like", value, "reportdatatype");
            return (Criteria) this;
        }

        public Criteria andReportdatatypeIn(List<String> values) {
            addCriterion("REPORTDATATYPE in", values, "reportdatatype");
            return (Criteria) this;
        }

        public Criteria andReportdatatypeNotIn(List<String> values) {
            addCriterion("REPORTDATATYPE not in", values, "reportdatatype");
            return (Criteria) this;
        }

        public Criteria andReportdatatypeBetween(String value1, String value2) {
            addCriterion("REPORTDATATYPE between", value1, value2, "reportdatatype");
            return (Criteria) this;
        }

        public Criteria andReportdatatypeNotBetween(String value1, String value2) {
            addCriterion("REPORTDATATYPE not between", value1, value2, "reportdatatype");
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

        public Criteria andBak1IsNull() {
            addCriterion("BAK1 is null");
            return (Criteria) this;
        }

        public Criteria andBak1IsNotNull() {
            addCriterion("BAK1 is not null");
            return (Criteria) this;
        }

        public Criteria andBak1EqualTo(String value) {
            addCriterion("BAK1 =", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1NotEqualTo(String value) {
            addCriterion("BAK1 <>", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1GreaterThan(String value) {
            addCriterion("BAK1 >", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1GreaterThanOrEqualTo(String value) {
            addCriterion("BAK1 >=", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1LessThan(String value) {
            addCriterion("BAK1 <", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1LessThanOrEqualTo(String value) {
            addCriterion("BAK1 <=", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1Like(String value) {
            addCriterion("BAK1 like", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1NotLike(String value) {
            addCriterion("BAK1 not like", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1In(List<String> values) {
            addCriterion("BAK1 in", values, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1NotIn(List<String> values) {
            addCriterion("BAK1 not in", values, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1Between(String value1, String value2) {
            addCriterion("BAK1 between", value1, value2, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1NotBetween(String value1, String value2) {
            addCriterion("BAK1 not between", value1, value2, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak2IsNull() {
            addCriterion("BAK2 is null");
            return (Criteria) this;
        }

        public Criteria andBak2IsNotNull() {
            addCriterion("BAK2 is not null");
            return (Criteria) this;
        }

        public Criteria andBak2EqualTo(String value) {
            addCriterion("BAK2 =", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2NotEqualTo(String value) {
            addCriterion("BAK2 <>", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2GreaterThan(String value) {
            addCriterion("BAK2 >", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2GreaterThanOrEqualTo(String value) {
            addCriterion("BAK2 >=", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2LessThan(String value) {
            addCriterion("BAK2 <", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2LessThanOrEqualTo(String value) {
            addCriterion("BAK2 <=", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2Like(String value) {
            addCriterion("BAK2 like", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2NotLike(String value) {
            addCriterion("BAK2 not like", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2In(List<String> values) {
            addCriterion("BAK2 in", values, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2NotIn(List<String> values) {
            addCriterion("BAK2 not in", values, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2Between(String value1, String value2) {
            addCriterion("BAK2 between", value1, value2, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2NotBetween(String value1, String value2) {
            addCriterion("BAK2 not between", value1, value2, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak3IsNull() {
            addCriterion("BAK3 is null");
            return (Criteria) this;
        }

        public Criteria andBak3IsNotNull() {
            addCriterion("BAK3 is not null");
            return (Criteria) this;
        }

        public Criteria andBak3EqualTo(String value) {
            addCriterion("BAK3 =", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3NotEqualTo(String value) {
            addCriterion("BAK3 <>", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3GreaterThan(String value) {
            addCriterion("BAK3 >", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3GreaterThanOrEqualTo(String value) {
            addCriterion("BAK3 >=", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3LessThan(String value) {
            addCriterion("BAK3 <", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3LessThanOrEqualTo(String value) {
            addCriterion("BAK3 <=", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3Like(String value) {
            addCriterion("BAK3 like", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3NotLike(String value) {
            addCriterion("BAK3 not like", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3In(List<String> values) {
            addCriterion("BAK3 in", values, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3NotIn(List<String> values) {
            addCriterion("BAK3 not in", values, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3Between(String value1, String value2) {
            addCriterion("BAK3 between", value1, value2, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3NotBetween(String value1, String value2) {
            addCriterion("BAK3 not between", value1, value2, "bak3");
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