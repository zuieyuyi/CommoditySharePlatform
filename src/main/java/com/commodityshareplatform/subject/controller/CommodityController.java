package com.commodityshareplatform.subject.controller;

import com.commodityshareplatform.subject.bean.Commodity;
import com.commodityshareplatform.subject.service.ICommodityService;
import com.commodityshareplatform.subject.service.impl.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;

@Controller
@RequestMapping("admin")
public class CommodityController {
    @Autowired
    ICommodityService commodityService;

    /**
     * 获取全部商品
     */
    @RequestMapping(value = "commodities",method = RequestMethod.GET)
    public String commodityList(Model model){
        Collection<Commodity> commodities = commodityService.selectAllCommodity();
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("commodities",commodities);
//        mv.setViewName("admin/commodity_list");
        model.addAttribute("commodities",commodities);
        return "admin/commodity_list";
    }
}
