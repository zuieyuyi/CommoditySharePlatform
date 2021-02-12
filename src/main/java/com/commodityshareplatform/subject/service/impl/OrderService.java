package com.commodityshareplatform.subject.service.impl;

import com.commodityshareplatform.subject.dao.OrderMapper;
import com.commodityshareplatform.subject.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService implements IOrderService {
    @Autowired
    OrderMapper orderMapper;
}
