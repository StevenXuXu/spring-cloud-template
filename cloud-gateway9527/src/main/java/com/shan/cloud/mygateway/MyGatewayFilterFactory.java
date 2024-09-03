package com.shan.cloud.mygateway;

import lombok.Getter;
import lombok.Setter;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: Steven
 * @Date: 2024/8/30
 * @Time: 下午2:44
 * @Description:
 */
@Component
public class MyGatewayFilterFactory extends AbstractGatewayFilterFactory<MyGatewayFilterFactory.Config> {

    public MyGatewayFilterFactory() {
        super(Config.class);
    }

    @Override
    public GatewayFilter apply(MyGatewayFilterFactory.Config config) {
        return new GatewayFilter() {
            @Override
            public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
                ServerHttpRequest request =  exchange.getRequest();
                System.out.println("进入自定义网关过滤器MyGatewayFilterFactory，status===="+config.getStatus());
                if(request.getQueryParams().containsKey("shan")) {
                    return chain.filter(exchange);
                }else {
                    exchange.getResponse().setStatusCode(HttpStatus.BAD_REQUEST);
                    return exchange.getResponse().setComplete();
                }
            }
        };
    }

    public List<String> shortcutFieldOrder() {
        return List.of("status");
    }

    @Getter
    @Setter
    public static class Config {
        private String status;

        public Config() {
        }
    }
}
