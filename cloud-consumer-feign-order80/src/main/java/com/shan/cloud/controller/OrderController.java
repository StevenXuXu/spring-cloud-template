package com.shan.cloud.controller;

import cn.hutool.core.date.DateUtil;
import com.shan.cloud.apis.PayFeignApi;
import com.shan.cloud.entity.PayDTO;
import com.shan.cloud.resp.ResultData;
import com.shan.cloud.resp.ReturnCodeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Steven
 * @Date: 2024/8/29
 * @Time: 上午10:36
 * @Description:
 */
@RestController
public class OrderController {

    @Autowired
    private PayFeignApi payFeignApi;

    @PostMapping(value = "/feign/pay/add")
    public ResultData add(@RequestBody PayDTO payDTO) {
        System.out.println("第一步：模拟本地addOrder新增订单成功(省略sql操作)，第二步：再开启addPay支付微服务远程调用");
        ResultData resultData = payFeignApi.addPay(payDTO);
        return resultData;
    }

    @GetMapping(value = "/feign/get/{id}")
    public ResultData getPayById(@PathVariable("id") Integer id) {
        ResultData resultData = null;
        try {
            System.out.println("invoke begin --------- " + DateUtil.now());
            resultData = payFeignApi.getPayById(id);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("invoke end --------- " + DateUtil.now());
            return ResultData.fail(ReturnCodeEnum.RC500.getCode(), e.getMessage());
        }
        return resultData;
    }

    @GetMapping(value = "/feign/get/info")
    public String mylb() {
        return payFeignApi.mylb();
    }
}
