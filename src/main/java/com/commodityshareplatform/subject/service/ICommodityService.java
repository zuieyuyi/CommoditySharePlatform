package com.commodityshareplatform.subject.service;

import com.commodityshareplatform.subject.bean.Commodity;

import java.util.List;

public interface ICommodityService {
    public List<Commodity> selectAllCommodity();

    public Commodity selectCommodityById(Integer id);

    public Integer deleteCommodityById(Integer id);

    public Integer updateCommodityById(Commodity commodity);

    public Integer insertCommodityById(Commodity commodity);

    public Integer deleteCommodityBatchById(List<Integer> ids);
}
