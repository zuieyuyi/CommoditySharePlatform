package com.commodityshareplatform.subject.service;

import com.commodityshareplatform.subject.bean.Commodity;

import java.util.List;

public interface ICommodityService {
    public List<Commodity> selectAllCommodity();

    public Commodity selectCommodityById(Integer id);

    public Integer deleteCommodityById(Integer id);

    public Integer updateCommodity(Commodity commodity);

    public Integer insertCommodity(Commodity commodity);

    public Integer deleteCommodityBatchById(List<Integer> ids);
}
