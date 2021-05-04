package com.commodityshareplatform.subject.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_comment
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_comment
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_comment
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public CommentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_comment
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
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

        public Criteria andCommentIdIsNull() {
            addCriterion("COMMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("COMMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(Integer value) {
            addCriterion("COMMENT_ID =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(Integer value) {
            addCriterion("COMMENT_ID <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(Integer value) {
            addCriterion("COMMENT_ID >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMMENT_ID >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(Integer value) {
            addCriterion("COMMENT_ID <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("COMMENT_ID <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<Integer> values) {
            addCriterion("COMMENT_ID in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<Integer> values) {
            addCriterion("COMMENT_ID not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("COMMENT_ID between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("COMMENT_ID not between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdIsNull() {
            addCriterion("COMMENT_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdIsNotNull() {
            addCriterion("COMMENT_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdEqualTo(Integer value) {
            addCriterion("COMMENT_USER_ID =", value, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdNotEqualTo(Integer value) {
            addCriterion("COMMENT_USER_ID <>", value, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdGreaterThan(Integer value) {
            addCriterion("COMMENT_USER_ID >", value, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMMENT_USER_ID >=", value, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdLessThan(Integer value) {
            addCriterion("COMMENT_USER_ID <", value, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("COMMENT_USER_ID <=", value, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdIn(List<Integer> values) {
            addCriterion("COMMENT_USER_ID in", values, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdNotIn(List<Integer> values) {
            addCriterion("COMMENT_USER_ID not in", values, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdBetween(Integer value1, Integer value2) {
            addCriterion("COMMENT_USER_ID between", value1, value2, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("COMMENT_USER_ID not between", value1, value2, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentCommodityIdIsNull() {
            addCriterion("COMMENT_COMMODITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCommentCommodityIdIsNotNull() {
            addCriterion("COMMENT_COMMODITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCommentCommodityIdEqualTo(Integer value) {
            addCriterion("COMMENT_COMMODITY_ID =", value, "commentCommodityId");
            return (Criteria) this;
        }

        public Criteria andCommentCommodityIdNotEqualTo(Integer value) {
            addCriterion("COMMENT_COMMODITY_ID <>", value, "commentCommodityId");
            return (Criteria) this;
        }

        public Criteria andCommentCommodityIdGreaterThan(Integer value) {
            addCriterion("COMMENT_COMMODITY_ID >", value, "commentCommodityId");
            return (Criteria) this;
        }

        public Criteria andCommentCommodityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMMENT_COMMODITY_ID >=", value, "commentCommodityId");
            return (Criteria) this;
        }

        public Criteria andCommentCommodityIdLessThan(Integer value) {
            addCriterion("COMMENT_COMMODITY_ID <", value, "commentCommodityId");
            return (Criteria) this;
        }

        public Criteria andCommentCommodityIdLessThanOrEqualTo(Integer value) {
            addCriterion("COMMENT_COMMODITY_ID <=", value, "commentCommodityId");
            return (Criteria) this;
        }

        public Criteria andCommentCommodityIdIn(List<Integer> values) {
            addCriterion("COMMENT_COMMODITY_ID in", values, "commentCommodityId");
            return (Criteria) this;
        }

        public Criteria andCommentCommodityIdNotIn(List<Integer> values) {
            addCriterion("COMMENT_COMMODITY_ID not in", values, "commentCommodityId");
            return (Criteria) this;
        }

        public Criteria andCommentCommodityIdBetween(Integer value1, Integer value2) {
            addCriterion("COMMENT_COMMODITY_ID between", value1, value2, "commentCommodityId");
            return (Criteria) this;
        }

        public Criteria andCommentCommodityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("COMMENT_COMMODITY_ID not between", value1, value2, "commentCommodityId");
            return (Criteria) this;
        }

        public Criteria andCommentCreateTimeIsNull() {
            addCriterion("COMMENT_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCommentCreateTimeIsNotNull() {
            addCriterion("COMMENT_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCommentCreateTimeEqualTo(Date value) {
            addCriterion("COMMENT_CREATE_TIME =", value, "commentCreateTime");
            return (Criteria) this;
        }

        public Criteria andCommentCreateTimeNotEqualTo(Date value) {
            addCriterion("COMMENT_CREATE_TIME <>", value, "commentCreateTime");
            return (Criteria) this;
        }

        public Criteria andCommentCreateTimeGreaterThan(Date value) {
            addCriterion("COMMENT_CREATE_TIME >", value, "commentCreateTime");
            return (Criteria) this;
        }

        public Criteria andCommentCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("COMMENT_CREATE_TIME >=", value, "commentCreateTime");
            return (Criteria) this;
        }

        public Criteria andCommentCreateTimeLessThan(Date value) {
            addCriterion("COMMENT_CREATE_TIME <", value, "commentCreateTime");
            return (Criteria) this;
        }

        public Criteria andCommentCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("COMMENT_CREATE_TIME <=", value, "commentCreateTime");
            return (Criteria) this;
        }

        public Criteria andCommentCreateTimeIn(List<Date> values) {
            addCriterion("COMMENT_CREATE_TIME in", values, "commentCreateTime");
            return (Criteria) this;
        }

        public Criteria andCommentCreateTimeNotIn(List<Date> values) {
            addCriterion("COMMENT_CREATE_TIME not in", values, "commentCreateTime");
            return (Criteria) this;
        }

        public Criteria andCommentCreateTimeBetween(Date value1, Date value2) {
            addCriterion("COMMENT_CREATE_TIME between", value1, value2, "commentCreateTime");
            return (Criteria) this;
        }

        public Criteria andCommentCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("COMMENT_CREATE_TIME not between", value1, value2, "commentCreateTime");
            return (Criteria) this;
        }

        public Criteria andCommentLevelIsNull() {
            addCriterion("COMMENT_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCommentLevelIsNotNull() {
            addCriterion("COMMENT_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCommentLevelEqualTo(Integer value) {
            addCriterion("COMMENT_LEVEL =", value, "commentLevel");
            return (Criteria) this;
        }

        public Criteria andCommentLevelNotEqualTo(Integer value) {
            addCriterion("COMMENT_LEVEL <>", value, "commentLevel");
            return (Criteria) this;
        }

        public Criteria andCommentLevelGreaterThan(Integer value) {
            addCriterion("COMMENT_LEVEL >", value, "commentLevel");
            return (Criteria) this;
        }

        public Criteria andCommentLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMMENT_LEVEL >=", value, "commentLevel");
            return (Criteria) this;
        }

        public Criteria andCommentLevelLessThan(Integer value) {
            addCriterion("COMMENT_LEVEL <", value, "commentLevel");
            return (Criteria) this;
        }

        public Criteria andCommentLevelLessThanOrEqualTo(Integer value) {
            addCriterion("COMMENT_LEVEL <=", value, "commentLevel");
            return (Criteria) this;
        }

        public Criteria andCommentLevelIn(List<Integer> values) {
            addCriterion("COMMENT_LEVEL in", values, "commentLevel");
            return (Criteria) this;
        }

        public Criteria andCommentLevelNotIn(List<Integer> values) {
            addCriterion("COMMENT_LEVEL not in", values, "commentLevel");
            return (Criteria) this;
        }

        public Criteria andCommentLevelBetween(Integer value1, Integer value2) {
            addCriterion("COMMENT_LEVEL between", value1, value2, "commentLevel");
            return (Criteria) this;
        }

        public Criteria andCommentLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("COMMENT_LEVEL not between", value1, value2, "commentLevel");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNull() {
            addCriterion("\"IS_VALID\" is null");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNotNull() {
            addCriterion("\"IS_VALID\" is not null");
            return (Criteria) this;
        }

        public Criteria andIsValidEqualTo(Integer value) {
            addCriterion("\"IS_VALID\" =", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotEqualTo(Integer value) {
            addCriterion("\"IS_VALID\" <>", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThan(Integer value) {
            addCriterion("\"IS_VALID\" >", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"IS_VALID\" >=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThan(Integer value) {
            addCriterion("\"IS_VALID\" <", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThanOrEqualTo(Integer value) {
            addCriterion("\"IS_VALID\" <=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidIn(List<Integer> values) {
            addCriterion("\"IS_VALID\" in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotIn(List<Integer> values) {
            addCriterion("\"IS_VALID\" not in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidBetween(Integer value1, Integer value2) {
            addCriterion("\"IS_VALID\" between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotBetween(Integer value1, Integer value2) {
            addCriterion("\"IS_VALID\" not between", value1, value2, "isValid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_comment
     *
     * @mbg.generated do_not_delete_during_merge Fri Feb 12 16:54:45 CST 2021
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_comment
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
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