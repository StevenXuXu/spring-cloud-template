package com.shan.cloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shan.cloud.entity.Account;
import com.shan.cloud.mapper.AccountMapper;
import com.shan.cloud.service.AccountService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
* @author Administrator
* @description 针对表【t_account】的数据库操作Service实现
* @createDate 2024-09-03 15:22:14
*/
@Service
@Slf4j
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account>
    implements AccountService{

    @Resource
    private AccountMapper accountMapper;

    @Override
    public void decrease(Long userId, Long money) {
        log.info("------->account-service中扣减账户余额开始");
        accountMapper.decrease(userId,money);
        myTimeOut();
//        int age = 10/0;
        log.info("------->account-service中扣减账户余额结束");
    }

    /**
     * 模拟超时异常，全局事务回滚
     */
    private static void myTimeOut() {
        try { TimeUnit.SECONDS.sleep(65); } catch (InterruptedException e) { e.printStackTrace(); }
    }
}




