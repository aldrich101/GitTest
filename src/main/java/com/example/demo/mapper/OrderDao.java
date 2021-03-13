package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderDao {


    /**
     * @Author Aldrich
     * @Description 依据订单状态和名称查询该订单信息
     * @Date 16:48 2019/12/24
     * @Param [orderStatus, orderName]
     * @return java.util.List<com.example.entity.Order>
     */
 List<Object> queryOrderInfo(@Param("orderStatus") Byte orderStatus,
                             @Param("orderName") String orderName);



}
