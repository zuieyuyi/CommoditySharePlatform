package com.commodityshareplatform.subject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("dataCount")
public class DataCountController {

    @RequestMapping(value = "/to_data_count_map",method = RequestMethod.GET)
    public String toDataCount(){
        return "dataCount/dataCountMap";
    }
}
