package com.commodityshareplatform.subject.bean;

import java.math.BigDecimal;
import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.USER_ID
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.USER_NAME
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.USER_PW
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    private String userPw;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.USER_BUY
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    private String userBuy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.USER_ADDR
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    private String userAddr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.USER_COLLECT
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    private String userCollect;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.USER_EMAIL
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    private String userEmail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.USER_STATUS
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    private Integer userStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.USER_CEARTE_DATE
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    private Date userCearteDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.USER_IS_ADMIN
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    private Integer userIsAdmin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.USER_MONEY
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    private BigDecimal userMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.IS_ VALID
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    private Integer isValid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.USER_DETAILS
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    private String userDetails;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.USER_ID
     *
     * @return the value of t_user.USER_ID
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.USER_ID
     *
     * @param userId the value for t_user.USER_ID
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.USER_NAME
     *
     * @return the value of t_user.USER_NAME
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.USER_NAME
     *
     * @param userName the value for t_user.USER_NAME
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.USER_PW
     *
     * @return the value of t_user.USER_PW
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public String getUserPw() {
        return userPw;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.USER_PW
     *
     * @param userPw the value for t_user.USER_PW
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public void setUserPw(String userPw) {
        this.userPw = userPw == null ? null : userPw.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.USER_BUY
     *
     * @return the value of t_user.USER_BUY
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public String getUserBuy() {
        return userBuy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.USER_BUY
     *
     * @param userBuy the value for t_user.USER_BUY
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public void setUserBuy(String userBuy) {
        this.userBuy = userBuy == null ? null : userBuy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.USER_ADDR
     *
     * @return the value of t_user.USER_ADDR
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public String getUserAddr() {
        return userAddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.USER_ADDR
     *
     * @param userAddr the value for t_user.USER_ADDR
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr == null ? null : userAddr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.USER_COLLECT
     *
     * @return the value of t_user.USER_COLLECT
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public String getUserCollect() {
        return userCollect;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.USER_COLLECT
     *
     * @param userCollect the value for t_user.USER_COLLECT
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public void setUserCollect(String userCollect) {
        this.userCollect = userCollect == null ? null : userCollect.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.USER_EMAIL
     *
     * @return the value of t_user.USER_EMAIL
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.USER_EMAIL
     *
     * @param userEmail the value for t_user.USER_EMAIL
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.USER_STATUS
     *
     * @return the value of t_user.USER_STATUS
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public Integer getUserStatus() {
        return userStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.USER_STATUS
     *
     * @param userStatus the value for t_user.USER_STATUS
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.USER_CEARTE_DATE
     *
     * @return the value of t_user.USER_CEARTE_DATE
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public Date getUserCearteDate() {
        return userCearteDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.USER_CEARTE_DATE
     *
     * @param userCearteDate the value for t_user.USER_CEARTE_DATE
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public void setUserCearteDate(Date userCearteDate) {
        this.userCearteDate = userCearteDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.USER_IS_ADMIN
     *
     * @return the value of t_user.USER_IS_ADMIN
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public Integer getUserIsAdmin() {
        return userIsAdmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.USER_IS_ADMIN
     *
     * @param userIsAdmin the value for t_user.USER_IS_ADMIN
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public void setUserIsAdmin(Integer userIsAdmin) {
        this.userIsAdmin = userIsAdmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.USER_MONEY
     *
     * @return the value of t_user.USER_MONEY
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public BigDecimal getUserMoney() {
        return userMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.USER_MONEY
     *
     * @param userMoney the value for t_user.USER_MONEY
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public void setUserMoney(BigDecimal userMoney) {
        this.userMoney = userMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.IS_ VALID
     *
     * @return the value of t_user.IS_ VALID
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public Integer getIsValid() {
        return isValid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.IS_ VALID
     *
     * @param isValid the value for t_user.IS_ VALID
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.USER_DETAILS
     *
     * @return the value of t_user.USER_DETAILS
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public String getUserDetails() {
        return userDetails;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.USER_DETAILS
     *
     * @param userDetails the value for t_user.USER_DETAILS
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public void setUserDetails(String userDetails) {
        this.userDetails = userDetails == null ? null : userDetails.trim();
    }
}