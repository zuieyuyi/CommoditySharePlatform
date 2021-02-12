package com.commodityshareplatform.subject.service;

import com.commodityshareplatform.subject.dao.CommodityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommodityService {
    @Autowired
    CommodityMapper commodityMapper;
}
