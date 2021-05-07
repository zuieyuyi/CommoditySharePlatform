package com.commodityshareplatform.subject.controller;

import com.commodityshareplatform.subject.bean.Order;
import com.commodityshareplatform.subject.bean.OrderExample;
import com.commodityshareplatform.subject.bean.User;
import com.commodityshareplatform.subject.enuminfo.OrderStatusEnum;
import com.commodityshareplatform.subject.service.IOrderService;
import com.commodityshareplatform.subject.utils.Result;
import com.commodityshareplatform.subject.utils.ResultUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    /**
     * 完成订单总数以及未完成订单总数
     */
    @RequestMapping(value = "order/countOrder",method = RequestMethod.POST)
    @ResponseBody
    public Result countOrder(@RequestParam("year") String year){
        Map<String,Integer> count = new HashMap<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");

        Date date1 = null;
        Date date2 = null;
        try {
            date1 = simpleDateFormat.parse(year);
            Integer i = Integer.parseInt(year) + 1;
            date2 = simpleDateFormat.parse(i.toString());
            date2.setTime(date2.getTime()-(1*1000*60*60*24));

        } catch (ParseException e) {
            return ResultUtils.error(-1,"日期出错");
        }

        //1、查出未完成订单总数
        OrderExample ex = new OrderExample();
        OrderExample.Criteria criteria = ex.createCriteria();
        criteria.andOrderCreateDateBetween(date1,date2);
        criteria.andOrderStatusNotEqualTo(OrderStatusEnum.RETURN_OVER.getStatusCode());
        criteria.andOrderStatusNotEqualTo(OrderStatusEnum.RETURN_BACK.getStatusCode());

        List<Order> notCompleteOrders = orderService.selectAllOrders(ex);

        count.put("未完成订单数",notCompleteOrders.size());
        //2、查出退货订单总数
        OrderExample ex1 = new OrderExample();
        OrderExample.Criteria criteria1 = ex1.createCriteria();
        criteria1.andOrderCreateDateBetween(date1,date2);
        criteria1.andOrderStatusEqualTo(OrderStatusEnum.RETURN_BACK.getStatusCode());

        List<Order> returnOrders = orderService.selectAllOrders(ex1);
        count.put("退货订单数",returnOrders.size());
        //3、查出完成订单总数
        OrderExample ex2 = new OrderExample();
        OrderExample.Criteria criteria2 = ex2.createCriteria();
        criteria2.andOrderCreateDateBetween(date1,date2);
        criteria2.andOrderStatusEqualTo(OrderStatusEnum.RETURN_OVER.getStatusCode());

        List<Order> completeOrders = orderService.selectAllOrders(ex2);
        count.put("完成订单数",completeOrders.size());

        return ResultUtils.success(count);
    }
}
