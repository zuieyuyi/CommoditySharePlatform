package com.commodityshareplatform.subject.service.impl;

import com.commodityshareplatform.subject.dao.CommodityMapper;
import com.commodityshareplatform.subject.service.ICommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommodityService implements ICommodityService {
    @Autowired
    CommodityMapper commodityMapper;
}
