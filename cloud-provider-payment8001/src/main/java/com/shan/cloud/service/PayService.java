package com.shan.cloud.service;

import com.shan.cloud.entity.Pay;

import java.util.List;

/**
 * @Author: Steven
 * @Date: 2024/8/28
 * @Time: 下午3:17
 * @Description:
 */
public interface PayService {
    int add(Pay pay);
    int delete(Integer id);
    int update(Pay pay);
    Pay getById(Integer id);
    List<Pay> getAll();
}
