package com.shan.cloud.apis;

import com.shan.cloud.resp.ResultData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "nacos-payment-provider", fallback = PayFeignSentinelApiFallBack.class)
public interface PayFeignSentinelApi {

    @GetMapping("/pay/nacos/get/{orderNo}")
    ResultData getPayByOrderNo(@PathVariable("orderNo") String orderNo);
}