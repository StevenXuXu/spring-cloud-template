package com.shan.cloud.service;

import com.shan.cloud.entity.Account;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author Administrator
* @description 针对表【t_account】的数据库操作Service
* @createDate 2024-09-03 15:22:14
*/
public interface AccountService extends IService<Account> {

    void decrease(Long userId, Long money);
}
