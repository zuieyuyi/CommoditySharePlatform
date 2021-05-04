package com.commodityshareplatform.subject.controller;

import com.commodityshareplatform.subject.bean.Order;
import com.commodityshareplatform.subject.bean.OrderExample;
import com.commodityshareplatform.subject.bean.User;
import com.commodityshareplatform.subject.service.IOrderService;
import com.commodityshareplatform.subject.utils.Result;
import com.commodityshareplatform.subject.utils.ResultUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping(value = "to_order_select/{orderId}",method = RequestMethod.GET)
    public ModelAndView toUserSelect(@PathVariable("orderId") Integer orderId){
        Order order = orderService.selectOrderById(orderId);

        ModelAndView mv = new ModelAndView("admin/order_select");
        mv.addObject("order",order);
        return mv;
    }

    /**
     * 获取全部订单数据
     */
    @RequestMapping(value = "orders", method = RequestMethod.GET)
    @ResponseBody
    public Result getAllOrders() {
        OrderExample example = new OrderExample();
        OrderExample.Criteria criteria = example.createCriteria();
        criteria.andIsValidEqualTo(1);
        List<Order> orders = orderService.selectAllOrders(example);
        return ResultUtils.success(orders);
    }

    /**
     * 获取全部订单数据(分页)
     */
    @RequestMapping(value = "orderss", method = RequestMethod.GET)
    @ResponseBody
    public Result<PageInfo> getAllOrderss(@RequestParam("pn") Integer pn) {
        PageHelper.startPage(pn, 5);
        OrderExample example = new OrderExample();
        OrderExample.Criteria criteria = example.createCriteria();
        criteria.andIsValidEqualTo(1);
        List<Order> orders = orderService.selectAllOrders(example);
        PageInfo pageInfo = new PageInfo(orders, 5);
        return ResultUtils.success(pageInfo);
    }

    /**
     * 添加订单
     */
    @RequestMapping(value = "order" ,method = RequestMethod.POST)
    @ResponseBody
    public Result addOrder(Order order){
        Integer result = orderService.insertOrder(order);
        if (result != null){
            return ResultUtils.success();
        }else{
            return ResultUtils.error(-1,"订单添加失败添加失败");
        }
    }

    /**
     * 通过Id查询对应的订单
     */
    @RequestMapping(value = "order/{orderId}",method = RequestMethod.GET)
    @ResponseBody
    public Result getOrderById(@PathVariable("orderId") Integer orderId){
        Order order = orderService.selectOrderById(orderId);
        return ResultUtils.success(order);
    }

    /**
     * 保存修改的订单
     */
    @RequestMapping(value = "order",method = RequestMethod.PUT)
    @ResponseBody
    public Result saveOrder(Order order){
        Integer result = orderService.updateOrder(order);
        if (result != null){
            return ResultUtils.success();
        }else{
            return ResultUtils.error(-1,"订单保存失败添加失败");
        }
    }

    /**
     * 删除订单
     */
    @RequestMapping(value = "order/{orderId}",method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteOrder(@PathVariable("orderId") Integer orderId){
        Integer result = orderService.deleteOrderById(orderId);
        if (result != null){
            return ResultUtils.success();
        }else{
            return ResultUtils.error(-1,"订单保存失败添加失败");
        }
    }
}
