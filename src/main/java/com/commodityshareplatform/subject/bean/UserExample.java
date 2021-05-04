package com.commodityshareplatform.subject.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_user
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_user
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_user
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
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
     * This method corresponds to the database table t_user
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
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
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
     * This class corresponds to the database table t_user
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPwIsNull() {
            addCriterion("USER_PW is null");
            return (Criteria) this;
        }

        public Criteria andUserPwIsNotNull() {
            addCriterion("USER_PW is not null");
            return (Criteria) this;
        }

        public Criteria andUserPwEqualTo(String value) {
            addCriterion("USER_PW =", value, "userPw");
            return (Criteria) this;
        }

        public Criteria andUserPwNotEqualTo(String value) {
            addCriterion("USER_PW <>", value, "userPw");
            return (Criteria) this;
        }

        public Criteria andUserPwGreaterThan(String value) {
            addCriterion("USER_PW >", value, "userPw");
            return (Criteria) this;
        }

        public Criteria andUserPwGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PW >=", value, "userPw");
            return (Criteria) this;
        }

        public Criteria andUserPwLessThan(String value) {
            addCriterion("USER_PW <", value, "userPw");
            return (Criteria) this;
        }

        public Criteria andUserPwLessThanOrEqualTo(String value) {
            addCriterion("USER_PW <=", value, "userPw");
            return (Criteria) this;
        }

        public Criteria andUserPwLike(String value) {
            addCriterion("USER_PW like", value, "userPw");
            return (Criteria) this;
        }

        public Criteria andUserPwNotLike(String value) {
            addCriterion("USER_PW not like", value, "userPw");
            return (Criteria) this;
        }

        public Criteria andUserPwIn(List<String> values) {
            addCriterion("USER_PW in", values, "userPw");
            return (Criteria) this;
        }

        public Criteria andUserPwNotIn(List<String> values) {
            addCriterion("USER_PW not in", values, "userPw");
            return (Criteria) this;
        }

        public Criteria andUserPwBetween(String value1, String value2) {
            addCriterion("USER_PW between", value1, value2, "userPw");
            return (Criteria) this;
        }

        public Criteria andUserPwNotBetween(String value1, String value2) {
            addCriterion("USER_PW not between", value1, value2, "userPw");
            return (Criteria) this;
        }

        public Criteria andUserBuyIsNull() {
            addCriterion("USER_BUY is null");
            return (Criteria) this;
        }

        public Criteria andUserBuyIsNotNull() {
            addCriterion("USER_BUY is not null");
            return (Criteria) this;
        }

        public Criteria andUserBuyEqualTo(String value) {
            addCriterion("USER_BUY =", value, "userBuy");
            return (Criteria) this;
        }

        public Criteria andUserBuyNotEqualTo(String value) {
            addCriterion("USER_BUY <>", value, "userBuy");
            return (Criteria) this;
        }

        public Criteria andUserBuyGreaterThan(String value) {
            addCriterion("USER_BUY >", value, "userBuy");
            return (Criteria) this;
        }

        public Criteria andUserBuyGreaterThanOrEqualTo(String value) {
            addCriterion("USER_BUY >=", value, "userBuy");
            return (Criteria) this;
        }

        public Criteria andUserBuyLessThan(String value) {
            addCriterion("USER_BUY <", value, "userBuy");
            return (Criteria) this;
        }

        public Criteria andUserBuyLessThanOrEqualTo(String value) {
            addCriterion("USER_BUY <=", value, "userBuy");
            return (Criteria) this;
        }

        public Criteria andUserBuyLike(String value) {
            addCriterion("USER_BUY like", value, "userBuy");
            return (Criteria) this;
        }

        public Criteria andUserBuyNotLike(String value) {
            addCriterion("USER_BUY not like", value, "userBuy");
            return (Criteria) this;
        }

        public Criteria andUserBuyIn(List<String> values) {
            addCriterion("USER_BUY in", values, "userBuy");
            return (Criteria) this;
        }

        public Criteria andUserBuyNotIn(List<String> values) {
            addCriterion("USER_BUY not in", values, "userBuy");
            return (Criteria) this;
        }

        public Criteria andUserBuyBetween(String value1, String value2) {
            addCriterion("USER_BUY between", value1, value2, "userBuy");
            return (Criteria) this;
        }

        public Criteria andUserBuyNotBetween(String value1, String value2) {
            addCriterion("USER_BUY not between", value1, value2, "userBuy");
            return (Criteria) this;
        }

        public Criteria andUserAddrIsNull() {
            addCriterion("USER_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andUserAddrIsNotNull() {
            addCriterion("USER_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddrEqualTo(String value) {
            addCriterion("USER_ADDR =", value, "userAddr");
            return (Criteria) this;
        }

        public Criteria andUserAddrNotEqualTo(String value) {
            addCriterion("USER_ADDR <>", value, "userAddr");
            return (Criteria) this;
        }

        public Criteria andUserAddrGreaterThan(String value) {
            addCriterion("USER_ADDR >", value, "userAddr");
            return (Criteria) this;
        }

        public Criteria andUserAddrGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ADDR >=", value, "userAddr");
            return (Criteria) this;
        }

        public Criteria andUserAddrLessThan(String value) {
            addCriterion("USER_ADDR <", value, "userAddr");
            return (Criteria) this;
        }

        public Criteria andUserAddrLessThanOrEqualTo(String value) {
            addCriterion("USER_ADDR <=", value, "userAddr");
            return (Criteria) this;
        }

        public Criteria andUserAddrLike(String value) {
            addCriterion("USER_ADDR like", value, "userAddr");
            return (Criteria) this;
        }

        public Criteria andUserAddrNotLike(String value) {
            addCriterion("USER_ADDR not like", value, "userAddr");
            return (Criteria) this;
        }

        public Criteria andUserAddrIn(List<String> values) {
            addCriterion("USER_ADDR in", values, "userAddr");
            return (Criteria) this;
        }

        public Criteria andUserAddrNotIn(List<String> values) {
            addCriterion("USER_ADDR not in", values, "userAddr");
            return (Criteria) this;
        }

        public Criteria andUserAddrBetween(String value1, String value2) {
            addCriterion("USER_ADDR between", value1, value2, "userAddr");
            return (Criteria) this;
        }

        public Criteria andUserAddrNotBetween(String value1, String value2) {
            addCriterion("USER_ADDR not between", value1, value2, "userAddr");
            return (Criteria) this;
        }

        public Criteria andUserCollectIsNull() {
            addCriterion("USER_COLLECT is null");
            return (Criteria) this;
        }

        public Criteria andUserCollectIsNotNull() {
            addCriterion("USER_COLLECT is not null");
            return (Criteria) this;
        }

        public Criteria andUserCollectEqualTo(String value) {
            addCriterion("USER_COLLECT =", value, "userCollect");
            return (Criteria) this;
        }

        public Criteria andUserCollectNotEqualTo(String value) {
            addCriterion("USER_COLLECT <>", value, "userCollect");
            return (Criteria) this;
        }

        public Criteria andUserCollectGreaterThan(String value) {
            addCriterion("USER_COLLECT >", value, "userCollect");
            return (Criteria) this;
        }

        public Criteria andUserCollectGreaterThanOrEqualTo(String value) {
            addCriterion("USER_COLLECT >=", value, "userCollect");
            return (Criteria) this;
        }

        public Criteria andUserCollectLessThan(String value) {
            addCriterion("USER_COLLECT <", value, "userCollect");
            return (Criteria) this;
        }

        public Criteria andUserCollectLessThanOrEqualTo(String value) {
            addCriterion("USER_COLLECT <=", value, "userCollect");
            return (Criteria) this;
        }

        public Criteria andUserCollectLike(String value) {
            addCriterion("USER_COLLECT like", value, "userCollect");
            return (Criteria) this;
        }

        public Criteria andUserCollectNotLike(String value) {
            addCriterion("USER_COLLECT not like", value, "userCollect");
            return (Criteria) this;
        }

        public Criteria andUserCollectIn(List<String> values) {
            addCriterion("USER_COLLECT in", values, "userCollect");
            return (Criteria) this;
        }

        public Criteria andUserCollectNotIn(List<String> values) {
            addCriterion("USER_COLLECT not in", values, "userCollect");
            return (Criteria) this;
        }

        public Criteria andUserCollectBetween(String value1, String value2) {
            addCriterion("USER_COLLECT between", value1, value2, "userCollect");
            return (Criteria) this;
        }

        public Criteria andUserCollectNotBetween(String value1, String value2) {
            addCriterion("USER_COLLECT not between", value1, value2, "userCollect");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("USER_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("USER_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("USER_EMAIL =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("USER_EMAIL <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("USER_EMAIL >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("USER_EMAIL >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("USER_EMAIL <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("USER_EMAIL <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("USER_EMAIL like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("USER_EMAIL not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("USER_EMAIL in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("USER_EMAIL not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("USER_EMAIL between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("USER_EMAIL not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNull() {
            addCriterion("USER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNotNull() {
            addCriterion("USER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andUserStatusEqualTo(Integer value) {
            addCriterion("USER_STATUS =", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotEqualTo(Integer value) {
            addCriterion("USER_STATUS <>", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThan(Integer value) {
            addCriterion("USER_STATUS >", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_STATUS >=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThan(Integer value) {
            addCriterion("USER_STATUS <", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThanOrEqualTo(Integer value) {
            addCriterion("USER_STATUS <=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusIn(List<Integer> values) {
            addCriterion("USER_STATUS in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotIn(List<Integer> values) {
            addCriterion("USER_STATUS not in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusBetween(Integer value1, Integer value2) {
            addCriterion("USER_STATUS between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_STATUS not between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserCearteDateIsNull() {
            addCriterion("USER_CEARTE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUserCearteDateIsNotNull() {
            addCriterion("USER_CEARTE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUserCearteDateEqualTo(Date value) {
            addCriterionForJDBCDate("USER_CEARTE_DATE =", value, "userCearteDate");
            return (Criteria) this;
        }

        public Criteria andUserCearteDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("USER_CEARTE_DATE <>", value, "userCearteDate");
            return (Criteria) this;
        }

        public Criteria andUserCearteDateGreaterThan(Date value) {
            addCriterionForJDBCDate("USER_CEARTE_DATE >", value, "userCearteDate");
            return (Criteria) this;
        }

        public Criteria andUserCearteDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("USER_CEARTE_DATE >=", value, "userCearteDate");
            return (Criteria) this;
        }

        public Criteria andUserCearteDateLessThan(Date value) {
            addCriterionForJDBCDate("USER_CEARTE_DATE <", value, "userCearteDate");
            return (Criteria) this;
        }

        public Criteria andUserCearteDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("USER_CEARTE_DATE <=", value, "userCearteDate");
            return (Criteria) this;
        }

        public Criteria andUserCearteDateIn(List<Date> values) {
            addCriterionForJDBCDate("USER_CEARTE_DATE in", values, "userCearteDate");
            return (Criteria) this;
        }

        public Criteria andUserCearteDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("USER_CEARTE_DATE not in", values, "userCearteDate");
            return (Criteria) this;
        }

        public Criteria andUserCearteDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("USER_CEARTE_DATE between", value1, value2, "userCearteDate");
            return (Criteria) this;
        }

        public Criteria andUserCearteDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("USER_CEARTE_DATE not between", value1, value2, "userCearteDate");
            return (Criteria) this;
        }

        public Criteria andUserIsAdminIsNull() {
            addCriterion("USER_IS_ADMIN is null");
            return (Criteria) this;
        }

        public Criteria andUserIsAdminIsNotNull() {
            addCriterion("USER_IS_ADMIN is not null");
            return (Criteria) this;
        }

        public Criteria andUserIsAdminEqualTo(Integer value) {
            addCriterion("USER_IS_ADMIN =", value, "userIsAdmin");
            return (Criteria) this;
        }

        public Criteria andUserIsAdminNotEqualTo(Integer value) {
            addCriterion("USER_IS_ADMIN <>", value, "userIsAdmin");
            return (Criteria) this;
        }

        public Criteria andUserIsAdminGreaterThan(Integer value) {
            addCriterion("USER_IS_ADMIN >", value, "userIsAdmin");
            return (Criteria) this;
        }

        public Criteria andUserIsAdminGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_IS_ADMIN >=", value, "userIsAdmin");
            return (Criteria) this;
        }

        public Criteria andUserIsAdminLessThan(Integer value) {
            addCriterion("USER_IS_ADMIN <", value, "userIsAdmin");
            return (Criteria) this;
        }

        public Criteria andUserIsAdminLessThanOrEqualTo(Integer value) {
            addCriterion("USER_IS_ADMIN <=", value, "userIsAdmin");
            return (Criteria) this;
        }

        public Criteria andUserIsAdminIn(List<Integer> values) {
            addCriterion("USER_IS_ADMIN in", values, "userIsAdmin");
            return (Criteria) this;
        }

        public Criteria andUserIsAdminNotIn(List<Integer> values) {
            addCriterion("USER_IS_ADMIN not in", values, "userIsAdmin");
            return (Criteria) this;
        }

        public Criteria andUserIsAdminBetween(Integer value1, Integer value2) {
            addCriterion("USER_IS_ADMIN between", value1, value2, "userIsAdmin");
            return (Criteria) this;
        }

        public Criteria andUserIsAdminNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_IS_ADMIN not between", value1, value2, "userIsAdmin");
            return (Criteria) this;
        }

        public Criteria andUserMoneyIsNull() {
            addCriterion("USER_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andUserMoneyIsNotNull() {
            addCriterion("USER_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andUserMoneyEqualTo(BigDecimal value) {
            addCriterion("USER_MONEY =", value, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyNotEqualTo(BigDecimal value) {
            addCriterion("USER_MONEY <>", value, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyGreaterThan(BigDecimal value) {
            addCriterion("USER_MONEY >", value, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USER_MONEY >=", value, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyLessThan(BigDecimal value) {
            addCriterion("USER_MONEY <", value, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USER_MONEY <=", value, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyIn(List<BigDecimal> values) {
            addCriterion("USER_MONEY in", values, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyNotIn(List<BigDecimal> values) {
            addCriterion("USER_MONEY not in", values, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USER_MONEY between", value1, value2, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USER_MONEY not between", value1, value2, "userMoney");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNull() {
            addCriterion("IS_VALID is null");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNotNull() {
            addCriterion("IS_VALID is not null");
            return (Criteria) this;
        }

        public Criteria andIsValidEqualTo(Integer value) {
            addCriterion("IS_VALID =", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotEqualTo(Integer value) {
            addCriterion("IS_VALID <>", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThan(Integer value) {
            addCriterion("IS_VALID >", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_VALID >=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThan(Integer value) {
            addCriterion("IS_VALID <", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThanOrEqualTo(Integer value) {
            addCriterion("IS_VALID <=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidIn(List<Integer> values) {
            addCriterion("IS_VALID in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotIn(List<Integer> values) {
            addCriterion("IS_VALID not in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidBetween(Integer value1, Integer value2) {
            addCriterion("IS_VALID between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_VALID not between", value1, value2, "isValid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_user
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
     * This class corresponds to the database table t_user
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