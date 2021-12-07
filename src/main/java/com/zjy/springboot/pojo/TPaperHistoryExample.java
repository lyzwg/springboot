package com.zjy.springboot.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TPaperHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TPaperHistoryExample() {
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

        public Criteria andTestPaperInfoIdIsNull() {
            addCriterion("TEST_PAPER_INFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andTestPaperInfoIdIsNotNull() {
            addCriterion("TEST_PAPER_INFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTestPaperInfoIdEqualTo(Long value) {
            addCriterion("TEST_PAPER_INFO_ID =", value, "testPaperInfoId");
            return (Criteria) this;
        }

        public Criteria andTestPaperInfoIdNotEqualTo(Long value) {
            addCriterion("TEST_PAPER_INFO_ID <>", value, "testPaperInfoId");
            return (Criteria) this;
        }

        public Criteria andTestPaperInfoIdGreaterThan(Long value) {
            addCriterion("TEST_PAPER_INFO_ID >", value, "testPaperInfoId");
            return (Criteria) this;
        }

        public Criteria andTestPaperInfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TEST_PAPER_INFO_ID >=", value, "testPaperInfoId");
            return (Criteria) this;
        }

        public Criteria andTestPaperInfoIdLessThan(Long value) {
            addCriterion("TEST_PAPER_INFO_ID <", value, "testPaperInfoId");
            return (Criteria) this;
        }

        public Criteria andTestPaperInfoIdLessThanOrEqualTo(Long value) {
            addCriterion("TEST_PAPER_INFO_ID <=", value, "testPaperInfoId");
            return (Criteria) this;
        }

        public Criteria andTestPaperInfoIdIn(List<Long> values) {
            addCriterion("TEST_PAPER_INFO_ID in", values, "testPaperInfoId");
            return (Criteria) this;
        }

        public Criteria andTestPaperInfoIdNotIn(List<Long> values) {
            addCriterion("TEST_PAPER_INFO_ID not in", values, "testPaperInfoId");
            return (Criteria) this;
        }

        public Criteria andTestPaperInfoIdBetween(Long value1, Long value2) {
            addCriterion("TEST_PAPER_INFO_ID between", value1, value2, "testPaperInfoId");
            return (Criteria) this;
        }

        public Criteria andTestPaperInfoIdNotBetween(Long value1, Long value2) {
            addCriterion("TEST_PAPER_INFO_ID not between", value1, value2, "testPaperInfoId");
            return (Criteria) this;
        }

        public Criteria andSiAnswersIsNull() {
            addCriterion("SI_ANSWERS is null");
            return (Criteria) this;
        }

        public Criteria andSiAnswersIsNotNull() {
            addCriterion("SI_ANSWERS is not null");
            return (Criteria) this;
        }

        public Criteria andSiAnswersEqualTo(String value) {
            addCriterion("SI_ANSWERS =", value, "siAnswers");
            return (Criteria) this;
        }

        public Criteria andSiAnswersNotEqualTo(String value) {
            addCriterion("SI_ANSWERS <>", value, "siAnswers");
            return (Criteria) this;
        }

        public Criteria andSiAnswersGreaterThan(String value) {
            addCriterion("SI_ANSWERS >", value, "siAnswers");
            return (Criteria) this;
        }

        public Criteria andSiAnswersGreaterThanOrEqualTo(String value) {
            addCriterion("SI_ANSWERS >=", value, "siAnswers");
            return (Criteria) this;
        }

        public Criteria andSiAnswersLessThan(String value) {
            addCriterion("SI_ANSWERS <", value, "siAnswers");
            return (Criteria) this;
        }

        public Criteria andSiAnswersLessThanOrEqualTo(String value) {
            addCriterion("SI_ANSWERS <=", value, "siAnswers");
            return (Criteria) this;
        }

        public Criteria andSiAnswersLike(String value) {
            addCriterion("SI_ANSWERS like", value, "siAnswers");
            return (Criteria) this;
        }

        public Criteria andSiAnswersNotLike(String value) {
            addCriterion("SI_ANSWERS not like", value, "siAnswers");
            return (Criteria) this;
        }

        public Criteria andSiAnswersIn(List<String> values) {
            addCriterion("SI_ANSWERS in", values, "siAnswers");
            return (Criteria) this;
        }

        public Criteria andSiAnswersNotIn(List<String> values) {
            addCriterion("SI_ANSWERS not in", values, "siAnswers");
            return (Criteria) this;
        }

        public Criteria andSiAnswersBetween(String value1, String value2) {
            addCriterion("SI_ANSWERS between", value1, value2, "siAnswers");
            return (Criteria) this;
        }

        public Criteria andSiAnswersNotBetween(String value1, String value2) {
            addCriterion("SI_ANSWERS not between", value1, value2, "siAnswers");
            return (Criteria) this;
        }

        public Criteria andOiAnswersIsNull() {
            addCriterion("OI_ANSWERS is null");
            return (Criteria) this;
        }

        public Criteria andOiAnswersIsNotNull() {
            addCriterion("OI_ANSWERS is not null");
            return (Criteria) this;
        }

        public Criteria andOiAnswersEqualTo(String value) {
            addCriterion("OI_ANSWERS =", value, "oiAnswers");
            return (Criteria) this;
        }

        public Criteria andOiAnswersNotEqualTo(String value) {
            addCriterion("OI_ANSWERS <>", value, "oiAnswers");
            return (Criteria) this;
        }

        public Criteria andOiAnswersGreaterThan(String value) {
            addCriterion("OI_ANSWERS >", value, "oiAnswers");
            return (Criteria) this;
        }

        public Criteria andOiAnswersGreaterThanOrEqualTo(String value) {
            addCriterion("OI_ANSWERS >=", value, "oiAnswers");
            return (Criteria) this;
        }

        public Criteria andOiAnswersLessThan(String value) {
            addCriterion("OI_ANSWERS <", value, "oiAnswers");
            return (Criteria) this;
        }

        public Criteria andOiAnswersLessThanOrEqualTo(String value) {
            addCriterion("OI_ANSWERS <=", value, "oiAnswers");
            return (Criteria) this;
        }

        public Criteria andOiAnswersLike(String value) {
            addCriterion("OI_ANSWERS like", value, "oiAnswers");
            return (Criteria) this;
        }

        public Criteria andOiAnswersNotLike(String value) {
            addCriterion("OI_ANSWERS not like", value, "oiAnswers");
            return (Criteria) this;
        }

        public Criteria andOiAnswersIn(List<String> values) {
            addCriterion("OI_ANSWERS in", values, "oiAnswers");
            return (Criteria) this;
        }

        public Criteria andOiAnswersNotIn(List<String> values) {
            addCriterion("OI_ANSWERS not in", values, "oiAnswers");
            return (Criteria) this;
        }

        public Criteria andOiAnswersBetween(String value1, String value2) {
            addCriterion("OI_ANSWERS between", value1, value2, "oiAnswers");
            return (Criteria) this;
        }

        public Criteria andOiAnswersNotBetween(String value1, String value2) {
            addCriterion("OI_ANSWERS not between", value1, value2, "oiAnswers");
            return (Criteria) this;
        }

        public Criteria andSysUserIdIsNull() {
            addCriterion("SYS_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSysUserIdIsNotNull() {
            addCriterion("SYS_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSysUserIdEqualTo(Long value) {
            addCriterion("SYS_USER_ID =", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdNotEqualTo(Long value) {
            addCriterion("SYS_USER_ID <>", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdGreaterThan(Long value) {
            addCriterion("SYS_USER_ID >", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SYS_USER_ID >=", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdLessThan(Long value) {
            addCriterion("SYS_USER_ID <", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdLessThanOrEqualTo(Long value) {
            addCriterion("SYS_USER_ID <=", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdIn(List<Long> values) {
            addCriterion("SYS_USER_ID in", values, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdNotIn(List<Long> values) {
            addCriterion("SYS_USER_ID not in", values, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdBetween(Long value1, Long value2) {
            addCriterion("SYS_USER_ID between", value1, value2, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdNotBetween(Long value1, Long value2) {
            addCriterion("SYS_USER_ID not between", value1, value2, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysTeacherIdIsNull() {
            addCriterion("SYS_TEACHER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSysTeacherIdIsNotNull() {
            addCriterion("SYS_TEACHER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSysTeacherIdEqualTo(Long value) {
            addCriterion("SYS_TEACHER_ID =", value, "sysTeacherId");
            return (Criteria) this;
        }

        public Criteria andSysTeacherIdNotEqualTo(Long value) {
            addCriterion("SYS_TEACHER_ID <>", value, "sysTeacherId");
            return (Criteria) this;
        }

        public Criteria andSysTeacherIdGreaterThan(Long value) {
            addCriterion("SYS_TEACHER_ID >", value, "sysTeacherId");
            return (Criteria) this;
        }

        public Criteria andSysTeacherIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SYS_TEACHER_ID >=", value, "sysTeacherId");
            return (Criteria) this;
        }

        public Criteria andSysTeacherIdLessThan(Long value) {
            addCriterion("SYS_TEACHER_ID <", value, "sysTeacherId");
            return (Criteria) this;
        }

        public Criteria andSysTeacherIdLessThanOrEqualTo(Long value) {
            addCriterion("SYS_TEACHER_ID <=", value, "sysTeacherId");
            return (Criteria) this;
        }

        public Criteria andSysTeacherIdIn(List<Long> values) {
            addCriterion("SYS_TEACHER_ID in", values, "sysTeacherId");
            return (Criteria) this;
        }

        public Criteria andSysTeacherIdNotIn(List<Long> values) {
            addCriterion("SYS_TEACHER_ID not in", values, "sysTeacherId");
            return (Criteria) this;
        }

        public Criteria andSysTeacherIdBetween(Long value1, Long value2) {
            addCriterion("SYS_TEACHER_ID between", value1, value2, "sysTeacherId");
            return (Criteria) this;
        }

        public Criteria andSysTeacherIdNotBetween(Long value1, Long value2) {
            addCriterion("SYS_TEACHER_ID not between", value1, value2, "sysTeacherId");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("SCORE is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Short value) {
            addCriterion("SCORE =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Short value) {
            addCriterion("SCORE <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Short value) {
            addCriterion("SCORE >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Short value) {
            addCriterion("SCORE >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Short value) {
            addCriterion("SCORE <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Short value) {
            addCriterion("SCORE <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Short> values) {
            addCriterion("SCORE in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Short> values) {
            addCriterion("SCORE not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Short value1, Short value2) {
            addCriterion("SCORE between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Short value1, Short value2) {
            addCriterion("SCORE not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andEvaluateIsNull() {
            addCriterion("EVALUATE is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateIsNotNull() {
            addCriterion("EVALUATE is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateEqualTo(String value) {
            addCriterion("EVALUATE =", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateNotEqualTo(String value) {
            addCriterion("EVALUATE <>", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateGreaterThan(String value) {
            addCriterion("EVALUATE >", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateGreaterThanOrEqualTo(String value) {
            addCriterion("EVALUATE >=", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateLessThan(String value) {
            addCriterion("EVALUATE <", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateLessThanOrEqualTo(String value) {
            addCriterion("EVALUATE <=", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateLike(String value) {
            addCriterion("EVALUATE like", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateNotLike(String value) {
            addCriterion("EVALUATE not like", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateIn(List<String> values) {
            addCriterion("EVALUATE in", values, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateNotIn(List<String> values) {
            addCriterion("EVALUATE not in", values, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateBetween(String value1, String value2) {
            addCriterion("EVALUATE between", value1, value2, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateNotBetween(String value1, String value2) {
            addCriterion("EVALUATE not between", value1, value2, "evaluate");
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

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
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