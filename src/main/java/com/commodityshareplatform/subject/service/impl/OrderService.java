package com.commodityshareplatform.subject.service.impl;

import com.commodityshareplatform.subject.bean.Commodity;
import com.commodityshareplatform.subject.bean.Order;
import com.commodityshareplatform.subject.bean.OrderExample;
import com.commodityshareplatform.subject.bean.User;
import com.commodityshareplatform.subject.dao.CommodityMapper;
import com.commodityshareplatform.subject.dao.OrderMapper;
import com.commodityshareplatform.subject.dao.UserMapper;
import com.commodityshareplatform.subject.enuminfo.OrderStatusEnum;
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
    @Autowired
    UserMapper userMapper;
    @Autowired
    CommodityMapper commodityMapper;

    @Override
    public List<Order> selectAllOrders() {
        List<Order> orders = orderMapper.selectAllOrder();
        List<User> users = userMapper.selectAllUsers();
        List<Commodity> commodities = commodityMapper.selectAllCommodities();

        for (Order order:orders){
            //确定订单状态信息
            if (order.getOrderStatus() == OrderStatusEnum.PAYMENT.getStatusCode()){
                order.setOrderStatusMsg(OrderStatusEnum.PAYMENT.getStatus());
            }else if (order.getOrderStatus() == OrderStatusEnum.TAKE_DELIVERY.getStatusCode()){
                order.setOrderStatusMsg(OrderStatusEnum.TAKE_DELIVERY.getStatus());
            }else if (order.getOrderStatus() == OrderStatusEnum.RENT_OUT.getStatusCode()){
                order.setOrderStatusMsg(OrderStatusEnum.RENT_OUT.getStatus());
            }else if (order.getOrderStatus() == OrderStatusEnum.RETURN.getStatusCode()){
                order.setOrderStatusMsg(OrderStatusEnum.RETURN.getStatus());
            }else if (order.getOrderStatus() == OrderStatusEnum.RETURN_OVER.getStatusCode()){
                order.setOrderStatusMsg(OrderStatusEnum.RETURN_OVER.getStatus());
            }

            for (User user:users){
                //确认订单卖家
                if (user.getUserId()==order.getOrderUserId()){
                    order.setOrderUserName(user.getUserName());
                }
                //确认订单买家
                if (user.getUserId()==order.getOrderPubUserId()){
                    order.setOrderPubUserName(user.getUserName());
                }
                if ((!order.getOrderUserName().isEmpty())&&(!order.getOrderPubUserName().isEmpty())){
                    break;
                }
            }

            for (Commodity commodity:commodities){
                //确认商品信息
                if (commodity.getCommodityId() == order.getOrderCommodityId()){
                    order.setOrderCommodityName(commodity.getCommodityName());
                    break;
                }
            }
        }

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
    public Integer updateOrder(Order order) {
//        OrderExample orderExample = new OrderExample();
//        OrderExample.Criteria criteria = orderExample.createCriteria();
//        criteria.andOrderIdEqualTo(order.getOrderId());
        orderMapper.updateByExample(order,null);
        return null;
    }

    @Override
    public Integer insertOrder(Order order) {
        int result = orderMapper.insertSelective(order);
        return result;
    }

    @Override
    public Integer deleteOrderBatchById(List<Integer> ids) {
        return null;
    }
}
