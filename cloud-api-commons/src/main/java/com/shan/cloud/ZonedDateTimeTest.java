package com.shan.cloud;

import java.time.ZonedDateTime;

/**
 * @Author: Steven
 * @Date: 2024/8/30
 * @Time: 上午9:36
 * @Description:
 */
public class ZonedDateTimeTest {
    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);
    }
}
