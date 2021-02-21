package com.commodityshareplatform.subject.controller;

import com.commodityshareplatform.subject.bean.Order;
import com.commodityshareplatform.subject.bean.User;
import com.commodityshareplatform.subject.service.IOrderService;
import com.commodityshareplatform.subject.utils.Result;
import com.commodityshareplatform.subject.utils.ResultUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("admin")
public class OrderController {
    @Autowired
    IOrderService orderService;

    @RequestMapping("to_orders")
    public String to_orders() {
        return "admin/order_list";
    }

    /**
     * 获取全部订单数据
     */
    @RequestMapping(value = "orders", method = RequestMethod.GET)
    @ResponseBody
    public Result getAllOrders() {
        List<Order> orders = orderService.selectAllOrders();
        return ResultUtils.success(orders);
    }

    /**
     * 获取全部订单数据(分页)
     */
    @RequestMapping(value = "orderss", method = RequestMethod.GET)
    @ResponseBody
    public Result<PageInfo> getAllOrderss(@RequestParam("pn") Integer pn) {
        PageHelper.startPage(pn, 5);
        List<Order> orders = orderService.selectAllOrders();
        PageInfo pageInfo = new PageInfo(orders, 5);
        return ResultUtils.success(pageInfo);
    }
}
