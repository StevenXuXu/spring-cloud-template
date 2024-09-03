package com.shan.cloud.apis;

import com.shan.cloud.resp.ResultData;
import com.shan.cloud.resp.ReturnCodeEnum;
import org.springframework.stereotype.Component;

@Component
public class PayFeignSentinelApiFallBack implements PayFeignSentinelApi {
    @Override
    public ResultData getPayByOrderNo(String orderNo) {
        return ResultData.fail(ReturnCodeEnum.RC500.getCode(),"对方服务宕机或不可用，FallBack服务降级o(╥﹏╥)o");
    }
}