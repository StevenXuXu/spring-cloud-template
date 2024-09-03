package com.shan.cloud.mapper;

import com.shan.cloud.entity.Account;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
* @author Administrator
* @description 针对表【t_account】的数据库操作Mapper
* @createDate 2024-09-03 15:22:14
* @Entity com.shan.cloud.entity.Account
*/
public interface AccountMapper extends BaseMapper<Account> {

    void decrease(@Param("userId") Long userId, @Param("money") Long money);
}




