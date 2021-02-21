package com.commodityshareplatform.subject.bean;

import java.util.Date;

public class Order extends OrderKey {
    private Integer orderId;

    private Integer orderPubUserId;

    private Integer orderUserId;

    private Integer orderCommodityId;

    private String orderName;

    private String orderCode;

    private Integer orderStatus;

    private Date orderCreateDate;

    private String orderAddr;

    private String orderArriveAddr;

    private Date orderBeginRentTime;

    private Date orderEndRentTime;

    private Integer orderBackTime;

    private Integer isValid;

    @Override
    public Integer getOrderId() {
        return orderId;
    }

    @Override
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderPubUserId() {
        return orderPubUserId;
    }

    public void setOrderPubUserId(Integer orderPubUserId) {
        this.orderPubUserId = orderPubUserId;
    }

    @Override
    public Integer getOrderUserId() {
        return orderUserId;
    }

    @Override
    public void setOrderUserId(Integer orderUserId) {
        this.orderUserId = orderUserId;
    }

    @Override
    public Integer getOrderCommodityId() {
        return orderCommodityId;
    }

    @Override
    public void setOrderCommodityId(Integer orderCommodityId) {
        this.orderCommodityId = orderCommodityId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName == null ? null : orderName.trim();
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getOrderCreateDate() {
        return orderCreateDate;
    }

    public void setOrderCreateDate(Date orderCreateDate) {
        this.orderCreateDate = orderCreateDate;
    }

    public String getOrderAddr() {
        return orderAddr;
    }

    public void setOrderAddr(String orderAddr) {
        this.orderAddr = orderAddr == null ? null : orderAddr.trim();
    }

    public String getOrderArriveAddr() {
        return orderArriveAddr;
    }

    public void setOrderArriveAddr(String orderArriveAddr) {
        this.orderArriveAddr = orderArriveAddr == null ? null : orderArriveAddr.trim();
    }

    public Date getOrderBeginRentTime() {
        return orderBeginRentTime;
    }

    public void setOrderBeginRentTime(Date orderBeginRentTime) {
        this.orderBeginRentTime = orderBeginRentTime;
    }

    public Date getOrderEndRentTime() {
        return orderEndRentTime;
    }

    public void setOrderEndRentTime(Date orderEndRentTime) {
        this.orderEndRentTime = orderEndRentTime;
    }

    public Integer getOrderBackTime() {
        return orderBackTime;
    }

    public void setOrderBackTime(Integer orderBackTime) {
        this.orderBackTime = orderBackTime;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }
}