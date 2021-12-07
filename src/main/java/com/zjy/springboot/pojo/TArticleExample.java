package com.zjy.springboot.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TArticleExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andPicIsNull() {
            addCriterion("PIC is null");
            return (Criteria) this;
        }

        public Criteria andPicIsNotNull() {
            addCriterion("PIC is not null");
            return (Criteria) this;
        }

        public Criteria andPicEqualTo(String value) {
            addCriterion("PIC =", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotEqualTo(String value) {
            addCriterion("PIC <>", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThan(String value) {
            addCriterion("PIC >", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThanOrEqualTo(String value) {
            addCriterion("PIC >=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThan(String value) {
            addCriterion("PIC <", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThanOrEqualTo(String value) {
            addCriterion("PIC <=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLike(String value) {
            addCriterion("PIC like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotLike(String value) {
            addCriterion("PIC not like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicIn(List<String> values) {
            addCriterion("PIC in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotIn(List<String> values) {
            addCriterion("PIC not in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicBetween(String value1, String value2) {
            addCriterion("PIC between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotBetween(String value1, String value2) {
            addCriterion("PIC not between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("AUTHOR is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("AUTHOR is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(Long value) {
            addCriterion("AUTHOR =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(Long value) {
            addCriterion("AUTHOR <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(Long value) {
            addCriterion("AUTHOR >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(Long value) {
            addCriterion("AUTHOR >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(Long value) {
            addCriterion("AUTHOR <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(Long value) {
            addCriterion("AUTHOR <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<Long> values) {
            addCriterion("AUTHOR in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<Long> values) {
            addCriterion("AUTHOR not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(Long value1, Long value2) {
            addCriterion("AUTHOR between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(Long value1, Long value2) {
            addCriterion("AUTHOR not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UPDATETIME =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UPDATETIME <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UPDATETIME >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UPDATETIME <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UPDATETIME in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UPDATETIME not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME not between", value1, value2, "updatetime");
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

        public Criteria andCommentnumIsNull() {
            addCriterion("COMMENTNUM is null");
            return (Criteria) this;
        }

        public Criteria andCommentnumIsNotNull() {
            addCriterion("COMMENTNUM is not null");
            return (Criteria) this;
        }

        public Criteria andCommentnumEqualTo(Long value) {
            addCriterion("COMMENTNUM =", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumNotEqualTo(Long value) {
            addCriterion("COMMENTNUM <>", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumGreaterThan(Long value) {
            addCriterion("COMMENTNUM >", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumGreaterThanOrEqualTo(Long value) {
            addCriterion("COMMENTNUM >=", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumLessThan(Long value) {
            addCriterion("COMMENTNUM <", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumLessThanOrEqualTo(Long value) {
            addCriterion("COMMENTNUM <=", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumIn(List<Long> values) {
            addCriterion("COMMENTNUM in", values, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumNotIn(List<Long> values) {
            addCriterion("COMMENTNUM not in", values, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumBetween(Long value1, Long value2) {
            addCriterion("COMMENTNUM between", value1, value2, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumNotBetween(Long value1, Long value2) {
            addCriterion("COMMENTNUM not between", value1, value2, "commentnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumIsNull() {
            addCriterion("GOODNUM is null");
            return (Criteria) this;
        }

        public Criteria andGoodnumIsNotNull() {
            addCriterion("GOODNUM is not null");
            return (Criteria) this;
        }

        public Criteria andGoodnumEqualTo(Long value) {
            addCriterion("GOODNUM =", value, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumNotEqualTo(Long value) {
            addCriterion("GOODNUM <>", value, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumGreaterThan(Long value) {
            addCriterion("GOODNUM >", value, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumGreaterThanOrEqualTo(Long value) {
            addCriterion("GOODNUM >=", value, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumLessThan(Long value) {
            addCriterion("GOODNUM <", value, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumLessThanOrEqualTo(Long value) {
            addCriterion("GOODNUM <=", value, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumIn(List<Long> values) {
            addCriterion("GOODNUM in", values, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumNotIn(List<Long> values) {
            addCriterion("GOODNUM not in", values, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumBetween(Long value1, Long value2) {
            addCriterion("GOODNUM between", value1, value2, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumNotBetween(Long value1, Long value2) {
            addCriterion("GOODNUM not between", value1, value2, "goodnum");
            return (Criteria) this;
        }

        public Criteria andBadnumIsNull() {
            addCriterion("BADNUM is null");
            return (Criteria) this;
        }

        public Criteria andBadnumIsNotNull() {
            addCriterion("BADNUM is not null");
            return (Criteria) this;
        }

        public Criteria andBadnumEqualTo(Long value) {
            addCriterion("BADNUM =", value, "badnum");
            return (Criteria) this;
        }

        public Criteria andBadnumNotEqualTo(Long value) {
            addCriterion("BADNUM <>", value, "badnum");
            return (Criteria) this;
        }

        public Criteria andBadnumGreaterThan(Long value) {
            addCriterion("BADNUM >", value, "badnum");
            return (Criteria) this;
        }

        public Criteria andBadnumGreaterThanOrEqualTo(Long value) {
            addCriterion("BADNUM >=", value, "badnum");
            return (Criteria) this;
        }

        public Criteria andBadnumLessThan(Long value) {
            addCriterion("BADNUM <", value, "badnum");
            return (Criteria) this;
        }

        public Criteria andBadnumLessThanOrEqualTo(Long value) {
            addCriterion("BADNUM <=", value, "badnum");
            return (Criteria) this;
        }

        public Criteria andBadnumIn(List<Long> values) {
            addCriterion("BADNUM in", values, "badnum");
            return (Criteria) this;
        }

        public Criteria andBadnumNotIn(List<Long> values) {
            addCriterion("BADNUM not in", values, "badnum");
            return (Criteria) this;
        }

        public Criteria andBadnumBetween(Long value1, Long value2) {
            addCriterion("BADNUM between", value1, value2, "badnum");
            return (Criteria) this;
        }

        public Criteria andBadnumNotBetween(Long value1, Long value2) {
            addCriterion("BADNUM not between", value1, value2, "badnum");
            return (Criteria) this;
        }

        public Criteria andCollectnumIsNull() {
            addCriterion("COLLECTNUM is null");
            return (Criteria) this;
        }

        public Criteria andCollectnumIsNotNull() {
            addCriterion("COLLECTNUM is not null");
            return (Criteria) this;
        }

        public Criteria andCollectnumEqualTo(Long value) {
            addCriterion("COLLECTNUM =", value, "collectnum");
            return (Criteria) this;
        }

        public Criteria andCollectnumNotEqualTo(Long value) {
            addCriterion("COLLECTNUM <>", value, "collectnum");
            return (Criteria) this;
        }

        public Criteria andCollectnumGreaterThan(Long value) {
            addCriterion("COLLECTNUM >", value, "collectnum");
            return (Criteria) this;
        }

        public Criteria andCollectnumGreaterThanOrEqualTo(Long value) {
            addCriterion("COLLECTNUM >=", value, "collectnum");
            return (Criteria) this;
        }

        public Criteria andCollectnumLessThan(Long value) {
            addCriterion("COLLECTNUM <", value, "collectnum");
            return (Criteria) this;
        }

        public Criteria andCollectnumLessThanOrEqualTo(Long value) {
            addCriterion("COLLECTNUM <=", value, "collectnum");
            return (Criteria) this;
        }

        public Criteria andCollectnumIn(List<Long> values) {
            addCriterion("COLLECTNUM in", values, "collectnum");
            return (Criteria) this;
        }

        public Criteria andCollectnumNotIn(List<Long> values) {
            addCriterion("COLLECTNUM not in", values, "collectnum");
            return (Criteria) this;
        }

        public Criteria andCollectnumBetween(Long value1, Long value2) {
            addCriterion("COLLECTNUM between", value1, value2, "collectnum");
            return (Criteria) this;
        }

        public Criteria andCollectnumNotBetween(Long value1, Long value2) {
            addCriterion("COLLECTNUM not between", value1, value2, "collectnum");
            return (Criteria) this;
        }

        public Criteria andViewnumIsNull() {
            addCriterion("VIEWNUM is null");
            return (Criteria) this;
        }

        public Criteria andViewnumIsNotNull() {
            addCriterion("VIEWNUM is not null");
            return (Criteria) this;
        }

        public Criteria andViewnumEqualTo(Long value) {
            addCriterion("VIEWNUM =", value, "viewnum");
            return (Criteria) this;
        }

        public Criteria andViewnumNotEqualTo(Long value) {
            addCriterion("VIEWNUM <>", value, "viewnum");
            return (Criteria) this;
        }

        public Criteria andViewnumGreaterThan(Long value) {
            addCriterion("VIEWNUM >", value, "viewnum");
            return (Criteria) this;
        }

        public Criteria andViewnumGreaterThanOrEqualTo(Long value) {
            addCriterion("VIEWNUM >=", value, "viewnum");
            return (Criteria) this;
        }

        public Criteria andViewnumLessThan(Long value) {
            addCriterion("VIEWNUM <", value, "viewnum");
            return (Criteria) this;
        }

        public Criteria andViewnumLessThanOrEqualTo(Long value) {
            addCriterion("VIEWNUM <=", value, "viewnum");
            return (Criteria) this;
        }

        public Criteria andViewnumIn(List<Long> values) {
            addCriterion("VIEWNUM in", values, "viewnum");
            return (Criteria) this;
        }

        public Criteria andViewnumNotIn(List<Long> values) {
            addCriterion("VIEWNUM not in", values, "viewnum");
            return (Criteria) this;
        }

        public Criteria andViewnumBetween(Long value1, Long value2) {
            addCriterion("VIEWNUM between", value1, value2, "viewnum");
            return (Criteria) this;
        }

        public Criteria andViewnumNotBetween(Long value1, Long value2) {
            addCriterion("VIEWNUM not between", value1, value2, "viewnum");
            return (Criteria) this;
        }

        public Criteria andPostbaridIsNull() {
            addCriterion("POSTBARID is null");
            return (Criteria) this;
        }

        public Criteria andPostbaridIsNotNull() {
            addCriterion("POSTBARID is not null");
            return (Criteria) this;
        }

        public Criteria andPostbaridEqualTo(Long value) {
            addCriterion("POSTBARID =", value, "postbarid");
            return (Criteria) this;
        }

        public Criteria andPostbaridNotEqualTo(Long value) {
            addCriterion("POSTBARID <>", value, "postbarid");
            return (Criteria) this;
        }

        public Criteria andPostbaridGreaterThan(Long value) {
            addCriterion("POSTBARID >", value, "postbarid");
            return (Criteria) this;
        }

        public Criteria andPostbaridGreaterThanOrEqualTo(Long value) {
            addCriterion("POSTBARID >=", value, "postbarid");
            return (Criteria) this;
        }

        public Criteria andPostbaridLessThan(Long value) {
            addCriterion("POSTBARID <", value, "postbarid");
            return (Criteria) this;
        }

        public Criteria andPostbaridLessThanOrEqualTo(Long value) {
            addCriterion("POSTBARID <=", value, "postbarid");
            return (Criteria) this;
        }

        public Criteria andPostbaridIn(List<Long> values) {
            addCriterion("POSTBARID in", values, "postbarid");
            return (Criteria) this;
        }

        public Criteria andPostbaridNotIn(List<Long> values) {
            addCriterion("POSTBARID not in", values, "postbarid");
            return (Criteria) this;
        }

        public Criteria andPostbaridBetween(Long value1, Long value2) {
            addCriterion("POSTBARID between", value1, value2, "postbarid");
            return (Criteria) this;
        }

        public Criteria andPostbaridNotBetween(Long value1, Long value2) {
            addCriterion("POSTBARID not between", value1, value2, "postbarid");
            return (Criteria) this;
        }

        public Criteria andRecommendIsNull() {
            addCriterion("RECOMMEND is null");
            return (Criteria) this;
        }

        public Criteria andRecommendIsNotNull() {
            addCriterion("RECOMMEND is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendEqualTo(String value) {
            addCriterion("RECOMMEND =", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotEqualTo(String value) {
            addCriterion("RECOMMEND <>", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendGreaterThan(String value) {
            addCriterion("RECOMMEND >", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendGreaterThanOrEqualTo(String value) {
            addCriterion("RECOMMEND >=", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLessThan(String value) {
            addCriterion("RECOMMEND <", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLessThanOrEqualTo(String value) {
            addCriterion("RECOMMEND <=", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLike(String value) {
            addCriterion("RECOMMEND like", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotLike(String value) {
            addCriterion("RECOMMEND not like", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendIn(List<String> values) {
            addCriterion("RECOMMEND in", values, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotIn(List<String> values) {
            addCriterion("RECOMMEND not in", values, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendBetween(String value1, String value2) {
            addCriterion("RECOMMEND between", value1, value2, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotBetween(String value1, String value2) {
            addCriterion("RECOMMEND not between", value1, value2, "recommend");
            return (Criteria) this;
        }

        public Criteria andTopIsNull() {
            addCriterion("TOP is null");
            return (Criteria) this;
        }

        public Criteria andTopIsNotNull() {
            addCriterion("TOP is not null");
            return (Criteria) this;
        }

        public Criteria andTopEqualTo(String value) {
            addCriterion("TOP =", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopNotEqualTo(String value) {
            addCriterion("TOP <>", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopGreaterThan(String value) {
            addCriterion("TOP >", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopGreaterThanOrEqualTo(String value) {
            addCriterion("TOP >=", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopLessThan(String value) {
            addCriterion("TOP <", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopLessThanOrEqualTo(String value) {
            addCriterion("TOP <=", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopLike(String value) {
            addCriterion("TOP like", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopNotLike(String value) {
            addCriterion("TOP not like", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopIn(List<String> values) {
            addCriterion("TOP in", values, "top");
            return (Criteria) this;
        }

        public Criteria andTopNotIn(List<String> values) {
            addCriterion("TOP not in", values, "top");
            return (Criteria) this;
        }

        public Criteria andTopBetween(String value1, String value2) {
            addCriterion("TOP between", value1, value2, "top");
            return (Criteria) this;
        }

        public Criteria andTopNotBetween(String value1, String value2) {
            addCriterion("TOP not between", value1, value2, "top");
            return (Criteria) this;
        }

        public Criteria andLastcommentIsNull() {
            addCriterion("LASTCOMMENT is null");
            return (Criteria) this;
        }

        public Criteria andLastcommentIsNotNull() {
            addCriterion("LASTCOMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andLastcommentEqualTo(Long value) {
            addCriterion("LASTCOMMENT =", value, "lastcomment");
            return (Criteria) this;
        }

        public Criteria andLastcommentNotEqualTo(Long value) {
            addCriterion("LASTCOMMENT <>", value, "lastcomment");
            return (Criteria) this;
        }

        public Criteria andLastcommentGreaterThan(Long value) {
            addCriterion("LASTCOMMENT >", value, "lastcomment");
            return (Criteria) this;
        }

        public Criteria andLastcommentGreaterThanOrEqualTo(Long value) {
            addCriterion("LASTCOMMENT >=", value, "lastcomment");
            return (Criteria) this;
        }

        public Criteria andLastcommentLessThan(Long value) {
            addCriterion("LASTCOMMENT <", value, "lastcomment");
            return (Criteria) this;
        }

        public Criteria andLastcommentLessThanOrEqualTo(Long value) {
            addCriterion("LASTCOMMENT <=", value, "lastcomment");
            return (Criteria) this;
        }

        public Criteria andLastcommentIn(List<Long> values) {
            addCriterion("LASTCOMMENT in", values, "lastcomment");
            return (Criteria) this;
        }

        public Criteria andLastcommentNotIn(List<Long> values) {
            addCriterion("LASTCOMMENT not in", values, "lastcomment");
            return (Criteria) this;
        }

        public Criteria andLastcommentBetween(Long value1, Long value2) {
            addCriterion("LASTCOMMENT between", value1, value2, "lastcomment");
            return (Criteria) this;
        }

        public Criteria andLastcommentNotBetween(Long value1, Long value2) {
            addCriterion("LASTCOMMENT not between", value1, value2, "lastcomment");
            return (Criteria) this;
        }

        public Criteria andLastcommenttimeIsNull() {
            addCriterion("LASTCOMMENTTIME is null");
            return (Criteria) this;
        }

        public Criteria andLastcommenttimeIsNotNull() {
            addCriterion("LASTCOMMENTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastcommenttimeEqualTo(Date value) {
            addCriterion("LASTCOMMENTTIME =", value, "lastcommenttime");
            return (Criteria) this;
        }

        public Criteria andLastcommenttimeNotEqualTo(Date value) {
            addCriterion("LASTCOMMENTTIME <>", value, "lastcommenttime");
            return (Criteria) this;
        }

        public Criteria andLastcommenttimeGreaterThan(Date value) {
            addCriterion("LASTCOMMENTTIME >", value, "lastcommenttime");
            return (Criteria) this;
        }

        public Criteria andLastcommenttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTCOMMENTTIME >=", value, "lastcommenttime");
            return (Criteria) this;
        }

        public Criteria andLastcommenttimeLessThan(Date value) {
            addCriterion("LASTCOMMENTTIME <", value, "lastcommenttime");
            return (Criteria) this;
        }

        public Criteria andLastcommenttimeLessThanOrEqualTo(Date value) {
            addCriterion("LASTCOMMENTTIME <=", value, "lastcommenttime");
            return (Criteria) this;
        }

        public Criteria andLastcommenttimeIn(List<Date> values) {
            addCriterion("LASTCOMMENTTIME in", values, "lastcommenttime");
            return (Criteria) this;
        }

        public Criteria andLastcommenttimeNotIn(List<Date> values) {
            addCriterion("LASTCOMMENTTIME not in", values, "lastcommenttime");
            return (Criteria) this;
        }

        public Criteria andLastcommenttimeBetween(Date value1, Date value2) {
            addCriterion("LASTCOMMENTTIME between", value1, value2, "lastcommenttime");
            return (Criteria) this;
        }

        public Criteria andLastcommenttimeNotBetween(Date value1, Date value2) {
            addCriterion("LASTCOMMENTTIME not between", value1, value2, "lastcommenttime");
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