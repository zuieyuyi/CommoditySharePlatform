package com.commodityshareplatform.subject.bean;

import java.util.Date;

public class Comment extends CommentKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment.COMMENT_CREATE_TIME
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    private Date commentCreateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment.COMMENT_LEVEL
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    private Integer commentLevel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment.IS_ VALID
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    private Integer isValid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment.COMMENT_CONTENT
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    private String commentContent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment.COMMENT_CREATE_TIME
     *
     * @return the value of t_comment.COMMENT_CREATE_TIME
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public Date getCommentCreateTime() {
        return commentCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment.COMMENT_CREATE_TIME
     *
     * @param commentCreateTime the value for t_comment.COMMENT_CREATE_TIME
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public void setCommentCreateTime(Date commentCreateTime) {
        this.commentCreateTime = commentCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment.COMMENT_LEVEL
     *
     * @return the value of t_comment.COMMENT_LEVEL
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public Integer getCommentLevel() {
        return commentLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment.COMMENT_LEVEL
     *
     * @param commentLevel the value for t_comment.COMMENT_LEVEL
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public void setCommentLevel(Integer commentLevel) {
        this.commentLevel = commentLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment.IS_ VALID
     *
     * @return the value of t_comment.IS_ VALID
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public Integer getIsValid() {
        return isValid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment.IS_ VALID
     *
     * @param isValid the value for t_comment.IS_ VALID
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment.COMMENT_CONTENT
     *
     * @return the value of t_comment.COMMENT_CONTENT
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public String getCommentContent() {
        return commentContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment.COMMENT_CONTENT
     *
     * @param commentContent the value for t_comment.COMMENT_CONTENT
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }
}