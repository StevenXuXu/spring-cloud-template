package com.shan.cloud.controller;

import com.shan.cloud.entity.Order;
import com.shan.cloud.resp.ResultData;
import com.shan.cloud.service.OrderService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    /**
     * 创建订单
     */
    @GetMapping("/order/create")
    public ResultData create(Order order) {
        orderService.create(order);
        return ResultData.success(order);
    }
}