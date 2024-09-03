package com.shan.cloud.controller;

import com.shan.cloud.resp.ResultData;
import com.shan.cloud.service.StorageService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class StorageController
{
    @Resource
    private StorageService storageService;

    /**
     * 扣减库存
     */
    @RequestMapping("/storage/decrease")
    public ResultData decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count) {
        log.info("进入2002 decrease！！！");
        storageService.decrease(productId, count);
        return ResultData.success("扣减库存成功!");
    }
}