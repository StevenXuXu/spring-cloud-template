package com.shan.cloud.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author: Steven
 * @Date: 2024/8/28
 * @Time: 下午7:41
 * @Description:
 */
@SpringBootTest
public class DistributionConfigTest {

    @Test
    public void contextLoads(@Value("${server.port}") String port, @Value("${shan.info}") String info) {
        System.out.println(port);
        System.out.println(info);
    }
}
