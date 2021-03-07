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

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Controller
@RequestMapping("admin")
public class CommodityController {
    @Autowired
    ICommodityService commodityService;

    /**
     * 跳转商品列表页面
     */
    @RequestMapping("to_commodities")
    public String toCommoditiesPage(){
        return "admin/commodity_list";
    }

    /**
     * 跳转商品详情页面
     */
    @RequestMapping(value = "to_commodity_select/{commodityId}",method = RequestMethod.GET)
    public ModelAndView toCommoditySelect(@PathVariable("commodityId") Integer commodityId){
        Commodity commodity = commodityService.selectCommodityById(commodityId);

        ModelAndView mv = new ModelAndView("admin/commodity_select");
        mv.addObject("commodity",commodity);
        return mv;
    }

    /**
     * 获取全部商品(分页)
     */
    @RequestMapping(value = "commodities",method = RequestMethod.GET)
    @ResponseBody
    public Result<PageInfo> getAllCommodities(@RequestParam(value = "pn",defaultValue = "1")Integer pn){
        PageHelper.startPage(pn,5);
        List<Commodity> commodities = commodityService.selectAllCommodities();
        PageInfo page = new PageInfo(commodities,5);
        return ResultUtils.success(page);
    }

    /**
     * 通过id查商品
     */
    @RequestMapping(value = "commodity/{commodityId}",method = RequestMethod.GET)
    @ResponseBody
    public Result<Commodity> getCommodityById(@PathVariable("commodityId") Integer commodityId){
        Commodity commodity = commodityService.selectCommodityById(commodityId);
        return ResultUtils.success(commodity);
    }

    /**
     * 商品添加
     */
    @RequestMapping(value = "commodity",method = RequestMethod.POST)
    @ResponseBody
    public Result<Commodity> addCommodity(Commodity commodity){
        Integer result = commodityService.insertCommodity(commodity);
        if (result != null){
            return ResultUtils.success();
        }else{
            return ResultUtils.error(-1,"商品添加失败");
        }
    }

    /**
     * 保存商品修改信息
     */
    @RequestMapping(value = "commodity",method = RequestMethod.PUT)
    @ResponseBody
    public Result<Commodity> saveCommodity(Commodity commodity){
        Integer result = commodityService.updateCommodity(commodity);
        if (result != null){
            return ResultUtils.success();
        }else{
            return ResultUtils.error(-1,"商品保存失败");
        }
    }

    /**
     * 商品删除
     */
    @RequestMapping(value = "/commodity/{commodityId}",method = RequestMethod.DELETE)
    @ResponseBody
    public Result<Commodity> deleteCommodity(@PathVariable("commodityId") Integer commodityId){
        Integer result = commodityService.deleteCommodityById(commodityId);
        if (result != null){
            return ResultUtils.success();
        }else{
            return ResultUtils.error(-1,"商品修改失败");
        }
    }

    /**
     * 保存商品标签
     */
    @RequestMapping(value = "/commodityTags/{commodityId}",method = RequestMethod.PUT)
    @ResponseBody
    public Result saveCommodityTags(@PathVariable("commodityId") Integer commodityId,@RequestParam("commodityTags") String commodityTags){
        Integer result = commodityService.saveCommodityTags(commodityId, commodityTags);
        if (result != null){
            return ResultUtils.success();
        }else{
            return ResultUtils.error(-1,"商品修改失败");
        }
    }

    /**
     * 获取商品标签
     */
    @RequestMapping(value = "/commodityTags/{commodityId}",method = RequestMethod.GET)
    @ResponseBody
    public Result<String> getCommodityTags(@PathVariable("commodityId") Integer commodityId){
        String commodityTags = commodityService.getCommodityTags(commodityId);
        return ResultUtils.success(commodityTags);
    }
}
