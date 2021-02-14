package com.commodityshareplatform.subject.service;

import com.commodityshareplatform.subject.bean.Order;

import java.util.List;

public interface IOrderService {
    public List<Order> selectAllOrder();

    public Order selectOrderById(Integer id);

    public Integer deleteOrderById(Integer id);

    public Integer updateOrderById(Order order);

    public Integer insertOrderById(Order order);

    public Integer deleteOrderBatchById(List<Integer> ids);
}
