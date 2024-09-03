package com.shan.cloud.service;

import com.shan.cloud.entity.Storage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author Administrator
* @description 针对表【t_storage】的数据库操作Service
* @createDate 2024-09-03 14:54:01
*/
public interface StorageService extends IService<Storage> {

    void decrease(Long productId, Integer count);
}
