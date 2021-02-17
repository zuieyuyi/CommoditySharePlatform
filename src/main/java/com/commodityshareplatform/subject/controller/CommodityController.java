package com.commodityshareplatform.subject.controller;

import com.commodityshareplatform.subject.bean.Commodity;
import com.commodityshareplatform.subject.service.ICommodityService;
import com.commodityshareplatform.subject.service.impl.CommodityService;
import com.commodityshareplatform.subject.utils.Result;
import com.commodityshareplatform.subject.utils.ResultUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Controller
@RequestMapping("admin")
public class CommodityController {
    @Autowired
    ICommodityService commodityService;

    @RequestMapping("to_commodities")
    public String toCommoditiesPage(){
        return "admin/commodity_list";
    }

    /**
     * 获取全部商品
     */
    @RequestMapping(value = "commodities",method = RequestMethod.GET)
    @ResponseBody
    public Result<PageInfo> commodityList(@RequestParam(value = "pn",defaultValue = "1")Integer pn){
        PageHelper.startPage(pn,5);
        List<Commodity> commodities = commodityService.selectAllCommodity();
        PageInfo page = new PageInfo(commodities,5);
        return ResultUtils.success(page);
    }

    /**
     * 商品添加
     */
    @RequestMapping(value = "commodity",method = RequestMethod.POST)
    @ResponseBody
    public Result<Commodity> addCommodity(Commodity commodity){
        Integer result = commodityService.insertCommodity(commodity);
        if (result == 1){
            return ResultUtils.success();
        }else{
            return ResultUtils.error(-1,"商品添加失败");
        }
    }

    /**
     * 保存商品修改信息
     */
    @RequestMapping(value = "/commodity/{commodityId}",method = RequestMethod.PUT)
    @ResponseBody
    public Result<Commodity> saveCommdity(Commodity commodity){
        Integer result = commodityService.updateCommodity(commodity);
        if (result == 1){
            return ResultUtils.success();
        }else{
            return ResultUtils.error(-1,"商品修改失败");
        }
    }

    /**
     * 商品删除
     */
    @RequestMapping(value = "/commodity/{commodityId}",method = RequestMethod.DELETE)
    @ResponseBody
    public Result<Commodity> deleteCommodity(@PathVariable("commodityId") Integer commodityId){
        Integer result = commodityService.deleteCommodityById(commodityId);
        if (result == 1){
            return ResultUtils.success();
        }else{
            return ResultUtils.error(-1,"商品修改失败");
        }
    }
}
