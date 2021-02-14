package com.commodityshareplatform.subject.service.impl;

import com.commodityshareplatform.subject.bean.Order;
import com.commodityshareplatform.subject.bean.OrderExample;
import com.commodityshareplatform.subject.dao.OrderMapper;
import com.commodityshareplatform.subject.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderService implements IOrderService {
    @Autowired
    OrderMapper orderMapper;

    @Override
    public List<Order> selectAllOrder() {
        List<Order> orders = orderMapper.selectByExample(null);
        return orders;
    }

    @Override
    public Order selectOrderById(Integer id) {
        OrderExample orderExample = new OrderExample();
        OrderExample.Criteria criteria = orderExample.createCriteria();
        criteria.andOrderIdEqualTo(id);
        List<Order> orders = orderMapper.selectByExample(orderExample);
        return orders.get(0);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW,
            isolation = Isolation.READ_COMMITTED,
            readOnly = false,
            timeout = 2,
            rollbackFor = {Exception.class})
    @Override
    public Integer deleteOrderById(Integer id) {
//        OrderExample orderExample = new OrderExample();
//        OrderExample.Criteria criteria = orderExample.createCriteria();
//        criteria.andOrderIdEqualTo(id);
        Order order = selectOrderById(id);
        order.setIsValid(0);
        int result = orderMapper.updateByExample(order, null);
        return result;
    }

    @Override
    public Integer updateOrderById(Order order) {
//        OrderExample orderExample = new OrderExample();
//        OrderExample.Criteria criteria = orderExample.createCriteria();
//        criteria.andOrderIdEqualTo(order.getOrderId());
        orderMapper.updateByExample(order,null);
        return null;
    }

    @Override
    public Integer insertOrderById(Order order) {
        int result = orderMapper.insertSelective(order);
        return result;
    }

    @Override
    public Integer deleteOrderBatchById(List<Integer> ids) {
        return null;
    }
}
