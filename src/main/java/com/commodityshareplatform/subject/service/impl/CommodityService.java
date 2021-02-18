package com.commodityshareplatform.subject.service.impl;

import com.commodityshareplatform.subject.bean.Commodity;
import com.commodityshareplatform.subject.bean.CommodityExample;
import com.commodityshareplatform.subject.bean.User;
import com.commodityshareplatform.subject.bean.UserExample;
import com.commodityshareplatform.subject.dao.CommodityMapper;
import com.commodityshareplatform.subject.dao.UserMapper;
import com.commodityshareplatform.subject.enuminfo.CommodityStatusEnum;
import com.commodityshareplatform.subject.service.ICommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class CommodityService implements ICommodityService {
    @Autowired
    CommodityMapper commodityMapper;

    @Autowired
    UserMapper userMapper;

    @Override
    public List<Commodity> selectAllCommodities() {
//        CommodityExample commodityExample = new CommodityExample();
//        CommodityExample.Criteria criteria = commodityExample.createCriteria();
//        criteria.andIsValidEqualTo(1);
//        List<Commodity> commodities = commodityMapper.selectByExample(null);
        List<Commodity> commodities = commodityMapper.selectAllCommodities();

        List<User> users = userMapper.selectByExample(null);

        for (Commodity commodity:commodities){
            //判断商品的状态
            if (commodity.getCommodityStatus() == CommodityStatusEnum.NOR_SELL.getStatusCode())
                commodity.setCommodityStatusMsg(CommodityStatusEnum.NOR_SELL.getStatus());
            else if (commodity.getCommodityStatus() == CommodityStatusEnum.SELL.getStatusCode())
                commodity.setCommodityStatusMsg(CommodityStatusEnum.SELL.getStatus());
            else if (commodity.getCommodityStatus() == CommodityStatusEnum.SELL_OUT.getStatusCode())
                commodity.setCommodityStatusMsg(CommodityStatusEnum.SELL_OUT.getStatus());

            if (commodity.getCommodityUserId() == null){
                commodity.setCommodityUserName("无用户");
                continue;
            }
            //获取用户名
            for (User user:users) {
                if (commodity.getCommodityUserId().equals(user.getUserId())) {
                    //判断用户是否有效
                    if (user.getIsValid() == 1){
                        commodity.setCommodityUserName(user.getUserName());
                    }else if (user.getIsValid() == 0){
                        commodity.setCommodityUserName("用户已失效");
                    }else {
                        commodity.setCommodityUserName("无用户");
                    }
                }
            }
        }
        return commodities;
    }

    @Override
    public Commodity selectCommodityById(Integer id) {
        //查询出商品信息
        CommodityExample commodityExample = new CommodityExample();
        CommodityExample.Criteria criteria = commodityExample.createCriteria();
        criteria.andCommodityIdEqualTo(id);
//        criteria.andIsValidEqualTo(1);
        List<Commodity> commodities = commodityMapper.selectByExample(commodityExample);
        Commodity commodity = commodities.get(0);
        //通过商品属性找到对应的卖家
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria1 = userExample.createCriteria();
        criteria1.andUserIdEqualTo(commodity.getCommodityUserId());
        List<User> users = userMapper.selectByExample(userExample);
        User user = users.get(0);
        //赋值
        commodity.setCommodityUserName(user.getUserName());
        //判断商品的状态
        if (commodity.getCommodityStatus() == CommodityStatusEnum.NOR_SELL.getStatusCode())
            commodity.setCommodityStatusMsg(CommodityStatusEnum.NOR_SELL.getStatus());
        else if (commodity.getCommodityStatus() == CommodityStatusEnum.SELL.getStatusCode())
            commodity.setCommodityStatusMsg(CommodityStatusEnum.SELL.getStatus());
        else if (commodity.getCommodityStatus() == CommodityStatusEnum.SELL_OUT.getStatusCode())
            commodity.setCommodityStatusMsg(CommodityStatusEnum.SELL_OUT.getStatus());
        return commodity;
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
        Date createDate = new Date();
        commodity.setCommodityCreateDate(createDate);
        commodity.setIsValid(1);
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
