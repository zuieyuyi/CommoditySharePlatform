package com.commodityshareplatform.subject.service;

import com.commodityshareplatform.subject.bean.Commodity;
import com.commodityshareplatform.subject.bean.CommodityExample;

import java.util.List;

public interface ICommodityService {
    public List<Commodity> selectCommodities(CommodityExample example);

    public List<Commodity> selectAllCommodities();

    public Commodity selectCommodityById(Integer id);

    public Integer deleteCommodityById(Integer id);

    public Integer updateCommodity(Commodity commodity);

    public Integer insertCommodity(Commodity commodity);

    public Integer deleteCommodityBatchById(List<Integer> ids);

    public Integer saveCommodityTags(Integer commodityId,String tags);

    public String getCommodityTags(Integer commodityId);
}
