package com.commodityshareplatform.subject.dao;

import com.commodityshareplatform.subject.bean.Order;
import com.commodityshareplatform.subject.bean.OrderExample;
import com.commodityshareplatform.subject.bean.OrderKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    long countByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    int deleteByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    int deleteByPrimaryKey(OrderKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    int insert(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    int insertSelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    List<Order> selectByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    Order selectByPrimaryKey(OrderKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    int updateByPrimaryKeySelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbg.generated Fri Feb 12 16:54:45 CST 2021
     */
    int updateByPrimaryKey(Order record);

    List<Order> selectAllOrder();
}