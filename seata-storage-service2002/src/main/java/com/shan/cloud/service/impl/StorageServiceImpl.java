package com.shan.cloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shan.cloud.entity.Storage;
import com.shan.cloud.mapper.StorageMapper;
import com.shan.cloud.service.StorageService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【t_storage】的数据库操作Service实现
* @createDate 2024-09-03 14:54:01
*/
@Service
@Slf4j
public class StorageServiceImpl extends ServiceImpl<StorageMapper, Storage>
    implements StorageService{

    @Resource
    private StorageMapper storageMapper;

    @Override
    public void decrease(Long productId, Integer count) {
//        Storage storage = storageMapper.selectById(productId);
//        storage.setUsed(storage.getUsed() + count);
//        storage.setResidue(storage.getResidue() - count);
//        storageMapper.updateById(storage);
        log.info("------->storage-service中扣减库存开始");
        storageMapper.decrease(productId, count);
        log.info("------->storage-service中扣减库存结束");
    }
}




