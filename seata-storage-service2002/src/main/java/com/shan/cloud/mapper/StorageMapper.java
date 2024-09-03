package com.shan.cloud.mapper;

import com.shan.cloud.entity.Storage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
* @author Administrator
* @description 针对表【t_storage】的数据库操作Mapper
* @createDate 2024-09-03 14:54:01
* @Entity com.shan.cloud.entity.Storage
*/
public interface StorageMapper extends BaseMapper<Storage> {

    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}




