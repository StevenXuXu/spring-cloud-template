package com.shan.cloud.service;

import com.shan.cloud.entity.Order;

public interface OrderService {
    /**
     * 创建订单
     */
    void create(Order order);
}
