package com.shan.cloud.controller;

import com.shan.cloud.entity.Pay;
import com.shan.cloud.entity.PayDTO;
import com.shan.cloud.resp.ResultData;
import com.shan.cloud.service.PayService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

/**
 * @Author: Steven
 * @Date: 2024/8/28
 * @Time: 下午3:25
 * @Description:
 */
@RestController
@Tag(name = "支付微服务模块",description = "支付CRUD")
public class PayController
{
    @Resource
    PayService payService;

    @PostMapping(value = "/pay/add")
    @Operation(summary = "新增",description = "新增支付流水方法,json串做参数")
    public ResultData addPay(@RequestBody Pay pay)
    {
        System.out.println(pay.toString());
        int i = payService.add(pay);
        return ResultData.success("成功插入记录，返回值："+i);
    }

    @DeleteMapping(value = "/pay/del/{id}")
    @Operation(summary = "删除",description = "删除支付流水方法")
    public ResultData deletePay(@PathVariable("id") Integer id) {
        int i = payService.delete(id);
        return ResultData.success(i);
    }

    @PutMapping(value = "/pay/update")
    @Operation(summary = "修改",description = "修改支付流水方法")
    public ResultData updatePay(@RequestBody PayDTO payDTO)
    {
        Pay pay = new Pay();
        BeanUtils.copyProperties(payDTO, pay);

        int i = payService.update(pay);
        return ResultData.success("成功修改记录，返回值："+i);
    }

    @GetMapping(value = "/pay/get/{id}")
    @Operation(summary = "按照ID查流水",description = "查询支付流水方法")
    public ResultData getById(@PathVariable("id") Integer id)
    {
        try {
            TimeUnit.SECONDS.sleep(62);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Pay pay = payService.getById(id);
        return ResultData.success(pay);
    }

    @GetMapping(value = "/pay/getall")
    @Operation(summary = "查询全部流水",description = "查询支付流水方法")
    public ResultData getAll(){
        return ResultData.success(payService.getAll());
    }

    @GetMapping(value = "/pay/get/info")
    private String getInfoByConsul(@Value("${server.port}") String port, @Value("${shan.info}") String atguiguInfo) {
        return "atguiguInfo: "+atguiguInfo+"\t"+"port: "+port;
    }
}
