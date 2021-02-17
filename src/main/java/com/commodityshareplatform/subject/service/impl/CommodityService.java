package com.commodityshareplatform.subject.service.impl;

import com.commodityshareplatform.subject.bean.Commodity;
import com.commodityshareplatform.subject.bean.CommodityExample;
import com.commodityshareplatform.subject.bean.UserExample;
import com.commodityshareplatform.subject.dao.CommodityMapper;
import com.commodityshareplatform.subject.enuminfo.CommodityStatusEnum;
import com.commodityshareplatform.subject.service.ICommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CommodityService implements ICommodityService {
    @Autowired
    CommodityMapper commodityMapper;

    @Override
    public List<Commodity> selectAllCommodity() {
//        CommodityExample commodityExample = new CommodityExample();
//        CommodityExample.Criteria criteria = commodityExample.createCriteria();
//        criteria.andIsValidEqualTo(1);
//        List<Commodity> commodities = commodityMapper.selectByExample(null);
        List<Commodity> commodities = commodityMapper.selectAllCommodities();
        for (Commodity commodity:commodities){
            if (commodity.getCommodityStatus() == CommodityStatusEnum.NOR_SELL.getStatusCode())
                commodity.setCommodityStatusMsg(CommodityStatusEnum.NOR_SELL.getStatus());
            else if (commodity.getCommodityStatus() == CommodityStatusEnum.SELL.getStatusCode())
                commodity.setCommodityStatusMsg(CommodityStatusEnum.SELL.getStatus());
            else if (commodity.getCommodityStatus() == CommodityStatusEnum.SELL_OUT.getStatusCode())
                commodity.setCommodityStatusMsg(CommodityStatusEnum.SELL_OUT.getStatus());
        }

        return commodities;
    }

    @Override
    public Commodity selectCommodityById(Integer id) {
        CommodityExample commodityExample = new CommodityExample();
        CommodityExample.Criteria criteria = commodityExample.createCriteria();
        criteria.andCommodityIdEqualTo(id);
//        criteria.andIsValidEqualTo(1);
        List<Commodity> commodities = commodityMapper.selectByExample(commodityExample);
        return commodities.get(0);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW,
            isolation = Isolation.READ_COMMITTED,
            readOnly = false,
            timeout = 2,
            rollbackFor = {Exception.class})
    @Override
    public Integer deleteCommodityById(Integer id) {
//        CommodityExample commodityExample = new CommodityExample();
//        CommodityExample.Criteria criteria = commodityExample.createCriteria();
//        criteria.andCommodityIdEqualTo(id);
        Commodity commodity = selectCommodityById(id);
        commodity.setIsValid(0);
        int result = commodityMapper.updateByExample(commodity, null);
        return result;
    }

    @Override
    public Integer updateCommodity(Commodity commodity) {
//        CommodityExample commodityExample = new CommodityExample();
//        CommodityExample.Criteria criteria = commodityExample.createCriteria();
//        criteria.andCommodityIdEqualTo(commodity.getCommodityId());
        int result = commodityMapper.updateByExample(commodity, null);
        return result;
    }

    @Override
    public Integer insertCommodity(Commodity commodity) {
        int result = commodityMapper.insertSelective(commodity);
        return result;
    }
    
    @Override
    public Integer deleteCommodityBatchById(List<Integer> ids) {
        Integer result = 0;
        for (Integer id:ids){
            result += deleteCommodityById(id);
        }
        return result;
    }
}
