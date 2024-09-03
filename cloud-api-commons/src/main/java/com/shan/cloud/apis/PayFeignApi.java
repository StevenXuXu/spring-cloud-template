package com.shan.cloud.apis;

import com.shan.cloud.entity.PayDTO;
import com.shan.cloud.resp.ResultData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Author: Steven
 * @Date: 2024/8/29
 * @Time: 上午10:25
 * @Description:
 */
@FeignClient(value = "cloud-payment-service")
public interface PayFeignApi {

    @PostMapping(value = "/pay/add")
    ResultData addPay(@RequestBody PayDTO payDTO);

    @GetMapping(value = "/pay/get/{id}")
    ResultData getPayById(@PathVariable("id") Integer id);

    @GetMapping(value = "/pay/get/info")
    String mylb();

    @GetMapping(value = "/pay/circuit/{id}")
    String myCircuit(@PathVariable("id") Integer id);

    @GetMapping(value = "/pay/bulkhead/{id}")
    String myBulkhead(@PathVariable("id") Integer id);

    @GetMapping(value = "/pay/ratelimit/{id}")
    String myRatelimit(@PathVariable("id") Integer id);

    @GetMapping(value = "/pay/micrometer/{id}")
    String myMicrometer(@PathVariable("id") Integer id);

    /**
     * GateWay进行网关测试案例01
     * @param id
     * @return
     */
    @GetMapping(value = "/pay/gateway/get/{id}")
    ResultData getById(@PathVariable("id") Integer id);

    /**
     * GateWay进行网关测试案例02
     * @return
     */
    @GetMapping(value = "/pay/gateway/info")
    ResultData<String> getGatewayInfo();
}
