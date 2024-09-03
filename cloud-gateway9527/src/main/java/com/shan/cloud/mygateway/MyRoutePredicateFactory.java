package com.shan.cloud.mygateway;

import jakarta.validation.constraints.NotNull;
import org.springframework.cloud.gateway.handler.predicate.AbstractRoutePredicateFactory;
import org.springframework.cloud.gateway.handler.predicate.GatewayPredicate;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

@Component
public class MyRoutePredicateFactory extends AbstractRoutePredicateFactory<MyRoutePredicateFactory.Config> {

    public MyRoutePredicateFactory() {
        super(MyRoutePredicateFactory.Config.class);
    }

    public List<String> shortcutFieldOrder() {
        return Collections.singletonList("userType");
    }

    @Override
    public Predicate<ServerWebExchange> apply(Config config) {
        return new GatewayPredicate() {
            public boolean test(ServerWebExchange serverWebExchange) {
                String userType = serverWebExchange.getRequest().getQueryParams().getFirst("userType");
                return config.getUserType().equals(userType);
            }

            public Object getConfig() {
                return config;
            }

            public String toString() {
                return String.format("UserType: %s", config.getUserType());
            }
        };
    }

    public static class Config {
        private @NotNull String userType;

        public Config() {
        }

        public @NotNull String getUserType() {
            return userType;
        }

        public void setUserType(@NotNull String userType) {
            this.userType = userType;
        }
    }
}